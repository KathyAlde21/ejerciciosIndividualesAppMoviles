
package ejercicioIndividual31;

public class Conyuge extends CargaFamiliar {
    
    private String parentesco1;
    
    public Conyuge () {};

    public Conyuge(
            String parentesco1,
            String runCarga,
            String nombreCarga,
            String apellidoMaternoCf,
            String apellidoPaternoCf,
            String parentesco,
            int edadCarga) {
        super(runCarga, nombreCarga, apellidoMaternoCf, apellidoPaternoCf, parentesco, edadCarga);
        this.parentesco1 = parentesco1;
    }

    public String getParentesco1() {
        return parentesco1;
    }

    public void setParentesco1(String parentesco1) {
        this.parentesco1 = parentesco1;
    }

    @Override
    public String toString() {
        return "Otro{" + "parentesco1=" + parentesco1
                + '}'
                + super.toString();
    }
    
}
