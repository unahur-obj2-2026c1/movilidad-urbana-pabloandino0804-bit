package ar.edu.unahur.obj2.uml;

public class Alquiler {
    private Fecha fechaInicio;
    private Fecha fechaFin;

    public Alquiler(Fecha fechaInicio, Fecha fechaFin){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Fecha getFechaInicio(){
        return fechaInicio;
    }

    public Fecha getFechaFin(){
        return fechaFin;
    }
}
