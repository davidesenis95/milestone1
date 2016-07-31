package Class;

public class Oggetti {
    private String modello;
    private String foto;
    private Integer quantità;
    private Double prezzo;

    public String Modello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getQuantità() {
        return quantità;
    }
    
    void setQuantità(Integer quantità) {
        this.quantità = quantità;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
    
}
