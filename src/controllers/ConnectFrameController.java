package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import net.ClientHandler;

public class ConnectFrameController {
    @FXML
    private TextField textFieldIP;
    @FXML
    private TextField textFieldPort;

    public void connect() {
        String host = textFieldIP.getText();
        int port = Integer.parseInt(textFieldPort.getText());
        Thread thread = new Thread(new ClientHandler(host, port));
        thread.start();
    }


}
