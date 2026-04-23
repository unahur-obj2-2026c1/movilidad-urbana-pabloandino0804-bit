package ar.edu.unahur.obj2.uml;

public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Fecha(Integer dia, Integer mes, Integer anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }  

    public Integer getDia(){
        return dia;
    }

    public Integer getMes(){
        return mes;
    }

    public Integer getAño(){
        return anio;
    }
}
