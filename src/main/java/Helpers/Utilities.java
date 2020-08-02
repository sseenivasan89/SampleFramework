package Helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utilities {
	static Properties prop = new Properties();
	public static String environment, userDataSet;
	public static String userName, password, browserName, firstName, lastName, emailAddressText, phoneNumber;

	public static Properties getProperties() {
		InputStream input = null;
		try {
			File propFile = new File("InputResource\\data.properties");

			if (!propFile.exists()) {
				prop.load(Utilities.class
						.getResourceAsStream("InputResource\\data.properties"));
			} else {
				input = new FileInputStream(propFile);
				prop.load(input);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prop;
	}

	public void readJsonData() throws IOException, ParseException {
		
		Properties property = Utilities.getProperties();
		environment = property.getProperty("environment");
		userDataSet = property.getProperty("userDataSet");
		
		System.out.println("***Selected Environment = " + environment);
		System.out.println("***Selected User Data Set = " + userDataSet);
		
		int ArraySet = 0;
		if (userDataSet.contains("user1")) {
			ArraySet = 0;
		}
		if (userDataSet.contains("user2")) {
			ArraySet = 1;
		}
		if (userDataSet.contains("user3")) {
			ArraySet = 2;
		}
		
		File filePath = new File("InputResource\\Data.json");
		FileReader reader = new FileReader(filePath);
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(reader);
		JSONObject JSONObject = (JSONObject) obj;
		browserName = JSONObject.get("browserName").toString();
		JSONArray userObjectArray = (JSONArray) JSONObject.get("userDetails");
		JSONObject userDetailsData = (JSONObject) userObjectArray.get(ArraySet);
		userName = (String) userDetailsData.get("userName");
		password = (String) userDetailsData.get("password");
		firstName = (String) userDetailsData.get("firstName");
		lastName = (String) userDetailsData.get("lastName");
		emailAddressText = (String) userDetailsData.get("emailAddressText");
		phoneNumber = (String) userDetailsData.get("phoneNumber");
		
		System.out.println("***Selected Browser Name = " + browserName);
		System.out.println("***Selected First Name = " + firstName);
		System.out.println("***Selected First Name = " + lastName);
		System.out.println("***Selected Email = " + emailAddressText);
		System.out.println("***Selected Phone Number = " + phoneNumber);
		System.out.println("***Selected UserName = " + userName);
		System.out.println("***Selected User Password = " + password);
				
	}
	
	public static String dateCreation(String format, String days) {
		
		String MonthAndDate = null;
		String TodaysDate = null;
		String CurrentDateAndTime = null;
		String Add5Days = null;
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat(format);
		Calendar c = Calendar.getInstance();
		if (format.matches("yyyy-MM-dd") && days.contains("5")) {
			c.setTime(new Date());
			c.add(Calendar.DATE, 5);
			Add5Days = dateFormat.format(c.getTime());
			return Add5Days;
		}
		
		return "nothing";
		
	}
}
