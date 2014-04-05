/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.infnet.business;

import br.edu.infnet.dao.PessoaFisicaDAO;
import br.edu.infnet.domain.PessoaFisica;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Javapos
 */
@Stateless
public class PessoaFisicaDTOImpl implements PessoaFisicaDTO{
    @EJB
    private PessoaFisicaDAO pfDAO;
    @Override
    public void cadastrar(PessoaFisica pessoa){
        pfDAO.cadastrar(pessoa);
    }
}
