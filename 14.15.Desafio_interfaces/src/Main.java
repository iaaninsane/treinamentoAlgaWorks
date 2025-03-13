import model.BemSeguravel;
import model.ImovelResidencial;
import services.ServicoPropostaSeguro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServicoPropostaSeguro servicoProstaSeguro = new ServicoPropostaSeguro();
        BemSeguravel imovel = new ImovelResidencial(440000, 100);

        servicoProstaSeguro.emitir(imovel);
        
    }
}