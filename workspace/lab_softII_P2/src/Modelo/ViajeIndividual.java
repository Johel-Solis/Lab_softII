package Modelo;

import java.util.Date;

/**
 *  Viaje de una sola persona
 *  
 * @author johel solis
 *
 */
public class ViajeIndividual extends Viaje {

	 public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
	        super(origen, destino, costo, fechaSalida, fechaLlegada);
	    }
/*
 * se sobreescribe el metodo heredado de la clase viaje.
 */
	    @Override
	    public String descripcion() {
	        return "Disfruta tu viaje individual";
	    }
}
