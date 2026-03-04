public class Carro {

    // Atributos do carro
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    // Construtor
    public Carro(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Calcula 5% de imposto
    public double calcularImposto() {
        return valor * 0.05;
    }

    // Calcula valor total com imposto
    public double calcularValorTotal() {
        return valor + calcularImposto();
    }

    // Mostra os dados do carro
    public void exibirDados() {
        System.out.println("===== RECIBO =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor Base: R$ " + valor);
        System.out.println("Imposto (5%): R$ " + calcularImposto());
        System.out.println("Valor Total: R$ " + calcularValorTotal());
    }
}
