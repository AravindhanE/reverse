import java.util.*;

class reverse {
	public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
	     String s1=s.next();
		 StringBuffer str=new 	 StringBuffer();
		 str.append(s1);
		 str=str.reverse();
	   
		  for(int i=0;i<str.length();i++)
		  {
		      System.out.println(str.charAt(i)); 
		  }
	}
}
