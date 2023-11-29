import java.util.ArrayList;
import java.util.Collections;


public class App {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("2");
        arrayList.add("5");
        arrayList.add("3");

        Collections.sort(arrayList);
        System.out.println("ArrayList classificado contém :" + arrayList);

        int index = Collections.binarySearch(arrayList, "5");
        

        if (index >= 0) {
            System.out.println("Elemento Encontrado em :" + index);
        } else {
            System.out.println("Elemento não encontrado");
        }
        //Estrutura Condicional Para que, Se o elemento for Encontrado na lista exiba o resultado pedido
        //E caso o elemento não esteja na lista, exiba elemento não encontrado
    }
}
