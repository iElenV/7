import java.util.Random;



public class NumRandom {
   public int a;
    public int b;

    public NumRandom(int a, int b) {
        this.a = this.a;
        this.b = this.b;
    }

    public int Len (int a, int b) {
        return b-a;
    }

    public int Number (int a, int b) {
        Random random = new Random();
        return random.nextInt(a, b);
    }
}
