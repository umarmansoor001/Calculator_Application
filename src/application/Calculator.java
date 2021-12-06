package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calculator {

	   @FXML
	    private TextField display_bar;
	   @FXML
	    private Button B_0;

	    @FXML
	    private Button B_1;

	    @FXML
	    private Button B_2;

	    @FXML
	    private Button B_3;

	    @FXML
	    private Button B_4;

	    @FXML
	    private Button B_5;

	    @FXML
	    private Button B_6;

	    @FXML
	    private Button B_7;

	    @FXML
	    private Button B_8;

	    @FXML
	    private Button B_9;

	    @FXML
	    private Button B_add;

	    @FXML
	    private Button B_div;

	    @FXML
	    private Button B_equal;

	    @FXML
	    private Button B_mul;

	    @FXML
	    private Button B_sub;

	    @FXML
	    private Button B_leftBrac;
	    
	    @FXML
	    private Button B_rightBrac;
	    
	    String txt="";
	  
	   @FXML
	    void show_1(ActionEvent event) {
		   
		   txt+=B_1.getText();
		   display_bar.setText(txt);
	    }
	   @FXML
	    void show_2(ActionEvent event) {
		   
		   txt+=B_2.getText();
		   display_bar.setText(txt);
	    }
	   @FXML
	    void show_3(ActionEvent event) {
		   
		   txt+=B_3.getText();
		   display_bar.setText(txt);
	    }
	   @FXML
	    void show_4(ActionEvent event) {
		   
		   txt+=B_4.getText();
		   display_bar.setText(txt);
	    }
	   @FXML
	    void show_5(ActionEvent event) {
		   
		   txt+=B_5.getText();
		   display_bar.setText(txt);
	    }

	
	    @FXML
	    void show_6(ActionEvent event) {
		   
		   txt+=B_6.getText();
		   display_bar.setText(txt);
	    }
	    @FXML
	    void show_7(ActionEvent event) {
		   
		   txt+=B_7.getText();
		   display_bar.setText(txt);
	    }
	    @FXML
	    void show_8(ActionEvent event) {
		   
		   txt+=B_8.getText();
		   display_bar.setText(txt);
	    }
	    @FXML
	    void show_9(ActionEvent event) {
		   
		   txt+=B_9.getText();
		   display_bar.setText(txt);
	    }
	    @FXML
	    void show_0(ActionEvent event) {
		   
		   txt+=B_0.getText();
		   display_bar.setText(txt);
	    }
	    @FXML
	    void clear(ActionEvent event) {
	    	//Calculator display Screen will clear
	    	txt="";
	    	display_bar.setText(txt);
	
	    }
	    @FXML
	    void show_add(ActionEvent event) {
	  
	    	txt+=B_add.getText();
	    	display_bar.setText(txt);

	    }
	    @FXML
	    void show_subtract(ActionEvent event) {
	    	//Calculator display Screen will clear
	    	txt+=B_sub.getText();
	    	display_bar.setText(txt);

	    }
	    @FXML
	    void show_Multiply(ActionEvent event) {
	    	
	    	txt+=B_mul.getText();
	    	display_bar.setText(txt);

	    }
	    @FXML
	    void show_div(ActionEvent event) {
	    
	    	txt+=B_div.getText();
	    	display_bar.setText(txt);

	    }
	    
	    
	    @FXML
	    void show_rbrac(ActionEvent event) {
	    	txt+=B_rightBrac.getText();
	    	display_bar.setText(txt);
	    }
	    
	    @FXML
	    void show_lbrac(ActionEvent event) {
	    	txt+=B_leftBrac.getText();
	    	display_bar.setText(txt);
	    }
	    
	    @FXML
	    void show_backspace(ActionEvent event) {
	    	String d_txt="";
	    	for(int i=0; i < txt.length()-1; ++i)
	    		d_txt+=txt.charAt(i);// coping characters in dummy string 'd_txt'
	    	txt="";
	    	txt=d_txt;
	    	display_bar.setText(txt);

	    }
	    
	  //Going to Main window
	    @FXML
	    void go_back(ActionEvent event) throws IOException {
	    	 FXMLLoader loader =  new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			 Parent root = loader.load();
			 Scene scene=new Scene(root);
			 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 stage.setScene(scene);
			 stage.show(); 
	    }
	    
	    @FXML
	    void show_result(ActionEvent event) throws IOException {

	    	txt=Integer.toString(EvaluateExpression.evaluate(txt));
	    	display_bar.setText(txt);
	    }

}
