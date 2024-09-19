package VEICULOS;

public class Carro extends Veiculo{
    private int portas;
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }
    public int getPortas() {
        return portas;
    }

    public void abrirPortaMalas(){
        System.out.println("SHUUUUUOOU... (abrindo porta malas)");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("número de portas: " + getPortas());
    }
}
