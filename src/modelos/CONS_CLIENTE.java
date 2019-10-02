/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;


public class CONS_CLIENTE {
    
    private  ArrayList<Cliente> clientes=new ArrayList<>();
    public static CONS_CLIENTE cons_cliente;

    public CONS_CLIENTE() {
    }
    
    public static  CONS_CLIENTE getCons_cliente(){
        if(cons_cliente==null){
            cons_cliente=new CONS_CLIENTE();
        }
        return cons_cliente;
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes){
        this.clientes=clientes;
    }
    
    
    
}
