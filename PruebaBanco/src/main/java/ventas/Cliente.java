/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

/**
 *
 * @author Manuel Araniva
 */
public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private TipoPago tipoPago;

    public Cliente(String nombreCliente, TipoPago tipoPago) {        
        this.nombreCliente = nombreCliente;
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Cliente: "+ nombreCliente +", tipo de pago " + tipoPago;
    }
    
}
