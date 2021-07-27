/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author olive
 */
public class Empleado extends Persona {
    private String codigo;
    public Empleado(){}

    public Empleado(String codigo, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     public void agregar(){
        System.out.println("Codigo: "+ getCodigo());
        System.out.println("Nombres: "+ getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha Nacimiento: "+ getFecha_nacimiento());
        System.out.println("______________________________________________");
    }
    
}
