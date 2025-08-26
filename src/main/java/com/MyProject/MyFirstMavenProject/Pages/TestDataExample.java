package com.MyProject.MyFirstMavenProject.Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataExample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\TestData\\TestDataDemo.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String password=String.valueOf((long)w1.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
		System.out.println(username);
		System.out.println(password);
	}

}
