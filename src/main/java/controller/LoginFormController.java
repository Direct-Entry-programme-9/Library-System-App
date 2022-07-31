package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import util.Navigation;
import util.Route;

import java.io.IOException;

public class LoginFormController {
    public Button btnLogin;
    public PasswordField txtPassword;
    private final String password="dep9";

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (txtPassword.getText().isBlank()) {
            new Alert(Alert.AlertType.ERROR, "Please enter the password!").showAndWait();
            txtPassword.requestFocus();
            return;
        }
        else if (!txtPassword.getText().equals(password)){
            new Alert(Alert.AlertType.ERROR, "Wrong password, Please check and enter again!").showAndWait();
            txtPassword.requestFocus();
            txtPassword.selectAll();
            return;
        }
        Navigation.navigate(Route.HOME_FORM);
    }
}
