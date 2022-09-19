package com.mtc.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.mtc.app.model.Product;

@Component("productPDFView")
public class ProductPDFView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		 List<Product> prodList = (List<Product>) model.get("allproducts");
		 
		 Table table = new Table(4);
		 
		 table.addCell("ID");
		 table.addCell("NAME");
		 table.addCell("PRICE");
		 table.addCell("DESCRIPTION");
		 
		 for (Product product : prodList) {
			table.addCell(product.getId()+"");
			table.addCell(product.getName());
			table.addCell(product.getPrice()+"");
			table.addCell(product.getDescription());
		}
		 document.add(table);
	}

}
