/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantinaifsc;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alisson/Lucas
 */
public class Vitrine extends Produto {
    
    public ArrayList<Produto> itens;
   
    
    
    public Vitrine() {
        itens = new ArrayList<Produto>();
        
    }
    
   
    
    public ArrayList<Produto> getItens() {
        return this.itens;
    }
    
    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }
    
    public void adicionarProduto() {
        Scanner in = new Scanner(System.in);
        System.out.println("=> ADICIONAR PRODUTO <=");
        System.out.print("CÓDIGO: ");
        int codigo = in.nextInt();
        System.out.print("NOME: ");
        String nome = in.nextLine();
        System.out.print("DESCRIÇÃO: ");
        String descricao = in.nextLine();
        System.out.print("PREÇO: ");
        double preco = in.nextDouble();
        System.out.print("PRODUTO ADICIONADO COM SUCESSO! ");
        
    }
       
    
    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

                
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
        
    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
    public ArrayList exibirVitrine() {
    return itens;
    }
}
