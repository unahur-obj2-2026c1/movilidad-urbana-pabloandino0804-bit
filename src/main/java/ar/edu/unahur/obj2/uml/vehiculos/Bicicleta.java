package ar.edu.unahur.obj2.uml.vehiculos;

public class Bicicleta extends Vehiculo{
    private Integer rodado;

    public Bicicleta(Integer disponibilidad, Integer rodado){
        super(disponibilidad);
        this.rodado = rodado;
    }

    public Integer getRodado(){
        return rodado;
    }

    public void cambiarRodado(Integer rodado){
        this.rodado = rodado;
    }
}