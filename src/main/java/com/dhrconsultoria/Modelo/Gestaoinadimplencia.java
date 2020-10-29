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
@Table(name = "gestaoinadimplencia", catalog = "magalhaes", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestaoinadimplencia.findAll", query = "SELECT g FROM Gestaoinadimplencia g"),
    @NamedQuery(name = "Gestaoinadimplencia.findById", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.id = :id"),
    @NamedQuery(name = "Gestaoinadimplencia.findByCobrancaVenda", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.cobrancaVenda = :cobrancaVenda"),
    @NamedQuery(name = "Gestaoinadimplencia.findByCodCli", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.codCli = :codCli"),
    @NamedQuery(name = "Gestaoinadimplencia.findByCompetencia", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.competencia = :competencia"),
    @NamedQuery(name = "Gestaoinadimplencia.findByCorrecao", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.correcao = :correcao"),
    @NamedQuery(name = "Gestaoinadimplencia.findByCorrecaoAtr", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.correcaoAtr = :correcaoAtr"),
    @NamedQuery(name = "Gestaoinadimplencia.findByDescAntecipacao", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.descAntecipacao = :descAntecipacao"),
    @NamedQuery(name = "Gestaoinadimplencia.findByDescricaoDaEmpresa", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.descricaoDaEmpresa = :descricaoDaEmpresa"),
    @NamedQuery(name = "Gestaoinadimplencia.findByDescricaoDaObra", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.descricaoDaObra = :descricaoDaObra"),
    @NamedQuery(name = "Gestaoinadimplencia.findByDiasAtraso", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.diasAtraso = :diasAtraso"),
    @NamedQuery(name = "Gestaoinadimplencia.findByDtProrrogacao", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.dtProrrogacao = :dtProrrogacao"),
    @NamedQuery(name = "Gestaoinadimplencia.findByDtVencimento", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.dtVencimento = :dtVencimento"),
    @NamedQuery(name = "Gestaoinadimplencia.findByEmpresa", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.empresa = :empresa"),
    @NamedQuery(name = "Gestaoinadimplencia.findByEscrituraVenda", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.escrituraVenda = :escrituraVenda"),
    @NamedQuery(name = "Gestaoinadimplencia.findByJurosAtraso", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.jurosAtraso = :jurosAtraso"),
    @NamedQuery(name = "Gestaoinadimplencia.findByMes", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.mes = :mes"),
    @NamedQuery(name = "Gestaoinadimplencia.findByMulta", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.multa = :multa"),
    @NamedQuery(name = "Gestaoinadimplencia.findByNDeParcela", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.nDeParcela = :nDeParcela"),
    @NamedQuery(name = "Gestaoinadimplencia.findByNParcAtraso", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.nParcAtraso = :nParcAtraso"),
    @NamedQuery(name = "Gestaoinadimplencia.findByNomeCliente", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Gestaoinadimplencia.findByObra", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.obra = :obra"),
    @NamedQuery(name = "Gestaoinadimplencia.findByParcela", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.parcela = :parcela"),
    @NamedQuery(name = "Gestaoinadimplencia.findByPrincipal", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.principal = :principal"),
    @NamedQuery(name = "Gestaoinadimplencia.findByPrincipalJuros", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.principalJuros = :principalJuros"),
    @NamedQuery(name = "Gestaoinadimplencia.findByResiduo", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.residuo = :residuo"),
    @NamedQuery(name = "Gestaoinadimplencia.findByStatusDaVenda", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.statusDaVenda = :statusDaVenda"),
    @NamedQuery(name = "Gestaoinadimplencia.findByTipo", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.tipo = :tipo"),
    @NamedQuery(name = "Gestaoinadimplencia.findByTotParc", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.totParc = :totParc"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVenda", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.venda = :venda"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrDescCusta", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrDescCusta = :vlrDescCusta"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrDescImposto", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrDescImposto = :vlrDescImposto"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrOriginalJurosCorrecao", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrOriginalJurosCorrecao = :vlrOriginalJurosCorrecao"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrParcResiduo", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrParcResiduo = :vlrParcResiduo"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrTxBoleto", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrTxBoleto = :vlrTxBoleto"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrJuros", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrJuros = :vlrJuros"),
    @NamedQuery(name = "Gestaoinadimplencia.findByVlrParcela", query = "SELECT g FROM Gestaoinadimplencia g WHERE g.vlrParcela = :vlrParcela")})
public class Gestaoinadimplencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "cobranca_venda")
    private String cobrancaVenda;
    @Size(max = 255)
    @Column(name = "cod_cli")
    private String codCli;
    @Size(max = 255)
    @Column(name = "competencia")
    private String competencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "correcao")
    private Double correcao;
    @Column(name = "correcao_atr")
    private Double correcaoAtr;
    @Column(name = "desc_antecipacao")
    private Double descAntecipacao;
    @Size(max = 255)
    @Column(name = "descricao_da_empresa")
    private String descricaoDaEmpresa;
    @Size(max = 255)
    @Column(name = "descricao_da_obra")
    private String descricaoDaObra;
    @Column(name = "dias_atraso")
    private Integer diasAtraso;
    @Size(max = 255)
    @Column(name = "dt_prorrogacao")
    private String dtProrrogacao;
    @Size(max = 255)
    @Column(name = "dt_vencimento")
    private String dtVencimento;
    @Size(max = 255)
    @Column(name = "empresa")
    private String empresa;
    @Size(max = 255)
    @Column(name = "escritura_venda")
    private String escrituraVenda;
    @Column(name = "juros_atraso")
    private Double jurosAtraso;
    @Size(max = 255)
    @Column(name = "mes")
    private String mes;
    @Column(name = "multa")
    private Double multa;
    @Column(name = "n_de_parcela")
    private Integer nDeParcela;
    @Column(name = "n_parc_atraso")
    private Integer nParcAtraso;
    @Size(max = 255)
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Size(max = 255)
    @Column(name = "obra")
    private String obra;
    @Size(max = 255)
    @Column(name = "parcela")
    private String parcela;
    @Column(name = "principal")
    private Double principal;
    @Column(name = "principal_juros")
    private Double principalJuros;
    @Column(name = "residuo")
    private Double residuo;
    @Size(max = 255)
    @Column(name = "status_da_venda")
    private String statusDaVenda;
    @Size(max = 255)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "tot_parc")
    private Integer totParc;
    @Size(max = 255)
    @Column(name = "venda")
    private String venda;
    @Column(name = "vlr_desc_custa")
    private Double vlrDescCusta;
    @Column(name = "vlr_desc_imposto")
    private Double vlrDescImposto;
    @Column(name = "vlr_original_juros_correcao")
    private Double vlrOriginalJurosCorrecao;
    @Column(name = "vlr_parc_residuo")
    private Double vlrParcResiduo;
    @Column(name = "vlr_tx_boleto")
    private Double vlrTxBoleto;
    @Column(name = "vlr_juros")
    private Double vlrJuros;
    @Column(name = "vlr_parcela")
    private Double vlrParcela;
    @JoinColumn(name = "carte_id", referencedColumnName = "id")
    @ManyToOne
    private Carteira carteId;

    public Gestaoinadimplencia() {
    }

    public Gestaoinadimplencia(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCobrancaVenda() {
        return cobrancaVenda;
    }

    public void setCobrancaVenda(String cobrancaVenda) {
        this.cobrancaVenda = cobrancaVenda;
    }

    public String getCodCli() {
        return codCli;
    }

    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public Double getCorrecao() {
        return correcao;
    }

    public void setCorrecao(Double correcao) {
        this.correcao = correcao;
    }

    public Double getCorrecaoAtr() {
        return correcaoAtr;
    }

    public void setCorrecaoAtr(Double correcaoAtr) {
        this.correcaoAtr = correcaoAtr;
    }

    public Double getDescAntecipacao() {
        return descAntecipacao;
    }

    public void setDescAntecipacao(Double descAntecipacao) {
        this.descAntecipacao = descAntecipacao;
    }

    public String getDescricaoDaEmpresa() {
        return descricaoDaEmpresa;
    }

    public void setDescricaoDaEmpresa(String descricaoDaEmpresa) {
        this.descricaoDaEmpresa = descricaoDaEmpresa;
    }

    public String getDescricaoDaObra() {
        return descricaoDaObra;
    }

    public void setDescricaoDaObra(String descricaoDaObra) {
        this.descricaoDaObra = descricaoDaObra;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String getDtProrrogacao() {
        return dtProrrogacao;
    }

    public void setDtProrrogacao(String dtProrrogacao) {
        this.dtProrrogacao = dtProrrogacao;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEscrituraVenda() {
        return escrituraVenda;
    }

    public void setEscrituraVenda(String escrituraVenda) {
        this.escrituraVenda = escrituraVenda;
    }

    public Double getJurosAtraso() {
        return jurosAtraso;
    }

    public void setJurosAtraso(Double jurosAtraso) {
        this.jurosAtraso = jurosAtraso;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Integer getNDeParcela() {
        return nDeParcela;
    }

    public void setNDeParcela(Integer nDeParcela) {
        this.nDeParcela = nDeParcela;
    }

    public Integer getNParcAtraso() {
        return nParcAtraso;
    }

    public void setNParcAtraso(Integer nParcAtraso) {
        this.nParcAtraso = nParcAtraso;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getPrincipalJuros() {
        return principalJuros;
    }

    public void setPrincipalJuros(Double principalJuros) {
        this.principalJuros = principalJuros;
    }

    public Double getResiduo() {
        return residuo;
    }

    public void setResiduo(Double residuo) {
        this.residuo = residuo;
    }

    public String getStatusDaVenda() {
        return statusDaVenda;
    }

    public void setStatusDaVenda(String statusDaVenda) {
        this.statusDaVenda = statusDaVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTotParc() {
        return totParc;
    }

    public void setTotParc(Integer totParc) {
        this.totParc = totParc;
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }

    public Double getVlrDescCusta() {
        return vlrDescCusta;
    }

    public void setVlrDescCusta(Double vlrDescCusta) {
        this.vlrDescCusta = vlrDescCusta;
    }

    public Double getVlrDescImposto() {
        return vlrDescImposto;
    }

    public void setVlrDescImposto(Double vlrDescImposto) {
        this.vlrDescImposto = vlrDescImposto;
    }

    public Double getVlrOriginalJurosCorrecao() {
        return vlrOriginalJurosCorrecao;
    }

    public void setVlrOriginalJurosCorrecao(Double vlrOriginalJurosCorrecao) {
        this.vlrOriginalJurosCorrecao = vlrOriginalJurosCorrecao;
    }

    public Double getVlrParcResiduo() {
        return vlrParcResiduo;
    }

    public void setVlrParcResiduo(Double vlrParcResiduo) {
        this.vlrParcResiduo = vlrParcResiduo;
    }

    public Double getVlrTxBoleto() {
        return vlrTxBoleto;
    }

    public void setVlrTxBoleto(Double vlrTxBoleto) {
        this.vlrTxBoleto = vlrTxBoleto;
    }

    public Double getVlrJuros() {
        return vlrJuros;
    }

    public void setVlrJuros(Double vlrJuros) {
        this.vlrJuros = vlrJuros;
    }

    public Double getVlrParcela() {
        return vlrParcela;
    }

    public void setVlrParcela(Double vlrParcela) {
        this.vlrParcela = vlrParcela;
    }

    public Carteira getCarteId() {
        return carteId;
    }

    public void setCarteId(Carteira carteId) {
        this.carteId = carteId;
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
        if (!(object instanceof Gestaoinadimplencia)) {
            return false;
        }
        Gestaoinadimplencia other = (Gestaoinadimplencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhrconsultoria.controler.Gestaoinadimplencia[ id=" + id + " ]";
    }
    
}
