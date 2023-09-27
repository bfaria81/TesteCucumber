package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class MyStepdefs {
    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
    }

    @E("digito no campo usuário o nome {string}")
    public void digitoNoCampoUsuárioONome(String arg0) {
    }

    @E("digito no campo senha a senha {string}")
    public void digitoNoCampoSenhaASenha(String arg0) {
    }

    @Quando("clico no botão login")
    public void clicoNoBotãoLogin() {
    }

    @Então("a mensagem sucesso é exibida")
    public void aMensagemSucessoÉExibida() {
    }

    @Dado("que estou na tela de inicio")
    public void queEstouNaTelaDeInicio() {
    }

    @E("digito o numero {int}")
    public void digitoONumero(int arg0) {
    }

    @E("digito a funcao de somar")
    public void digitoAFuncaoDeSomar() {
    }

    @Quando("clico no botão de igual")
    public void clicoNoBotãoDeIgual() {
    }

    @Então("o resultado {int} é mostrado")
    public void oResultadoÉMostrado(int arg0) {
    }
}
