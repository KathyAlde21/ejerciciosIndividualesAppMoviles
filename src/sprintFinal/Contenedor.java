
package sprintFinal;

import java.util.ArrayList;
import java.util.List;

        
public class Contenedor {

    private List<Asesoria> usuarios;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        this.usuarios = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }
    
    //-------------------------

    public List<Asesoria> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Asesoria> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }
        
    //*************************************************************
    //METODOS
    //1) Almacenar cliente
    public void almacenarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    //2) Almacenar profesional
    public void almacenarProfesional(Profesional profesional) {
        usuarios.add(profesional);
    }

    //3) Almacenar administrativo
    public void almacenarAdministrativo(Administrativo administrativo) {
        usuarios.add(administrativo);
    }

    //4) Almacenar capacitación
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    //5) Eliminar usuario por RUN
    public void eliminarUsuario(int run) {
        usuarios.removeIf(usuario ->
                ((Usuario) usuario).getRun().equals(run));
    }

    //6) Listar todos los usuarios
    public void listarUsuarios() {
        for (Asesoria usuario : usuarios) {
            System.out.println(((Usuario) usuario).toString());
        }
    }

    //7) Listar usuarios por tipo
    public void listarUsuariosPorTipo(String tipoUsuario) {
        for (Asesoria usuario : usuarios) {
            if ((tipoUsuario.equals("cliente")
                    && usuario instanceof Cliente) ||
                (tipoUsuario.equals("administrativo")
                    && usuario instanceof Administrativo) ||
                (tipoUsuario.equals("profesional")
                    && usuario instanceof Profesional)) {
                System.out.println(((Usuario) usuario).toString());
            }
        }
    }

    //8) Listar capacitaciones junto con los datos del cliente asociado
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion.toString());
            for (Asesoria usuario : usuarios) {              
                if (usuario instanceof Cliente) 
                    && (Cliente) usuario.getRun().equals(capacitacion.getRutCliente())
                    System.out.println("Datos del Cliente: " + usuario.toString());
                }
            }
        }
    }
}

    
    
    

