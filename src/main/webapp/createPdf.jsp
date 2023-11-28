<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="com.itextpdf.text.Image"%>
<%@page import="com.itextpdf.text.Font"%>
<%@page import="com.itextpdf.text.Element"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.Document, com.jsp.dto.Reservation, com.jsp.service.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Invoice</title>
</head>
<body>
    <%
        int reservationId = Integer.parseInt(request.getParameter("reservationId"));
        ReservationService reservationService = new ReservationService();
        Reservation reservation = reservationService.getReservationById(reservationId);

        response.setContentType("application/pdf");
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, response.getOutputStream());
        document.open();

        // Header
        Paragraph title = new Paragraph("FACTURE TOMOBILE.MA");
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);

        // Subtitle
        Paragraph subtitle = new Paragraph("Invoice");
        subtitle.setAlignment(Element.ALIGN_CENTER);
        document.add(subtitle);

        // Content
        Font boldFont = new Font();
        boldFont.setStyle(Font.BOLD);
        boldFont.setSize(14);

        document.add(new Paragraph("\nReservation Details", boldFont));
        document.add(new Paragraph("Reservation ID: " + reservation.getReservationId()));
        document.add(new Paragraph("Payment Status: " + reservation.getPaymentStatus()));
        document.add(new Paragraph("Pickup Date: " + reservation.getPickupDate()));
        document.add(new Paragraph("Return Date: " + reservation.getReturnDate()));
        document.add(new Paragraph("Total Cost: " + reservation.getTotalCost()));
        document.add(new Paragraph("Car ID: " + reservation.getCar().getModel()));
        document.add(new Paragraph("User ID: " + reservation.getUser().getUsername()));

        // Footer with Page Number
        Paragraph footer = new Paragraph("Page " + writer.getPageNumber());
        footer.setAlignment(Element.ALIGN_CENTER);
        document.add(footer);

        document.close();
    %>
</body>
</html>
