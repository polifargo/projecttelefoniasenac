/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.ui.clientes;

/**
 *
 * @author rafael.fsilva7
 */
public class CadastrarCliente {

    private String nome, cpf, endereco, estadoCivil, genero, nascimentoDia, nascimentoMes, nascimentoAno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getNascimentoDia(){
        return nascimentoDia;
    }
    
    public void setNascimentoDia(String nascimentoDia){
        this.nascimentoDia = nascimentoDia;
    }
    
    public String getNascimentoMes(){
        return nascimentoMes;
    }
    
    public void setNascimentoMes(String nascimentoMes){
        this.nascimentoMes = nascimentoMes;
    }
    
    public String getNascimentoAno(){
        return nascimentoAno;
    }
    
    public void setNascimentoAno(String nascimentoAno){
        this.nascimentoAno = nascimentoAno;
    }

}
