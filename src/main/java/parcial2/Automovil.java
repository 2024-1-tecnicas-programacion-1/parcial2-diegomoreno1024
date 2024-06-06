package parcial2;

public class Automovil extends  Vehiculo{
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    //complejidad: O(1) Constante.
    public Automovil(String marca, String modelo, int anio,int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, anio);
        this.numeroPuertas= numeroPuertas;
        this.tipoCombustible= tipoCombustible;
    }
    //complejidad: O(1) Constante.
    public String imprimirInformacion() {
        return getMarca()+" "+getModelo()+" "+getAño()+", "+getNumeroPuertas()+" puertas"+", combustión a "+getTipoCombustible();
    }
    //complejidad: O(1) Constante.
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    //complejidad: O(1) Constante.
    public TipoCombustible getTipoCombustible(){
        return tipoCombustible;
    }
    //complejidad: O(1) Constante.
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas=numeroPuertas;
    }
    //complejidad: O(1) Constante.
    public void setTipoCombustible(TipoCombustible tipoCombustible){
        this.tipoCombustible= tipoCombustible;
    }
}
