import helpers.HelperDriver;
import org.junit.*;
import page.ContatoPage;
import page.HomePage;

public class DesafioVerityTest {

    HomePage homePage = new HomePage();
    ContatoPage contatoPage = new ContatoPage();

    @Before
    public void setup(){
        HelperDriver.inicializar();
    }

    @Test
    public void cenario1(){
        if(homePage.validarTelaFecharAberto()){
            homePage.clicarBotaoFechar();
        }
        Assert.assertEquals(homePage.obterTextoNovaSolucao(), "Nossas soluções_");
    }

    @Test
    public void cenario2() throws InterruptedException {

        if(homePage.validarTelaFecharAberto()){
            homePage.clicarBotaoFechar();
        }
        homePage.clicarContato();
        contatoPage.preencherNome("Alecsandro");
        contatoPage.preencherEmail("alecsandro.santana@gmail.com");
        contatoPage.preencherPhone("71 99338282");
        contatoPage.preencherDesafio("desafio alecsandro");
        contatoPage.clicarCheckboxMensagensVerity();
        contatoPage.clicarBotaoEnviar();
        Assert.assertEquals(contatoPage.getVerificao(), "Verificação");

    }
    @After
    public void tearDown(){
        HelperDriver.finalizar();
    }
}
