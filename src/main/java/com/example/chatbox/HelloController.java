package com.example.chatbox;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button call;
    @FXML
    private Button vidcall;
    @FXML
    private Button miscell;
    @FXML
    private Button send;
    @FXML
    private TextField tf;
    @FXML
    private AnchorPane ap;
    @FXML
    private Label label;
    boolean caijdo = false;
    @FXML
    protected void loi() {
        Stage stage = (Stage) call.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.INFORMATION;
        Alert alert = new Alert(type, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        if(caijdo == false)
        alert.getDialogPane().setContentText("James đang trong một cuộc gọi khác");
        else alert.getDialogPane().setContentText("Bạn không thể liên lạc với người này");
        alert.setTitle("Notification");
        alert.setHeaderText("Không gọi được");
        alert.showAndWait();
    }
    @FXML
    protected void send() {
        if(!tf.getText().isEmpty()){
            ap.getChildren().remove(tf);
            ap.getChildren().remove(send);
            label.setText("Bạn không thể liên lạc với người này. Tìm hiểu thêm");
            label.setLayoutX(95);
            label.setLayoutY(610);
            caijdo = true;
        }
    }
}