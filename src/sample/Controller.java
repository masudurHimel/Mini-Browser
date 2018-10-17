package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {

    @FXML
    private TextField t;

    @FXML
    private WebView w;

    @FXML
    private Button reset;

    @FXML
    private Button enter;

    @FXML
    private Label l;

    private WebEngine engine;

    public String k = "";
    public String x;

    @FXML
    private Button youtube;

    @FXML
    private Button RDS;

    @FXML
    private Button Google;

    @FXML
    private Button Facebook;
    @FXML
    private Button homepage;


    @FXML
    void textevent(ActionEvent event) {
        engine = w.getEngine();


        x = t.getText();

        engine.load("https://www." + x.toLowerCase() + "/");
        k = x.toLowerCase();
        l.setText(k);
        youtube.setVisible(false);
        Facebook.setVisible(false);
        RDS.setVisible(false);
        Google.setVisible(false);
        w.setVisible(true);


    }

    @FXML
    void setSearch(ActionEvent event) {
        engine = w.getEngine();

        x = t.getText();

        engine.load("https://www." + x.toLowerCase() + "/");

        k = x.toLowerCase();
        l.setText(k);
        w.setVisible(true);

    }

    @FXML
    void setButton3(ActionEvent event) {
        engine.reload();
        l.setText(k);
    }


    @FXML
    void setYoutube(ActionEvent event) {
        engine = w.getEngine();

        engine.load("https://www.youtube.com/");
        k = "Youtube";
        l.setText(k);
        youtube.setVisible(false);
        Facebook.setVisible(false);
        RDS.setVisible(false);
        Google.setVisible(false);
        w.setVisible(true);

    }

    @FXML
    void setFacebook(ActionEvent event) {
        engine = w.getEngine();

        engine.load("https://www.facebook.com/");
        k = "Youtube";
        l.setText(k);
        youtube.setVisible(false);
        Facebook.setVisible(false);
        RDS.setVisible(false);
        Google.setVisible(false);
        w.setVisible(true);
    }

    @FXML
    void setRDS(ActionEvent event) {
        engine = w.getEngine();

        engine.load("https://rds3.northsouth.edu/index.php/welcome/enter_login");
        k = "NSU RDS";
        l.setText(k);
        youtube.setVisible(false);
        Facebook.setVisible(false);
        RDS.setVisible(false);
        Google.setVisible(false);
        w.setVisible(true);
    }

    @FXML
    void setGoogle(ActionEvent event) {
        engine = w.getEngine();

        engine.load("https://www.google.com/");
        k = "Google";
        l.setText(k);
        youtube.setVisible(false);
        Facebook.setVisible(false);
        RDS.setVisible(false);
        Google.setVisible(false);
        w.setVisible(true);
    }

    @FXML
    void setHomepage(){
        engine = w.getEngine();



        k = "";
        l.setText(k);
        youtube.setVisible(true);
        Facebook.setVisible(true);
        RDS.setVisible(true);
        Google.setVisible(true);
        w.setVisible(false);
    }

}

