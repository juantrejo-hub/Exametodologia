/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pc
 */
public class Planilla {
    private String Nombre_empleado;
    private double Salario;
    private int cant_horas;
    private double Sueldo;
    
    
     public Planilla() {
    }

    public Planilla(String Nombre_empleado, double Salario, int cant_horas) {
        this.Nombre_empleado = Nombre_empleado;
        this.Salario = Salario;
        this.cant_horas = cant_horas;
    }

    public int getCant_horas() {
        return cant_horas;
    }

    public void setCant_horas(int cant_horas) {
        this.cant_horas = cant_horas;
    }

    public String getNombre_empleado() {
        return Nombre_empleado;
    }

    public void setNombre_empleado(String Nombre_empleado) {
        this.Nombre_empleado = Nombre_empleado;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
     public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Salario = Sueldo;
    }
    
    
}


