/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantinaifsc;

import java.util.ArrayList;

/**
 *
 * @author Alisson/Lucas
 */
public class Pedido {
    public ArrayList<Produto> listaProdutos;
    private double precoTotal;
    private int idPedido;
    boolean confirma = false;
    boolean cancela = false;
    
    
    public Pedido(ArrayList<Produto> listaProdutos, double precoTotal, int idPedido) {
        this.listaProdutos = listaProdutos;
    }
	
	
    public void adicionarProdutoPedido() {
		
    }
    
    
    public void finalizarPedido(boolean confirma) {
		
	confirma = true;
	System.out.println("Pedido gerado com sucesso!");
		
    }
    public void cancelarPedido (boolean confirma) {
	cancela = true;
	System.out.println("Pedido Cancelado");	
	};
    
}
