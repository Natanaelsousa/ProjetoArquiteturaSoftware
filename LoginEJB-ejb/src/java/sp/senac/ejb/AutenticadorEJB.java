/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author natanael.ssousa
 */
@Stateless
public class AutenticadorEJB implements AutenticadorEJBLocal {

    @Override
    public boolean validarUsuario(String nomeUsuario, String senha) {
        boolean isOk= false;
        if("teste".equals(nomeUsuario) && "1234".equals(senha)){
            isOk = true;
        }else if ("admin".equals(nomeUsuario)&& "admin".equals(senha)){
            
            isOk = true;
        }
        return isOk;
    }

    
}
