package doa;

public class stringmatches {

public void StringNumber(String no){
	System.out.println(no.matches("(\\d+)"));
}
	
	
	
	public static void main(String[] args) {
    stringmatches sm=new stringmatches();
    sm.StringNumber("345");
    sm.StringNumber("444");
    sm.StringNumber("22ww");
    sm.StringNumber("ee33");
	}

}
