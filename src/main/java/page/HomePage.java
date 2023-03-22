package page;

import helpers.HelperWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class HomePage {

    @FindBy(xpath = "//div[@title='Voltar ao site']")
    private WebElement botaoFechar;

    @FindBy(xpath = "//span[text()='CONHEÇA A NEURONA']")
    private  WebElement janelaAberta;

    @FindBy(xpath = "//span[text()='Nossas soluções']")
    private WebElement textoNovaSolucao;

    @FindBy(xpath = "//p[text()='CONTATO']")
    private WebElement clicarContato;

    public HomePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clicarBotaoFechar(){
        botaoFechar.click();
    }

    public boolean validarTelaFecharAberto(){ return (HelperWait.waitVisible(janelaAberta, 10) != null); }

    public void clicarContato(){
        HelperWait.waitClicable(clicarContato, 10);
        clicarContato.click();
    }

    public String obterTextoNovaSolucao(){
        return textoNovaSolucao.getText();
    }

}
