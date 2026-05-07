package ar.edu.unahur.obj2.uml.alquiler;

import java.util.Date;
import java.util.List;

import ar.edu.unahur.obj2.uml.alquiler.Alquiler;
import ar.edu.unahur.obj2.uml.vehiculos.*;

public class Alquiler {
    private Date fechaInicio;
    private Date fechaFin;

    public Alquiler(Date fechaInicio, Date fechaFin){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio(){
        return fechaInicio;
    }

    public Date getFechaFin(){
        return fechaFin;
    }

    public void setFin(Date fechaFin){
        this.fechaFin = fechaFin; 
    }

    private List<Vehiculo>alquileresRealizados;
    private List<Vehiculo>alquileresAlquilados;
    private List<Vehiculo>vehiculosDisponibles;

    public List<Vehiculo> getalquileresRealizados(){
        return alquileresRealizados;
    }

    public List<Vehiculo> getalquileresAlquilados(){
        return alquileresAlquilados;
    }

    public List<Vehiculo> getvehiculosDisponibles(){
        return vehiculosDisponibles;
    }
}
