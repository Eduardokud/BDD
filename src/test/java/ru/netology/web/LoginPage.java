package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(css = "[data-test-id='login'] input ")
    private SelenideElement loginField;
    @FindBy(css = "[data-test-id='password'] input")
    private SelenideElement passwordField;
    @FindBy(css = "[data-test-id='action-login']")
    private SelenideElement loginButton;

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();

    }
}
