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


public class DiscountCalculator {

	
	    @FXML
	    private Button B_0;

	    @FXML
	    private Button B_dot;

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
	    private TextField discount_bar;

	    @FXML
	    private TextField finalprice_bar;

	    @FXML
	    private TextField price_bar;

	    @FXML
	    private Label saving_bar;

	    String txt_1="";//For Original Price bar 
	    String txt_2="";//For Discount bar
	    boolean OP_flag=false;//For Original Price bar 
	    boolean D_flag=false;//For Discount bar
	    
	    boolean OP_dot_flag=false;//dot flag For Original Price bar 
	    boolean D_dot_flag=false;//dot flag For Discount bar
	    
	    @FXML
	    void clear(ActionEvent event) {
	    	if(!OP_flag)
	    	{	
	    		txt_1="";
	    		price_bar.setText(txt_1);
	    		OP_dot_flag=false;
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2="";
	    		discount_bar.setText(txt_2);
	    		D_dot_flag=false;
	    	}
	    }

	    @FXML
	    void show_0(ActionEvent event) {
	    	
	    	if(!OP_flag)
	    	{	
	    		txt_1+=B_0.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_0.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_1(ActionEvent event) {
	    	
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_1.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_1.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_2(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_2.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_2.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_3(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_3.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_3.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_4(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_4.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_4.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_5(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_5.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_5.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_6(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_6.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_6.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_7(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_7.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_7.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_8(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_8.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_8.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_9(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		txt_1+=B_9.getText();
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		txt_2+=B_9.getText();
	    		discount_bar.setText(txt_2);
	    	}
	    }

	    @FXML
	    void show_backspace(ActionEvent event) {
	    	
	    	String d_txt="";
	    	if(!OP_flag)
	    	{
	    		//check if last-one element which is going to remove from expression 
	    		//was dot then sets its flag again false
	    		//so it can be able to add in expression again
	    		if(txt_1.charAt(txt_1.length()-1) == '.')
	    		{
	    			OP_dot_flag=false;
	    		}
	    		
	    		//now storing string expression in 'd_txt' exceeding last-one element so it will be remove from expression
	    		for(int i=0; i < txt_1.length()-1; ++i)
	    			d_txt+=txt_1.charAt(i);// coping characters in dummy string 'd_txt'
	    		txt_1="";
	    		txt_1=d_txt;
	    		price_bar.setText(txt_1);
	    	}
	    	else if(!D_flag)
	    	{
	    		//check if last-one element which is going to remove from expression 
	    		//was dot then sets its flag again false
	    		//so it can be able to add in expression again
	    		if(txt_2.charAt(txt_2.length()-1) == '.')
	    		{
	    			D_dot_flag=false;
	    		}
	    		
	    		//now storing string expression in 'd_txt' exceeding last-one element so it will be remove from expression
	    		
	    		for(int i=0; i < txt_2.length()-1; ++i)
	    			d_txt+=txt_2.charAt(i);// coping characters in dummy string 'd_txt'
	    		txt_2="";
	    		txt_2=d_txt;
	    		discount_bar.setText(txt_2);
	    	}

	    }
	    @FXML
	    void show_dot(ActionEvent event) {
	    	if(!OP_flag)
	    	{
	    		if(!OP_dot_flag)//if dot is already added in expression then don't add again
	    		{
	    			txt_1+=B_dot.getText();
	    			price_bar.setText(txt_1);
	    			OP_dot_flag=true;//now it can't be added in expression again
	    		}
	    		
	    	}
	    	else if(!D_flag)
	    	{
	    		if(!D_dot_flag)//if dot is already added in expression then don't add again
	    		{
	    			txt_2+=B_dot.getText();
		    		discount_bar.setText(txt_2);
	    			D_dot_flag=true;//now it can't be added in expression again
	    		}
	    		
	    	}
	    }

	    @FXML
	    void reset(ActionEvent event) {
	    	txt_1="";
	    	txt_2="";
	    	OP_flag=false;
	    	D_flag=false;
	    	OP_dot_flag=false;
	    	D_dot_flag=false;
	    	
	    	//clearing screen
	    	price_bar.setText(txt_1);
	    	discount_bar.setText(txt_2);
	    	finalprice_bar.setText("");
	    	saving_bar.setText("");
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
	    void done(ActionEvent event)
	    {
	    	// when OK button clicked first time
	    	if(!OP_flag)
	    	{	
	    		if(!txt_1.equals(""))
	    			OP_flag=true;
	    	}
	    	else if(!D_flag)
	    	{	
	    		if(!txt_2.equals(""))
	    			D_flag=true;
	    		
	    		if(OP_flag && D_flag)//if both values get then need to calculate and show discount
	    			show_n_calculateDiscount(txt_1,txt_2);
	    	}
	    	
	    }
	    //this method returns discount after calculation
	    void show_n_calculateDiscount(String exp1,String exp2)
	    {
	    	float price=Float.parseFloat(exp1);
	    	float discount=Float.parseFloat(exp2);
	    	
	    	//calculating discounted amount
	    	discount=(discount/100)*price;
	    	//Displaying saving amount
	    	String saving="You save ";
	    	saving+=Float.toString(discount);//appending amount in message
	    	//setting saving amount on screen
	    	saving_bar.setText(saving);
	    	
	    	//displaying Final price on screen
	    	price-=discount;
	    	finalprice_bar.setText(Float.toString(price));
	    	
	    }
}


