package OOP;
/*
MultiTasking
MultiThreading
===============
- Word Processors   : Typing, saying, formatting and spell checking happens at the same time
- Web servers       : apache HTTP server creates a thread pool and serve the request
- IDEs              : Modern IDEs do compile error checks while you are writing code
- Games             : In Modern games, multiple objects are implemented as different threads

Advantages
==============
1. Parallelism and improved performance - on different processors
2. Responsiveness
3. Better resource utilisation
    Within a process, they all share same memory space
Thread are also called light weight process.


Disadvantages
- difficulty in writing, testing and debugging code
- can lead to deadlock or race conditions
- static variables and classes which are shared

Example of Race Condition

Thread 1            Thread 2
----------          -----------
read x
x++
write x
                    read x
                    x++
                    write x

Deadlock and cannot proceed further anymore
    R1
   /  \
T1      T2
  \    /
    R2

All threads are managed by JVM

Two ways to create threads
--------------------------
1. Extending thread class
2. Implementing runnable interface


 */

class Test extends Thread{
    public void run(){
        for(int i =0; i < 3; i++){
            System.out.println("Inside Test Thread");
        }
    }
}
public class MltiThreading {
    public static void main(String[] args) throws InterruptedException {
//        Test t = new Test();
//        t.start();
//        for(int i = 0; i < 3; i++){
//            System.out.println("Inside Main Thread");
//            Thread.sleep(2);
//        }
//===================================================================
//        Complex c1 = new Complex(10, 20);
//        c1.print();
//        Complex c2 = new Complex(20, 30);
//        c1.add(c2);
//        c1.print();
//===================================================================
        Point p = new Point(10, 20);
        p.print();
    }
}

class Complex{
    int real, image;
    void print(){
        System.out.println(real + " + i" + image);
    }
    // Constructor - used to initialise the object and initialise the data members
    // initialise the data members
    Complex(int r, int i ){
        real = r;
        image = i;
    }

    void add(Complex c){
        real = real + c.real;
        image = image + c.image;
    }
}

class Point{
    int x, y;
    Point(int a, int b){
        x = a;
        y = b;
    }

    void print(){
        System.out.println("x = " + x + ", y = "+ y);
    }
}




































