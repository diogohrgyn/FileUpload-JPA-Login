/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhrconsultoria.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author administrador
 */
@Entity
@Table(name = "enviowhatsapp", catalog = "magalhaes", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enviowhatsapp.findAll", query = "SELECT e FROM Enviowhatsapp e"),
    @NamedQuery(name = "Enviowhatsapp.findById", query = "SELECT e FROM Enviowhatsapp e WHERE e.id = :id"),
    @NamedQuery(name = "Enviowhatsapp.findByCpf", query = "SELECT e FROM Enviowhatsapp e WHERE e.cpf = :cpf"),
    @NamedQuery(name = "Enviowhatsapp.findByData", query = "SELECT e FROM Enviowhatsapp e WHERE e.data = :data"),
    @NamedQuery(name = "Enviowhatsapp.findByFone", query = "SELECT e FROM Enviowhatsapp e WHERE e.fone = :fone"),
    @NamedQuery(name = "Enviowhatsapp.findByNome", query = "SELECT e FROM Enviowhatsapp e WHERE e.nome = :nome")})
public class Enviowhatsapp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "cpf")
    private String cpf;
    @Size(max = 255)
    @Column(name = "data")
    private String data;
    @Size(max = 255)
    @Column(name = "fone")
    private String fone;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "contratante_id", referencedColumnName = "id")
    @ManyToOne
    private Contratante contratanteId;

    public Enviowhatsapp() {
    }

    public Enviowhatsapp(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contratante getContratanteId() {
        return contratanteId;
    }

    public void setContratanteId(Contratante contratanteId) {
        this.contratanteId = contratanteId;
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
        if (!(object instanceof Enviowhatsapp)) {
            return false;
        }
        Enviowhatsapp other = (Enviowhatsapp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhrconsultoria.controler.Enviowhatsapp[ id=" + id + " ]";
    }
    
}
