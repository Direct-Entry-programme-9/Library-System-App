package controller;

import db.Book;
import db.InMemoryDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import util.Navigation;
import util.Route;

import java.io.IOException;

public class ManageBooksFormController {
    public Button btnAddNewBook;
    public TableView<Book> tblBooks;
    public TableColumn colISBN;
    public TableColumn colBookName;
    public TableColumn colAuthor;
    public TableColumn colAvailability;

    public void initialize(){
        ObservableList<Book> olList = tblBooks.getItems();
        olList.addAll(FXCollections.observableArrayList(InMemoryDB.getDBList()));

        colISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        colBookName.setCellValueFactory(new PropertyValueFactory<>("bookName"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        colAvailability.setCellValueFactory(new PropertyValueFactory<>("availability"));
    }
    public void btnAddNewBookOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Route.ADD_NEW_BOOK);
    }
}
