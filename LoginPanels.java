import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

public class LoginPanels extends StackPane{

	private TextField jtfUser = new TextField();
	private PasswordField jtfPass = new PasswordField();
	private Button jbLogin = new Button("Log in");
	
	Scanner input = new Scanner(System.in);
	 String password = String.valueOf(this.jtfPass.getText());
		BorderPane borderPane2 = new BorderPane();
	public LoginPanels() {
		// TODO Auto-generated constructor stub

		loginpanels();

	}

	public String getjtfUser() {
		return jtfUser.getText();
	}
	
	public String getjtfPass() {
		return password;
	}

	
	protected void loginpanels(){
		
		jbLogin.setOnAction(new LoginHandler());
		
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(new Label("user:"),0,0);
		gridPane1.add(jtfUser,1,0);
		gridPane1.add(new Label("password:"),0,1);
		gridPane1.add(jtfPass,1,1);
		gridPane1.add(jbLogin, 2, 2);

		

		borderPane2.setTop(new Label("Welcome to the Student Registration System.\n"));
		borderPane2.setCenter(gridPane1);
		
		getChildren().addAll(borderPane2);
		
		
	}
	
	class LoginHandler implements EventHandler<ActionEvent>{
		
		
		public void handle(ActionEvent e) {
			String realid = getjtfUser();
			String realword = jtfPass.getText();
			
			try {
			File lo1 = new File("Login1.txt");
			
			Scanner input = new Scanner(lo1);
			String id = input.next();
			String word = input.next();

			while(!(realid.equals(id)) && !(realword.equals(word)) ) {
				id = input.next();
				word = input.next();
			}
			if(realid.equals(id) && realword.equals(word)) {

				MenuPanels Frame2 = new MenuPanels(getjtfUser(),getjtfPass());
				borderPane2.getChildren().removeAll();
				borderPane2.setTop(null);
				borderPane2.setBottom(null);
	                        borderPane2.setCenter(Frame2);
			}
			else
				borderPane2.setBottom(new Label("Input error!"));
			input.close();
			}catch (Exception ex) {
				borderPane2.setBottom(new Label("Input error!"));
			}

			
			}
	}
	
}
