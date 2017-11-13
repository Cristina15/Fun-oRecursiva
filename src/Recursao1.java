
public class Recursao1 {

    static double potencia(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * potencia(b, e - 1);
        // return (Math.pow(b, e));

    }

    public static void main(String[] args) {

        System.out.println(potencia(3, 4));
    }

}

