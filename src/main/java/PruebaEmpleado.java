
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carloseduardojesusleon
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pedro", "Ruiz", 18000, 1 );
        Empleado empleado2 = new Empleado("Mariana", "sanchez", 21500, 2);     
        System.out.println("Empleado número: " + empleado1.getNumero_empleado());
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Apellido: " + empleado1.getApellido());
        System.out.println("Salario mensual: " + empleado1.getSalario_mensual());
        System.out.println("Salario anual: " + empleado1.getSalarioAnual());
        empleado1.setAumento(10);
        System.out.println("Salario anual con 10% de aumento: " + empleado1.getSalarioAnual());
        
        System.out.println("********************************************************");
        
        System.out.println("Empleado número: " + empleado2.getNumero_empleado());
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Apellido: " + empleado2.getApellido());
        System.out.println("Salario mensual: " + empleado2.getSalario_mensual());
        System.out.println("Salario anual: " + empleado2.getSalarioAnual());
        empleado2.setAumento(10);
        System.out.println("Salario anual con 10% de aumento: " + empleado2.getSalarioAnual());
        
        
        
        
    }
}
