package aula13c;

import java.util.ArrayList;
import java.util.List;

public class Aula13c {

    public static void main(String[] args) {
        List<String> aulas = new ArrayList<>();
        List<String> ultimas;
        
        aulas.add("Apresentação da disciplina");
        aulas.add("A linguagem java");
        aulas.add("Estruturas de controle");
        aulas.add("Sintaxe e semântica");
        System.out.println(aulas.toString());
        
        aulas.forEach(e -> {
            System.out.println("Aula: " + e);
        });
        
        ultimas = aulas.subList(2, aulas.size()); //pega as duas ultimas 
        System.out.println(ultimas);
        
        for(String aula : aulas){
            System.out.println("Aula: " + aula);
        }
    }
}
