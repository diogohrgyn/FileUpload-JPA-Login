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
@Table(name = "emissao", catalog = "magalhaes", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emissao.findAll", query = "SELECT e FROM Emissao e"),
    @NamedQuery(name = "Emissao.findById", query = "SELECT e FROM Emissao e WHERE e.id = :id"),
    @NamedQuery(name = "Emissao.findByStatusNeg", query = "SELECT e FROM Emissao e WHERE e.statusNeg = :statusNeg"),
    @NamedQuery(name = "Emissao.findByValorHon", query = "SELECT e FROM Emissao e WHERE e.valorHon = :valorHon"),
    @NamedQuery(name = "Emissao.findByDataVenc", query = "SELECT e FROM Emissao e WHERE e.dataVenc = :dataVenc"),
    @NamedQuery(name = "Emissao.findByPacrNeg", query = "SELECT e FROM Emissao e WHERE e.pacrNeg = :pacrNeg"),
    @NamedQuery(name = "Emissao.findByProcHon", query = "SELECT e FROM Emissao e WHERE e.procHon = :procHon"),
    @NamedQuery(name = "Emissao.findByTipoNeg", query = "SELECT e FROM Emissao e WHERE e.tipoNeg = :tipoNeg"),
    @NamedQuery(name = "Emissao.findByValorneg", query = "SELECT e FROM Emissao e WHERE e.valorneg = :valorneg")})
public class Emissao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "status_neg")
    private String statusNeg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_hon")
    private Double valorHon;
    @Size(max = 255)
    @Column(name = "data_venc")
    private String dataVenc;
    @Size(max = 255)
    @Column(name = "pacr_neg")
    private String pacrNeg;
    @Column(name = "proc_hon")
    private Double procHon;
    @Size(max = 255)
    @Column(name = "tipo_neg")
    private String tipoNeg;
    @Column(name = "valorneg")
    private Double valorneg;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuarioId;

    public Emissao() {
    }

    public Emissao(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusNeg() {
        return statusNeg;
    }

    public void setStatusNeg(String statusNeg) {
        this.statusNeg = statusNeg;
    }

    public Double getValorHon() {
        return valorHon;
    }

    public void setValorHon(Double valorHon) {
        this.valorHon = valorHon;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    public String getPacrNeg() {
        return pacrNeg;
    }

    public void setPacrNeg(String pacrNeg) {
        this.pacrNeg = pacrNeg;
    }

    public Double getProcHon() {
        return procHon;
    }

    public void setProcHon(Double procHon) {
        this.procHon = procHon;
    }

    public String getTipoNeg() {
        return tipoNeg;
    }

    public void setTipoNeg(String tipoNeg) {
        this.tipoNeg = tipoNeg;
    }

    public Double getValorneg() {
        return valorneg;
    }

    public void setValorneg(Double valorneg) {
        this.valorneg = valorneg;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
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
        if (!(object instanceof Emissao)) {
            return false;
        }
        Emissao other = (Emissao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhrconsultoria.controler.Emissao[ id=" + id + " ]";
    }
    
}
