import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //values for main frame window
    private static final String TITLE = "Real Estate Agency";
    private static final String FXML_FILE_PATH = "fxml/connect_frame.fxml";
    private static final int SCENE_WIDTH = 300;
    private static final int SCENE_HEIGHT = 240;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(FXML_FILE_PATH));
        primaryStage.setScene(new Scene(root, SCENE_WIDTH, SCENE_HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.setTitle(TITLE);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
