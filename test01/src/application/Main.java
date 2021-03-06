package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			// stage > scene > container > node
			
			Pane pane = new Pane(); // container
			
			Scene scene = new Scene(pane, 300, 500);
			
			stage.setScene(scene);
			stage.show();
			stage.setTitle("My windows");
			stage.setResizable(false);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
