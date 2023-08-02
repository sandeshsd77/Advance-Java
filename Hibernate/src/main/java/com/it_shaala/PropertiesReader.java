package com.it_shaala;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesReader {
    public static void main( String[] args ) throws IOException {
        // reading the data from properties file and putting this in the properties object.
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sande\\IdeaProjects\\Hibernate\\src\\main\\java\\com\\it_shaala\\hibernate.cfg.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        System.out.println("url "+properties.getProperty("url"));
        System.out.println("username "+properties.getProperty("username"));
        System.out.println("password "+properties.getProperty("password"));
    }
}
