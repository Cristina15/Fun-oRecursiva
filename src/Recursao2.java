/**
 *
 * @author vitoria.csilva15
 * at 2
 */
public class Recursao2 {
    
    public static void binario(int n){
        if(n<2){
            System.out.print(n);
            return;
        }
        // coloca o resto depois para saber a sequencia certa
        binario(n/2);
        System.out.print(n%2);
    }
    
    public static void main(String[] args) {
        binario(14);
    }
}
