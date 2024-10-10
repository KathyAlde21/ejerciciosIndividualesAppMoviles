
package ejercicioIndividual30;

public class Pago extends Envio {
    
    private String fechaPago;
    private String importe;
    private String direccionFacturacion;
    
    public Pago (){};

    public Pago(
            String fechaPago,
            String importe,
            String direccionFacturacion,
            String fechaEnvio,
            String direccionEnvio,
            String nombreComprador,
            String apellidoComprador,
            String direccion
    ) {
        super(fechaEnvio, direccionEnvio, nombreComprador, apellidoComprador, direccion);
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.direccionFacturacion = direccionFacturacion;
    }

    //------------------------------------
    //FECHA PAGO
    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    //IMPORTE
    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    //DIRECCION FACTURACION
    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }
    
    //*****************************************

    @Override
    public String toString() {
        return "Pago{" + "fechaPago=" + fechaPago
                + ", importe=" + importe
                + ", direccionFacturacion=" + direccionFacturacion
                + '}'
                + super.toString();
    }
    
    
}
