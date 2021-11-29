package aula13b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Aula13b {

    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        
        A.addAll(Arrays.asList(1, 2, 4, 5));
        B.addAll(Arrays.asList(1, 4, 6));
        
        
        System.out.println("A " + A + "Tamanho: " + A.size());
        System.out.println("B" + B + "Tamanho: " + B.size());
        
        System.out.println("A Contem B?" + A.contains(B));
       
        A.retainAll(B); //mantem os numeros iguais nas listas
        //A.addAll(B); //adiciona os numeros de B em A 
        
        System.out.println("A " + A + " Tamanho: " + A.size());
    }
    
}
