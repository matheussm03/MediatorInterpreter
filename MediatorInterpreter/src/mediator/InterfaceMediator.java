package mediator;

public interface InterfaceMediator {
	
	public void enviarMensagem (String mensagem, UsuarioAbstrato usuario);
	
	public void adicionarUsuario (UsuarioAbstrato usuario);

}
