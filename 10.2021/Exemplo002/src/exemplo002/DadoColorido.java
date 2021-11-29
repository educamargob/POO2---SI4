package exemplo002;

public class DadoColorido {
    private int totalLados;
    private LadoColorido[] lados;
    private int numLados;
    
    public DadoColorido(int totalLados) throws Exception{
        setTotalLados(totalLados);
        numLados = 0;
        lados = new LadoColorido[this.totalLados];
    }
    public void setTotalLados(int totalLados) throws Exception{
        if(totalLados < 4){
            throw new Exception("Dado não pode ter menos de 4 lados");
        }
        if(totalLados > 8){
            throw new Exception ("Este dado não pode ter mais que 8 lados!");
        }
        this.totalLados = totalLados;
    }
    
    public void adicionarLado(int num, String cor) throws Exception{
        if(numLados >= totalLados){
            throw new Exception("Já foram informados todos os lados!");
        }
        
        this.lados[numLados] = new LadoColorido(num, cor);
        numLados++;
    }
    @Override
    public String toString(){
        String info = "";
        
        for(int i = 0; i < numLados; i++){
            info += lados[i].getNum() + " | " + lados[i].getCor() + "\n";
        }
        return info;
    }
}
