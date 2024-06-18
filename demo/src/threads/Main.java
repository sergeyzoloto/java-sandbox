package threads;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    // thread = A thread of execution in a program.
    // The Java Virtual Machine allows an application
    // to have multiple threads of execution running concurrently.
    // Each thread has a priority.
    // Threads with higher priority are executed in preference to threads
    // with lower priority.

    // The Java Virtual Machine continues to execute threads until
    // either of the following occurs:
    // 1. The exit method of class Runtime has been called and the 
    //    security manager has permitted the exit operation to take place.
    // 2. All threads that are not daemon threads have died, either 
    //    by returning from the call to the run method or by throwing
    //    an exception that propagates beyond the run method.

    // When a JVM starts up, there is a thread which calls the main method of the class used in starting the application.
    // This thread is usually called the "main" thread and has a priority of Thread.MAX_PRIORITY.

    // Daemon threads are service providers for user threads running in the same process.
    // Daemon threads are used for background supporting tasks and are only needed while normal threads are executing.

    System.out.println("Main thread started");
    System.out.println("Active threads count: " + Thread.activeCount());
    System.out.println("Current thread: " + Thread.currentThread().getName());
    System.out.println("Current thread priority: " 
      + Thread.currentThread().getPriority());
    System.out.println("Current thread state: " 
      + Thread.currentThread().getState());
    System.out.println("Current thread group: " 
      + Thread.currentThread().getThreadGroup());
    System.out.println("Current thread ID: " 
      + Thread.currentThread().getId());
    System.out.println("Current thread is alive: " 
      + Thread.currentThread().isAlive());
    System.out.println("Current thread is daemon: "
      + Thread.currentThread().isDaemon());
    System.out.println("Current thread is intoutupted: "
      + Thread.currentThread().isInterrupted());
    System.out.println("Current thread stack trace: "
      + Thread.currentThread().getStackTrace());
    System.out.println("Current thread context class loader: "
      + Thread.currentThread().getContextClassLoader());
    System.out.println("Current thread uncaught exception handler: "
      + Thread.currentThread().getUncaughtExceptionHandler());

      
    
    // Create a thread
    MyThread myThread = new MyThread();
    System.out.println("MyThread created. isAlive: " + myThread.isAlive());
    myThread.setDaemon(true);
    System.out.println("MyThread is a daemon thread: " + myThread.isDaemon());
    myThread.start();
    System.out.println("MyThread started. isAlive: " + myThread.isAlive());
    myThread.setName("SecondThread");
    System.out.println("MyThread name: " + myThread.getName());
    System.out.println("We have now that amount of threads: " + Thread.activeCount()); // must be 2
    
    for (int i = 3; i > 0; i--) {
      System.out.println("Main thread: " + i);
      Thread.sleep(1000);
    }
      
    System.out.println("Main thread finished");
  }
}
