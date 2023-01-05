/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_15122022;

/**
 *
 * @author Nila Enjeni
 */
public class Student extends Person {
    public Student(){
        super();
        System.out.println("Inside Student : Constructor");
                
    }
    
    public String getName(){ 
        System.out.println("Student Name : " +name );
        return name; 
    }
    
    public static void main(String[] args){
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    }
}