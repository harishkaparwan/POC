<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@page import="com.hck.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://displaytag.sf.net" prefix="display"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Its a Test</title>
         <script type="text/javascript">

			//code to add New user
			function save(){
				document.forms[0].action="add.htm";
				document.forms[0].submit();
			}

		    //code to edit a user
			function clear(){
				document.getElementById("rolename").value ="";
				document.getElementById("roledescription").value ="";
			}
		</script>
    </head>

    <body>
        <form:form method="POST" commandName="roleForm" name="roleForm"  >
       Role  <form:input path="roleName" id="roleName" /><br>
        Descrition          <form:input path="roleDescription" id="roleDescription" />
         
            <input  value="Save" type="button" onclick="javascript:save();" />
             <input  value="Clear" type="button" onclick="javascript:clear();" />
        </form:form>
 
        <hr><ol> 
      
        </ol><hr>
 
 <display:table name="${roleList}" id="contact"  pagesize="2"  >
 ${contact.roleName}
 ${contact.roleDescription}
  
</display:table>

		
	</body>
</html>