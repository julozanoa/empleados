/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario1
 */
public class empleados {
    private int id;
    private double horas;
    private double salario;

    public empleados(int id) {
        this.id = id;
    }
    
    public double añadirhoras(double horasañadidas){
       this.horas += horasañadidas;
       return this.salario = 29575 * this.horas;
    }
    
    
    

    public int getId() {
        return id;
    }

    public double getHoras() {
        return horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    
    
}
