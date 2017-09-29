package principal;

import gramatica.Metodos;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Insira os símbolos do alfabeto separados por vírgula.");
		Metodos metodos = new Metodos();
		String[] alfabeto = null;
		alfabeto = metodos.lerVetorString();
		metodos.imprimeVetorString(alfabeto);
		String[] terminais = null;
		System.out.println("Insira os símbolos terminais separados por vírgula.");
		terminais = metodos.lerVetorString();
		metodos.imprimeVetorString(terminais);
		metodos.condicoesTerminais(terminais);

	}
}
