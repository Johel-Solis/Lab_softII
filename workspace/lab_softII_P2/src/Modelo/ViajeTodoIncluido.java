package Modelo;

import java.util.Date;
/**
 * Viaje incluidos todos los servicios
 * 
 * @author johel solis
 *
 */
public class ViajeTodoIncluido  extends Viaje{ 

	public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
	/*
	 * se sobreescribe el metodo heredado de la clase viaje.
	 */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
}
