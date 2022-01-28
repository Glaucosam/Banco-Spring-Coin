import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

public abstract class Conta implements iConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	protected @Getter int agencia;
	protected @Getter int numero;
	protected @Getter double saldo;
	
	
		
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
		
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}
	
	
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}
	
		
		
		
		protected void impinfocomuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
		
		
		
	
		

		public void imprimirExtrato() {
			// TODO Auto-generated method stub
			
		}
		
}
