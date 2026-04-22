package ar.edu.unahur.obj2.uml.vehiculos;

public class Monopatin extends Vehiculo{
    private String marca;

    public Monopatin(Integer disponibilidad, String marca){
        super(disponibilidad);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}
