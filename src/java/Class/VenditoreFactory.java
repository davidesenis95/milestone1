package Class;

import java.util.ArrayList;

public class VenditoreFactory {
    
        private ArrayList<Venditore> lista =new ArrayList<Venditore>();
    
    public VenditoreFactory()
    {       
    Venditore venditore1= new Venditore();
    venditore1.setUsername("d.senis");
    venditore1.setPassword("rjctrt");
    lista.add(venditore1);
    
    Venditore venditore2= new Venditore();
    venditore2.setUsername("armadillo95");
    venditore2.setPassword("amm2016");
    lista.add(venditore2);
    
    }   
}
