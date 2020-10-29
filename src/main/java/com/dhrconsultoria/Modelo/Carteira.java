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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "carteira", catalog = "magalhaes", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carteira.findAll", query = "SELECT c FROM Carteira c"),
    @NamedQuery(name = "Carteira.findById", query = "SELECT c FROM Carteira c WHERE c.id = :id"),
    @NamedQuery(name = "Carteira.findByNome", query = "SELECT c FROM Carteira c WHERE c.nome = :nome")})
public class Carteira implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "carteId")
    private List<Gestaoinadimplencia> gestaoinadimplenciaList;
    @JoinColumn(name = "contratante_id", referencedColumnName = "id")
    @ManyToOne
    private Contratante contratanteId;

    public Carteira() {
    }

    public Carteira(Long id) {
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
    public List<Gestaoinadimplencia> getGestaoinadimplenciaList() {
        return gestaoinadimplenciaList;
    }

    public void setGestaoinadimplenciaList(List<Gestaoinadimplencia> gestaoinadimplenciaList) {
        this.gestaoinadimplenciaList = gestaoinadimplenciaList;
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
        if (!(object instanceof Carteira)) {
            return false;
        }
        Carteira other = (Carteira) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhrconsultoria.controler.Carteira[ id=" + id + " ]";
    }
    
}
