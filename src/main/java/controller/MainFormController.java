package controller;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import util.Navigation;
import util.Route;

import java.io.IOException;

public class MainFormController {
    public AnchorPane pneMainForm;
    public Label lblHome;
    public Label lblLogout;
    public Label lblBooks;
    public Label lblMembers;

    public void lblHomeOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Navigation.navigate(Route.HOME_FORM);
    }

    public void lblLogoutOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Navigation.navigate(Route.LOGIN_FORM);
    }

    public void lblBooksOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Navigation.navigate(Route.MANAGE_BOOKS);
    }

    public void lblMembersOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Navigation.navigate(Route.MANAGE_MEMBERS);
    }
}
