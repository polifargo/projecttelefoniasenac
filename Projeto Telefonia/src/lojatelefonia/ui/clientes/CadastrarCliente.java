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

    private String nome;
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    private String cpf;
    public String getCPF() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String endereco;
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    private String estadoCivil;
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    private String genero;
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    private String nascimentoDia;
    public String getNascimentoDia(){
        return nascimentoDia;
    }
    
    public void setNascimentoDia(String nascimentoDia){
        this.nascimentoDia = nascimentoDia;
    }
    
    private String nascimentoMes;
    public String getNascimentoMes(){
        return nascimentoMes;
    }
    
    public void setNascimentoMes(String nascimentoMes){
        this.nascimentoMes = nascimentoMes;
    }
    
    private String nascimentoAno;
    public String getNascimentoAno(){
        return nascimentoAno;
    }
    
    public void setNascimentoAno(String nascimentoAno){
        this.nascimentoAno = nascimentoAno;
    }

}
