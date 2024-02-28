package PrimeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecoesHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);

        //numeros.remove(11);

        for(Integer elemento : numeros){
            System.out.println(elemento);
        }
        System.out.println(numeros.size());

        System.out.println(numeros.contains(9));
    }
}
