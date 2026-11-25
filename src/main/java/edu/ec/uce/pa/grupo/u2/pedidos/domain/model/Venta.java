package edu.ec.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //que esta clase es administrada por Jakarta Persistence API
@Table(name = "ventas")
public class Venta {

    @Id
    @SequenceGenerator(name = "venta_seq" , sequenceName = "venta_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venta_seq") 
    @Column(name = "vent_id")
    private Integer id;
    @Column(name = "vent_numeroVenta")
    private String numeroVenta;

    @Column(name = "vent_fecha")
    private LocalDate fecha;

    @Column(name = "vent_total")
    private double total;

    @Column(name = "vent_estado")
    private String estado;

    @Override
    public String toString() {
        return "Venta [id=" + id + ", numeroVenta=" + numeroVenta + ", fecha=" + fecha + ", total=" + total
                + ", estado=" + estado + "]";
    }
    
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
