package com.cesarlead.hr.patterd.singleton;

import java.util.Properties;

public class Configuration {

    private static volatile Configuration INSTANCE;

    private final Properties properties = new Properties();

    private Configuration() {
        properties.put("server", "localhost");
        properties.put("port", "8080");
    }

    public static Configuration getInstance() {
        if (INSTANCE == null) {
            synchronized (Configuration.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Configuration();
                }
            }
        }
        return INSTANCE;
    }

    public String getServer() {
        return properties.getProperty("server");
    }

    public String getPort() {
        return properties.getProperty("port");
    }

}
