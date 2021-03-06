package Presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Modelo.Viaje;
import Modelo.ViajeFamiliar;
import Modelo.ViajeIncentivo;
import Modelo.ViajeIndividual;
import Modelo.ViajeTodoIncluido;

public class ClienteMain {
/**
 * 
 * @author johel solis
 */
	 /**
     * Arreglo polim�rfico de viajes
     */
    public static List<Viaje> viajes = new ArrayList();

    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();

    }

    /**
     * Lee viajes en el arreglo polim�rfico
     */
    public static void leerViajes() {
        try {

            Viaje viaje1 = new ViajeFamiliar("Popay�n", "Bogot�", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
            viajes.add(viaje1);

            Viaje viaje2 = new ViajeIncentivo("Popay�n", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
            viajes.add(viaje2);

            Viaje viaje3 = new ViajeIndividual("Popay�n", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);

            Viaje viaje4 = new ViajeTodoIncluido("Popay�n", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);
            

        } catch (ParseException ex) {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Recorre e imprime datos del arreglo polim�fico
     */
    public static void mostrarViajes() {
        // En este caso vemos que todos los viajes ejecutan el m�todo "descripcion()" de forma diferente 
        // ya que al ser este m�todo abstracto en la clase padre, les forzamos a las clases hijas a que 
        // implementen ese m�todo.
        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripci�n: " + viaje.descripcion());
            System.out.println("Cualquier m�todo: " + viaje.cualquierMetodo());
            System.out.println("Cualquier m�todo2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }

    }
}



