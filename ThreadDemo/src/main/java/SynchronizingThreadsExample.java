public class SynchronizingThreadsExample extends Thread {

    @Override
    public void run(){

        for(int i = 0; i<10000 ; i++){
            Main.syncCounter();
        }
    }
}
