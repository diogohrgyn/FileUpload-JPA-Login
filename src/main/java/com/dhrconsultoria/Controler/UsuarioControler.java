/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhrconsultoria.Controler;


import com.dhrconsultoria.Modelo.Usuario;
import com.dhrconsultoria.util.JpaUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author administrador
 */
public class UsuarioControler {

    private Usuario entity;
    private String usuario;
    private String senha;
    private List<Usuario> lista;

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioControler() {

    }

    public String logar() {
        EntityManager em = JpaUtil.getEntityManager();
        Query q = em.createQuery("select a from Usuario a", Usuario.class);
        lista = q.getResultList();
        for (Usuario usuario1 : lista) {
            if (usuario1.getUsuario().equals(this.usuario)) {
                if (usuario1.getSenha().equals(this.senha)) {
                    return "logado";
                }
            }
        }
        
            FacesMessage message = new FacesMessage("Erro ao Logar", "Usuario ou senha invalido, Verifique com o Administrador");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return null;
        
        

    }
}
