package Class;

import java.util.ArrayList;

public class OggettiFactory {
    
    private ArrayList<Oggetti> lista = new ArrayList<Oggetti>();
    
    public OggettiFactory(){
    
    Oggetti oggetto1= new Oggetti();
    oggetto1.setModello("Samsung Galaxy S6");
    oggetto1.setFoto("Foto/samsung_galaxy_s6.jpg");
    oggetto1.setQuantità(4);
    oggetto1.setPrezzo(399.00);
    lista.add(oggetto1);
    
    Oggetti oggetto2= new Oggetti();
    oggetto2.setModello("IPhone 6S");
    oggetto2.setFoto("Foto/iphone_6s.jpg");
    oggetto2.setQuantità(5);
    oggetto2.setPrezzo(599.00);
    lista.add(oggetto2);
    
    Oggetti oggetto3= new Oggetti();
    oggetto3.setModello("LG G3");
    oggetto3.setFoto("Foto/lg_g3.jpg");
    oggetto3.setQuantità(2);
    oggetto3.setPrezzo(199.00);
    lista.add(oggetto3);
    
    Oggetti oggetto4= new Oggetti();
    oggetto4.setModello("Xiaomi Mi3");
    oggetto4.setFoto("Foto/xiaomi_mi3.jpg");
    oggetto4.setQuantità(1);
    oggetto4.setPrezzo(219.00);
    lista.add(oggetto4);
    
    Oggetti oggetto5= new Oggetti();
    oggetto5.setModello("IPad Air 2");
    oggetto5.setFoto("Foto/ipad_air2.jpg");
    oggetto5.setQuantità(2);
    oggetto5.setPrezzo(499.00);
    lista.add(oggetto5);
    
    
    
    
}
    
}

