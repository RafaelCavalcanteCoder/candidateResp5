package program;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		// Definindo a string a ser invertida
		String originalString = "Invertendo String desejada"; //aqui escreve o que desejar para inverter.

		// Imprimindo a string original
		System.out.println("String original: " + originalString);

		// Convertendo a string para um array de caracteres
		char[] charArray = originalString.toCharArray();

		// Invertendo a ordem dos caracteres no array
		for (int i = 0; i < charArray.length / 2; i++) {
		char temp = charArray[i];
		charArray[i] = charArray[charArray.length - 1 - i];
		charArray[charArray.length - 1 - i] = temp;
		}

		// Convertendo o array de volta para uma string
		String invertedString = new String(charArray);

		// Imprimindo a string invertida
		System.out.println("String invertida: " + invertedString);
		}
}
