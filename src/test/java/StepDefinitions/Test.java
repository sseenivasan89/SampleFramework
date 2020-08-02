package StepDefinitions;

import java.util.Properties;
import Helpers.ReadDataFromExcel;
import Helpers.Utilities;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ReadDataFromExcel readData = new ReadDataFromExcel();
		readData.readExcelData();
		
		Properties property = Utilities.getProperties();
		String environment = property.getProperty("environment");
		System.out.println(environment);
		
		Utilities obj = new Utilities();
		obj.readJsonData();
		System.out.println(Utilities.userName);
	}

}
