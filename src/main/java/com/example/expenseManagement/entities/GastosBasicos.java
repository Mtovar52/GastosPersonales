package com.example.expenseManagement.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
@Entity
@Table(name="GastosBasicos")
public class GastosBasicos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //para generar los id automaticamente
    private long id;

    @Column(name = "internet")
    private float internet;

    @Column(name = "gasolina")
    private float gasolina;   //lo que tiene que ver con transporte

    @Column(name = "agua")
    private float agua;

    @Column(name = "luz")
    private float luz;

    @Column(name = "gas")
    private float gas;

    @Column(name = "comida")
    private float comida;

    @Column(name = "aseo")
    private float aseo;

    @Column(name = "medicina")
    private float medicina;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getInternet() {
        return internet;
    }

    public void setInternet(float internet) {
        this.internet = internet;
    }

    public float getGasolina() {
        return gasolina;
    }

    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getLuz() {
        return luz;
    }

    public void setLuz(float luz) {
        this.luz = luz;
    }

    public float getGas() {
        return gas;
    }

    public void setGas(float gas) {
        this.gas = gas;
    }

    public float getComida() {
        return comida;
    }

    public void setComida(float comida) {
        this.comida = comida;
    }

    public float getAseo() {
        return aseo;
    }

    public void setAseo(float aseo) {
        this.aseo = aseo;
    }

    public float getMedicina() {
        return medicina;
    }

    public void setMedicina(float medicina) {
        this.medicina = medicina;
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
