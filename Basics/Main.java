// class lec01 {
//     String color;        //INSTANCE VARIABLE(PROPERTIES OF A CLASS)
//     int speed;
// // CONSTRUCTOR
//     lec01(String color, int speed) {
//         this.color = color;     // "THIS REFERS TO CURRENT OBJECT"
//         this.speed = speed;
//     }

//     public static void main(String[] args) {   // MAIN METHOD(ENTRY POINT OF THE PROGRAM)
//         lec01 l = new lec01("blue", 80);   //OBJECT CREATION
//         System.out.println(l.color);  // OUTPUT:BLUE
//         System.out.println(l.speed);  // OUTPUT:80
//     }
// }




// class Student{
//     String name;
//     int rollNo;

//     Student(String name,int rollNo){
//         this.name=name;
//         this.rollNo=rollNo;
//     }
//     public static void main(String[] args) {
//         Student s=new Student("Chandana", 12);
//         System.out.println(s.name);
//         System.out.println(s.rollNo);
//     }
// }


//ENCAPSULATION 
// class Student{
//     private String name;
//     private int rollNo;

//     public void setname(String name){
//         this.name=name;
//     }
//     public void setrollNo(int rollNo){
//         this.rollNo=rollNo;
//     } 
//     public String getname(){
//         return name;
//     }
//     public int getrollNo(){
//         return rollNo;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setname("chandana");
//         s.setrollNo(12);
//         System.out.println(s.getname());
//         System.out.println(s.getrollNo());
//     }
// }


// class Employee{
//     private int empId;
//     private String empName;
//     public void setempId(int empId){
//         this.empId=empId;
//     }
//     public void setempName(String empName){
//         this.empName=empName;
//     }
//     public int getempId(){
//         return empId;
//     }
//     public String getempName(){
//         return empName;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.setempId(101);
//         e.setempName("Chandana");
//         System.out.println(e.getempId());
//         System.out.println(e.getempName());
//     }
// }

//INHERITANCE
// class Animal{
//     void eat(){
//         System.out.println("animal is eating");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog is Barking");
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.bark();
//     }
// }


//POLYMORPHISM

//Method Overloading
// class Calculator{
//     int mul(int a,int b){
//         return a*b;
//     }
//     int mul(int a,int b,int c){
//         return a*b*c;
//     }
//     public static void main(String[] args) {
//         Calculator c = new Calculator();
//         System.out.println(c.mul(5, 9));
//         System.out.println(c.mul(2, 3, 4));
//     }
// }

//Method Overriding
// class Shape {
//     void draw(){
//         System.out.println("drawing the shape");
//     }
// }
// class Circle extends Shape{
//     void draw(){
//         System.out.println("drawing circle");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Shape s = new Circle();
//         s.draw();
//     }
// }

//ABSTRACTION
//using abstract class
// abstract class Vehicle{
//     int speed=60;
//     abstract void run();
//     void fuel(){
//         System.out.println("Uses fuel");
//     }
// }
// class Car extends Vehicle{
//     void run(){
//         System.out.println("Car is running");
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         v.run();
//         v.fuel();
//         System.out.println(v.speed);
//     }
// }

//using interface 
// interface Payment{
//     void pay();
// }
// class phonepe implements Payment{
//     public void pay(){
//         System.out.println("Payment using phonepe");
//     }
// }
// class creditcard implements Payment{
//     public void pay(){
//         System.out.println("Payment using Credit Card");
//     }
// }
// class Main{
//     public static void main(String [] args){
//         Payment p1 = new phonepe();
//         p1.pay();
//         Payment p2 = new creditcard();
//         p2.pay();
//     }
// }
