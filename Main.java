package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static Controller myConroll;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
//        Parent root = loader.load();
//        myConroll = (Controller)loader.getController();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 880, 530));
        primaryStage.show();

//        Locations locations = new Locations();
//        locations.city();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
