package Modelo;

import java.util.Date;

/**
 * Viaje dado como incentivo  por la empresa a un empleado
 * @author johel solis
 *
 */
public class ViajeIncentivo extends Viaje{

	/**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    /*
     * se sobreescribe el metodo heredado de la clase viaje.
     */
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    /*
     * se implenmenta y se sobreescribe  el metodo de la clase viaje.
     */
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
