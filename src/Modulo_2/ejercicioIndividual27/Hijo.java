
package Modulo_2.ejercicioIndividual27;

public class Hijo extends CargaFamiliar {
    
    private String parentesco2;
    
    public Hijo () {};

    public Hijo (
            String parentesco2,
            String runCarga,
            String nombreCarga,
            String apellidoMaternoCf,
            String apellidoPaternoCf,
            String parentesco,
            int edadCarga) {
        super(runCarga, nombreCarga, apellidoMaternoCf, apellidoPaternoCf, parentesco, edadCarga);
        this.parentesco2 = parentesco2;
    }

    public String getParentesco2() {
        return parentesco2;
    }

    public void setParentesco2(String parentesco2) {
        this.parentesco2 = parentesco2;
    }

    @Override
    public String toString() {
        return "Otro{" + "parentesco2=" + parentesco2
                + '}'
                + super.toString();
    }
    
}
