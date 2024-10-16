
package Modulo_2.ejercicioIndividual31;

public class Otro extends CargaFamiliar {
    
    private String parentesco3;
    
    public Otro () {};

    public Otro(
            String parentesco3,
            String runCarga,
            String nombreCarga,
            String apellidoMaternoCf,
            String apellidoPaternoCf,
            String parentesco,
            int edadCarga) {
        super(runCarga, nombreCarga, apellidoMaternoCf, apellidoPaternoCf, parentesco, edadCarga);
        this.parentesco3 = parentesco3;
    }

    public String getParentesco3() {
        return parentesco3;
    }

    public void setParentesco3(String parentesco3) {
        this.parentesco3 = parentesco3;
    }

    @Override
    public String toString() {
        return "Otro{" + "parentesco3=" + parentesco3
                + '}'
                + super.toString();
    }
    
}
