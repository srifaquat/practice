package simple;

public class PrintWithoutLoop {

    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {
        if (n <= 100) {
            System.out.println(n);
            n++;
            print(n);
        }
    }
}
