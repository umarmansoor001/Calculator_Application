package application;

//This is a utility class to  calculate different operations on Birthday 

public class AgeCalculation {

	int b_year;
	int b_month;
	int b_day;
	int t_year;
	int t_month;
	int t_day;
	
	void splitting_dates(String b_date, String t_date)
	{
		String[] birthday= b_date.split("/");//breaking birthday string
		String[] today= t_date.split("/");// breaking today string
		
		//storing birthday after splitting
		b_day=Integer.parseInt(birthday[0]);
		b_month=Integer.parseInt(birthday[1]);
		b_year=Integer.parseInt(birthday[2]);
		
		//storing today after splitting
		t_day=Integer.parseInt(today[0]);
		t_month=Integer.parseInt(today[1]);
		t_year=Integer.parseInt(today[2]);	
		
	}
	int age_year_Calculation()
	{
		if(t_year>b_year)
			return t_year-b_year;
		else
			return b_year-t_year;
	}
	int age_month_Calculation()
	{
		if(t_month>b_month)
			return t_month-b_month;
		else
			return b_month-t_month;
	}
	int age_day_Calculation()
	{
		if(t_day>b_day)
			return t_day-b_day;
		else
			return b_day-t_day;
	}
	
}
