public class SynchronizingThreadsExample2 extends Thread {

    @Override
    public void run(){

        for(int i = 0; i<10000 ; i++){
            Main.syncCounter();
        }
    }
}
