package propiedades;

import java.io.IOException;
import java.util.Properties;

public class Propiedades extends Properties {
    
    public Propiedades(String idioma) {
        getProperties(idioma+".properties");
    }
    private void getProperties(String idioma) {
        try {
            this.load(getClass().getResourceAsStream(idioma));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
