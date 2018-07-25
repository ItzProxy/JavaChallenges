package chapter30;

import java.util.concurrent.*;

import chapter30.AccountWithSyncLock;

public class Test {
  private static AccountWithSyncLock account = new AccountWithSyncLock();

  public static void main(String[] args) {
  System.out.println("The Account Balance Before Deposit is " + account.getBalance());
    // Create and launch 100 threads
    for (int i = 0; i < 100; i++) {
      Thread t = new Thread(new Runnable(){
        @Override
        public void run() {
          account.PennyTask();
        }
      });
      //System.out.println("Starting thread: "+  t.getId());
      t.start();
      //System.out.println("Ending thread: "+  t.getId());
    }

    //executor.shutdown();

    // Wait until all tasks are finished
    //while (!executor.isTerminated()) {
    //}

    System.out.println("The Account Balance Before Deposit is " + account.getBalance());
  }
}