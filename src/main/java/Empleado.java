/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carloseduardojesusleon
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salario_mensual;
    private int numero_empleado;

    public Empleado(String nombre, String apellido, double salario_mensual, int numero_empleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_mensual = salario_mensual;
        this.numero_empleado = numero_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }

    public int getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    
    
    public double getSalarioAnual() {
        double salario_anual = this.salario_mensual * 12;
        
        return salario_anual;
    }
    
    public void setAumento(double porcentaje) {
        double aumento = this.salario_mensual * (porcentaje / 100);
        this.salario_mensual = this.salario_mensual + aumento;
    }
    
    
}
