public class Main {

    public static void main(String[] args) {

        
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 100000);
        Carro carro2 = new Carro("Honda", "Civic", 2023, 120000);

        
        carro1.exibirDados();
        System.out.println();
        carro2.exibirDados();
    }
}
