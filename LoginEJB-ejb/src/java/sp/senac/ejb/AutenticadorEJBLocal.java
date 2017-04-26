/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Local;

/**
 *
 * @author natanael.ssousa
 */
@Local
public interface AutenticadorEJBLocal {
  
    public boolean validarUsuario(String nomeUsuario, String senha);
    
}
