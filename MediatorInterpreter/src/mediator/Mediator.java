package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements InterfaceMediator {
	
	private List<UsuarioAbstrato> usuarios;
	
	public Mediator() {
		this.usuarios = new ArrayList<>();
	}

	@Override
	public void enviarMensagem(String mensagem, UsuarioAbstrato usuario) {
		for (UsuarioAbstrato usuarioAbst : this.usuarios) {
			if (usuarioAbst != usuario) {
				usuarioAbst.recebendo(mensagem);
			}
		}
	}

	@Override
	public void adicionarUsuario(UsuarioAbstrato usuario) {
		this.usuarios.add(usuario);
	}

}
