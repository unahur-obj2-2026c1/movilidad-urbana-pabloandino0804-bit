package ar.edu.unahur.obj2.uml;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.uml.vehiculos.*;

public class Usuario {
    private String nombre;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    

    public Usuario (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public List<Vehiculo> vehiculosDisp(){
        return vehiculos;
    }
}