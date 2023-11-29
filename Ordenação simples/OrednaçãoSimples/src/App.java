import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numeros = new int[] {10, 15 ,0 ,1 ,5 ,81 ,64 ,2 , 5, 9};
        Arrays.sort(numeros);
        System.out.println(numeros);

        System.out.println(Arrays.toString(numeros));
    }
}
