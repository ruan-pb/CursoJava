
package ReservaDeHotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    protected int numeroDoQuarto;
    protected Date dataDeEntrada;
    protected Date dataDeSaida;

    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroDoQuarto, Date dataDeEntrada, Date dataDeSaida) {
        if (!dataDeSaida.after(dataDeEntrada)) {
            throw new ExcecaoDeTempo("A data de saida precisa ser depois da data de entrada");
        }
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataDeEntrada = dataDeEntrada;
        this.dataDeSaida = dataDeSaida;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public Date getDataDeSaida() {
        return dataDeSaida;
    }

    
    public long duracao(){
        long diferenca = this.dataDeEntrada.getTime() - this.dataDeSaida.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }
    
    public String toString(){
        return "Numero do Quarto: "+this.numeroDoQuarto+ 
                ", Data de Entrada: "+format.format(dataDeEntrada)+ 
                ", Data de Saida: "+format.format(dataDeSaida)+
                "Duração de: "+
                duracao()+" Noites";
    }
    
    public void atualização(Date Entrada, Date Saida){
        Date agora = new Date();
        if(dataDeEntrada.before(agora) || dataDeSaida.before(agora)){
            throw new ExcecaoDeTempo("As datas de reserva precisam ser de datas futuras");
        }
        if(Saida.after(Entrada)){
        } else {
            throw new ExcecaoDeTempo("As datas de Saida precisa ser depois da data de Entrada");
        }
        this.dataDeEntrada = Entrada;
        this.dataDeSaida = Saida;
        
        
        
        
    }

}
