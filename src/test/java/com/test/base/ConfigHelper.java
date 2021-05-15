package com.test.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum ConfigHelper {
	INSTANCE;

	public String getProperty(String property) {
		Properties properties = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(property);
	}

}
