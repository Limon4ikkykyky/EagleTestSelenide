package utils;

import org.junit.jupiter.api.Assertions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CommonUtils {
    public static String getCentralData(String name) {

        String filePath = "./src/main/resources/test.properties";
        return getProperty(filePath, name);
    }

    public static String getProperty(String filePath, String propertyName) {
        Properties prop = new Properties();
        InputStream input = null;
        String value = null;
        try {
            input = new FileInputStream(filePath);
            prop.load(input);
            value = prop.getProperty(propertyName);
        } catch (Exception ex) {
            Assertions.fail(ex.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    Assertions.fail(ex.getMessage());
                }
            }
        }
        return value;
    }
}