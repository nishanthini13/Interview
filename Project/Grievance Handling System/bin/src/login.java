package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginPage {
	
	@FXML
	private AnchorPane rootPane2;
	@FXML
	private Button button2;
	
   @FXML
   private Label Lable;
    
   @FXML
   private TextField txtuserid;

   @FXML
   private TextField txtpass;
 
   @FXML
   private Label lbldob;

   @FXML
   private Label lbleid;

   @FXML
   private Label lblmob;
 
   @FXML
   private Label lblroomno;

   @FXML
   private Label lblbname;

   @FXML
   private Label lblarea;

   @FXML
   private Label lblcity;

   @FXML
   private Label ldbdistrict;

   @FXML
   private Label lblpin;

   @FXML
   private Label lblstate;
   @FXML
   private Button backbut;

   @FXML
   private AnchorPane rootPane7;
   	
   
   
   

   String useridi;
    
    




	Connection con;
		PreparedStatement pat;
		private PreparedStatement pst;


	  public void loadUserPage(ActionEvent event) throws IOException
	
	{
			
		 

			UserDashbord a=new UserDashbord();
		
		   
		   Connection con;
			ResultSet rs;
		 String userid = txtuserid.getText();
			  String pass = txtpass.getText();
			  

			 
			 
			

			  try {
    			Class.forName("com.mysql.jdbc.Driver");
    			try {
    				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsitregistration?characterEncoding=latin1","root","");
    		
    				pst =con.prepareStatement("SELECT First_Name,Last_Name,DOB,Flat_Number,Mobile_NUmber,Flat_Number,Building_Name,Area,City,Email,District,Pincode,State from personal_details where Email=? and Password=?");
    				
    			
    				
    				pst.setString(1, userid);
    				pst.setString(2, pass);
    		
    				rs = pst.executeQuery();
    				
    				if(rs.next())
    				{
    					
    					
    					
    					AnchorPane pane2 = (AnchorPane)FXMLLoader.load(getClass().getResource("UserDashbord.fxml"));
    					rootPane2.getChildren().setAll(pane2);
    					String fname=rs.getString("First_Name");
                     	a.setvalue(fname);
    					 
    					
    						
    					
    					

    					
         	            System.out.println(rs.getString("Last_Name"));
 			            System.out.println(rs.getString("DOB"));
 			            System.out.println(rs.getString("Mobile_NUmber"));
 			            System.out.println(rs.getString("Flat_Number"));
 			            System.out.println(rs.getString("Building_Name"));
 			            System.out.println(rs.getString("Area"));
 			            System.out.println(rs.getString("City"));
 			            System.out.println(rs.getString("Pincode"));
 			            System.out.println(rs.getString("State"));
    					
			      		}
 			           		
    		  					
    				
    				else
    				{
		            	Lable.setText("INVALID LOGIN PLEAASE TRY AGAIN");

    				}
    			
    			
    		 
    				
    			} catch (SQLException e) {
    				e.printStackTrace();
    			}
    			
    			
    			
    		} catch (ClassNotFoundException e) {
    			e.printStackTrace();
    		
    		}
			  
	}


@FXML
private void loadMainPagelp(ActionEvent event) throws IOException
{  
	
	

	AnchorPane pane2 = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
	rootPane2.getChildren().setAll(pane2);

}
@FXML
private void loadRegistrationPage(ActionEvent event) throws IOException
{  
	AnchorPane pane2 = (AnchorPane)FXMLLoader.load(getClass().getResource("RegistrationPage.fxml"));
	rootPane2.getChildren().setAll(pane2);
}






@FXML
private void loadUserDashbordBK(ActionEvent event) throws IOException
{
AnchorPane pane7 = (AnchorPane)FXMLLoader.load(getClass().getResource("UserDashbord.fxml"));
rootPane7.getChildren().setAll(pane7);
}





}
