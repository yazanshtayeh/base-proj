package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("DVL");
        primaryStage.setScene(new Scene(root, 1227, 794));
        primaryStage.setResizable(false);
        primaryStage.show();
        //yazan
        //asaad

    }


    public static void main(String[] args) {
        launch(args);
    }

}
