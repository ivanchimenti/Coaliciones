package pb2.unlam.edu.ar;

import java.util.ArrayList;

public class Mapa {
    private String nombreCiudad;
    private ArrayList<Vehiculo> vehiculos;

    public Mapa(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void agregarVehiculo(Vehiculo v){
        this.vehiculos.add(v);
    }

    public Integer obtenerCantDeVehiculos(){
        return this.vehiculos.size();
    }

    public Boolean hayCoalicion() throws ColitionException {

        for (Vehiculo v : vehiculos) {
            for (Vehiculo v2: vehiculos) {
                if (!(v.equals(v2))){
                    if ((v.getLatitud().equals(v2.getLatitud())) && (v.getLongitud().equals(v2.getLongitud()))) {
                        throw new ColitionException("Los vehiculos chocaron");
                    }
                }
            }
        }
        return false;
    }

}
