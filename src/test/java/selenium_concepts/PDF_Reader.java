package selenium_concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PDF_Reader {

	

	@Test
	public void methodone() throws IOException  {
	
	
	
	File file = new File("C:/Users/msi/Desktop/Resume/RajendraChozhanResume.pdf");
	
	
	
	FileInputStream fis = new FileInputStream(file);
	
	PDFParser pdf = new PDFParser(fis);
	
	pdf.parse();
	
	COSDocument cosdoc =  pdf.getDocument();
	
	PDDocument pddoc = new PDDocument(cosdoc);
	
	PDFTextStripper strip = new PDFTextStripper();
	
	String data = strip.getText(pddoc);
	
	System.out.println(data);
	
	
	}
	
	
}
