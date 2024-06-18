package threads;

public class MyThread extends Thread{
  
  @Override
  public void run() {
    if(this.isDaemon()) {
      System.out.println("This is a daemon thread");
    } else {
      System.out.println("This is a user thread");
    }
    System.out.println("MyThread is running");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}