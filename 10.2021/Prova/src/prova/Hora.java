package prova;

public class Hora extends Data{
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Hora(int hora, int minuto, int segundo, int dia, int mes, int ano) throws Exception {
        super(dia, mes, ano);
        
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }else{
            throw new Exception("Hora errada");
        }
        if(minuto >= 0 && minuto <= 60){
            this.minuto = minuto;
        }else{
            throw new Exception("Minutagem errada");
        }
        if(segundo >= 0 && segundo <= 60){
            this.segundo = segundo;
        }else{
            throw new Exception("Segundo errado");
        }
        
    }

    

    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws Exception {
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }else{
            throw new Exception("Hora errada");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws Exception {
     if(minuto >= 0 && minuto <= 60){
            this.minuto = minuto;
        }else{
            throw new Exception("Minutagem errada");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) throws Exception {
       if(segundo >= 0 && segundo <= 60){
            this.segundo = segundo;
        }else{
            throw new Exception("Segundo errado");
        }
    }
    
    
}
