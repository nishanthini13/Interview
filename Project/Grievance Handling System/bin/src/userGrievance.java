package application;

import java.io.IOException;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class UserGrivances {
	@FXML
	private AnchorPane rootPane9;
	
	@FXML
	private Button button;
	
	

	public SimpleStringProperty firstname = new SimpleStringProperty();
	public SimpleStringProperty lastname = new SimpleStringProperty();
	public SimpleStringProperty Email = new SimpleStringProperty();
	public SimpleStringProperty gsub = new SimpleStringProperty();
	public SimpleStringProperty gbody = new SimpleStringProperty();
	
	
	
	
	
	

	@FXML
	private void loadAdminDashbord(ActionEvent event) throws IOException
	{
		AnchorPane pane9 = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminDashbord.fxml"));
		rootPane9.getChildren().setAll(pane9);

}
}
