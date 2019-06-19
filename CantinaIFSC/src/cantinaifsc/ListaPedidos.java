/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantinaifsc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alisson/Lucas
 */
public class ListaPedidos {
    
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();
    private Date data;

 
    public ListaPedidos(ArrayList<Pedido> listaPedidos, Date data) {
        this.listaPedidos = listaPedidos;
        this.data = new Date();
    }


    public ArrayList<Pedido> getPedidos() {
        return this.listaPedidos;
    }

    public String getData() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        return dataFormatada.format(this.data);
    }
    
}
