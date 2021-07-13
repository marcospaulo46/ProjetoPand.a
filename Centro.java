package projetosaudemental;

public class Centro {

	private String centro;
	private String bomRetiro;
	private String belaVista;
	private String aclimacao;
	
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getBomRetiro() {
		return bomRetiro;
	}
	public void setBomRetiro(String bomRetiro) {
		this.bomRetiro = bomRetiro;
	}
	public String getBelaVista() {
		return belaVista;
	}
	public void setBelaVista(String belaVista) {
		this.belaVista = belaVista;
	}
		public String getAclimacao() {
		return aclimacao;
	}
	public void setAclimacao(String aclimacao) {
		this.aclimacao = aclimacao;
	}
		public void centro() {
			System.out.println("\nCAPS AD III CENTRO - R. Frederico Alvarenga, 259 - 2° andar - Centro" 
		+ "\nTelefones: 3241-0901/ 3241-5460");		
	}
		public void bomRetiro() {
			System.out.println("\nCAPS III AD COMPLEXO PRATES - R. Prates, 1107 - Bom Retiro"
					+ "\nTelefones: 3229-8501/3229-8192");
		}
		public void belaVista() {
			System.out.println("\nCAPS AD IV - Praça Princesa Isabel, 75 - Luz" + "Telefone: 3224-6140\n"
					+ "CAPS III ADULTO SÉ - Rua Itaraé, 75 - Bela Vista"+ "\nTelefone: 3151-4900");
		}
		public void aclimacao() {
			System.out.println("\nCAPS IJ III SÉ - R. Diamante, 41 - Aclimação" + "\nTelefones: 3101-0156/3104-3210");
		}
}



