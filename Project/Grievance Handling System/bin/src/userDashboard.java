package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;




public class UserDashbord implements Initializable
{

	    @FXML
	    private AnchorPane rootPane5;	
	    
		@FXML
		private Button button;

		
	   
	   @FXML
	   public Label firstname;
	    
//	    
//	    private String Username;
//	    UserDashbord(String UserName)
//	    {
//	    	
//
//	    	
//	    	this.Username=UserName;
//	    	firstname.setText("sdfghjk");
//	    	firstname.setText(UserName);
//	    }
//	  
//	    
	   
	



		public void setvalue(String a) 
		{
			

			String faname=a;
			
            System.out.println(faname);
            
	   		firstname.setText(faname);
	   		
	   		refresh(faname);
	   		
		}
