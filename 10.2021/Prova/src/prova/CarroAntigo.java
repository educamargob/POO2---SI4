package prova;

public class CarroAntigo extends Carro{
    private int ano;
    private boolean original;
    private int qtdMundo;
    private String raridade;
    private float preco;
    private Data data;
    
    
    
    public CarroAntigo(String modelo, String fabricante, int ano, boolean original) {
        super(modelo, fabricante);
        setAno(ano);
        setOriginal(original);
    }
    
    public float verificarPreço() throws Exception{
        if(preco == 0){
            throw new Exception("Preco inicial não informado");
        }
        if(getRaridade().equals("Super raro")){
            setPreco(getPreco() + 100000.00f);
        }else if(getRaridade().equals("Raro")){
            setPreco(getPreco() + 50000.00f);
        }else if(getRaridade().equals("Pouco raro")){
            setPreco(getPreco() + 20000.00f);
        }
        return getPreco();
    }
    //Carros com mais de 30 anos podem obter a placa preta de coleção do mercosul
    public void carroColeção() throws Exception{
        if(isOriginal() == false){
            throw new Exception("Carro não é 100% original");
        }
       
        if(getAno() < (data.getAno() - 30)){
            System.out.println("O Carro possui placa de coleção");
        }else{
            System.out.println("O carro não tem mais de 30 anos");
        }
    }

    public String informacoes() {
        return "Carro Antigo{" + "Modelo = " + modelo + ", Fabricante = " + fabricante + " Ano = " + ano + ", original = " + original + ", qtdMundo = " + qtdMundo + ", raridade = " + raridade + '}';
    }
    
    
    //Getters e Setters
   
    //Dependendo da quantidade de carros no mundo é definida a raridade do mesmo.
    public void setQtdMundo(int qtdMundo) {
       
        this.qtdMundo = qtdMundo;
        if(this.qtdMundo <= 10){
            setRaridade("Super raro");
        }else if(this.qtdMundo > 10 && this.qtdMundo <= 50){
            setRaridade("Raro");
        }else if(this.qtdMundo > 50 && this.qtdMundo <= 200){
            setRaridade("Pouco raro");
        }else if(this.qtdMundo > 200){
            setRaridade("Normal");
        }
    }
    public int getQtdMundo() {
        return qtdMundo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    

    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }
    
    public String getRaridade() {
        return raridade;
    }
    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    


    
}
