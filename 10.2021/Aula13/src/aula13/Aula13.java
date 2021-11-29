package aula13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Aula13 {

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Banana", "Laranja", "Pera", "Uva");
        
       
        
        lista.forEach(System.out::println);
        
        lista.forEach(e -> {
            if(e.startsWith("P")){
                System.out.println("Elemento:" + e);
            }
        });
        
        Iterator<String> it = lista.iterator();
        while(it.hasNext()) {
            String e = it.next();
            if(e.contains("va")){
                System.out.println("Elemento 2:" + e);
            }
        }
    }
}
