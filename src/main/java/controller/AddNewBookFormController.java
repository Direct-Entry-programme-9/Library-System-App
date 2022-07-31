package controller;

import db.Book;
import db.InMemoryDB;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddNewBookFormController {
    public TextField txtISBN;
    public TextField txtBookName;
    public TextField txtAuthor;
    public Button btnAdd;

    public void btnAddOnAction(ActionEvent actionEvent) {
        if (txtISBN.getText().isBlank()){
            new Alert(Alert.AlertType.ERROR, "Please enter the ISBN!").showAndWait();
            txtISBN.requestFocus();
            return;
        } else if (txtBookName.getText().isBlank()) {
            new Alert(Alert.AlertType.ERROR, "Please enter the Book Name!").showAndWait();
            txtBookName.requestFocus();
            return;
        } else if (txtAuthor.getText().isBlank()) {
            new Alert(Alert.AlertType.ERROR, "Please enter the Author!").showAndWait();
            txtAuthor.requestFocus();
            return;
        }
        InMemoryDB.addBook(new Book(txtISBN.getText(), txtBookName.getText(), txtAuthor.getText(), "Yes"));
        new Alert(Alert.AlertType.INFORMATION,"Successfully added the book").showAndWait();
        txtISBN.clear();
        txtBookName.clear();
        txtAuthor.clear();
        txtISBN.requestFocus();
    }
}
