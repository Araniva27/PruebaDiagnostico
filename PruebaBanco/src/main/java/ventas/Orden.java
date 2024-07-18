/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Manuel Araniva
 */
public class Orden {
    private int idOrden;
    private Producto[] productos;
    private Cliente cliente;
    private Date fecha;
    private static int contadorOrdenes = 0;
    private int contadorProductos = 0;
    final private static int MAX_PRODUCTOS = 10;

    public Orden() { 
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.fecha = new Date();
    }
    
    public void agregarCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto producto){
        if(MAX_PRODUCTOS > contadorProductos){
            productos[contadorProductos++] = producto;
        }else{
            System.out.print("Se ha alcanzado el limite de productos "+ MAX_PRODUCTOS + " productos");
        }        
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for(int i = 0; i < contadorProductos; i++){
            if (productos[i] != null) {
                total += productos[i].getPrecio();
            }
        }
        return total;
    }
    
    public void mostrarOrden(){              
        System.out.println("Id Orden: "+this.idOrden);
        System.out.println("Fecha: "+this.fecha);  
        System.out.println("Cliente: "+this.cliente.toString());
        
        System.out.println("----Productos----");
        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i] != null) {
                System.out.println("- " + productos[i].getNombreProducto()+ ": $" + productos[i].getPrecio());
            }
        }
        System.out.println("Total: $"+ calcularTotal());

    }
    
    
    
}
