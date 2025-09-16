package sqlTask;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sql {



	    public static void main(String[] args) throws Exception {
	        String URL = "jdbc:mysql://localhost:3306/Testdb"; 
	        String user = "root"; 
	        String password = "YourNewPassword"; 

	        String sql = "INSERT INTO employee (empcode, empname, empage, empsalary) VALUES (?, ?, ?, ?)"; 
	        try { 
	            Class.forName("com.mysql.cj.jdbc.Driver"); 
	            Connection con = DriverManager.getConnection(URL, user, password); 
	            if(con != null){
	                System.out.println("Connection established");
	                PreparedStatement ps = con.prepareStatement(sql); 
	                // Insert row 1
	                ps.setInt(1, 101);
	                ps.setString(2, "Jenny");
	                ps.setInt(3, 25);
	                ps.setInt(4, 10000);
	                ps.executeUpdate();

	                // Insert row 2
	                ps.setInt(1, 102);
	                ps.setString(2, "Jacky");
	                ps.setInt(3, 30);
	                ps.setInt(4, 20000);
	                ps.executeUpdate();

	                // Insert row 3
	                ps.setInt(1, 103);
	                ps.setString(2, "Joe");
	                ps.setInt(3, 20);
	                ps.setInt(4, 40000);
	                ps.executeUpdate();

	                // Insert row 4
	                ps.setInt(1, 104);
	                ps.setString(2, "John");
	                ps.setInt(3, 40);
	                ps.setInt(4, 80000);
	                ps.executeUpdate();

	                // Insert row 5
	                ps.setInt(1, 105);
	                ps.setString(2, "Shameer");
	                ps.setInt(3, 25);
	                ps.setInt(4, 90000);
	                ps.executeUpdate();

	                System.out.println("All records inserted successfully!");

	                ps.close(); 
	                con.close();

	            }
	            System.out.println("Connected to the database");
	        }catch (SQLException e) {
	            System.out.println("Connection failed: " + e.getMessage()); 
	        } 
	        catch (ClassNotFoundException e) {
	            System.out.println("Driver not loaded: " + e.getMessage());  
	        }
	    }
	}
