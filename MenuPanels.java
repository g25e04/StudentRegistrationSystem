import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.*;
public class MenuPanels extends StackPane  {

	
	private Button jbDisplayYourInformation = new Button("Display your information.");
	private Button jbChangeYourInformation = new Button("Change your information.");
	private Button jbDisplayYourCurriculum = new Button("Display your curriculum.");
	private Button jbDisCanCh = new Button("Display which course you can choose.");
	private Button jbCourseOutline = new Button("Display this semester's course outline.");
	private Button jbAddAndCancelCourse = new Button("Add and cancel course.");
	private Button jbSignOut = new Button("Sign out.");
	TextArea jtacontent = new TextArea();
    
	private String realID;
        
	Login Lo = new Login();
	Curriculum Cu1 = new Curriculum();
	Course Co1 = new Course();
	CourseOutline Col1 = new CourseOutline();
	
	File S1 = new File("Student.txt");
	
	public MenuPanels() {
		// TODO Auto-generated constructor stub
	}
	
        
        
	public MenuPanels(String j1,String j2) {
		// TODO Auto-generated constructor stub
		Lo.logininformation(j1,j2);
		realID=j1;
		
                jtacontent.setFont(new Font("º–∑¢≈È",20));
		menupanels();
                jbDisplayYourInformation.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
            	jtacontent.setText("");
            	try {
    				
    				Scanner input = new Scanner(S1);
    				String ID=input.next();
    				
    				while(!(realID.equals(ID))) {
    					ID=input.nextLine();
    					ID=input.next();
    				}
    				
    				Lo.changeinformation(input.next(), input.next(), input.next(), input.next());
    				
    				jtacontent.setText(Lo.toString());	
    				input.close();
    			}catch(Exception ex) {
    				jtacontent.setText("System error! Please login again!");
    			}
            }
        });
                
               jbChangeYourInformation.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
               ChangeYourInformation();
            }
        });
               
               jbDisplayYourCurriculum.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
               jtacontent.setText("");
               jtacontent.setText(Cu1.toString());
            }
        });
               
              jbDisCanCh.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
               jtacontent.setText("");
               jtacontent.appendText("You can learn general education course at monday and wednesday.\n");
               jtacontent.appendText("You can learn required course at tuesday and Thursday.\n");
               jtacontent.appendText(Co1.toString());
            }
        }); 
             
              jbCourseOutline.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
               jtacontent.setText("");
               jtacontent.appendText(Col1.toString());
            }
        });
              
              jbAddAndCancelCourse.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
               AddAndCancelCourse();
            }
        });
              
              jbSignOut.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
               System.exit(1);
            }
        });
              
	}
	
        
        public void menupanels(){
            
            GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbDisplayYourInformation,0,0);
		gridPane1.add(jbChangeYourInformation,0,1);
		gridPane1.add(jbDisplayYourCurriculum,0,2);
		gridPane1.add(jbDisCanCh,0,3);
		gridPane1.add(jbCourseOutline,0,4);
		gridPane1.add(jbAddAndCancelCourse,0,5);
		gridPane1.add(jbSignOut,0,6);
		
                
		BorderPane borderPane2 = new BorderPane();
		borderPane2.setTop(new Label("Fuction list"));
		borderPane2.setLeft(gridPane1);
		borderPane2.setRight(jtacontent);
		ScrollPane scrollPane3 = new ScrollPane(borderPane2);
	
		
		jtacontent.setWrapText(true);//change line
		jtacontent.setEditable(false);
		
		
            getChildren().addAll(scrollPane3);
        }
        
        
    private void ChangeYourInformation() {
    	TextField jtfName = new TextField();
    	TextField jtfGender = new TextField();
    	TextField jtfDepartment = new TextField();
    	TextField jtfAddress = new TextField();

    	
    	
    	Button jbModify = new Button("Modify");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Name: "),0,0);
		gridPane1.add(jtfName,1,0);
		gridPane1.add(new Label("Gender: "),0,1);
		gridPane1.add(jtfGender,1,1);
		gridPane1.add(new Label("Department: "),0,2);
		gridPane1.add(jtfDepartment,1,2);
		gridPane1.add(new Label("Address: "),0,3);
		gridPane1.add(jtfAddress,1,3);

		
		gridPane1.setAlignment(Pos.CENTER);

		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbModify, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("Please input your name, gender, department and address."));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Change basic information");
		stage.setScene(scene);
		stage.show();
		
		
		
		jbModify.setOnAction(e ->{
			try {
				RandomAccessFile inout = new RandomAccessFile("Student.txt","rw");
				int i = 0;
				String ID = inout.readLine();
				for(i = 0;!(realID.equals(ID));i++) {
				ID=inout.readLine();
				ID=inout.readLine();
				}
				
				
				inout.seek(10+i*50);
				
				inout.writeBytes(jtfName.getText()+"\t\t");
				
				inout.seek(10+i*50+jtfName.getLength()+2);
				inout.writeBytes(jtfGender.getText()+"\t\t");
				inout.seek(10+i*50+jtfName.getLength()+2+jtfGender.getLength()+2);
				inout.writeBytes(jtfDepartment.getText()+"\t\t");
				inout.seek(10+i*50+jtfName.getLength()+2+jtfGender.getLength()+2+jtfDepartment.getLength()+2);
				inout.writeBytes(jtfAddress.getText());
				inout.seek(10+i*50+jtfName.getLength()+2+jtfGender.getLength()+2+jtfDepartment.getLength()+2+jtfAddress.getLength());
				inout.writeBytes("\t\t\t\0");
				
				inout.close();
			}catch(Exception ex) {
				
			}
			Lo.changeinformation(jtfName.getText(), jtfGender.getText(), jtfDepartment.getText(), jtfAddress.getText());
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }
	
	private void AddAndCancelCourse() {
		TextField jtfInputAdd = new TextField();
		Button jbAdd = new Button("Add course");
		
		TextField jtfInputCancel = new TextField();
		Button jbCancel = new Button("Cancel course");
		
		Button jbEnd = new Button("Finish");
		
		
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(new Label("Add course"), 0, 1);
		gridPane1.add(jtfInputAdd, 1, 1);
		gridPane1.add(jbAdd, 2, 1);
		gridPane1.setAlignment(Pos.CENTER);
		jtfInputAdd.setAlignment(Pos.BOTTOM_LEFT);

		GridPane gridPane3 = new GridPane();
		gridPane3.setHgap(5);
		gridPane3.setVgap(5);
		gridPane3.add(new Label("Cancel course"), 0, 0);
		gridPane3.add(jtfInputCancel, 1, 0);
		gridPane3.add(jbCancel, 2, 0);
		gridPane3.setAlignment(Pos.CENTER);
		jtfInputAdd.setAlignment(Pos.BOTTOM_LEFT);

		BorderPane borderPane5 = new BorderPane();
		borderPane5.setTop(gridPane1);
		borderPane5.setCenter(new Label("Please input code to cancel course."));
		borderPane5.setBottom(gridPane3);
		
		HBox hbox6 = new HBox(jbEnd);
		hbox6.setAlignment(Pos.BOTTOM_RIGHT);

		BorderPane borderPane7 = new BorderPane();
		borderPane7.setTop(new Label("Please input code to add course."));
		borderPane7.setCenter(borderPane5);
		borderPane7.setBottom(hbox6);
		
		Scene scene = new Scene(borderPane7,500,200);
		Stage stage = new Stage();
		stage.setTitle("Choose course");
		stage.setScene(scene);
		stage.show();
		
		
		jbAdd.setOnAction(e ->{
			Cu1.addCu(jtfInputAdd.getText());
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			Cu1.removeCu(jtfInputCancel.getText());
			stage.close();
		});
		
		jbEnd.setOnAction(e ->{
			stage.close();
		});
	}
	
	
}
