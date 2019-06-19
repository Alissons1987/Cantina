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
public class Produto {
    
    public int codigo;
    public String nome;
    public String descricao;
    public double preco;

    /**
     *
     */
    public Produto() {
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    
    }

    


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }




    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
}
