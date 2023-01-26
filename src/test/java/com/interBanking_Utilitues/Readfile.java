package com.interBanking_Utilitues;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readfile {
	Properties pro;

	public Readfile() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getApplicationURL() {
		String Url = pro.getProperty("baseUrl");
		return Url;

	}

	public String getLoginUsername() {
		String user = pro.getProperty("username");
		return user;

	}

	public String getLoginPassword() {
		String pass = pro.getProperty("password");
		return pass;

	}
}
