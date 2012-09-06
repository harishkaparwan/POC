<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@page import="com.hck.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://displaytag.sf.net" prefix="display"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>JPA Guestbook Web Application Tutorial</title>
    </head>
 
    <body>
        <form method="POST" action="add.htm">
            Role Name: <input type="text" name="rolename" /><br>
            Role Description: <input type="text" name="roledescription" /><br>
            
            <input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
      
        </ol><hr>
 
 <display:table name="${roleList}" id="contact"  pagesize="2"  >
 ${contact.roleName}
 ${contact.roleDescription}
  
</display:table>

		
	</body>
</html>