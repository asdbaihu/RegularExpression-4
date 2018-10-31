package doa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipaddress {
     public static boolean isvalid(String ipaddr){
    	 Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher matcher = ptn.matcher(ipaddr);
    	 return matcher.find();
    	 
     }
public static void main(String args[]) {
                      System.out.println("10.23.45.12 is valid? "+ipaddress.isvalid("10.23.45.12"));         
                      System.out.println("10.23.45 is valid?"+ipaddress.isvalid("13.2+.1.12"));
	}

}
