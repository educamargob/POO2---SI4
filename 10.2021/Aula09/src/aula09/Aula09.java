package aula09;

public class Aula09 {

    public static double efetuarCalculo(Calculavel calc, double a, double b){
        return calc.calcular(a, b);
    }
    
    public static void main(String[] args) {
        //CalculavelImpi c = new CalculavelImpi();
        //CalculavelPedro p = new CalculavelPedro();
         System.out.println("Resultado: " + efetuarCalculo(new Calculavel(){
            @Override
            public double calcular(double a, double b) {
                return (a + b) / 2;
            }
        }, 6, 9));
        
        System.out.println("Resultado: " + efetuarCalculo((double a, double b) -> 0.4 * a + 0.6 * b, 6, 9));
    }
}