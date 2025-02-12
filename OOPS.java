import java.util.*;
import Bank.bank;
class Pen{
    String color;
    String type;
    public void  write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
  
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(String name,int age){
    //     this.name = name;
    //     this.age = age;
    // }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
        public Student() {
            //TODO Auto-generated constructor stub
        }
          
        
        
        }
class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(l/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

// abstract class Animal{
//     abstract void walk();
//     Animal(){
//         System.out.println("created an animal");
//     }
//     public void eat(){
//         System.out.println("animal eats");
//     }
// }
interface Animal {
    public void walk(); 
}
interface Herbivore {
}
class Horse implements Animal{
    // Horse(){
    //     System.out.println("created horse");
    // }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }

    
}
    public class OOPS {
        public static void main(String [] args){
            // bank.Account account1 = new Account();
            // account1.name = "Jsmoke";

            Horse horse = new Horse();
            horse.walk();
            // Animal animal = new Animal();
            // animal.walk();





            Pen pen1 = new Pen();
            Pen pen2 = new Pen();
            Student s1 = new Student();
            s1.name = "Jsmoke";
            s1.age = 22;

            Student s2 = new Student(s1);
            s2.printInfo();

       
            pen2.color = "red";
            pen1.color = "blue";
            pen1.type = "Gel";
            pen2.type = "Ball";

            pen1.write();
            pen1.printColor();
            pen2.printColor();
            pen2.printType();
            s1.printInfo(); 
    }

    
}
