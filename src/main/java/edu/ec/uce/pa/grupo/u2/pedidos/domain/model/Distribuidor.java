package edu.ec.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //que esta clase es administrada por Jakarta Persistence API
@Table(name = "distribuidores")
public class Distribuidor {

    @Id
    @SequenceGenerator(name = "distribuidor_seq" , sequenceName = "distribuidor_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "distribuidor_seq") 
    @Column(name = "dist_id") 
    private Integer id;

    @Column(name = "dist_nombre") 
    private String nombre;

    @Column(name = "dist_ruc") 
    private String ruc;

    @Column(name = "dist_telefono") 
    private String telefono;

    @Column(name = "dist_direccion") 
    private String direccion;
    
    @Override
    public String toString() {
        return "Distribuidor [id=" + id + ", nombre=" + nombre + ", ruc=" + ruc + ", telefono=" + telefono
                + ", direccion=" + direccion + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
