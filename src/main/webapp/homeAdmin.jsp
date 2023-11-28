<%@page import="javax.servlet.annotation.WebServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.jsp.dto.User, com.jsp.service.UserService" %>

<%
User user = null;
if(request.getAttribute("userInfos")==null){
	UserService userService = new UserService();
	user = userService.findUserById(Integer.valueOf(request.getParameter("user_id")));
}
else{
	user = (User) request.getAttribute("userInfos");
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="h-screen flex items-stretch">

  <div class="flex flex-col w-1/3">
    <div class="bg-black h-full p-5 flex items-center justify-center">
	  <form action="listCars" method="get" class="text-white text-center">
        <input type="hidden" name="user_id" value="<%= user.getUser_id() %>">
        <p class="text-3xl font-bold mb-4">List of Cars</p>
        <input type="submit" class="text-lg cursor-pointer" value="Click to Get List Of Cars"></input>
      </form>
    </div>
  </div>

  <div class="flex flex-col w-1/3">
    <div class="h-full p-5 flex items-center justify-center">
      <form action="listReservation" method="get" class="text-center">
        <input type="hidden" name="user_id" value="<%= user.getUser_id() %>">
        <p class="text-3xl font-bold mb-4">List of Reservations</p>
        <input type="submit" class="text-lg cursor-pointer" value="Click to view the list of reservations"></input>
      </form>   
    </div>
  </div>
  
    <div class="flex flex-col w-1/3">
    <div class="bg-black h-full p-5 flex items-center justify-center">
      <form action="getusers" method="post" class="text-white text-center">
        <input type="hidden" name="user_id" value="<%= user.getUser_id() %>">
        <p class="text-3xl font-bold mb-4">List of Users</p>
        <input type="submit" class="text-lg cursor-pointer" value="Click to Get List Of Users"></input>
      </form>
    </div>
  </div>

</body>
</html>