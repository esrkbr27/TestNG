package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

          static { //her metottan önce calışır

              String dosyayolu="configuration.properties";
              try {
                  FileInputStream fis=new FileInputStream(dosyayolu);
                  properties = new Properties();
                  properties.load(fis);
                  //fisin okudugu bilgileri propertiese yukledi.

              }  catch (IOException e) {
                  throw new RuntimeException(e);
              }


          }

    public static String getProperty(String key) {
        /*
        Test metodundan yolladıgımı9z key degerini alıp properties
        classından getProperty(String key) metodunu kullanarak bu keye
        ait valueyu bize getirir.
         */

        return properties.getProperty(key);
    }
}
