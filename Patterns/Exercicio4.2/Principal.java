public class Principal {
	
	public static void main(String[] args) {
	
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
