package exemplo002;

public class Exemplo002 {

    public static void main(String[] args) {
        try{
            DadoColorido d1 = new DadoColorido(6);
            d1.adicionarLado(0, "Azul");
            d1.adicionarLado(1, "Verde");
            d1.adicionarLado(2, "Marrom");
            System.out.println(d1.toString());
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        
    }
    
}
