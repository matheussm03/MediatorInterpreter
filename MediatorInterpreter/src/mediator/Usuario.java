package mediator;

public class Usuario extends UsuarioAbstrato {
	
	public Usuario(InterfaceMediator interfaceMediator, String nome) {
		super(interfaceMediator, nome);
	}

	@Override
	public void enviando(String mensagem) {
		System.out.println(this.nome + ": Enviando a mensagem = " + mensagem);
		mediator.enviarMensagem(mensagem, this);
	}

	@Override
	public void recebendo(String mensagem) {
		System.out.println(this.nome + ": Mensagem recebida = " + mensagem);
	}

}
