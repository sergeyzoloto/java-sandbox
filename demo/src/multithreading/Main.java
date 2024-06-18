package multithreading;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    // multithreading = The ability of a CPU to execute multiple threads concurrently.
    // Helps to achieve full utilization of CPU.
    // Threads are independent, concurrent execution through a program, and each thread has its own stack.
    // An exception in one thread will not affect the other threads.
    // useful for serving multiple clients, animation, multi-threaded GUI, etc.

    // Create a subclass of the Thread class
    MyThread thread1 = new MyThread();

    // or

    // Create a class that implements the Runnable interface
    MyRunnable myRunnable = new MyRunnable();
    Thread thread2 = new Thread(myRunnable);

    thread1.start();
    thread2.start();
    
    // thread1.join(); // Wait for thread1 to finish before proceeding
    
    System.out.println(1/0);
    // thread2 is the only thread that will finish executing
  
  }
}