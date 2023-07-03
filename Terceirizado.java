package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends dadosPessoais{ //Utilizando Herença do Funcionario.java

    private String Empresa;

    public Terceirizado (String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste){
        super (nome,cpf,cargo,salario);
    }

    @Override
    public void promover (Cargo novoCargo){
        super.promover(novoCargo);
    }

    @Override 
    public void atualizarSalario (BigDecimal novoSalario){
        super.atualizarSalario(novoSalario);
    }

    public String getEmpresa (){
        return Empresa;
    }

    public void SetEmpresa (String Empresa){
        this.Empresa = Empresa;
    }

}