package prova;

public class Data {
    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano) throws Exception {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }else{
            throw new Exception("Dia invalido");
        }
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            throw new Exception("Mes invalido");
        }
        this.ano = ano;
    }

    
    public String dataAtual(){
        return (getDia() + "/" + getMes() + "/" + getAno());
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }else{
            throw new Exception("Dia invalido");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            throw new Exception("Mes invalido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
