public class Main
{
    public static void main(String[] args) {

        Estacionamento est1 = new Estacionamento("Estaciona Fácil", "Azul", 5, 10.0);
        Estacionamento est2 = new Estacionamento("Parking Rápido", "Verde", 3, 12.5);

        est1.exibirDados();
        System.out.println();
        est2.exibirDados();
    }
}
