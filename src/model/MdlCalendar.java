package model;


/**
 *
 * @author Santiago Nieto
 */
public class MdlCalendar {

    private String nombre;
    private String descripcion;
    private String hora_incio;
    private String hora_fin;

   
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

    public String getHora_incio() {
        return hora_incio;
    }

    public void setHora_incio(String hora_incio) {
        this.hora_incio = hora_incio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

}
