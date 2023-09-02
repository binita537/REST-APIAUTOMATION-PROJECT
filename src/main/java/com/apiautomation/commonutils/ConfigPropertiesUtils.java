package com.apiautomation.commonutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigPropertiesUtils {


    private Properties properties = new Properties();
    private Map<String, String> keyValueMap = new HashMap<>();


    private void loadProperties(String fileName) {
        try (InputStream inputStream = new FileInputStream(fileName)) {
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties.entrySet().forEach(e -> keyValueMap.put(String.valueOf(e.getKey()), String.valueOf(e.getValue())));
    }

    public String getValue(String key) {
        return keyValueMap.get(key);
    }


}
