package pb2.unlam.edu.ar;

public class Auto extends Vehiculo {
    private Integer cantPersonas;
    private Integer velocidadMax;

    public Auto(String patente, Double latitud, Double longitud, Integer cantPersonas, Integer velocidadMax) {
        super(patente, latitud, longitud);
        this.cantPersonas = cantPersonas;
        this.velocidadMax = velocidadMax;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

}
