package basico3;

import java.util.StringTokenizer;

public class subst {

	public static void main(String[] args) {
		String str = "Hello";
		String resultado = str.replace("l", "w");
		System.out.println(resultado);
	
		String str1 = "Oi"; String texto = str + "Mundo";
		int tres = 3;
		String resultadoFinal = 3 + "palavra" + tres;
		System.out.println(resultadoFinal);
		
		String str2 = "Hello World";
		String posicao = str2.substring(6);
		System.out.println(posicao);
		
		String resultado3 = str2.substring (3, 8);
		System.out.println(resultado3);
				
		String str3 = "Hello";
		String resultado2 = str3.toUpperCase();
		System.out.println(resultado2);
		
		String str4 = "Hello";
		String resultado4 = str4.toLowerCase();
		System.out.println(resultado4);
		
		String str5 = "Hello  ";//tirar espaço
		String resultado5 = str5.trim();
		System.out.println(resultado5);
		
		String str6 = "Hello";
		char c = str6.charAt(1);
		System.out.println(c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1+" "+b2 +" "+b3+" "+b4);
		
		String s = "abc";
		int tam = s.length();
		System.out.println(tam);
		
		String str7 = "Hello World World2";
		int pos = str.indexOf("l");
		System.out.println(pos);
	
		String valor = "CDD - Java";
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD", 1));//identifica onde está a palavra na string
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());
	}

}
