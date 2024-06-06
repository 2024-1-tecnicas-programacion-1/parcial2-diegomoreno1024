package parcial2;

public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;
    //complejidad: O(1) Constante.
    public Motocicleta(String marca, String modelo, int anio, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, anio);
        this.tipoMotocicleta= tipoMotocicleta;
    }
    //complejidad: O(1) Constante.
    public String imprimirInformacion() {
        return getMarca()+" "+getModelo()+" "+getAño()+", tipo de motocicleta: "+getTipoMotocicleta();
    }
    //complejidad: O(1) Constante.
    public TipoMotocicleta getTipoMotocicleta(){
        return tipoMotocicleta;
    }
    //complejidad: O(1) Constante.
    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta){
        this.tipoMotocicleta=tipoMotocicleta;
    }
}
