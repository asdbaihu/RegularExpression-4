package doa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseInsentivete {
	public boolean caseinsentivete(String line){
		Pattern cm = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
	     Matcher mtch = cm.matcher(line);
	     if(mtch.find()){
	    	 return true;
	     }
		return false;
		
	}
	    public static void main(String[] a) {
		CaseInsentivete ci=new CaseInsentivete();
		System.out.println(ci.caseinsentivete("This line contains java, lets see"));
		System.out.println(ci.caseinsentivete("Here JAVA is in capital leters, lets see"));
		System.out.println(ci.caseinsentivete("its true c++"));
		System.out.println(ci.caseinsentivete("its 123"));
	
	
	
	
	}

}
