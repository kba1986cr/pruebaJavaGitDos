/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebatecnicajavap2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pruebatecnicajavap2.logica.Ticket;

/**
 *
 * @author harol
 */
public class PruebaTecnicaJavaP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Estrudtura de Datos
        List listaTickets = new ArrayList <Ticket>();
        
        //Tickets cn constructor
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(13, 2, 4, 1500, new Date(), new Date());
        
        //Ticket cn constructor vacio y encapsulamiento
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(20);
        ticket3.setFila(5   );
        ticket3.setAsiento(10);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
    
        //Carga de tickets a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        
        
        
        
    }
    
}
