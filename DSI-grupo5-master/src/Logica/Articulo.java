package Logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Articulo {
    
    private int idArticulo;
    private String titulo;
    private String descripcion;
    private String fecha;
    private boolean aceptado;
    private Integer idCliente; // Puede ser null si el cliente es eliminado
    private String NombreUsuario;

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {

        this.fecha = fecha;
    }

    public void setFecha() {
        LocalDate fechaHoy = LocalDate.now();
        String fecha = fechaHoy.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.fecha = fecha;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
    
}
