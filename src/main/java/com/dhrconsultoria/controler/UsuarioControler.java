/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhrconsultoria.controler;

import com.dhrconsultoria.modelo.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author administrador
 */
public class UsuarioControler {

    private Usuario entity;
    private String usuario;
    private String senha;

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
        entity = new Usuario();
        if (true) {
            return "logado";
        } else {
            FacesMessage message = new FacesMessage("Erro ao Logar", "Usuario ou senha invalido, Verifique com o Administrador");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "index";
        }
        

    }
}
