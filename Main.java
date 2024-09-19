package VEICULOS;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Hyundai", "Azera", 2012);
        Carro carro1 = new Carro("Fiat", "Uno", 2012, 2);
        Moto moto1 = new Moto("Honda", "C160", 2019, true);

        veiculo1.exibirInformacao();
        veiculo1.acelerar();

        System.out.println("-".repeat(10));

        carro1.exibirInformacao();
        carro1.abrirPortaMalas();

        System.out.println("-".repeat(10));

        moto1.exibirInformacao();
        moto1.empinar();

    }
}
