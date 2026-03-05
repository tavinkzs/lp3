public class Main {
   static Integer valorHora = 5;
    public static void main(String[] args) {

        Veiculo c1 = new Veiculo();
        c1.cor = "azul";
        c1.placa = "REBORN";
        c1.horaChegada = 12;
        c1.horaSaida = 32;
        Integer qtdHoras = c1.calcularHorasEst();
        Integer valorPago = qtdHoras*valorHora;
        
        System.out.println("Dados do carro1: ");
        System.out.println("Cor do carro: " + c1.cor);
        System.out.println("Placa do carro: " + c1.placa);
        System.out.println("Hora da chegada: " + c1.horaChegada);
        System.out.println("Hora da Saida:" + c1.horaSaida);
        System.out.println("Horas Estacionadas: " + qtdHoras);
        System.out.println("Valor a pagar: R$ " + valorPago);
        
        System.out.println();
        
        Veiculo c2 = new Veiculo();
        c2.cor = "Branco";
        c2.placa = "Piloto";
        c2.horaChegada = 04;
        c2.horaSaida = 18;
        Integer qtdHoras2 = c2.calcularHorasEst();
        Integer valorPago2 = qtdHoras2*valorHora;
        
        System.out.println("Dados do carro2: ");
        System.out.println("Cor do carro: " + c2.cor);
        System.out.println("Placa do carro: " + c2.placa);
        System.out.println("Hora da chegada: " + c2.horaChegada);
        System.out.println("Hora da Saida:" + c2.horaSaida);
        System.out.println("Horas Estacionadas: " + qtdHoras2);
        System.out.println("Valor a pagar: R$ " + valorPago2);
        
        
    }
}
