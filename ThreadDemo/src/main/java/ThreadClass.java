public class ThreadClass extends Thread {

    @Override
    public void run() {

      for(int i = 0; i<10 ;i++){
          long threadId = Thread.currentThread().getId(); //get ID of current thread;
          System.out.println("Id of current thread:" + threadId + " Value: " + i);
      }

      //Sleep thread for 10ms
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

