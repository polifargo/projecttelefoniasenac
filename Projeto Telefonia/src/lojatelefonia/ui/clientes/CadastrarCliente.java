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
    private String nome, CPF, endereco;
    
    public String getNome(){
        return nome;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}