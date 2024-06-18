package multithreading;

public class MyThread extends Thread{
  
  @Override
  public void run() {

    for (int i = 0; i < 10; i++) {
      System.out.println("Thread #1: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(1/0);
    }

    System.out.println("Thread #1 finished");
  }
}