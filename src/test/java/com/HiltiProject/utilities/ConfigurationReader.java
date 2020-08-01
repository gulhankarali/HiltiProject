package com.HiltiProject.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    public static Properties properties;
    static {
        String path= "configuration.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            properties= new Properties();
            properties.load(input);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String get(String keyname){
        return properties.getProperty(keyname);
    }

}
