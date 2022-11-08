package pb2.unlam.edu.ar;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCoaliciones {

    @Test
    public void queSePuedaCrearUnAuto(){
        Vehiculo auto = new Auto("AA231NW", 41.28, 2.175, 5, 220);
        assertNotNull(auto);
    }

    @Test
    public void queSePuedaCrearUnaMoto(){
        Vehiculo moto = new Moto("A050EKP",28.3, 52.5, 120);
        assertNotNull(moto);
    }

    @Test
    public void queSePuedaCrearUnaBicicleta(){
        Vehiculo bici = new Bicicleta(28.3, 52.5);
        assertNotNull(bici);
    }

    @Test
    public void queSePuedaCrearUnTren(){
        Vehiculo tren = new Tren(36.9, 19.6, 280, 15, 250);
        assertNotNull(tren);
    }

    @Test
    public void queSePuedanIncorporarDistintosVehiculos() throws ColitionException {
        Mapa mapa = new Mapa("Gran BsAs");

        mapa.agregarVehiculo(new Auto("AA231NW", 41.2, 36.9, 5, 130));
        mapa.agregarVehiculo(new Moto("A050EKP",28.3, 52.5, 120));
        mapa.agregarVehiculo(new Bicicleta(28.4, 52.6));
        mapa.agregarVehiculo(new Tren(36.9, 19.6, 280, 15, 250));
        mapa.agregarVehiculo(new Auto("AA578XV", 41.0, 37.0, 5, 160));

        assertEquals((Integer) 5, mapa.obtenerCantDeVehiculos());
        assertFalse(mapa.hayCoalicion());
    }

    @Test (expected = ColitionException.class)
    public void queChoquenDosVehiculos() throws ColitionException{
        Mapa mapa = new Mapa("Gran BsAs");

        mapa.agregarVehiculo(new Auto("AA231NW", 41.2, 36.9, 5, 130));
        mapa.agregarVehiculo(new Moto("A050EKP",28.3, 52.5, 120));
        mapa.agregarVehiculo(new Auto("AA578XV", 41.2, 36.9, 5, 160));

        assertTrue(mapa.hayCoalicion());
    }
}
