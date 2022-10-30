package aula4;

public class ClasseExecutavel {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 6, 8, 10, 13, 15, 23, 9, 40};
		int pares = 0;
		int impar = 0;
	
		for (int cont = 0; cont < array1.length; cont++) {
			if (array1[cont] % 2 == 0) {
				pares++;
				pares = pares * 100 / 100;
			} else {
				impar++;
				impar = impar * 100 / 100;
			}
		}
		System.out.println("Temos " + pares + " Numeros Pares");
		System.out.println("Temos " + impar + " Numeros Impares");
		System.out.println("<<<>>><>>><>>>><>><>><>><>><>><>><><>");
		System.out.println(ANSI_YELLOW_BACKGROUND+"O percentual de valores pares>>>>  " + pares + "%"+ANSI_RESET);
		System.out.println(ANSI_YELLOW_BACKGROUND+"O percentual de valores impares>> " + impar + "%"+ANSI_RESET);

	}

}
