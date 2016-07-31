package Class;

import java.util.ArrayList;

public class ClienteFactory {
    
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();
    
    public ClienteFactory()
    {
    Cliente cliente1= new Cliente();
    cliente1.setUsername("genoveffo");
    cliente1.setPassword("pincopallino");
    lista.add(cliente1);
    
    
    Cliente cliente2= new Cliente();
    cliente2.setUsername("alfabeta");
    cliente2.setPassword("deltagamma68");
    lista.add(cliente2);
    
    }    
}

 