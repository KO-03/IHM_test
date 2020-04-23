import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainTest extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			VBox root = FXMLLoader.load(getClass().getResource("vueTest.fxml"));
			
			
			Scene scene = new Scene(root,800,600);
			primaryStage.setScene(scene);
			system.out.println("Salut !");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
