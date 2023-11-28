<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, java.util.*" %>
<%@ page import="com.jsp.dto.Car, com.jsp.dto.User, com.jsp.service.UserService" %>

<%

    List<Car> listOfCars = (List<Car>) request.getAttribute("listOfCars");
    User user = (User) request.getAttribute("user");

    Map<String, String> brandLogos = new HashMap<>();
    brandLogos.put("Honda Civic", "./images/Honda.webp");
    brandLogos.put("Toyota Camry", "./images/Toyota.webp");
    brandLogos.put("Ford Mustang", "./images/Toyota.webp");
    brandLogos.put("Jeep Wrangler", "./images/Jeep.webp");
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dataverse - Car Rental Service</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://api.fontshare.com/v2/css?f[]=general-sans@500,300,600,400,700&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600&family=Open+Sans&display=swap"
    rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet">
    
   <style>
   	#body{
   	  font-family: 'General Sans', sans-serif;
   	 }
   </style>
</head>

<body class="min-h-screen font-sans bg-gray-100">
    <!-- Include the navigation bar -->
    <%@ include file="navBar.jsp" %>

    <div class="container mx-auto p-4" id="body">
        <section class="section featured-car">
			
			<div class="flex justify-between items-center mb-4">
                <h1 class="text-[50px] font-semibold">Featured Cars</h1>
                <form action="listCars" method="get" class="flex items-center">
               		<input hidden=true name="user_id" value=<%=user.getUser_id() %>></input> 
                    <label class="mr-2">Model:</label>
                    <select name="model" class="bg-transparent border border-gray-300 px-2 py-1">
                        <option value="">Select Model</option>
                        <% Set<String> uniqueModels = new HashSet<>(); %>
                        <% for(Car car : listOfCars) {
                            uniqueModels.add(car.getModel());
                        } %>
                        <% for(String model : uniqueModels) { %>
                            <option value="<%= model %>"><%= model %></option>
                        <% } %>
                    </select>
                    <label class="ml-2 mr-2">Year:</label>
                    <select name="year" class="bg-transparent border border-gray-300 px-2 py-1">
                        <option value="">Select Year</option>
                        <% Set<Integer> uniqueYears = new HashSet<>(); %>
                        <% for(Car car : listOfCars) {
                            uniqueYears.add(car.getProduction_year());
                        } %>
                       <% List<Integer> sortedYears = new ArrayList<>(uniqueYears);
                           Collections.sort(sortedYears);
                        %>
                        <% for(Integer year : sortedYears) { %>
                            <option value="<%= year %>"><%= year %></option>
                        <% } %>
                    </select>
                    <button type="submit" class="btn rounded-lg bg-red-500 px-2 py-1 text-white ml-2">Search</button>
                </form>
            </div>
			
			<% if (!user.getRole().equals("client")) { %>
			    <p class="text-[13px] mb-4 font-medium flex justify-center items-center align-center text-blue-600">
			        <a href="addCar.jsp">As an admin you have the privilege to add a nice car to the store</a>
			    </p>
			<% } %>

            <%int i=0; %>
            <ul class="featured-car-list grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4">
                <% for(Car car : listOfCars) { %>
                <%i++; %>
                <li>
                    <div class="featured-car-card bg-white shadow-md rounded-lg overflow-hidden">
                        <img src="./assets/images/car-<%= (i % 6 + 1) %>.jpg" alt="<%= car.getModel() %>" class="w-full h-40 object-cover">
                        <div class="p-4">
                            <h5 class="text-xl font-semibold mb-2"><%= car.getModel() %></h5>
                            <p class="text-sm text-gray-500 mb-2"><%= car.getProduction_year() %></p>
							<ul class="text-sm text-gray-700 space-y-2 flex flex-col flex-wrap">
							  <div class="flex justify-between">
							    <li class="flex items-center"><i class="fas fa-users mr-2"></i> <%= car.getProduction_year() %></li>
							    <li class="flex items-center"><i class="fas fa-bolt mr-2"></i> <%= car.getRentalRate() %></li>
							  </div>
							  <div class="flex justify-between">
							    <li class="flex items-center"><i class="fas fa-tachometer-alt mr-2"></i> <%= car.getRentalRate() %></li>
							    <li class="flex items-center"><i class="fas fa-microchip mr-2"></i> <%= car.isAvailable() %></li>
							  </div>
							</ul>

                            <div class="mt-4 flex justify-between items-center">
                                <p class="text-lg font-medium text-blue-500"><%= car.getRentalRate() %>MAD / Day</p>
                                <form action="saveReservation.jsp" method="get">
                                    <input type="hidden" name="user_id" value="<%= user.getUser_id() %>">
                                    <input type="hidden" name="car_id" value="<%= car.getCarId() %>">
                                    <button class="btn" type="submit" <%= car.isAvailable() ? "" : "disabled" %>><%= car.isAvailable() ? "Rent Now" : "Reserved" %></button>
                                </form>
                            </div>
                        </div>
                    </div>
                </li>
                <% } %>
            </ul>
        </section>
    </div>
</body>

</html>
