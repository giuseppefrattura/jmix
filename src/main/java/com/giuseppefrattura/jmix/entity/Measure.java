package com.giuseppefrattura.jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Entity(name = "gf_Measure")
@Table(name = "GF_MEASURE")
@Data
public class Measure implements Serializable {

    @Id
    @Column(name = "ID")
    @JmixGeneratedValue
    private UUID id;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @Column(name = "DATE", nullable = false)
    private Date date;

    @Column(name = "WEIGHT", nullable = false)
    private Double weight;

    @Column(name = "VITA")
    private Double vita;

    @Column(name = "Petto")
    private Double petto;

    @Column(name = "COSCIA")
    private Double coscia;

    @Column(name = "POLPACCIO")
    private Double polpaccio;

    @Column(name = "VO2MAX")
    private Double vo2Max;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVita() {
        return vita;
    }

    public void setVita(Double vita) {
        this.vita = vita;
    }

    public Double getPetto() {
        return petto;
    }

    public void setPetto(Double petto) {
        this.petto = petto;
    }

    public Double getCoscia() {
        return coscia;
    }

    public void setCoscia(Double coscia) {
        this.coscia = coscia;
    }

    public Double getPolpaccio() {
        return polpaccio;
    }

    public void setPolpaccio(Double polpaccio) {
        this.polpaccio = polpaccio;
    }

    public Double getVo2Max() {
        return vo2Max;
    }

    public void setVo2Max(Double vo2Max) {
        this.vo2Max = vo2Max;
    }
}