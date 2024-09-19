package VEICULOS;

import javax.sound.midi.Soundbank;

public class Moto extends Veiculo{
    private boolean temCarenagem;
    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }
    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    public void empinar(){
        System.out.println("RAN DAN DAN DAN DAN DAN DAN 'olha o graaau' (empinando)");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Tem Carenagem: " + (isTemCarenagem() ? "sim" : "não"));
    }
}
