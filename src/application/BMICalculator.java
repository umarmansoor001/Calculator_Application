package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BMICalculator {

	 @FXML
	 private TextField BMI_bar;
	 
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
    private Button B_dot;
    
    @FXML
    private TextField height_bar;

    @FXML
    private TextField weight_bar;
    
    String txt_1="";//For Weight bar 
    String txt_2="";//For Height bar
    boolean W_flag=false;//For Weight bar 
    boolean H_flag=false;//For Height bar

    boolean W_dot_flag=false;//dot flag For weight bar 
    boolean H_dot_flag=false;//dot flag For height bar
    
    @FXML
    void clear(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1="";
    		weight_bar.setText(txt_1);
    		W_dot_flag=false;
    	}
    	else if(!H_flag)
    	{
    		txt_2="";
    		height_bar.setText(txt_2);
    		H_dot_flag=false;
    	}
    }

    @FXML
    void done(ActionEvent event) {
    	// when OK button clicked first time
    	if(!W_flag)
    	{	
    		if(!txt_1.equals(""))
    			W_flag=true;
    	}
    	else if(!H_flag)
    	{	
    		if(!txt_2.equals(""))
    			H_flag=true;
    		
    		if(W_flag && H_flag)//if both values get then need to calculate and show discount
    			show_n_calculateBMI(txt_1,txt_2);
    	}
    }

    @FXML
    void reset(ActionEvent event) {
    	txt_1="";
    	txt_2="";
    	W_flag=false;
    	H_flag=false;
    	W_dot_flag=false;
    	H_dot_flag=false;
    	
    	//clearing screen
    	weight_bar.setText(txt_1);
    	height_bar.setText(txt_2);
    	BMI_bar.setText("");
    }

    @FXML
    void show_0(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_0.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_0.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_1(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_1.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_1.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_2(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_2.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_2.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_3(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_3.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_3.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_4(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_4.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_4.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_5(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_5.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_5.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_6(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_6.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_6.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_7(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_7.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_7.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_8(ActionEvent event) {
    	
    	if(!W_flag)
    	{	
    		txt_1+=B_8.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_8.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_9(ActionEvent event) {
    	if(!W_flag)
    	{	
    		txt_1+=B_9.getText();
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		txt_2+=B_9.getText();
    		height_bar.setText(txt_2);
    	}
    }

    @FXML
    void show_backspace(ActionEvent event) {
    	String d_txt="";
    	if(!W_flag)
    	{
    		//check if last-one element which is going to remove from expression 
    		//was dot then sets its flag again false
    		//so it can be able to add in expression again
    		if(txt_1.charAt(txt_1.length()-1) == '.')
    		{
    			W_dot_flag=false;
    		}
    		
    		//now storing string expression in 'd_txt' exceeding last-one element so it will be remove from expression
    		for(int i=0; i < txt_1.length()-1; ++i)
    			d_txt+=txt_1.charAt(i);// coping characters in dummy string 'd_txt'
    		txt_1="";
    		txt_1=d_txt;
    		weight_bar.setText(txt_1);
    	}
    	else if(!H_flag)
    	{
    		//check if last-one element which is going to remove from expression 
    		//was dot then sets its flag again false
    		//so it can be able to add in expression again
    		if(txt_2.charAt(txt_2.length()-1) == '.')
    		{
    			H_dot_flag=false;
    		}
    		
    		//now storing string expression in 'd_txt' exceeding last-one element so it will be remove from expression
    		
    		for(int i=0; i < txt_2.length()-1; ++i)
    			d_txt+=txt_2.charAt(i);// coping characters in dummy string 'd_txt'
    		txt_2="";
    		txt_2=d_txt;
    		height_bar.setText(txt_2);
    	}
    }
    
    @FXML
    void show_dot(ActionEvent event) {
    	if(!W_flag)
    	{
    		if(!W_dot_flag)//if dot is already added in expression then don't add again
    		{
    			txt_1+=B_dot.getText();
    			weight_bar.setText(txt_1);
    			W_dot_flag=true;//now it can't be added in expression again
    		}
    		
    	}
    	else if(!H_flag)
    	{
    		if(!H_dot_flag)//if dot is already added in expression then don't add again
    		{
    			txt_2+=B_dot.getText();
	    		height_bar.setText(txt_2);
    			H_dot_flag=true;//now it can't be added in expression again
    		}
    		
    	}
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
    
    //this method shows BMI after calculation
    void show_n_calculateBMI(String exp1,String exp2)
    {
    	float weight=Float.parseFloat(exp1);
    	float height=Float.parseFloat(exp2);
    	
    	//converting height from cm to m
    	height/=100;
    	float bmi=weight/(height*height);
    	
    	
    	//displaying BMI on screen
    	String txt="BMI : ";
    	txt+=Float.toString(bmi);
    	BMI_bar.setText(txt);
    	
    }


}
