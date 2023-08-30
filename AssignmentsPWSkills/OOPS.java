package AssignmentsPWSkills;

import java.util.Scanner;

class Student{
    String name;
    int roll_no;
}

class Triangle{
    public double getArea(int a, int b, int c){
        double s=(a+b+c)/2.0;
        return Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
    }

    public double getPerimeter(int a,int b,int c){
        return (a+b+c)/2.0;
    }
}

class Area{
    int length,breadth;
    public Area(int l,int b){
        length=l;
        breadth=b;
    }

    public int getArea(){
        return length*breadth;
    }
}


class Complex{
    int real;
    int img;

    public Complex(int r,int i){
        real=r;
        img=i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.img+b.img));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.img-b.img));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
    }

    public void printComplex(){
        if(real==0 && img !=0){
            System.out.println(img+"i");
        }
        else if(img==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real + " + " + img + "i");
        }
    }
}

class Employee{
    String name;
    int yoj;
    int salary;
    String address;
}


public class OOPS {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

//        Q1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
//        value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

//        class Student
        /*
        Student s1=new Student();
        s1.name=s.next();
        s1.roll_no=s.nextInt();
*/


//       Q2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//       creating a class named 'Triangle' without any parameter in its constructor.
//        Triangle class
/*

        System.out.println("Enter Sides: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Triangle t=new Triangle();
        double area=t.getArea(a,b,c);
        double peri=t.getPerimeter(a,b,c);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + peri);
*/


//        Q3.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
//          of its length and breadth as parameters of its constructor and having a method named 'returnArea'
//          which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
//        Area class
/*

        System.out.print("Enter Length: ");
        int l=s.nextInt();
        System.out.print("Enter Breadth: ");
        int b= s.nextInt();

        Area a=new Area(l,b);
        System.out.println("Area: "+ a.getArea());

*/


//        Q4.Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with
//        separate methods for each operation whose real and imaginary parts are entered by user.
//        Complex Class
/*

        System.out.print("Enter Real Value of first number: ");
        int real1=s.nextInt();
        System.out.print("Enter Imaginary Value of first number without iota: ");
        int img1=s.nextInt();
        System.out.print("Enter Real Value of second number: ");
        int real2=s.nextInt();
        System.out.print("Enter Imaginary Value of first number without iota: ");
        int img2=s.nextInt();

        Complex a=new Complex(real1,img1);
        Complex b=new Complex(real2,img2);

        Complex sum= Complex.add(a,b);
        Complex diff= Complex.diff(a,b);
        Complex product= Complex.product(a,b);

        sum.printComplex();
        diff.printComplex();
        product.printComplex();
*/

//        Q5. Write a program that would print the information (name, year of joining, salary, address) of three
//          employees by creating a class named 'Employee'. The output should be as follows:
//        Name    Year of Joining     Address
//       Robert     1994            64C- WallsStreet
//        Sam       2000            68D- WallsStreet
//        John      1999            26B- WallsStreet

/*

        Employee a = new Employee();
        a.name = "Robert";
        a.yoj = 1994;
        a.address = "64C- WallsStreet";
        Employee b = new Employee();
        b.name = "Sam";
        b.yoj = 2000;
        b.address = "64D- WallsStreet";
        Employee c = new Employee();
        c.name = "John";
        c.yoj = 1999;
        c.address = "26B- WallsStreet";
        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address");
        System.out.println(a.name + "\t" + a.yoj + "\t" + a.address);
        System.out.println(b.name + "\t" + b.yoj + "\t" + b.address);
        System.out.println(c.name + "\t" + c.yoj + "\t" + c.address);
*/


    }
}
