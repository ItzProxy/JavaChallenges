package chapter30;
import java.util.concurrent.locks.*;
  // A class for account
  public class AccountWithSyncLock{
    private static Lock lock = new ReentrantLock(); 
    private int balance = 0;

    public int getBalance() {
      return balance;
    }

    public void deposit(int amount) {
      lock.lock(); //get lock
      // This delay is deliberately added to magnify the
      // data-corruption problem and make it easy to see.
      try {
        int newBalance = balance + amount;
        Thread.sleep(5);
        balance = newBalance;
      }
      catch (InterruptedException ex) {
        System.out.println("OUT");
      }
      finally{
        lock.unlock();
      }
    }

    public void PennyTask() {
      this.deposit(1);
    }
}