public class Main {

    public static int count = 0;

    public static synchronized void syncCounter(){
        count++;
    }

    public static void main(String[] arg){

        //Approach I - extends Threads class
        ThreadClass thread1 = new ThreadClass();
        ThreadClass thread2 = new ThreadClass();
        ThreadClass thread3 = new ThreadClass();

        thread1.start();
        thread2.start();
        thread3.start();


        //Approach II - implements runnable interface

        Thread threadRunnable1 = new Thread(new ThreadClassRunnable());
        Thread threadRunnable2 = new Thread(new ThreadClassRunnable());

        threadRunnable1.start();
        threadRunnable2.start();

        //Synchronizing threads methods

    SynchronizingThreadsExample t1 = new SynchronizingThreadsExample();
    SynchronizingThreadsExample2 t2 = new SynchronizingThreadsExample2();

    t1.start();
    t2.start();

        try {
            t1.join(); //t1.join() means that the MAIN thread waits for t1 to complete.
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("value:" + count);
    }
}
