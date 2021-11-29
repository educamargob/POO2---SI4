package prova;

public class Prova {

    public static float kmPor(Calculos calc, float a){
            return calc.kmPorLitro(a);
    }
    public static void main(String[] args) {
        try{
        Data data = new Data(31, 11, 2021);
        DataHora dhora = new DataHora(31, 11, 2021, 10, 2, 2);
        System.out.println(dhora.mostraDataHora());
        
       
        //Carro normal
        Carro c = new Carro("Gol", "Volkswagen");
        c.setKms(0.0f);
        System.out.println(c.isNovo() + "" + c.getKms());
        c.andarCarro(10.0f);
        
        //testando kilometragem e vendo se é novo ou não
        System.out.println(c.getKms() + " " + c.isNovo());
        
        //Percorrerá 90 Km com 10 litros de gasolina
        System.out.println("Um carro normal faz: "+c.kmPorLitro(10) +" KM/L");
        System.out.println(c.informacoes());
        
        
        //Carro corrida
        CarroCorrida cc = new CarroCorrida("Ferrari 488", "Ferrari", 720, "V8", "Tração Traseira");
        
        //Percorrendo distancia sem nitro
        System.out.println("A distancia percorrida durou " + cc.percorrerDistancia(10) + " Segundos ");
        
        //Percorrendo distancia usando nitro
        cc.usarNitro();
        System.out.println("A distancia percorrida durou " + cc.percorrerDistancia(10) + " Segundos ");
        //informações do carro de corrida
        System.out.println(cc.informacoes());
      
        //Percorrerá 50 Km com 10 litros de gasolina
        System.out.println("Um carro de corrida faz: "+cc.kmPorLitro(10) +" KM/L");
        //Usando lambda
        System.out.println("Um carro de corrida faz: " + kmPor((float a) -> a * cc.getKMPL(), 5) + " KM/L" );
        

        //Carro Antigo
        CarroAntigo ca = new CarroAntigo("Jaguar XJC", "Jaguar Cars", 1976, true);
        ca.setData(data);
        
        //Colocando a quantidade de carros no mundo;
        ca.setQtdMundo(1);
        System.out.println("O carro é " + ca.getRaridade());
        
        //Colocando preço inicial
        ca.setPreco(10000.00f);
        try{
            System.out.println("O preço do carro é de R$"+ ca.verificarPreço() + "");
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        
        try{
            ca.carroColeção();
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        System.out.println(ca.informacoes());
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
            
    }
}
