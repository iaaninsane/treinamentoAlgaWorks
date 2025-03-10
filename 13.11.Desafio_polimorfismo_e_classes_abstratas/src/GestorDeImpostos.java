public class GestorDeImpostos {

    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar (Pessoa... pessoas){

        for(Pessoa pessoa : pessoas){

            var impostoDevido = pessoa.calcularImpostos();
            valorTotalImpostos += impostoDevido;
            System.out.println("Imposto devido de " + pessoa.getNome() + ": " + impostoDevido);

        }


    }
}
