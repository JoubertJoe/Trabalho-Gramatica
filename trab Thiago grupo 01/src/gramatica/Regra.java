package gramatica;

import java.util.ArrayList;

/**
 * Classe criada para guarda regras de producao onde tem-se uma regra que referece
 * a um caractere espec�fico e tem-se um Arraylist(AlfabetoGerado) contendo o
 * alfabeto que pode ser substituido por este caractere da regra.
 * 
 * @author Edimo Divino Silva J�nior
 * @author Joubert Joe Vieira Lellis
 * @author Elber C�ndido da Silva
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
	 * Para cada regra tem-se v�rios alfabetos.
	 * Ex : X - abS X - a Y - b 
	 * Em regra.get(posi��o).getRegra - tem-se:X(posi��o[0]) ,
	 * Y(posi��o[1]).
	 * Em regra.get(posi��o).alfabetoGerado.get(posi��o).getAlfabeto
	 * Em X(posi��o[0]) tem-se: abS(posi��o[0])
	 * Em regra.get(posi��o).alfabetoGerado.get(posi��o).getAlfabeto
	 * Em X(posi��o[1]) tem-se: a(posi��o[1])
	 * Em regra.get(posi��o).alfabetoGerado.get(posi��o).getAlfabeto
	 * EM Y(posi��o[1]) tem-se: b(posi��o[0])
	 * 
	 * @param regra
	 *            recebe uma String.
	 */
	public Regra(String regra) {
		this.regra = regra;
		alfabetoGerado = new ArrayList<AlfabetoGerado>();
	}

	/**
	 * Pega a String guardada em uma posi��o.
	 * 
	 * @return retorna String na posi��o.
	 */
	public String getRegra() {
		return regra;
	}

	/**
	 * Edita a regra em uma posi��o.
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
	 * Pega um alfabeto de um caractere espec�fico referente a posi��o (i)
	 * passada.
	 * 
	 * @param i
	 *            posi��o passada.
	 * @return retorna a String(alfabedo guardado nequela posi��o).
	 */
	public String pegarAlfabeto(int i) {
		String alfabeto;
		alfabeto = this.alfabetoGerado.get(i).getAlfabeto();
		return alfabeto;
	}

	/**
	 * Retorna o tamanho do alfabeto que um caractere espec�fico pode gerar.
	 * 
	 * @return retorna tamanho (int).
	 */
	public int tamanho() {
		int tam = alfabetoGerado.size();
		return tam;
	}
}
