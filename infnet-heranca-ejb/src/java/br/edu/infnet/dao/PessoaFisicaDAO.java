/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.infnet.dao;

import br.edu.infnet.domain.PessoaFisica;
import javax.ejb.Local;

/**
 *
 * @author Javapos
 */
@Local
public interface PessoaFisicaDAO {
    void cadastrar(PessoaFisica p);
    
}
