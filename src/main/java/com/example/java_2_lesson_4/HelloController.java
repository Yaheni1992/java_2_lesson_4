package com.example.java_2_lesson_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML public TextField textField;
    @FXML public TextArea textArea;

    @FXML
    public void sendMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "");
        textField.clear();
        textField.requestFocus();
    }
}