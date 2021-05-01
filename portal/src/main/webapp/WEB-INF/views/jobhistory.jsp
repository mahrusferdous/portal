<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Job History</title>
      <style><%@include file="/WEB-INF/resources/css/app.css"%></style>
   </head>
   <body>
      <table id="job_history_tbl" >
         <tr>
            <th>EMPLOYEE_ID</th>
            <th>START_DATE</th>
            <th>END_DATE</th>
            <th>JOB_ID</th>
            <th>DEPARTMENT_ID</th>
         </tr>
         <c:forEach var="history" items="${histories}">
            <tr>
               <td>
                  <c:out value="${history.employeeId}" />
               </td>
               <td>
                  <c:out value="${history.startDate}" />
               </td>
               <td>
                  <c:out value="${history.endDate}" />
               </td>
               <td>
                  <c:out value="${history.jobId}" />
               </td>
               <td>
                  <c:out value="${history.deptId}" />
               </td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>