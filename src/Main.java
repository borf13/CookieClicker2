import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private int cookies = 0;

    @Override
    public void start(Stage stage) {

        Label cookieLabel = new Label("Cookies: 0");
        cookieLabel.setStyle("-fx-font-size: 24px;");

        Button cookieButton = new Button("🍪");
        cookieButton.setStyle("-fx-font-size: 40px;");

        cookieButton.setOnAction(e -> {
            cookies++;
            cookieLabel.setText("Cookies: " + cookies);
        });

        BorderPane root = new BorderPane();

        root.setTop(cookieLabel);
        BorderPane.setAlignment(cookieLabel, Pos.CENTER);

        root.setCenter(cookieButton);

        Scene scene = new Scene(root, 1000, 600);

        stage.setTitle("Cookie Clicker 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}