package com.seleniumEasy.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./ConfigurationFiles/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is: " + e);
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getuserName() {
		String userName = pro.getProperty("userName");
		return userName;
	}

	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getchromePath() {
		String chromePath = pro.getProperty("chromePath");
		return chromePath;
	}

	public String getFirefoxPath() {
		String firefoxPath = pro.getProperty("firefoxPath");
		return firefoxPath;
		
	}
	public String getIEPath() {
		String iEPath = pro.getProperty("iEPath");
		return iEPath;
		
	}

}
