package com.br.dentuda.dentudaview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class HelloController {
    @FXML
    private Button buton;

    @FXML
    private ImageView myImage;

    @FXML
    private Label welcomeText;
    public void setImage(){
        Image ima = new Image("C:\\Users\\Julie\\Desktop\\Projeto-Dentuda\\dentuda-view\\src\\main\\java\\com\\br\\dentuda\\dentudaview\\img\\taylor.png");
        myImage.setImage(ima);
    }


    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }
}