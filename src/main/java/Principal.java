
import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
import parcial2.Vehiculo;

public class Principal {
    
    public static void main(String[] args) {
        Vehiculo vehiculoCreado= new Vehiculo("Toyota", "Land Cruiser", 2020);
        Automovil automovilCreado= new Automovil("Volvo", "cx40", 2024, 5, TipoCombustible.HIBRIDO);
        Motocicleta motocicletaCreada= new Motocicleta("Yamaha", "YZF-R3", 0, TipoMotocicleta.DEPORTIVA);
    }
}
