package entidades;

public class ConversaoMoeda
 {
	
	
	public static double IOF=0.06;
	
	public static double dollarParaReal(double motante, double precoDollar) {
		return motante*precoDollar*(1+IOF);
	}

}
