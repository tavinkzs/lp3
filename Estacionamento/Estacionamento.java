public class Estacionamento {

    private String empresa;
    private String cor;
    private int anos;
    private double valorPorHora;

    // Construtor
    public Estacionamento(String empresa, String cor, int anos, double valorPorHora) {
        this.empresa = empresa;
        this.cor = cor;
        this.anos = anos;
        this.valorPorHora = valorPorHora;
    }

    // Calcula o valor a pagar com base nas horas estacionadas
    public double calcularHoras(double horasEstacionadas) {
        return horasEstacionadas * valorPorHora;
    }

    // Exibe os dados do estacionamento
    public void exibirDados() {
        System.out.println("Empresa: " + empresa);
        System.out.println("Cor do estacionamento: " + cor);
        System.out.println("Anos de operação: " + anos);
        System.out.println("Valor por hora: R$ " + valorPorHora);
    }
}
