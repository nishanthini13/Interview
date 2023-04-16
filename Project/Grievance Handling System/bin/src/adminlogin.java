package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdminLogin {


    @FXML
    private AnchorPane rootPane3;

    @FXML
    private TextField TextField;

    @FXML
    private Label Lable;

    @FXML
    private PasswordField PasswordField;

   
	
	@FXML
	private void loadAdminDashbord(ActionEvent event) throws IOException
	{
	String userid = TextField.getText();
	String pass = PasswordField.getText();
	
	if(userid.equals("abc")&& pass.equals("123"))
	{
	

		AnchorPane pane3 = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminDashbord.fxml"));
		rootPane3.getChildren().setAll(pane3);
	}
	else
	{
		Lable.setText("INVALID LOGIN PLEASE TRY AGAIN");
	}
	}
	
	
	
	@FXML
	private void loadMainPageBackm(ActionEvent event) throws IOException
	{  
		AnchorPane pane3 = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		rootPane3.getChildren().setAll(pane3);
	}
	
}
