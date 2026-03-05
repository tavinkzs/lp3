public class Veiculo{
    
    String cor;
    String placa;
    Integer horaChegada;
    Integer horaSaida;
  
    public Integer calcularHorasEst(){
        return horaSaida - horaChegada;
    }
}
