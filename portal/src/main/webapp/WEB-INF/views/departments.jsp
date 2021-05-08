<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Departments</title>
      <style><%@include file="/WEB-INF/resources/css/app.css"%></style>
   </head>
   <body>
      <table id="departments_tbl" >
         <tr>
            <th>DEPARTMENT_ID</th>
            <th>DEPARTMENT_NAME</th>
            <th>MANAGER_ID</th>
            <th>LOCATION_ID</th>         
         </tr>
         <c:forEach var="department" items="${allDepartments}">
            <tr>
               <td>
                  <c:out value="${department.departmentId}" />
               </td>
               <td>
                  <c:out value="${department.departmentName}" />
               </td>
               <td>
                  <c:out value="${department.managerId}" />
               </td>
               <td>
                  <c:out value="${department.locationId}" />
               </td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>