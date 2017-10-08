package gramatica;

import java.util.ArrayList;

/**
 * Classe criada para guarda regras de producao onde tem-se uma regra que referece
 * a um caractere específico e tem-se um Arraylist(AlfabetoGerado) contendo o
 * alfabeto que pode ser substituido por este caractere da regra.
 * 
 * @author Edimo Divino Silva Júnior
 * @author Joubert Joe Vieira Lellis
 * @author Elber Cândido da Silva
 * @author Laressa Fernanda Vilela Silveira
 * @author Rafael Sene Alves Penha
 * @author Roberto Alves Ferreira Filho
 * 
 */
public class Regra {
	private String regra;
	private ArrayList<AlfabetoGerado> alfabetoGerado;

	/**
	 * Recebe a String do usuario, e cria um Array, a partir do mesmo, cria-se
	 * uma Matriz.
	 * Para cada regra tem-se vários alfabetos.
	 * Ex : X - abS X - a Y - b 
	 * Em regra.get(posição).getRegra - tem-se:X(posição[0]) ,
	 * Y(posição[1]).
	 * Em regra.get(posição).alfabetoGerado.get(posição).getAlfabeto
	 * Em X(posição[0]) tem-se: abS(posição[0])
	 * Em regra.get(posição).alfabetoGerado.get(posição).getAlfabeto
	 * Em X(posição[1]) tem-se: a(posição[1])
	 * Em regra.get(posição).alfabetoGerado.get(posição).getAlfabeto
	 * EM Y(posição[1]) tem-se: b(posição[0])
	 * 
	 * @param regra
	 *            recebe uma String.
	 */
	public Regra(String regra) {
		this.regra = regra;
		alfabetoGerado = new ArrayList<AlfabetoGerado>();
	}

	/**
	 * Pega a String guardada em uma posição.
	 * 
	 * @return retorna String na posição.
	 */
	public String getRegra() {
		return regra;
	}

	/**
	 * Edita a regra em uma posição.
	 * 
	 * @param regra
	 *            String de substituicao.
	 */
	public void setRegra(String regra) {
		this.regra = regra;
	}

	/**
	 * Adiciona um alfabeto referente a regra.
	 * 
	 * @param entraAlfabeto
	 *            String na qual voce entra com o alfabeto e e guardado.
	 */
	public void addAlfabeto(String entraAlfabeto) {
		AlfabetoGerado alfabeto = new AlfabetoGerado(entraAlfabeto);
		this.alfabetoGerado.add(alfabeto);
	}

	/**
	 * Pega um alfabeto de um caractere específico referente a posição (i)
	 * passada.
	 * 
	 * @param i
	 *            posição passada.
	 * @return retorna a String(alfabedo guardado nequela posição).
	 */
	public String pegarAlfabeto(int i) {
		String alfabeto;
		alfabeto = this.alfabetoGerado.get(i).getAlfabeto();
		return alfabeto;
	}

	/**
	 * Retorna o tamanho do alfabeto que um caractere específico pode gerar.
	 * 
	 * @return retorna tamanho (int).
	 */
	public int tamanho() {
		int tam = alfabetoGerado.size();
		return tam;
	}
}
