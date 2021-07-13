package projetosaudemental;

public class mensagens {

	
	String msg1;
	String msg2;
	String msg3;
	String msg4;
	
	
	public String getMsg1() {
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public String getMsg2() {
		return msg2;
	}
	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	public String getMsg3() {
		return msg3;
	}
	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}
	public String getMsg4() {
		return msg4;
	}
	public void setMsg4(String msg4) {
		this.msg4 = msg4;
	}
	public void msg1() {
		System.out.println("Estou bastate preocupado com você."
				+ "\nVocê não precisa passar por tudo isso sozinhe"
				+ "\nEntão eu vou dar pra você uma dica de amigo."
				+ "\nVocê sabia que existe atendimento psicológico gratuito em SP?"
				+ "\nDe acordo com a região que você escolheu, esse é o mais próximo de você: \n");
	}
	public void msg2() {
		System.out.println("Estou um pouquinho preocupado com você."
				+ "\nEntão eu vou dar pra você uma dica de amigo."
				+ "\nVocê sabia que existe atendimento psicológico gratuito em SP?"
				+ "\nDe acordo com a região que você escolheu, esse é o mais próximo de você: \n");
	}
	public void msg3() {
		System.out.println("Aparentemente você tem se sentido bem, né?"
				+ "\nMas eu sei que podem ter dias que a gente precisa de um help!"
				+ "\nEntão eu vou dar pra você uma dica de amigo."
				+ "\nVocê sabia que existe atendimento psicológico gratuito em SP?"
				+ "\nDe acordo com a região que você escolheu, esse é o mais próximo de você: \n");
	}
	public void msg4() {
		System.out.println("Você é um ótimo amigo por estar aqui por alguém que você gosta."
				+ "\nEntão eu vou dar pra você uma dica de amigo também."
				+ "\nVocê sabia que existe atendimento psicológico gratuito em SP?"
				+ "\nDe acordo com a região que você escolheu, esse é o mais próximo de você: \n");
	}
}

