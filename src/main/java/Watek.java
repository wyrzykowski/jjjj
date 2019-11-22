public class Watek extends Thread {
    private int i;
    private Obraz obraz;

    public Watek(int i, Obraz obraz){
        this.i = i;
        this.obraz=obraz;
    }

    public void run(){
        System.out.println(Thread.currentThread() + " ");
        obraz.calculate_histogram(i);
        obraz.print_histogram();
    }
}
