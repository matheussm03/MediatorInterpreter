package mediator;

public abstract class UsuarioAbstrato {
	
	protected InterfaceMediator mediator;
	protected String nome;
	
	public UsuarioAbstrato(InterfaceMediator mediator, String nome) {
		this.mediator = mediator;
		this.nome = nome;
	}
	
	public abstract void enviando(String mensagem);
	
	public abstract void recebendo(String mensagem);

}
