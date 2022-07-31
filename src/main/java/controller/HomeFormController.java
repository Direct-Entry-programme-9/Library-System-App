package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import util.Navigation;
import util.Route;

import java.io.IOException;

public class HomeFormController {
    public Button btnManageBooks;
    public Button btnManageMembers;

    public void btnManageBooksOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Route.MANAGE_BOOKS);
    }

    public void btnManageMembersOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Route.MANAGE_MEMBERS);
    }
}
