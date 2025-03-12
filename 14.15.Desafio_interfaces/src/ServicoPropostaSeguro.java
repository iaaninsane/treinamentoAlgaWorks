public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem){


        System.out.println("______________");
        System.out.println("Proposta de Seguro");
        System.out.println("______________");
        System.out.println(bem.descrever());
        System.out.print("Prêmio: R$");
        System.out.println(bem.calcularValorPremio());
    }
}
