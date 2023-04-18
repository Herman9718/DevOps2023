package mx.tecnm.itlp.models;

import java.sql.Time;

public class Historial {
    private int id;
    private java.sql.Timestamp fecha;
    private Time tiempoAvance;
    private int peliculaId;
    private int perfilId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public java.sql.Timestamp getFecha() {
        return fecha;
    }
    public void setFecha(java.sql.Timestamp timestamp) {
        this.fecha = timestamp;
    }
    public Time getTiempoAvance() {
        return tiempoAvance;
    }
    public void setTiempoAvance(Time tiempo_avance) {
        this.tiempoAvance = tiempo_avance;
    }
    public int getPeliculaId() {
        return peliculaId;
    }
    public void setPeliculaId(int pelicula_id) {
        this.peliculaId = pelicula_id;
    }
    public int getPerfilId() {
        return perfilId;
    }
    public void setPerfilId(int perfil_id) {
        this.perfilId = perfil_id;
    }

}