package com.utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;
	static {
		
	
	try {
		properties = new Properties();
		InputStream is=ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
		properties.load(is);
	}catch (Exception e){
		e.printStackTrace();
	}
	}
	public static String get(String key) {
		return properties.getProperty(key);
	}
	

}
