package atividade_3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
			
		String chars = "A1B2C3D44F555@";
		String A = "A*B8C";
		String B = "12#3456&";
		String resultado = "";
		B = new StringBuilder(B).reverse().toString();
		for(int i = 0; i < A.length(); i++) {
			if(i < B.length()) {
				resultado += String.valueOf(A.charAt(i)) + String.valueOf(B.charAt(i));
			} else {
				resultado += String.valueOf(A.charAt(i));
			}
		}
		

		if(B.length() > A.length()) {
			resultado += B.substring(A.length(), B.length());
		}
		
		
		List <Character> digits = resultado.chars().
		                             boxed().
		                             map(ch -> (char) ch.intValue()).
		                             filter(Character::isDigit).
		                             collect(Collectors.toList());
		
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(resultado);
		System.out.println(resultado.length()- digits.size());
		System.out.println(digits.size());
		// x = 5 ultimos numeros inseridos
		// N = 6 quantidade total a ser inserido
		// 5, 20, 30, 50, 100, 28, 6 numeros inseridos
		
		// 5, 6, 28, 30, 50 ,100
		// 6, 28, 30, 50, 100
		
	}
}
