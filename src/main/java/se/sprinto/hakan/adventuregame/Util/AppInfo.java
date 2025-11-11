package se.sprinto.hakan.adventuregame.Util;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppInfo {
    private static AppInfo instance;
    private Properties properties;

    //Privat konstruktor för att hindra direkt skapande utanför klassen
    private AppInfo(){
        properties = new Properties();
        try (FileReader reader = new FileReader("config.properties")){
            properties.load(reader);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    // För att hämta samma instans varje gång
    public static AppInfo getInstance(){
        if (instance == null){
            instance = new AppInfo();
        }
        return instance;
    }

    //Metoder för att hämta värden
    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
