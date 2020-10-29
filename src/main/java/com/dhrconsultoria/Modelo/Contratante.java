/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhrconsultoria.Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author administrador
 */
@Entity
@Table(name = "contratante", catalog = "magalhaes", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratante.findAll", query = "SELECT c FROM Contratante c"),
    @NamedQuery(name = "Contratante.findById", query = "SELECT c FROM Contratante c WHERE c.id = :id"),
    @NamedQuery(name = "Contratante.findByNome", query = "SELECT c FROM Contratante c WHERE c.nome = :nome")})
public class Contratante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "contratanteId")
    private List<Enviowhatsapp> enviowhatsappList;
    @OneToMany(mappedBy = "contratanteId")
    private List<Carteira> carteiraList;
    @OneToMany(mappedBy = "contratanteId")
    private List<Distribuicao> distribuicaoList;
    @OneToMany(mappedBy = "contratanteId")
    private List<Enviosms> enviosmsList;

    public Contratante() {
    }

    public Contratante(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<Enviowhatsapp> getEnviowhatsappList() {
        return enviowhatsappList;
    }

    public void setEnviowhatsappList(List<Enviowhatsapp> enviowhatsappList) {
        this.enviowhatsappList = enviowhatsappList;
    }

    @XmlTransient
    public List<Carteira> getCarteiraList() {
        return carteiraList;
    }

    public void setCarteiraList(List<Carteira> carteiraList) {
        this.carteiraList = carteiraList;
    }

    @XmlTransient
    public List<Distribuicao> getDistribuicaoList() {
        return distribuicaoList;
    }

    public void setDistribuicaoList(List<Distribuicao> distribuicaoList) {
        this.distribuicaoList = distribuicaoList;
    }

    @XmlTransient
    public List<Enviosms> getEnviosmsList() {
        return enviosmsList;
    }

    public void setEnviosmsList(List<Enviosms> enviosmsList) {
        this.enviosmsList = enviosmsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratante)) {
            return false;
        }
        Contratante other = (Contratante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhrconsultoria.controler.Contratante[ id=" + id + " ]";
    }
    
}
