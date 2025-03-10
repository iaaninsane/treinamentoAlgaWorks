public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISENCAO = 50000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {

        double imposto = 0;
        if (receitaAnual > RECEITA_ANUAL_ISENCAO) {

            imposto = receitaAnual*ALIQUOTA_IMPOSTO_RENDA;

        }

        return imposto;
    }
}
