package exercicios.s14e04.entities;

public class PessoaFisica extends Pessoa {


    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    // construtor no caso da pessoa nao ter gastos com saude
    public PessoaFisica(String name, Double rendaAnual) {
        super(name, rendaAnual);
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calculoImposto() {

        if (super.getRendaAnual() < 20000.00) {
            if (gastosSaude >= 0.0) return calculoImpostoAbaixo20000() - gastosSaude * 0.5;
            else return calculoImpostoAbaixo20000();
        }
        else {
            if (gastosSaude >= 0.0) return calculoImpostoAcima20000() - gastosSaude * 0.5;
            else return  calculoImpostoAcima20000();
        }
    }

    public Double calculoImpostoAbaixo20000() {
        return super.getRendaAnual() * 0.15;
    }

    public Double calculoImpostoAcima20000() {
        return super.getRendaAnual() * 0.25;
    }
}
