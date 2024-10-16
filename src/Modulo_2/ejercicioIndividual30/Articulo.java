
package Modulo_2.ejercicioIndividual30;


public class Articulo extends Envio {
    
    private String nombreArticulo;
    private String precio;

    public Articulo (){};
    
    public Articulo(
            String nombreArticulo,
            String precio,
            String fechaEnvio,
            String direccionEnvio,
            String nombreComprador,
            String apellidoComprador,
            String direccion
    ) {
        super(fechaEnvio, direccionEnvio, nombreComprador, apellidoComprador, direccion);
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
    }

    //NOMBRE ARTICULO
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    //PRECIO
    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombreArticulo=" + nombreArticulo
                + ", precio=" + precio
                + '}'
                + super.toString();
    }
        
}
