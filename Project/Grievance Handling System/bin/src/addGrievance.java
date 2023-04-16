package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddGrievance {
	
	@FXML
	private AnchorPane rootPane5;
	
	@FXML
	private Button button;
	
	
   @FXML
   private TextField txtsubject;

	  @FXML
	 private TextArea txtbody;
	
	
	  Connection con;
			PreparedStatement pat;

			private PreparedStatement pst;


	

  	   @FXML
  		private void loadSubmitted(ActionEvent event) throws IOException
  		{
  		 String gsub = txtsubject.getText();		
 		String gbody = txtbody.getText();
  		   
  		   

		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsitregistration?characterEncoding=latin1","root","");
             	pst =con.prepareStatement("insert into g_table(g_subject, g_body) values (?,?);");

			    pst.setString(1,gsub);	
			    pst.setString(2,gbody);
			    
			    

			    int sst =pst.executeUpdate();			    
	      if (sst==4)
	      {
	    	  txtsubject.setText("");
	    	  txtbody.setText("");


	      
	      }
  		   
	     	
  	    
	  				} catch (SQLException e) {
	  					e.printStackTrace();
	  				}
	  				
	  				
	  				
	  			} catch (ClassNotFoundException e) {
	  				e.printStackTrace();
	  			} 	
	  	             	
	  	             	
	  	 AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("Submited.fxml"));
 				rootPane5.getChildren().setAll(pane5);
 				
 				
 		}

 		
 	    	
 		
 		@FXML
 		private void loadUserDash(ActionEvent event) throws IOException
 		{
 			AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("UserDashbord.fxml"));
 			rootPane5.getChildren().setAll(pane5);
 		}

 
	
}
