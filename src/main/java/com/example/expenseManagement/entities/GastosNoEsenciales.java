package com.example.expenseManagement.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
@Entity
@Table(name="GastosNoEsenciales")
public class GastosNoEsenciales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //para generar los id automaticamente
    private long id;

    @Column(name = "mecato")
    private float mecato;

    @Column(name = "alcohol")
    private float alcohol;   //lo que tiene que ver con transporte

    @Column(name = "propina")
    private float propina;

    @Column(name = "diversion")
    private float diversion;

    @Column(name = "regalos")
    private float regalos;

    @Column(name = "otros")
    private float otros;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getMecato() {
        return mecato;
    }

    public void setMecato(float mecato) {
        this.mecato = mecato;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public float getPropina() {
        return propina;
    }

    public void setPropina(float propina) {
        this.propina = propina;
    }

    public float getDiversion() {
        return diversion;
    }

    public void setDiversion(float diversion) {
        this.diversion = diversion;
    }

    public float getRegalos() {
        return regalos;
    }

    public void setRegalos(float regalos) {
        this.regalos = regalos;
    }

    public float getOtros() {
        return otros;
    }

    public void setOtros(float otros) {
        this.otros = otros;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
}
