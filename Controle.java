/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Escopo de atributos e de métodos
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */
package fundamentos.escopo;

public class Controle 
{

	public static void main(String[] args) 
	{	
		int qtdPessoasInicial = Pessoa.getQuantidadePessoas();
		System.out.println("Quantidade inicial: " + qtdPessoasInicial);	
		
		Pessoa pessoa1 = new Pessoa("Abel");		
		System.out.println(pessoa1.getNome());	
		
		Pessoa pessoa2 = new Pessoa("Bela");
		System.out.println(pessoa2.getNome());	
		
		int qtdPessoasFinal = Pessoa.getQuantidadePessoas();
		
		System.out.println("Método getQuantidadePessoas: " + qtdPessoasFinal);
		System.out.println("Método getTotalPessoas: " + pessoa2.getTotalPessoas());
		System.out.print("Atributo quantidadePessoas: " + Pessoa.quantidadePessoas);
	}
}
