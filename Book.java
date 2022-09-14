import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			Statement stmt = conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from ebookshop.books");
			 System.out.println("id\t\t title\t\t author\t\t price\t\t quantity");
			 
	            // Condition check
	            while (rs.next()) {
	 
	                int id = rs.getInt("id");
	                String title = rs.getString("title");
	                String author = rs.getString("author");
	                float price = rs.getFloat("price");
	                int quantity = rs.getInt("quantity");
	                System.out.println(id + "\t\t" + title + "\t\t" + author + "\t\t" + price + "\t\t" + quantity);
	            }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
