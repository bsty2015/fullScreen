package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Scene root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
        StackPane p = new StackPane();
        p.setId("pane");
        Scene root = new Scene(p);
        Text text = new Text("我中毒了::>_<::,请勿动乱动,尽快联系管理员!!!");
        text.setFont(javafx.scene.text.Font.font("微软雅黑",25));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().width;
        double height = toolkit.getScreenSize().height;
        primaryStage.setScene(root);
        primaryStage.setFullScreen(true);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(new KeyCombination() {
            @Override
            public boolean match(KeyEvent event) {
//                if (event.getCode() == KeyCode.A)
//                    return super.match(event);
//                else
                return false;
            }
        });
        root.getStylesheets().addAll(this.getClass().getResource("main.css").toExternalForm());
        primaryStage.show();
        Thread.sleep(3000);
//        Scene scene = new Scene(p, width, height);
        root.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(root);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
