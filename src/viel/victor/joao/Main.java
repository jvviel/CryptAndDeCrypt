package viel.victor.joao;

public class Main {

	public static void main(String[] args) {
		
		Crypt crypt = new Crypt();
		String encriptar = crypt.cryptHexa("Ola Senhores");
		System.out.println(encriptar);
		
		String decriptar = crypt.deCryptHexa(encriptar);
		System.out.println(decriptar);
		
		//   Resultado =>
		//   7e5c581964545f585e425542
		//   Ola Senhores
	}
}
