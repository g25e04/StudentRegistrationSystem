import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class StudentRegistrationSystem extends Application{

	
	public StudentRegistrationSystem() {
		// TODO Auto-generated constructor stub
	}

	public void start(Stage primaryStage) {
		LoginPanels scene1 = new LoginPanels();
		

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(scene1);
		
		Scene scene = new Scene(borderPane,330,160);
                
		primaryStage.setTitle("StudentRegistrationSystem");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Application.launch(args);
					

}
	
}