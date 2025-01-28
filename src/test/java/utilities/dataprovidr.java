package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataprovidr {
	
	@DataProvider(name = "datapro")
	String[][] logindata() throws IOException{
		ExcelUtility xlut = new ExcelUtility("D://Opencart_LoginData.xlsx");
		
		//"D:\Opencart_LoginData.xlsx"
		
		int rcount = xlut.getRowCount("Sheet1");
		int colcount = xlut.getCellCount("Sheet1", 1);
		String data[][]  = new String[rcount][colcount];
		
		for(int r= 1; r<=rcount; r++) {
			for(int c=0; c<colcount; c++) {
				data[r-1][c]=xlut.getCellData("Sheet1", r, c);
			}
		}
		
		return data;
		
	}

}
