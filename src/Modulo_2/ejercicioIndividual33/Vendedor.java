
package Modulo_2.ejercicioIndividual33;

public class Vendedor extends Empleados{
    
    private String fechaInicioEmpresa;
    
    public Vendedor (){};

    public Vendedor(
            String fechaInicioEmpresa,
            String nombre,
            String apellido,
            int edad,
            double salario
    ) {
        super(nombre, apellido, edad, salario);
        this.fechaInicioEmpresa = fechaInicioEmpresa;
    }

    //*******************************************

    public String getFechaInicioEmpresa() {
        return fechaInicioEmpresa;
    }

    public void setFechaInicioEmpresa(String fechaInicioEmpresa) {
        this.fechaInicioEmpresa = fechaInicioEmpresa;
    }

    //*******************************************
    //Metodo para calcular el salario con bono vendedores
    @Override
    public double calcularSalario(){
        double salarioFinal = super.calcularSalario();
        salarioFinal += 50000; //bono adicional para vendedores
        return salarioFinal;
    }
    
    
    @Override
    public String toString() {
        return "Vendedor{" 
                + "fechaInicioEmpresa=" + fechaInicioEmpresa
                + '}'
                + super.toString();
    }
    
    
}
