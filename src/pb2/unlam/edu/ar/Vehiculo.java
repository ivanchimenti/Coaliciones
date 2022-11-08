package pb2.unlam.edu.ar;

public abstract class Vehiculo {
    protected String patente;
    protected Double latitud;
    protected Double longitud;

    public Vehiculo() {}

    public Vehiculo(String patente, Double latitud, Double longitud) {
        this.patente = patente;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Vehiculo(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
