
package ejercicioIndividual33;

public class Repartidor extends Empleados{
    
    private String disponibilidadHoraria;
    
    public Repartidor (){};

    public Repartidor(
            String disponibilidadHoraria,
            String nombre,
            String apellido,
            int edad,
            double salario
    ) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    //*********************************************

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    //*******************************************
    //Metodo para calcular el salario con bono si aplica
    @Override
    public double calcularSalario(){
        double salarioFinal = super.calcularSalario();
        if (getEdad() < 30) {
            salarioFinal += 15000; //bono adicional para menores de 30 años
        }
        return salarioFinal;
    }
    
    @Override
    public String toString() {
        return "Repartidor{" 
                + "disponibilidadHoraria=" + disponibilidadHoraria
                + '}'
                + super.toString();
    }

}
