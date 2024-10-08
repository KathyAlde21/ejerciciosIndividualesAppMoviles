package ejercicioIndividual27;


public class CargaFamiliar{
    
        private String runCarga;
        private String nombreCarga;
        private String apellidoMaternoCf;
        private String apellidoPaternoCf;
        private String parentesco;
        private int edadCarga;
         
       public CargaFamiliar (){};

    public CargaFamiliar(
            String runCarga,
            String nombreCarga,
            String apellidoMaternoCf,
            String apellidoPaternoCf,
            String parentesco,
            int edadCarga
    ) {
        this.runCarga = runCarga;
        this.nombreCarga = nombreCarga;
        this.apellidoMaternoCf = apellidoMaternoCf;
        this.apellidoPaternoCf = apellidoPaternoCf;
        this.parentesco = parentesco;
        this.edadCarga = edadCarga;
    }
    
    // ---------------------------------
    //metodos constructores
    public void mostrarNombreCarga(){
        System.out.println(this.nombreCarga + " " + this.apellidoMaternoCf
                + " " + this.apellidoPaternoCf);
    }
    
    public void mostrarDatosCarga(){
        System.out.println("Nombre carga: " + this.nombreCarga + " " 
                + this.apellidoMaternoCf + " " + this.apellidoPaternoCf 
                + " Edad: " + this.edadCarga 
                + " Parentesco: " + this.parentesco
        );
    }
       
    // ----------------------------   
    //metodo toString
    @Override
    public String toString() {
        return "CargaFamiliar{" + "runCarga=" + runCarga
                + ", nombreCarga=" + nombreCarga
                + ", apellidoMaternoCf=" + apellidoMaternoCf 
                + ", apellidoPaternoCf=" + apellidoPaternoCf
                + ", parentesco=" + parentesco
                + ", edadCarga=" + edadCarga
                + '}';
    }
 
    



    
 
    
}
