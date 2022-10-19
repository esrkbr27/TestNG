package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //Javadakı Properties classından obje ürettik asagıda (objenın esitlikten öncekı kısmını)deger burda atamadık
    public static Properties properties;

          static { //her metottan önce calışır

              String dosyayolu="configuration.properties";
              try {
                  FileInputStream fis=new FileInputStream(dosyayolu);
                  //objenin esitlikten sonrakı kısmını buraya yazdık
                  properties = new Properties();

                  //fisin okudugu bilgileri propertiese yukledi.
                  properties.load(fis);


              }  catch (IOException e) {
                  throw new RuntimeException(e);
              }


          }

    public static String getProperty(String key) {
        /*
        Test metodundan yolladıgımız key degerini alıp properties
        classından getProperty(String key) metodunu kullanarak bu keye
        ait valueyu bize getirir.
         */

        return properties.getProperty(key);
    }
}
