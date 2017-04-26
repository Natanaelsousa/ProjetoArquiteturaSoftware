/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sp.senac.ejb.AutenticadorEJBLocal;

/**
 *
 * @author natanael.ssousa
 */
@ManagedBean
@RequestScoped
public class LoginBean {

    public AutenticadorEJBLocal getAutenticadorEJB() {
        return autenticadorEJB;
    }

    public void setAutenticadorEJB(AutenticadorEJBLocal autenticadorEJB) {
        this.autenticadorEJB = autenticadorEJB;
    }

    private String nomeUsuario; 
    private String senha;
    @EJB
  private AutenticadorEJBLocal autenticadorEJB;
    public String autenticarUsuario(){
       boolean ok =  autenticadorEJB.validarUsuario(nomeUsuario, senha);
       
        return(ok?"home":"erro");
    }
    
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public LoginBean() {
        
        
    }
    
}
