/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Escopo de atributos e de métodos
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.escopo;

public class Pessoa 
{

	public static int quantidadePessoas = 0; //atributo com escopo de classe (estático)
	private String nome; // atributo com escopo de instância

	public Pessoa(String nome) 
	{
		this.nome = nome;
		quantidadePessoas +=1; // incrementa a quantidade de pessoas
	}

	// método com escopo de classe (estático)
	public static int getQuantidadePessoas() 
	{
		return quantidadePessoas;
	}
	
	// método com escopo de instância
	public String getNome() 
	{
		return nome;
	}

	// método com escopo de instância
	public int getTotalPessoas() 
	{
		return quantidadePessoas;
	}
}
