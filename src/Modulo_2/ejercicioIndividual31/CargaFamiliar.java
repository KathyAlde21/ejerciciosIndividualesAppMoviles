package Modulo_2.ejercicioIndividual31;


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

    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombreCarga() {
        return nombreCarga;
    }

    public void setNombreCarga(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    public String getApellidoMaternoCf() {
        return apellidoMaternoCf;
    }

    public void setApellidoMaternoCf(String apellidoMaternoCf) {
        this.apellidoMaternoCf = apellidoMaternoCf;
    }

    public String getApellidoPaternoCf() {
        return apellidoPaternoCf;
    }

    public void setApellidoPaternoCf(String apellidoPaternoCf) {
        this.apellidoPaternoCf = apellidoPaternoCf;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdadCarga() {
        return edadCarga;
    }

    public void setEdadCarga(int edadCarga) {
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
