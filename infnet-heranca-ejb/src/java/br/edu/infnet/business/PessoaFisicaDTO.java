/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.infnet.business;

import br.edu.infnet.domain.PessoaFisica;
import javax.ejb.Local;

/**
 *
 * @author Javapos
 */
@Local
public interface PessoaFisicaDTO {
    void cadastrar(PessoaFisica pessoa);
}
