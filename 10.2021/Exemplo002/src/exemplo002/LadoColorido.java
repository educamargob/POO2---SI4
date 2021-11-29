package exemplo002;

public class LadoColorido {
    private int num;
    private String cor;
    
    public LadoColorido(int num, String cor) throws Exception{
        setNumero(num);
        setCor(cor);
    }
    public void setNumero(int num) throws Exception{
        if(num < 0){
            throw new Exception("Numero não pode ser negativo");
        }
        if(num > 12){
            throw new Exception("Numero não pode ser maior que 12");
        }
        this.num = num;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    public int getNum() {
        return num;
    }

    public String getCor() {
        return cor;
    }
    
}


