/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.infnet.dao;

import br.edu.infnet.domain.PessoaFisica;
import javax.ejb.Stateless;

/**
 *
 * @author Javapos
 */
@Stateless
public class PessoaFisicaDAOImpl extends AbstractDAO<PessoaFisica> implements PessoaFisicaDAO{

    public PessoaFisicaDAOImpl() {
        super(PessoaFisica.class);
    }
    
}
