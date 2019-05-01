package Modelo;

import java.util.Date;

/**
 *  viaje en familia
 *  
 * @author johel solis
 *
 */
public class ViajeFamiliar extends Viaje{

	/**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {

        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    /*
     * se sobreescribe el metodo heredado de la clase viaje.
     */
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
    /*
     * se implenmenta y se sobreescribe  el metodo de la clase viaje.
     */
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
