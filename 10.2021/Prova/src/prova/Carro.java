package prova;

public class Carro implements Calculos{
    protected String modelo;
    protected String fabricante;
    private float kms;
    private final float KMPL = 9;
    private boolean novo = false;
    

    
    public Carro(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    @Override
    //Distancia percorrida pelo carro com uma determinada quantidade de litros de gasolina
    public float kmPorLitro(float l) {
        float dis = KMPL * l;
        return dis;
    }
    //Andar uma distancia com o carro
    public void andarCarro(float k){
        setKms(getKms() + k);
        setNovo(false);
    }
    //Informações sobre o carro

    public String informacoes() {
        return "Carro {" + "Modelo = " + modelo + ", Fabricante = " + fabricante + ", Kilometragem = " + kms + ", Km/L = " + KMPL + ", Novo = " + novo + '}';
    }
    
    
    //Getters e Setters
    
   //setando kilometragem, caso for = 0 o carro é novo
    public void setKms(float kms) {
        this.kms = kms;
        if(this.kms == 0.0f){
            setNovo(true);
        }
    }
    public float getKms() {
        return kms;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }


    
    
}
