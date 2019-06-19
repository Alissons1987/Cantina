/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantinaifsc;

/**
 *
 * @author Alisson/Lucas
 */
public class Cliente {
    
    private int cpf;
    private String nome;
    private char senha;
 
    
    public Cliente(int cpf, String nome, char senha) {
    this.cpf = cpf;
    this.nome = nome;
    this.senha = senha;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(char senha) {
        this.senha = senha;
    }

}