package ar.edu.unahur.obj2.uml.vehiculos;

public class Vehiculo {
    protected boolean estaDisponible;

    public Vehiculo(boolean estaDisponible){
        this.estaDisponible = estaDisponible;
    }
    
    public boolean getDisponibilidad(){
        return estaDisponible;
    }

    public void setDisponibilidad(boolean disponibilidad){
        this.estaDisponible = disponibilidad;
    }
}
