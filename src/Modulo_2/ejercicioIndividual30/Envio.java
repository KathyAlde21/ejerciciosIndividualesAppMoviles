
package Modulo_2.ejercicioIndividual30;


public class Envio extends Comprador {
    
    private String fechaEnvio;
    private String direccionEnvio;
            
    public Envio (){};

    public Envio(
            String fechaEnvio,
            String direccionEnvio,
            String nombreComprador,
            String apellidoComprador,
            String direccion
    ) {
        super(nombreComprador, apellidoComprador, direccion);
        this.fechaEnvio = fechaEnvio;
        this.direccionEnvio = direccionEnvio;
    }

    //FECHA ENVIO
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    //DIRECCION ENVIO
    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    @Override
    public String toString() {
        return "Envio{" + "fechaEnvio=" + fechaEnvio
                + ", direccionEnvio=" + direccionEnvio
                + '}'
                + super.toString();
    }
           
}
