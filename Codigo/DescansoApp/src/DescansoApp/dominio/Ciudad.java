package descansoApp.dominio;

import descansoApp.herramientas.TipoCA;
import java.io.Serializable;
import java.util.*;
import javax.swing.ImageIcon;

public class Ciudad implements Serializable {
    private String nombre;
    private String descripcion;
    private String infoGral;
    private ImageIcon mapa;
    private ArrayList<ImageIcon> imagenes;
    private ArrayList<ComercioActividad> actividades;
    private ArrayList<ComercioActividad> estGastronomicos;
    private ArrayList<ComercioActividad> alojamientos;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; 
    } 

    public String getInfoGral() {
        return infoGral; 
    }

    public void setInfoGral(String infoGral) {
        this.infoGral = infoGral; 
    } 
   
    public ArrayList<ComercioActividad> getActividades() {
        return actividades;
    }

    public ArrayList<ComercioActividad> getEstGastronomicos() {
        return estGastronomicos;
    }

    public ArrayList<ComercioActividad> getAlojamientos() {
        return alojamientos;
    }

    @Override
    public String toString() {
        return  nombre; 
    }
    
    public boolean perteneceComercioActividad(TipoCA tipo, ComercioActividad cA){
        switch (tipo) {
            case alojamiento:
                return alojamientos.contains(cA);
            case estGastronomico:
                return estGastronomicos.contains(cA);
            case actividad:
                return actividades.contains(cA);
        }

        return false;
    }
    
    public void agregarComercioActividad(TipoCA tipo, ComercioActividad cA){
        switch (tipo) {
            case alojamiento:
                alojamientos.add(cA);
                break;
            case estGastronomico:
                estGastronomicos.add(cA);
                break;
            case actividad:
                actividades.add(cA);
                break;
        }
    }
    
    public Ciudad() {
        nombre = "";
        infoGral = "";
        imagenes = new ArrayList<>();
        actividades = new ArrayList<>();
        estGastronomicos = new ArrayList<>();
        alojamientos = new ArrayList<>();
    }
    
    public Ciudad(String unNombre, String unaInfo) {
        nombre = unNombre;
        infoGral = unaInfo;
        imagenes = new ArrayList<>();
        actividades = new ArrayList<>();
        estGastronomicos = new ArrayList<>();
        alojamientos = new ArrayList<>();
    }
    
    @Override 
    public boolean equals(Object obj){
        boolean valido = false;
        Ciudad ci= (Ciudad) obj;
        if (ci.getNombre().equalsIgnoreCase(this.getNombre())) {
            valido = true;
        }
        return valido;
    }
    
    public void agregarImagen(String ruta){
      //  imagenes.add(new javax.swing.ImageIcon(ruta));
        imagenes.add(new javax.swing.ImageIcon(getClass().getResource(ruta))); //imagen vieja
    }
    
    public void agregarImagenDesdeRuta(String ruta){
        try{
            imagenes.add(new javax.swing.ImageIcon(ruta));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<ImageIcon> getImagenes() {
        return imagenes;
    }
    
    public void agregarMapa(String ruta){
        try{
            mapa = new javax.swing.ImageIcon(ruta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public ImageIcon getMapa(){
        try{
            return this.mapa;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
