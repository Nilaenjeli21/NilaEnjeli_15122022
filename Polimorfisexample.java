/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_15122022;

/**
 *
 * @author Nila Enjeni
 */
public class Polimorfisexample {
    public static void main(String[] args){
      Person ref;
      Student studentObject = new Student();
      Employee employeeObject = new Employee();
      
      ref = studentObject;
      String temp = ref.getName();
      System.out.println("Nila Enjeli"+temp);
      
      ref = employeeObject;
      String temp1 = ref.getName();
      System.out.println("Nila Enjeli"+temp1);
      
  }  
}
