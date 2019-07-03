package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
	
  SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
  SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date y1 = sdf1.parse("25/06/2019");
	Date y2 = sdf2.parse("25/06/2019 01:03:07");
	
	
	Date x1 = new Date(); // criar data agora
	Date x2 = new Date(System.currentTimeMillis()); // pega do sistema	
	Date x3 = new Date(0L);
	
	
	System.out.println("x1 : " + sdf2.format(x1));
	System.out.println("x2 : " + sdf2.format(x2));
	System.out.println("x3 : " + sdf2.format(x3));
	System.out.println("y1: " + sdf2.format(y1));
	System.out.println("y2 : " + sdf2.format(y2));
	}

}
