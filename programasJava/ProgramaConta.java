

class Programa{
	public static void main(String[] args){
	
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "Matheus";
		minhaConta.saldo = 1000.0;

		System.out.println(minhaConta.dono);
		System.out.println("Saldo atual: R$" + minhaConta.saldo);
	}
}
