package Timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import access_modifiers.package2.C;

public class Main {

  public static void main(String[] args) {

    // Timer = a class that measures time in milliseconds
    // It has three methods:
    //   start() = starts the timer
    //   stop() = stops the timer
    //   getElapsedTime() = returns the elapsed time in milliseconds

    // TimerTask = a task that can be scheduled for one-time or repeated execution by a Timer
    // It has one method:
    //   run() = the code to be executed by the task

    // Create a Timer object
    Timer timer = new Timer();

    // Create a TimerTask object
    TimerTask task = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Timer task executed.");
      }
    };

    TimerTask task2 = new TimerTask() {
      @Override
      public void run() {
          System.out.println("Timer task executed at specific time.");
      }
    };

    // Schedule the task to run after 2 seconds
    timer.schedule(task, 2000);

    Calendar date = Calendar.getInstance();
    // Set it in 10 seconds from now
    date.add(Calendar.SECOND, 10);

    // // Set the date and time
    // date.set(Calendar.MILLISECOND, 0);
    // date.set(Calendar.SECOND, 0);
    // date.set(Calendar.MINUTE, 22);
    // date.set(Calendar.HOUR_OF_DAY, 14);
    // date.set(Calendar.DAY_OF_MONTH, 18);
    // date.set(Calendar.MONTH, Calendar.JUNE);
    // date.set(Calendar.YEAR, 2024);
    // // Set current timezone
    // date.setTimeZone(Calendar.getInstance().getTimeZone());

    System.out.println(
      "Timezone in date variable: " 
      + date.getTimeZone().getDisplayName() 
      + " " 
      + date.getTimeZone().getID()
    );
    System.out.println(
      "Current timezone: " 
      + Calendar.getInstance().getTimeZone().getDisplayName() 
      + " " 
      + Calendar.getInstance().getTimeZone().getID()
    );
    

    // Schedule the task to run at a specific time
    timer.schedule(task2, date.getTime());
    System.out.println("Task scheduled at specific time. : " + date.getTime());
}
}