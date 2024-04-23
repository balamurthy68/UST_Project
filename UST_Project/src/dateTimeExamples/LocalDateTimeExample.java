package dateTimeExamples;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	    public static void main(String[] args) {  
	        LocalDateTime now = LocalDateTime.now();  
	        System.out.println("Before Formatting: " + now);  
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");  
	        String formatDateTime = now.format(format);  
	        System.out.println("After Formatting: " + formatDateTime);  
	    
	    // Assignment : Greet the user Good morning if <12, Good Afternoon if >=12
	        //and Good evening if >=3
	        //Good night if >=7
	        
	        //Stage no 2 - store the actual Greeting value in a property file or
	        //a string and compare with expected Greeting 
	        
	        System.out.println(LocalTime.now().getHour());
	    }  
	}  

