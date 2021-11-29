package prova;

public class CarroCorrida extends Carro implements Calculos{
    private int potencia;
    private boolean nitro = false;
    private String motor;
    private String tracao;
    private final float KMPL = 5;

    public CarroCorrida(String modelo, String fabricante, int potencia, String motor, String tracao) {
        super(modelo, fabricante);
        setPotencia(potencia);
        setMotor(motor);
        setTracao(tracao);
    }
    
    
    @Override
    public float kmPorLitro(float l) {
        float dis = KMPL * l;
        return dis;
    }
    public float kmPorLitro(Calculos calc){
        return calc.kmPorLitro(KMPL);
    }
    //Usando o nitro o carro aumenta 20 cavalos de potencia
    public float usarNitro(){
        setNitro(true);
        setPotencia(getPotencia() + 300);
        return getPotencia();
    }
    
    //retorna o tempo gasto para percorrer uma distancia
    public float percorrerDistancia(float dis){
        //velocidade é dada pela potencia dividida pela força, nesse caso coloquei 75kg de força mas é só uma suposição
        float vel = potencia / 75;
        float tempo = vel / dis;
        return tempo;
    }
    //Informações do carro
     public String informacoes() {
        return "Carro Corrida{" + "Modelo = " + modelo + ", Fabricante = " + fabricante + ", Potencia = " + potencia + ", Km/L = " + KMPL + ", Motor = " + motor + ", Tração = " + tracao + '}';
    }
    
    //Getters e Setters
     
    public float getKMPL() {
        return KMPL;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
    
    
    
}
