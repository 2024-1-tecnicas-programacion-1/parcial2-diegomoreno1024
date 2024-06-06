package parcial2;

public class Vehiculo{
    private String marca;
    private String modelo;
    private int anio;
    //complejidad: O(1) Constante.
    public Vehiculo(String marca, String modelo, int anio){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
    }
    //complejidad: O(1) Constante.
    public String imprimirInformacion(){
        return getMarca()+" "+getModelo()+" "+getAño();
    }
    //complejidad: O(1) Constante.
    public String getMarca(){
        return marca;
    }
    //complejidad: O(1) Constante.
    public String getModelo(){
        return modelo;
    }
    //complejidad: O(1) Constante.
    public int getAño(){
        return anio;
    }
    //complejidad: O(1) Constante.
    public void setMarca(String marca){
        this.marca= marca;
    }
    //complejidad: O(1) Constante.
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    //complejidad: O(1) Constante.
    public void setAño(int anio){
        this.anio=anio;
    }
}
