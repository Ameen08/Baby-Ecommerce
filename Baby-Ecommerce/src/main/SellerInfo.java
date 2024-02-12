

package main;

import java.sql.*;
public class SellerInfo {

public String getSellerInformation(int productID)

	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baby-ecommerce","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT seller.Name, seller.Location, products.Name FROM seller,products WHERE products.ID = seller.ProductID AND products.ID = '" + productID + "';");
			String sellerInformation = "";
			while(rs.next())
			{
				sellerInformation += " Seller Name: " + rs.getString(1) + " | Seller Location: " + rs.getString(2) + " | Sold Product Name: " + rs.getString(3) + "<BR>";
			}
			con.close();
			
			return sellerInformation;

		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return "";
	}
}