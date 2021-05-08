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
      <table id="employees_tbl" >
         <tr>
            <th>EMPLOYEE_ID</th>
            <th>FIRST_NAME</th>
            <th>LAST_NAME</th>
            <th>EMAIL</th>
            <th>PHONE_NUMBER</th>
            <th>HIRE_DATE</th>
            <th>JOB_ID</th>
            <th>SALARY</th>
            <th>COMMISSION_PCT</th>
            <th>MANAGER_ID</th>
            <th>DEPARTMENT_ID</th>           
         </tr>
         <c:forEach var="employee" items="${allEmployees}">
            <tr>
               <td>
                  <c:out value="${employee.employeeId}" />
               </td>
               <td>
                  <c:out value="${employee.firstName}" />
               </td>
               <td>
                  <c:out value="${employee.lastName}" />
               </td>
               <td>
                  <c:out value="${employee.email}" />
               </td>
               <td>
                  <c:out value="${employee.phoneNumber}" />
               </td>
               <td>
                  <c:out value="${employee.hireDate}" />
               </td>
               <td>
                  <c:out value="${employee.jobId}" />
               </td>
               <td>
                  <c:out value="${employee.salary}" />
               </td>
               <td>
                  <c:out value="${employee.commisionPct}" />
               </td>
               <td>
                  <c:out value="${employee.managerId}" />
               </td>
               <td>
                  <c:out value="${employee.deptId}" />
               </td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>