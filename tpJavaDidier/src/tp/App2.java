package tp;

public class App2 {
	
	//void = type tr�s sp�cial (pas de valeur de retour)
	public static void print(String message) {
			System.out.println(message);
			//pas de return ...
		}
		
	public static double retournerLaPlusPetiteValeur(double a, double b){
		/*
		if(a<=b) {
			return a;
		}else {
			return b;
		}
		*/
		double res=0;
		if(a<=b) {
			res= a;
		}else {
			res= b;
		}
		return res;
	}
	
	public static double plusGrandeValeurDuTableau(double[] tab) {
		double res=-9999999;
		//en exercice , parcourir le tableau tab avec une boucle for et un indice i
		     //si res est plus petit que tab[i]
		         //alors nouvelle valeur de res = tab[i]
		for(int i=0 ; i<tab.length   ; i++  ) {
			if( res < tab[i]) {
				res=tab[i];
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		
		double[] tableau2 = { -6 , 16 , -8 , -4 , 36 , 25 };
		double x= plusGrandeValeurDuTableau(tableau2);
		print("x="+x);
		
		
		
		int i=0;
		while(i<tableau2.length) {
			if(tableau2[i]>=0) {
				double racine = Math.sqrt(tableau2[i]);
				print("racine="+racine);
			}
			i++; //i=i+1;
		}//fin de while
		
		print("app2");
		double res1 = retournerLaPlusPetiteValeur(6,8);
		print("res1 (plus petite valeur)="+res1);
		res1 = retournerLaPlusPetiteValeur(78,34);
		print("res1 (plus petite valeur)="+res1);
	}

}