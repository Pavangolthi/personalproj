package com.user.myapp.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;


import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.user.myapp.model.User;

@Component("pdfView")
public class PDFView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<User> userList = (List<User>) model.get("userList");
		
		Table table = new Table(3);
		
		table.addCell("Id");
		table.addCell("Name");
		table.addCell("User Name");
		
		for (User user : userList) {
			table.addCell(user.getId()+"");
			table.addCell(user.getName());
			table.addCell(user.getUserName());
		}
		
		document.add(table);
		
	}



}
