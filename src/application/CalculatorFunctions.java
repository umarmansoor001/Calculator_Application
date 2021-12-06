package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

//This is Controller class and is controlled by MainWindow.fxml   
public class CalculatorFunctions {

	 @FXML
	    void show_calculator(ActionEvent event) throws IOException {
		 // it shows calculator window 
		 FXMLLoader loader =  new FXMLLoader(getClass().getResource("CalculatorWindow.fxml"));
		 Parent root = loader.load();
		 Scene scene=new Scene(root);
		 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 stage.setScene(scene);
		 stage.show();
		 
	    }
	 @FXML
	    void show_AgeCalculator(ActionEvent event) throws IOException {
		 // it shows calculator window 
		 FXMLLoader loader =  new FXMLLoader(getClass().getResource("AgeCalculator.fxml"));
		 Parent root = loader.load();
		 Scene scene=new Scene(root);
		 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 stage.setScene(scene);
		 stage.show();
		 
	    }

	  @FXML
	    void show_discountCalculator(ActionEvent event) throws IOException {
		  // it shows Discount calculator window 
			 FXMLLoader loader =  new FXMLLoader(getClass().getResource("DiscountCalculator.fxml"));
			 Parent root = loader.load();
			 Scene scene=new Scene(root);
			 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 stage.setScene(scene);
			 stage.show();
			  
	   }
	  
	  @FXML
	    void show_BMIcalculator(ActionEvent event) throws IOException {
		// it shows BMI calculator window 
			 FXMLLoader loader =  new FXMLLoader(getClass().getResource("BMICalculator.fxml"));
			 Parent root = loader.load();
			 Scene scene=new Scene(root);
			 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 stage.setScene(scene);
			 stage.show();
	    }
	  
}
