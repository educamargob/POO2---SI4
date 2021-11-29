package aula13d;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Aula13d {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);
        System.out.println(fila.element());
        fila.remove();
        System.out.println(fila.element());
        
        Map<String, Integer> idadesPessoas = new HashMap<>();
        
        idadesPessoas.put("Samuel", 35);
        idadesPessoas.put("João", 21);
        
        System.out.println(idadesPessoas);
    }
    
}
