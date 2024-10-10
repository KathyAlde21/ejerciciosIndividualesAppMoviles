
package ejercicioIndividual30;

public class Vendedor extends Articulo{
    
    private String nombreVendedor;
    private String apellidoVendedor;
    
    public Vendedor (){};

    public Vendedor(
            String nombreVendedor,
            String apellidoVendedor,
            String nombreArticulo,
            String precio,
            String fechaEnvio,
            String direccionEnvio,
            String nombreComprador,
            String apellidoComprador,
            String direccion
    ) {
        super(nombreArticulo, precio, fechaEnvio, direccionEnvio, nombreComprador, apellidoComprador, direccion);
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
    }

    //NOMBRE VENDEDOR
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    //APELLIDO VENDEDOR
    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor) {
        this.apellidoVendedor = apellidoVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombreVendedor=" + nombreVendedor
                + ", apellidoVendedor=" + apellidoVendedor
                + '}'
                + super.toString();
    }
   
}
