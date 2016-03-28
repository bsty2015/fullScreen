package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        primaryStage.setScene(new Scene(root, toolkit.getScreenSize().width, toolkit.getScreenSize().height));
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(new KeyCombination() {
            @Override
            public boolean match(KeyEvent event) {
                if (event.getCode() == KeyCode.ALT)
                    return super.match(event);
                else
                    return false;
            }
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
