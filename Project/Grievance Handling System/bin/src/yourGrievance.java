package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class YourGrievance {
	@FXML
	private AnchorPane rootPane8;
	
	@FXML
	private Button button;
	
	@FXML
	private void loadUserDashbordBack(ActionEvent event) throws IOException
	{
		AnchorPane pane8 = (AnchorPane)FXMLLoader.load(getClass().getResource("UserDashbord.fxml"));
		rootPane8.getChildren().setAll(pane8);
	}
	
}
