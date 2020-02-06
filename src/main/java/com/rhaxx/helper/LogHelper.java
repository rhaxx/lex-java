package com.rhaxx.helper;

import java.io.File;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.status.StatusLogger;

public class LogHelper {

	static {
		/* Turning off default status logging in console */
		StatusLogger.getLogger().setLevel(Level.OFF);
		/* Setting the path for the log4j2 configuration file */
		String configPath = LogHelper.class.getResource("/log4j2.xml").getPath();
		((LoggerContext) LogManager.getContext(false)).setConfigLocation(new File(configPath).toURI());
	}

	public static Logger getLogger(Class<?> clazz) {
		return LogManager.getLogger(clazz);
	}

}
