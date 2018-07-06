package gestionasistencia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GestionTest{
    @Before
    public void setUp(){

    }

    //el decorador @Test es substituto de extends TestCase, que es la otra manera de hacer que sea un test
    @Test
    public void creacionInstanciaGestor(){
        Gestion g = new Gestion();
        assert g != null;
    }

    @After
    public void tearDown(){
        return;
        //
        //
        //
    }
}