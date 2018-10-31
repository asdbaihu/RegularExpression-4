package doa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatcher {
//Patter is a compiled representation of a regular expression. 
	//Matcher is an engine that performs match operations on a character sequence by interpreting a Pattern.


	public static void main(String[] args) {

		
		
		String line="this is order qt3000!ok";
		String pattern="(.*)(\\d+)(.*)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		if(m.find()){
			System.out.println("found value:"+m.group(0));
			System.out.println("found value:"+m.group(1));
			System.out.println("found value:"+m.group(3));
		}else{System.out.println("no match");
	}

}
}