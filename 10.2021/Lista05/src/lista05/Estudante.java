package lista05;

public class Estudante {
    private String nome;
    private float n1, n2, n3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public void atribuirPontoExtra(){
        
    }
    
    public float calcularMedia(){
        float media;
        media = (getN1() + getN2() + getN3()) / 3;
        return media;
    }
}
