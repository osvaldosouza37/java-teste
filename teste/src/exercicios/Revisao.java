package exercicios;
/*
 * Classe contendo a revisão do primeiro módulo.
 * 
 * author: Osvaldo Souza
 * 
 * versão 1.0
 * 
 * 
 * */


public class Revisao {

	//método de execução da classe.
	public static void main(String[] args) {
		
		String nome="Osvaldo";
		int idade=34;
		double peso=75.4;
		char tipoSanguineo='A', fatorRh='+';
		boolean ehDoador=true;
		
		System
		.out
		.println("nome: "
		+nome
		+"pneumoutramicros"
		+ "copicossilicovu"
		+ "lcanoconiótico");
		System.out.println("idade: "+idade);
		System.out.println("peso: "+peso);
		System.out.println("tipo sanguíneo: "+tipoSanguineo+fatorRh);
		System.out.println("Doador de sangue: "+ehDoador);
		
		System.out.printf("nome: %s outra coisa \n",nome);
		System.out.printf("idade: %d\n",idade);
		System.out.printf("peso: %.2f\n",peso);
		System.out.printf("tipo sanguíneo: %c%c\n",tipoSanguineo,fatorRh);
	}

}
