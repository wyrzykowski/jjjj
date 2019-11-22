public class ThreadClassRunnable implements Runnable {

    @Override
    public void run(){

        for(int i = 0; i<10 ;i++){
            long threadId = Thread.currentThread().getId(); //get ID of current thread;
            System.out.println("Id of current thread:" + threadId + " Value: " + i);
        }

    }
}
