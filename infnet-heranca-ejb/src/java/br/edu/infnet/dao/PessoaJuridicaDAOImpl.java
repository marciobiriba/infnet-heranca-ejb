/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.infnet.dao;

import br.edu.infnet.domain.PessoaJuridica;
import javax.ejb.Stateless;

/**
 *
 * @author Javapos
 */
@Stateless
public class PessoaJuridicaDAOImpl extends AbstractDAO<PessoaJuridica> implements PessoaJuridicaDAO{

    public PessoaJuridicaDAOImpl() {
        super(PessoaJuridica.class);
    }
    
}