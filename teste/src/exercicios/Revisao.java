package exercicios;
/*
 * Classe contendo a revis�o do primeiro m�dulo.
 * 
 * author: Osvaldo Souza
 * 
 * vers�o 1.0
 * 
 * 
 * */


public class Revisao {

	//m�todo de execu��o da classe.
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
		+ "lcanoconi�tico");
		System.out.println("idade: "+idade);
		System.out.println("peso: "+peso);
		System.out.println("tipo sangu�neo: "+tipoSanguineo+fatorRh);
		System.out.println("Doador de sangue: "+ehDoador);
		
		System.out.printf("nome: %s outra coisa \n",nome);
		System.out.printf("idade: %d\n",idade);
		System.out.printf("peso: %.2f\n",peso);
		System.out.printf("tipo sangu�neo: %c%c\n",tipoSanguineo,fatorRh);
	}

}
