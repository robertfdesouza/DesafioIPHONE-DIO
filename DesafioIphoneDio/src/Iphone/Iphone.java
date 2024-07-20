package Iphone;
public class Iphone implements Navegador, AparelhoTelefonico, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando Música!");
	}

	@Override
	public void pausar() {
		System.out.println("Música Pausada!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Música!");
	}

	@Override
	public void ligar() {
		System.out.println("Efetuando Chamada!");
		
	}

	@Override
	public void atender() {
		System.out.println("Chamada Atendida!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz Ativo!");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Abrir Pagina de Internet!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Add Nova Aba no Navegador!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar Página Web!");
		
	}
	
	  public static void main(String[] args) {
          Iphone iphone = new Iphone();

          iphone.ligar();
          iphone.atender();
          iphone.iniciarCorreioVoz();
          iphone.exibirPagina();
          iphone.adicionarNovaAba();
          iphone.atualizarPagina();
          iphone.tocar();
          iphone.pausar();
          iphone.selecionarMusica();
      }
	
	
	

}

