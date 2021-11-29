package lista05;

public class Lista05 {

    public static double calcularMedia(Calculos calc, double a, double b, double c){
        return calc.calcularMedia(a, b, c);
    }
    public static void main(String[] args) {
        Estudante est = new Estudante();
        
        est.setN1(10);
        est.setN2(2);
        est.setN3(10);
        
        System.out.println("A média do estudante foi: " + calcularMedia((double a, double b, double c) 
                -> (a + b + c) / 3, est.getN1(), est.getN2(), est.getN3()));
    }
    
}
