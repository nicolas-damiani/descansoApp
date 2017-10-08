package descansoApp.dominio;

import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Ciudad;
import descansoApp.herramientas.TipoCA;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class CiudadTest {

    @Test
    public void testGetNombre() {
        System.out.println("Get Nombre");
        String nombre = "Fray Bentos";
        Ciudad instance = new Ciudad(nombre, "");

        String expResult = "Fray Bentos";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString() {
        System.out.println("ToString");
        String nombre = "Fray Bentos";
        Ciudad instance = new Ciudad(nombre, "");

        String expResult = "Fray Bentos";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombre() {
        System.out.println("Set Nombre");
        String nombre = "Fray Bentos";
        Ciudad instance = new Ciudad();
        instance.setNombre(nombre);

        String expResult = "Fray Bentos";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("Get Descripcion");
        String descripcion = "Des";
        Ciudad instance = new Ciudad();
        instance.setDescripcion(descripcion);

        String expResult = "Des";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("Set Descripcion");
        String descripcion = "Des";
        Ciudad instance = new Ciudad();
        instance.setDescripcion(descripcion);

        String expResult = "Des";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetInfoGral() {
        System.out.println("Get Info Gral");
        String infoGral = "Informacion";
        Ciudad instance = new Ciudad("", infoGral);

        String expResult = "Informacion";
        String result = instance.getInfoGral();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetInfoGral() {
        System.out.println("Set Info Gral");
        String infoGral = "Informacion";
        Ciudad instance = new Ciudad();
        instance.setInfoGral(infoGral);

        String expResult = "Informacion";
        String result = instance.getInfoGral();
        assertEquals(expResult, result);
    }

    @Test
    public void testPerteneceComercioActividad1() {
        System.out.println("Pertenece Comercio Actividad (comercioActividad no pertenece a la ciudad)");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("alojamiento");
        Ciudad instance = new Ciudad();

        boolean expResult = false;
        boolean result = instance.perteneceComercioActividad(TipoCA.alojamiento, cA);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerteneceComercioActividad2() {
        System.out.println("Pertenece Comercio Actividad (comercioActividad no pertenece a la ciudad)");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("estGastronomico");
        Ciudad instance = new Ciudad();

        boolean expResult = false;
        boolean result = instance.perteneceComercioActividad(TipoCA.estGastronomico, cA);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerteneceComercioActividad3() {
        System.out.println("Pertenece Comercio Actividad (comercioActividad no pertenece a la ciudad)");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("actividad");
        Ciudad instance = new Ciudad();

        boolean expResult = false;
        boolean result = instance.perteneceComercioActividad(TipoCA.actividad, cA);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerteneceComercioActividad4() {
        System.out.println("Pertenece Comercio Actividad (comercioActividad no pertenece a la ciudad)");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("actividad");
        Ciudad instance = new Ciudad();

        boolean expResult = false;
        boolean result = instance.perteneceComercioActividad(TipoCA.otros, cA);
        assertEquals(expResult, result);
    }

    @Test
    public void testAgregarComercioActividad() {
        System.out.println("Agregar Comercio Actividad(se agrega correctamente)");
        ComercioActividad cA = new ComercioActividad();

        cA.setNombre("actividad");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.actividad, cA);

        ComercioActividad expResult = new ComercioActividad("actividad", null, TipoCA.actividad, null, null, null, null, null, null);
        ComercioActividad result = instance.getActividades().get(0);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetActividades() {
        System.out.println("Get Actividades");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("actividad");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.actividad, cA);

        ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(cA);
        ArrayList<ComercioActividad> result = instance.getActividades();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEstGastronomicos() {
        System.out.println("Get Est Gastronomicos");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("estGastronomico");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.estGastronomico, cA);

        ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(cA);
        ArrayList<ComercioActividad> result = instance.getEstGastronomicos();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAlojamientos() {
        System.out.println("Get Alojamientos");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("alojamiento");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.alojamiento, cA);

        ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(cA);
        ArrayList<ComercioActividad> result = instance.getAlojamientos();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals(compara dos ciudades con distintos nombres)");
        Ciudad c1 = new Ciudad();
        c1.setNombre("Ciudad1");
        Ciudad c2 = new Ciudad();
        c1.setNombre("Ciudad2");

        boolean expResult = false;
        boolean result = c1.equals(c2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals2() {
        System.out.println("equals(compara dos ciudades con nombres iguales)");
        Ciudad c1 = new Ciudad();
        c1.setNombre("Ciudad1");
        Ciudad c2 = new Ciudad();
        c2.setNombre("Ciudad1");

        boolean expResult = true;
        boolean result = c1.equals(c2);
        assertEquals(expResult, result);
    }

    @Test
    public void testAgregarImagen() {
        System.out.println("Agregar imagen(agrega imagen a una lista de imagenes)");
        String ruta = "/descansoApp/baseDatos/fraybentos1.jpg";
        Ciudad instance = new Ciudad();
        instance.agregarImagen(ruta);

        String expResult = "basedatos/fraybentos1.jpg";
        String aux = instance.getImagenes().get(0).getDescription();
        String[] split = aux.split("/descansoApp/");
        String result = split[1].toLowerCase();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetImagenes() {
        System.out.println("GetImagenes compara las rutas de una lista de imagenes");
        String ruta = "/descansoApp/baseDatos/fraybentos2.jpg";
        Ciudad instance = new Ciudad();
        instance.agregarImagen(ruta);

        String expResult = "basedatos/fraybentos2.jpg";
        String aux = instance.getImagenes().get(0).getDescription();
        System.out.println("HOLA");
        System.out.println("HOLA");
        System.out.println(aux);
        System.out.println("HOLA");
        System.out.println("HOLA");
        String[] split = aux.split("/descansoApp/");
        String result = split[1].toLowerCase();
        assertEquals(expResult, result);

    }
}
