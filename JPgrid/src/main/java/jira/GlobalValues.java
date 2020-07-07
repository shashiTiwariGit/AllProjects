package jira;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Training\\Workspace\\JPgrid\\data.properties");
		FileOutputStream fos= new FileOutputStream("D:\\Training\\Workspace\\JPgrid\\data1.properties");
		p.load(fis);
		System.out.println(p.get("browser"));
		System.out.println(p.get("url"));
		p.setProperty("browser", "Firefox");
		System.out.println(p.get("browser"));
		p.setProperty("avaivain", "LutGaya");
		p.store(fos, "Farzi");
		p.store(fos, "");
	}

}
