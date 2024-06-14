
public class Auto {
    private String targa, marca, modello;
    private int cilindrata;

    public Auto (int cilindrata,String targa,String marca,String modello){
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    public String toString() {
        return "Auto{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
