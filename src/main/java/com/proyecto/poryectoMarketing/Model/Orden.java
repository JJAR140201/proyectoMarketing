package com.proyecto.poryectoMarketing.Model;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechaCreaction;
    private Date fechaRecibida;
    private double total;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private detalleOrden DetalleOrden;

    public Orden(){

    }

    public Orden(Integer id, String numero, Date fechaCreaction, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreaction = fechaCreaction;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreaction=" + fechaCreaction +
                ", fechaRecibida=" + fechaRecibida +
                ", total=" + total +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreaction() {
        return fechaCreaction;
    }

    public void setFechaCreaction(Date fechaCreaction) {
        this.fechaCreaction = fechaCreaction;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public detalleOrden getDetalleOrden() {
        return DetalleOrden;
    }

    public void setDetalleOrden(detalleOrden detalleOrden) {
        DetalleOrden = detalleOrden;
    }
}
