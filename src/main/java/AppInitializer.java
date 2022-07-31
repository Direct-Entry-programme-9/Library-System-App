import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Navigation;
import util.Route;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {
    public Object mainForm;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = this.getClass().getResource("/view/MainForm.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        Parent mainContainer = fxmlLoader.load();
        mainForm = fxmlLoader.getController();

        AnchorPane pneMainForm = (AnchorPane) mainContainer.lookup("#pneMainForm");
        Navigation.init(pneMainForm);
        Scene scene = new Scene(mainContainer);
        primaryStage.setScene(scene);
        Navigation.navigate(Route.LOGIN_FORM);

        primaryStage.setTitle("Library App");
        primaryStage.show();

    }
}
