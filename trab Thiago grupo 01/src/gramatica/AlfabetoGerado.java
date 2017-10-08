package gramatica;
/**
 * Classe criada para guarda o alfabeto que pode ser gerado por um caracter especifico.
 * Ex : X - abS
 * 		X - a
 * Sendo X o caracter especifico que pode ser substituido por abS ou a para forma a palavra.
 * @author Edimo Divino Silva J�nior
 * @author Joubert Joe Vieira Lellis
 * @author Elber C�ndido da Silva
 * @author Laressa Fernanda Vilela Silveira
 * @author Rafael Sene Alves Penha
 * @author Roberto Alves Ferreira Filho

 *
 */
public class AlfabetoGerado {

	private String alfabeto;
	
	/**
	 * Preenche a variavel com a String passada.
	 * @param alfabeto recebe a String passada.
	 */
	public AlfabetoGerado(String alfabeto) {
		this.alfabeto = alfabeto;		
	}
	
	/**
	 * Retorna a String guardada
	 * @return retorna a String
	 */
	public String getAlfabeto() {
		return alfabeto;
	}
	
	/**
	 * Entra com uma String para substituir a que estava guardada.
	 * @param alfabeto recebe a String passada.
	 */
	public void setAlfabeto(String alfabeto) {
		this.alfabeto = alfabeto;
	}

}
