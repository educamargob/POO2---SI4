
package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String a2 = sc.nextLine();
        String a3 = sc.nextLine();
        if(a1.equals("vertebrado")){
            if(a2.equals("ave")){
                if(a3.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }
            if(a2.equals("mamifero")){
                if(a3.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(a2.equals("inseto")){
                if(a3.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }
            if(a2.equals("anelideo")){
                if(a3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
