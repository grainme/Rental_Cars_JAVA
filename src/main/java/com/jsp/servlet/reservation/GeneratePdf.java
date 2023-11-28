package com.jsp.servlet.reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.BaseColor;

import com.jsp.dto.*;

@WebServlet("/generatePDF")
public class GeneratePdf extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Create a document
    	Document document = new Document();

    	// Set the output file or stream (e.g., FileOutputStream or ByteArrayOutputStream)
    	try {
    		// Get the real path of the servlet's directory
    		String servletRealPath = getServletContext().getRealPath("/");

    		// Create the output file in the servlet's directory
    		String outputPath = servletRealPath + File.separator + "output.pdf";
    		PdfWriter.getInstance(document, new FileOutputStream(outputPath));

		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	// Open the document
    	document.open();

    	// Add content to the document
    	try {
			document.add(new Paragraph("Hello, iText!"));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	// Close the document
    	document.close();
    	System.out.println("File Saved!");
    }

}
