package tp;

public class App {
	
	public static String prompt(String invite) {
		System.out.println(invite);
		java.util.Scanner reader = new java.util.Scanner(System.in);
		String res=  reader.next();
		reader.close();
		return res;
	}

	public static void main(String[] args) {
		// commentaire
		String v1="titi2"; 
		v1="toto";
	    //v1=prompt("nom:");
		int v2=13;
		double  v3=12.5;
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
	}

}
