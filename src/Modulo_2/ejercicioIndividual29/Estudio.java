
package Modulo_2.ejercicioIndividual29;

public class Estudio {
    
    private String institucion;
    private String carrera;
    private int anoInicio;
    private int anoFin;

    public Estudio () {};
    
    public Estudio(
            String institucion,
            String carrera,
            int anoInicio,
            int anoFin
    ) {
        this.institucion = institucion;
        this.carrera = carrera;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(int anoFin) {
        this.anoFin = anoFin;
    }

    @Override
    public String toString() {
        return "Estudio{" + "institucion=" + institucion
                + ", carrera=" + carrera
                + ", anoInicio=" + anoInicio
                + ", anoFin=" + anoFin
                + '}';
    }
    
}
