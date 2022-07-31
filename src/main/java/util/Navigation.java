package util;

import controller.LoginFormController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

import static util.Route.LOGIN_FORM;

public class Navigation {
    private static AnchorPane pneContainer;

    public static void init(AnchorPane pneContainer){
        Navigation.pneContainer=pneContainer;
    }

    public static Object navigate(Route route) throws IOException {
        pneContainer.getChildren().clear();
        URL resource;
        switch (route){
            case LOGIN_FORM:
                resource = Navigation.class.getResource("/view/LoginForm.fxml");
                break;
            case HOME_FORM:
                resource = Navigation.class.getResource("/view/HomeForm.fxml");
                break;
            case ADD_NEW_BOOK:
                resource = Navigation.class.getResource("/view/AddNewBookForm.fxml");
                break;
            case EDIT_BOOK_DETAILS:
                resource = Navigation.class.getResource("/view/EditBookDetailsForm.fxml");
                break;
            case MANAGE_BOOKS:
                resource = Navigation.class.getResource("/view/ManageBooksForm.fxml");
                break;
            case MANAGE_MEMBERS:
                resource = Navigation.class.getResource("/view/ManageMembersForm.fxml");
                break;
            default:
                resource=null;
                break;
        }
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        Parent container = fxmlLoader.load();
        pneContainer.getChildren().add(container);
        AnchorPane.setLeftAnchor(container,0.0);
        AnchorPane.setRightAnchor(container,0.0);
        AnchorPane.setTopAnchor(container,0.0);
        AnchorPane.setBottomAnchor(container,0.0);

        return fxmlLoader.getController();
    }
}
