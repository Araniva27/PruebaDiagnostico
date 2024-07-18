/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test;

import java.util.Scanner;
import ventas.Cliente;
import ventas.Orden;
import ventas.Producto;
import ventas.TipoPago;

/**
 *
 * @author Manuel Araniva
 */
public class Ventas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        do {
            TipoPago opcionTipoPagoSeleccionada = null;

            System.out.println("¡Bienvenido!");
            System.out.println("--------Información del cliente--------");

            System.out.print("Nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.println("Seleccione el tipo de pago a realizar: ");
            System.out.println("1-Contado ");
            System.out.println("2-Credito ");
            int tipoPago = sc.nextInt();

            switch(tipoPago){
                case 1:
                    opcionTipoPagoSeleccionada = TipoPago.CONTADO;
                    break;
                case 2:
                    opcionTipoPagoSeleccionada = TipoPago.CREDITO;
                    break;
                default:
                    System.out.println("No ingresó una opción válida... ");

            }

            Cliente objCliente = new Cliente(nombre, opcionTipoPagoSeleccionada);
            Orden objOrden = new Orden();

            objOrden.agregarCliente(objCliente);

            System.out.println("--------Productos--------");

            Boolean bandera = false;
            do{
                sc.nextLine();
                System.out.print("Nombre del producto: ");
                String nombreProducto = sc.nextLine();
                sc.nextLine();    
                //System.out.println();
                System.out.print("Precio del producto: ");
                double precioProducto = sc.nextDouble();
                sc.nextLine(); 
                Producto objProducto = new Producto(nombreProducto, precioProducto);
                objOrden.agregarProducto(objProducto);

                System.out.println("¿Desea agregar otro producto? (si/no)");
                String seleccion = sc.nextLine();   

                bandera = !seleccion.equalsIgnoreCase("si");

            }while(!bandera);

            objOrden.mostrarOrden();
            
            System.out.println("¿Desea realizar otra orden? (si/no)");
            String respuesta = sc.nextLine();
            repetir = respuesta.equalsIgnoreCase("si");
        } while (repetir);
    }
}
