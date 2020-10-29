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
@Table(name = "enviosms", catalog = "magalhaes", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enviosms.findAll", query = "SELECT e FROM Enviosms e"),
    @NamedQuery(name = "Enviosms.findById", query = "SELECT e FROM Enviosms e WHERE e.id = :id"),
    @NamedQuery(name = "Enviosms.findByDataEnv", query = "SELECT e FROM Enviosms e WHERE e.dataEnv = :dataEnv")})
public class Enviosms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "data_env")
    private String dataEnv;
    @JoinColumn(name = "contratante_id", referencedColumnName = "id")
    @ManyToOne
    private Contratante contratanteId;
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    @ManyToOne
    private Pessoa pessoaId;
    @JoinColumn(name = "telefone_id", referencedColumnName = "id")
    @ManyToOne
    private Telefone telefoneId;

    public Enviosms() {
    }

    public Enviosms(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataEnv() {
        return dataEnv;
    }

    public void setDataEnv(String dataEnv) {
        this.dataEnv = dataEnv;
    }

    public Contratante getContratanteId() {
        return contratanteId;
    }

    public void setContratanteId(Contratante contratanteId) {
        this.contratanteId = contratanteId;
    }

    public Pessoa getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Pessoa pessoaId) {
        this.pessoaId = pessoaId;
    }

    public Telefone getTelefoneId() {
        return telefoneId;
    }

    public void setTelefoneId(Telefone telefoneId) {
        this.telefoneId = telefoneId;
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
        if (!(object instanceof Enviosms)) {
            return false;
        }
        Enviosms other = (Enviosms) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhrconsultoria.controler.Enviosms[ id=" + id + " ]";
    }
    
}
