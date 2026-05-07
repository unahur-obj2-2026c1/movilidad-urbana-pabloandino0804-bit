package ar.edu.unahur.obj2.uml.vehiculos;

public class Monopatin extends Vehiculo{
    private String marca;

    public Monopatin(boolean estaDisponible, String marca){
        super(estaDisponible);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}
