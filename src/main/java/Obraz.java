import  java.util.Random;

class Obraz {

    private int size_n;
    private int size_m;
    private char[][] tab; //tablica obrazu
    private int[] histogram; // ile znakow wystapilo dla kazdeja sci

    public Obraz(int n, int m) {

        this.size_n = n;
        this.size_m = m;
        tab = new char[n][m];

        final Random random = new Random();

        for(int i=0;i<n;i++) { //size n
            for(int j=0;j<m;j++) { //sizee m
                tab[i][j] = (char)(random.nextInt(94)+33);  // ascii 33-127 // losuje se zank
                System.out.print(tab[i][j]+" "); //wyswietla ten znak
            }
            System.out.print("\n"); // do nowej linii
        }
        System.out.print("\n\n");

        histogram = new int[94];// tablica asci,
        clear_histogram();
    }

    public void clear_histogram(){

        for(int i=0;i<94;i++) histogram[i]=0;

    }


    public void calculate_histogram(){

        for(int i=0;i<size_n;i++) {
            for(int j=0;j<size_m;j++) {

                for(int k=0;k<94;k++) { // dla kazdego znaku asci
                    if(tab[i][j] == (char)(k+33)) histogram[k]++; // sprawdza ilosc wsytepowania dla akzdego el asci
                }

            }
        }

    }

    public void print_histogram(int k){

        for(int i=0;i<k;i++) {
            System.out.print((char)(i+33)+" "+histogram[i]+"\n");
        }

    }

}