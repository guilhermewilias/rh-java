package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;


public class PromocaoService {
    
    public void promover (Funcionario funcionario, Boolean metaBatida){
        if (Cargo.GERENTE == funcionario.CargoAtual()){
            throw new ValidacaoException ("Gerentes não podem ser promovidos");
        }

        
        if (metaBatida ){
            Cargo novoCargo = CargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else {
            throw new ValidacaoException ("Funcionário não bateu a meta!"); 
        }

        
    }
}