package ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner test = new Scanner(System.in);
	    
	    String x = test.next();
	    String[] y = x.split("");
	    
	    System.out.println("[" + Integer.parseInt(y[0]) * 10000 + "]");
	    System.out.println("[" + Integer.parseInt(y[1]) * 1000 + "]");
	    System.out.println("[" + Integer.parseInt(y[2]) * 100 + "]");
	    System.out.println("[" + Integer.parseInt(y[3]) * 10 + "]");
	    System.out.println("[" + y[4] + "]");
	    }
	}
