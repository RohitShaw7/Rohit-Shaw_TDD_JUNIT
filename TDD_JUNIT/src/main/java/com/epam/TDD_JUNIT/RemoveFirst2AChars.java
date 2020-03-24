package com.epam.TDD_JUNIT;

public class RemoveFirst2AChars {
	
	public String remove(String string) {
		if(string.length()==0 || ( (string.length()==1) && (string.charAt(0)=='A') ))
		{
			string="";
		}
		else if(string.charAt(0)=='A')
		{
			while(string.charAt(0)=='A') //accessing the first letter 
			{
				string = string.replaceFirst("A","");	
			}
		}
		else if(string.charAt(1)=='A')  //accessing the second letter 
		{
			string = string.replaceFirst("A","");
		}
		return string;
	}

}
