package ar.edu.unahur.obj2.uml;

public class Usuario {
    private String nombre;
    private Double dinero;

    public Usuario (String nombre, Double dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getDinero(){
        return dinero;
    }
}