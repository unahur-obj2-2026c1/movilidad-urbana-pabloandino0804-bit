package ar.edu.unahur.obj2.uml.vehiculos;

public class Bicicleta extends Vehiculo{
    private Integer rodado;

    public Bicicleta(boolean estaDisponible, Integer rodado){
        super(estaDisponible);
        this.rodado = rodado;
    }

    public Integer getRodado(){
        return rodado;
    }

    public void cambiarRodado(Integer rodado){
        this.rodado = rodado;
    }
}