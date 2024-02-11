<%@ page import="sellerinfo.SellerInfo" %>
<%@ page import="sellerinfo.SellerInfoServiceLocator" %>
<%@ page import="javax.xml.rpc.ServiceException" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Baby Ecommerce</title>
</head>
<body>
	<h1>Seller Information</h1>
	<%
	    //receipt ID from the form
	    String receiptID = request.getParameter("productID");
	
	    try {
	        SellerInfoServiceLocator locator = new SellerInfoServiceLocator();
			SellerInfo info = locator.getSellerInfo();
	
	        String sellerInfo = info.getSellerInformation(Integer.parseInt(receiptID));
				
	        sellerInfo.replace("Seller Name:", "<br/>").replace("Seller Location:", "<br/>").replace("Sold Product Name:", "<br/>");                    
	        
	        out.println("<p>" + sellerInfo + "</p>");
	
	    } catch (ServiceException e) {
	        e.printStackTrace();
	    }
	%>
</body>
</html>