package edu.ec.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

public class Venta {

    private Integer id;
    private String numeroVenta;
    private LocalDate fecha;
    private double total;
    private String estado;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumeroVenta() {
        return numeroVenta;
    }
    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
