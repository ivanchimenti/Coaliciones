package pb2.unlam.edu.ar;

public class Moto extends Vehiculo {
    private Integer velocidadMax;

    public Moto(String patente, Double latitud, Double longitud, Integer velocidadMax) {
        super(patente, latitud, longitud);
        this.velocidadMax = velocidadMax;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
}
