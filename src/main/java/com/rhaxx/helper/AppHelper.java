package com.rhaxx.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppHelper {

	public static final Properties PROPERTIES;
	public static InputStream inputStream = null;

	static {
		try {
			inputStream = AppHelper.class.getResourceAsStream("/configuration.properties");
		} catch (Exception e) {
			LogHelper.getLogger(AppHelper.class).error(e.getMessage(), e);
		}

		PROPERTIES = new Properties();

		try {
			PROPERTIES.load(inputStream);
		} catch (IOException e) {
			LogHelper.getLogger(AppHelper.class).error(e.getMessage(), e);
		}
	}

}
