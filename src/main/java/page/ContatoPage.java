package page;

import helpers.HelperWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;


public class ContatoPage extends BasePage {

    @FindBy(name = "nome")
    private WebElement nome;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(xpath = "//textarea[@placeholder='Nos conte o seu desafio']")
    private WebElement desafio;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement mensagensVerity;

    @FindBy(xpath = "//button[@data-testid='buttonElement']")
    private WebElement botaoEnviar;

    @FindBy(xpath = "//h2[text()='Verificação']")
    private WebElement verificao;


    public ContatoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void preencherNome(String nome) throws InterruptedException {
        HelperWait.waitPresenceOfElement(this.nome, 10);
        super.scrollParaElemento(this.nome);
        this.nome.sendKeys(nome);
        Thread.sleep(2000);
    }


    public void preencherEmail(String email) throws InterruptedException {
        this.email.sendKeys(email);Thread.sleep(2000);
    }


    public void preencherPhone(String phone) {
        this.phone.sendKeys(phone);
    }


    public void preencherDesafio(String desafio) {
        this.desafio.sendKeys(desafio);
    }

    public void clicarCheckboxMensagensVerity() {
        mensagensVerity.click();
    }

    public void clicarBotaoEnviar() throws InterruptedException {
        botaoEnviar.click();
        Thread.sleep(2000);
    }

    public String getVerificao(){
        HelperWait.waitPresenceOfElement(verificao, 10);
        return verificao.getText();
    }
}