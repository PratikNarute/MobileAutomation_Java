package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Unit_Conversion 
{

	
	public static  double convertUnits(String sourceUnit, String targetUnit, Double inputValue)
	{
		double convertedValue=0.00;
		
//////////////////////////+++++++++++++//Convert to mm ++++++++++++++++++////////////////////////////////////////////////
        if (targetUnit.equalsIgnoreCase("mm")) 
        {
	        	if (sourceUnit.equalsIgnoreCase("ft"))
	        	{ 		
	        		convertedValue = (inputValue*304.8);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("m"))
	        	{
	        		convertedValue = (inputValue*1000);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("cm"))
	        	{
	        		convertedValue = (inputValue*10);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("inch"))
	        	{
	        		convertedValue = (inputValue*25.4);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("km"))
	        	{
	        		convertedValue = (inputValue*1000000);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("mile"))
	        	{
	        		convertedValue = (inputValue*1609344);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("yard"))
	        	{
	        		convertedValue = (inputValue*914.4);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("mm"))
	        	{
	        		convertedValue = (inputValue);
	        	}
         }   
//////////////////////////+++++++++++++//Convert to cm ++++++++++++++++++////////////////////////////////////////////////
        else if (targetUnit.equalsIgnoreCase("cm")) 
        {
	        	if (sourceUnit.equalsIgnoreCase("ft"))
	        	{ 		
	        		convertedValue = (inputValue*30.48);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("m"))
	        	{
	        		convertedValue = (inputValue*100);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("cm"))
	        	{
	        		convertedValue = (inputValue);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("inch"))
	        	{
	        		convertedValue = (inputValue*2.54);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("km"))
	        	{
	        		convertedValue = (inputValue*100000);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("mile"))
	        	{
	        		convertedValue = (inputValue*160934);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("yard"))
	        	{
	        		convertedValue = (inputValue*91.44);
	        	}
	        	else if (sourceUnit.equalsIgnoreCase("mm"))
	        	{
	        		convertedValue = (inputValue*0.1);
	        	}
        }
//////////////////////////+++++++++++++//Convert to m ++++++++++++++++++////////////////////////////////////////////////
		else if (targetUnit.equalsIgnoreCase("m")) 
		{
			  	if (sourceUnit.equalsIgnoreCase("ft"))
			  	{ 		
			  		convertedValue = (inputValue*0.3048);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("m"))
			  	{
			  		convertedValue = (inputValue);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("cm"))
			  	{
			  		convertedValue = (inputValue*0.01);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("inch"))
			  	{
			  		convertedValue = (inputValue*0.0254);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("km"))
			  	{
			  		convertedValue = (inputValue*1000);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("mile"))
			  	{
			  		convertedValue = (inputValue*1609.34);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("yard"))
			  	{
			  		convertedValue = (inputValue*0.9143977272588);
			  	}
			  	else if (sourceUnit.equalsIgnoreCase("mm"))
			  	{
			  		convertedValue = (inputValue / 1000);
			  		System.out.println("convertedValue: "+convertedValue);
			  	}
       }   
//////////////////////////+++++++++++++//Convert to ft ++++++++++++++++++////////////////////////////////////////////////
	   else if (targetUnit.equalsIgnoreCase("ft")) 
	   {
			if (sourceUnit.equalsIgnoreCase("ft"))
			{ 		
				convertedValue = (inputValue);
			}
			else if (sourceUnit.equalsIgnoreCase("m"))
			{
				convertedValue = (inputValue*3.28084);
			}
			else if (sourceUnit.equalsIgnoreCase("cm"))
			{
				convertedValue = (inputValue/30.48);
			}
			else if (sourceUnit.equalsIgnoreCase("inch"))
			{
				convertedValue = (inputValue/12);
			}
			else if (sourceUnit.equalsIgnoreCase("km"))
			{
				convertedValue = (inputValue*3280.84);
			}
			else if (sourceUnit.equalsIgnoreCase("mile"))
			{
				convertedValue = (inputValue*5280.00016896);
			}
			else if (sourceUnit.equalsIgnoreCase("yard"))
			{
				convertedValue = (inputValue*3.000000096);
			}
			else if (sourceUnit.equalsIgnoreCase("mm"))
			{
				convertedValue = (inputValue / 304.8);
				System.out.println("convertedValue: "+convertedValue);
			}
	   } 
//////////////////////////+++++++++++++//Convert to km ++++++++++++++++++////////////////////////////////////////////////
	   else if (targetUnit.equalsIgnoreCase("km")) 
	   {
			if (sourceUnit.equalsIgnoreCase("ft"))
			{ 		
			convertedValue = (inputValue);
			}
			else if (sourceUnit.equalsIgnoreCase("m"))
			{
			convertedValue = (inputValue*3.28084);
			}
			else if (sourceUnit.equalsIgnoreCase("cm"))
			{
			convertedValue = (inputValue/30.48);
			}
			else if (sourceUnit.equalsIgnoreCase("inch"))
			{
			convertedValue = (inputValue/12);
			}
			else if (sourceUnit.equalsIgnoreCase("km"))
			{
			convertedValue = (inputValue*3280.84);
			}
			else if (sourceUnit.equalsIgnoreCase("mile"))
			{
			convertedValue = (inputValue*5280.00016896);
			}
			else if (sourceUnit.equalsIgnoreCase("yard"))
			{
			convertedValue = (inputValue*3.000000096);
			}
			else if (sourceUnit.equalsIgnoreCase("mm"))
			{
			convertedValue = (inputValue / 304.8);
			System.out.println("convertedValue: "+convertedValue);
			}
     	} 
        
        
				      
        
      
        return convertedValue;
	
	}	

}
