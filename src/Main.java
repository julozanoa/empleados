/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author usuario1
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        empleados e1 = new empleados(1);
        empleados e2 = new empleados(2);
        empleados e3 = new empleados(3);
        
        System.out.println("ingrese id del empleado");
        int id = s.nextInt();
        if(id == 1){
            System.out.println("¿cuantas horas desea añadir?");
            int horas = s.nextInt();
            e1.añadirhoras(horas);
        }else if(id == 2){
            System.out.println("¿cuantas horas desea añadir?");
            int horas = s.nextInt();
            e2.añadirhoras(horas);
        }else if(id == 3){
            System.out.println("¿cuantas horas desea añadir?");
            int horas = s.nextInt();
            e3.añadirhoras(horas);
        }
        
        
        System.out.println("ustede debe pagar:");
        System.out.println("al empleado id#1: $" + e1.getSalario());
        System.out.println("al empleado id#2: $" + e2.getSalario());
        System.out.println("al empleado id#3: $" + e3.getSalario());
        
        double pago = e1.getSalario()+e2.getSalario()+e3.getSalario();
        
        System.out.println("Pago total de nómina = $" + pago);
        
        
    }
}
