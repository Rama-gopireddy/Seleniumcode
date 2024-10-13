package selenium1.selenium1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DDT_Class {
	
	static String   username;

	static String password;
	
	public void valid() throws EncryptedDocumentException, IOException {

		
	

	FileInputStream f1=new FileInputStream("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\Rama'saumationexcel\\Rama.xlsx");
    Workbook w1=	WorkbookFactory.create(f1);
    Sheet s1=   w1.getSheet("Amazon_project_1");
  username= s1.getRow(1).getCell(0).getStringCellValue();
    password=s1.getRow(1).getCell(1).getStringCellValue();
	}
     
    
	public void invalid() throws EncryptedDocumentException, IOException {

		
		

	FileInputStream f1=new FileInputStream("C:\\Users\\ramag\\Desktop\\java projects\\Seleniumbasics\\Rama'saumationexcel\\Rama.xlsx");
    Workbook w1=	WorkbookFactory.create(f1);
    Sheet s2=   w1.getSheet("invalidsheet");
  username= s2.getRow(1).getCell(0).getStringCellValue();
    password=s2.getRow(1).getCell(1).getStringCellValue();
          
         /* System.out.println(username);


	//password
          
          Sheet s2=   w1.getSheet("Login");
  	       Row r2  = s2.getRow(1);
  	       Cell c2      =r2.getCell(1);
  	       String password      = c2.getStringCellValue();
  	          
  	         // System.out.println(password);*/
  	          
  	       

	}

}
