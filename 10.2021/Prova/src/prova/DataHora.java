package prova;

public class DataHora extends Hora{

    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo) throws Exception {
        super(hora, minuto, segundo, dia, mes, ano);
    }
    public String mostraDataHora(){
        return (dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo);
    }
    
}
