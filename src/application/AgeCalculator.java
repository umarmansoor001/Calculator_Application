package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AgeCalculator {

	@FXML
    private Label date_bar;

    @FXML
    private DatePicker dob;

    @FXML
    private Label month_bar;

    @FXML
    private DatePicker today;

    @FXML
    private Label year_bar;
    
    //Boolean flags
    boolean dob_flag=false;
    boolean today_flag=false;

    @FXML
    void calculate(ActionEvent event) {

    	if(dob_flag && today_flag)
    		age_calculation();
    }

    @FXML
    void get_dob(ActionEvent event) {
    	dob_flag=true;
    }

    @FXML
    void get_today(ActionEvent event) {
    	today_flag=true;
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
    
    // Age Calculations
    void age_calculation()
    {
    	String dob_date = dob.getValue().toString();
    	String[] dob_t=dob_date.split("-");
    	String today_date = today.getValue().toString();
    	String[] today_t=today_date.split("-");
    	
//    	//year calculation
    	int year=Integer.parseInt(today_t[0])-Integer.parseInt(dob_t[0]);//today year -dob year
    	year_bar.setText(Integer.toString(year)+" Year");
    	//month calculation
    	
    	//setting to display
    	int month;
    	int dob_month=Integer.parseInt(dob_t[1]);
    	int t_month=Integer.parseInt(today_t[1]);
    	if(t_month>dob_month)
    	{		
    		month=t_month-dob_month;
    		month_bar.setText(Integer.toString(month)+" Month");
    	}
    	else if(dob_month>t_month)
    	{		
    		month=dob_month-t_month;
    		month_bar.setText(Integer.toString(month)+ "Month");
    	}
    	//Date calculation
    	
    	//setting to display
    	int date;
    	int dob_Date=Integer.parseInt(dob_t[2]);
    	int t_date=Integer.parseInt(today_t[2]);
    	if(t_date>dob_Date)
    	{		
    		date=t_date-dob_Date;
    		date_bar.setText(Integer.toString(date)+" Day");
    	}
    	else if(dob_Date>t_date)
    	{		
    		date=dob_Date-t_date;
    		date_bar.setText(Integer.toString(date)+" Day");
    	}
    	
    }
}
