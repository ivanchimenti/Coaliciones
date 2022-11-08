package pb2.unlam.edu.ar;

public class Tren extends Vehiculo {
    private Integer velocidadMax;
    private Integer cantVagones;
    private Integer cantPasajeros;

    public Tren(Double latitud, Double longitud, Integer velocidadMax, Integer cantVagones, Integer cantPasajeros) {
        super(latitud,longitud);
        this.velocidadMax = velocidadMax;
        this.cantVagones = cantVagones;
        this.cantPasajeros = cantPasajeros;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Integer getCantVagones() {
        return cantVagones;
    }

    public void setCantVagones(Integer cantVagones) {
        this.cantVagones = cantVagones;
    }

    public Integer getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(Integer cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
}
