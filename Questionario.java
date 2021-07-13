package projetosaudemental;

import java.util.Scanner;

public class Questionario {

	public static void main(String[] args) {

		int idade , regiao, bairro = 0, sexo, quem, urgente, atendimento, profissional, precisa;

		int resposta1, resposta2, resposta3, resposta4, resposta5, resposta6, resposta7, resposta8, resposta9,
				somaRespostas;
		int novamente;

		String name;

		String email;

		Scanner ler = new Scanner(System.in);

		Leste end = new Leste();
		Oeste end1 = new Oeste();
		Centro end2 = new Centro();
		Sul end3 = new Sul();

		mensagens write = new mensagens();

		System.out.println("================================================================="
				+ "\n===                                                           ==="
				+ "\n===                 SEJA BEM VINDE AO PAND.A                  ==="
				+ "\n===                                                           ==="
				+ "\n=================================================================\n");

		System.out.println("Qual seu nome? ");
		name = ler.nextLine();
		System.out.println("Qual seu email? ");
		email = ler.nextLine();
		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();
		System.out.println("Qual seu gênero?" + "\n1.Homem | 2.Mulher | 3.Não Binário | 4.Genderfluid | 5.Outros");
		sexo = ler.nextInt();
		do  {
		System.out.println("O atendimento é para você ou para outra pessoa?" + "\n1.Para Mim | 2.Para outra pessoa");
		quem = ler.nextInt();
		
		if (quem == 1) {
			System.out.println("O que você precisa?" + "\n1.Atendimento Urgente | 2.Saber mais sobre o assunto | "
					+ "3.Locais de Atendimento | 4.Responder questionário de saúde mental");
			precisa = ler.nextInt();
		} else {
			System.out.println("O que você precisa?" + "\n1.Atendimento Urgente | 2.Locais de Atendimento");
			precisa = ler.nextInt();

		}

		if (precisa == 1) {
			System.out.println("Qual tipo de atendimento você prefere?" + "\n1.ONLINE | 2.PRESENCIAL");
			urgente = ler.nextInt();
			System.out.println("Você prefere ser atendido por:" + "\n1.Homem | 2.Mulher");
			profissional = ler.nextInt();

			if (urgente == 1) {
				System.out.println("Aguarde, vamos encaminhar você para um profissional!");
			}

			else if (urgente == 2) {
				System.out.println("Aguarde, vamos encaminhar você para um profissional!\n");

				System.out.println("Qual região de São Paulo a pessoa mora?"
						+ "\n1.Norte | 2.Sul | 3.Leste | 4.Oeste | 5.Sudeste | 6.Centro");
				regiao = ler.nextInt();

				if (regiao == 1) {

				} else if (regiao == 2) {
					System.out.println("\nQual bairro mais próximo de você?"
							+ "\n1.SANTO AMARO | 2.JD SÃO LUIZ | 3.JD SHANGRILA | 4.RIVIERA PAULISTA | 5.CAMPO LIMPO"
							+ "\n6.JD DOM BOSCO | 7.JD LIDIA | 8.BAL. MAR PAULISTA | 9.CIDADE DUTRA | 10. JD PANORAMA"
							+ "\n11.JD PEDREIRA | 12.GRAJAU | 13.JD NOVO HORIZONTE | 14.JD NOVO PARELHEIROS"
							+ "\n15.JD MORUMBI | 16.JD ROSCHEL");
					bairro = ler.nextInt();

					for (int i = 0; i < 50; ++i)
						System.out.println();

					if (bairro == 1) {
						write.msg4();
						end3.santoAmaro();
					}
					if (bairro == 2) {
						write.msg4();
						end3.jdSaoLuiz();
					}
					if (bairro == 3) {
						write.msg4();
						end3.jdShangrila();
					}
					if (bairro == 4) {
						write.msg4();
						end3.rivieraPaulista();
					}
					if (bairro == 5) {
						write.msg4();
						end3.campoLimpo();
					}
					if (bairro == 6) {
						write.msg4();
						end3.jdDomBosco();
					}
					if (bairro == 7) {
						write.msg4();
						end3.jdLidia();
					}
					if (bairro == 8) {
						write.msg4();
						end3.balnearioMarPaulista();
					}
					if (bairro == 9) {
						write.msg4();
						end3.cidadeDutra();
					}
					if (bairro == 10) {
						write.msg4();
						end3.jdPanorama();
					}
					if (bairro == 11) {
						write.msg4();
						end3.JdPedreira();
					}
					if (bairro == 12) {
						write.msg4();
						end3.grajau();
					}
					if (bairro == 13) {
						write.msg4();
						end3.jdNovoHorizonte();
					}
					if (bairro == 14) {
						write.msg4();
						end3.jdNovoParelheiros();
					}
					if (bairro == 15) {
						write.msg4();
						end3.jdMorumbi();
					}

					if (bairro == 16) {
						write.msg4();
						end3.jdRoschel();
					}
					System.out.println(
							"\n" + name + ", uma cópia com essas informações foi enviada para o email: " + email);
				}

				else if (regiao == 3) {
					System.out.println("\nQual bairro mais próximo da pessoa?"
							+ "\n1.SÃO MATEUS | 2.ITAQUERA | 3.ITAIM PAULISTA | 4.GUAIANASES | 5.SÃO MIGUEL"
							+ "\n6.ERMELINO MATARAZZO | 7.JD NÉLIA | 8.CIDADE TIRADENTES | 9.CIDADE LIDER");
					bairro = ler.nextInt();

					for (int i = 0; i < 50; ++i)
						System.out.println();

					if (bairro == 1) {
						write.msg4();
						end.saomateus();
					} else if (bairro == 2) {
						write.msg4();
						end.itaquera();
					} else if (bairro == 3) {
						write.msg4();
						end.itaim();
					} else if (bairro == 4) {
						write.msg4();
						end.guaianases();
					} else if (bairro == 5) {
						write.msg4();
						end.saomiguel();
					} else if (bairro == 6) {
						write.msg4();
						end.ermelino();
					} else if (bairro == 7) {
						write.msg4();
						end.jdnelia();
					} else if (bairro == 8) {
						write.msg4();
						end.cdtiradentes();
					} else if (bairro == 9) {
						write.msg4();
						end.cdlider();
					}
					System.out.println(
							"\n" + name + ", uma cópia com essas informações foi enviada para o email: " + email);

				} else if (regiao == 4) {

				} else if (regiao == 5) {

				} else if (regiao == 6) {
					System.out.println("\nQual bairro mais próximo de você?"
							+ "\n1.CENTRO | 2.BOM RETIRO | 3.BELA VISTA | 4.ACLIMAÇÃO ");
					bairro = ler.nextInt();
					if (bairro == 1) {
						write.msg4();
						end2.centro();
					} else if (bairro == 2) {
						write.msg4();
						end2.bomRetiro();
					} else if (bairro == 3) {
						write.msg4();
						end2.belaVista();
					} else if (bairro == 4) {
						write.msg4();
						end2.aclimacao();
					}
				}
			}
			System.out.println();

		}

		else if (quem == 1 && precisa == 2) {
			for (int i = 0; i < 50; ++i)
				System.out.println();
			System.out.println("Manter a saúde mental não é " + "\ntão simples quanto parece,"
					+ " \nprincipalmente nos dias de hoje. " + "\nSão muitos problemas…");
			System.out.println("===================================\n" + "   ESTRESSE      BRIGAS\n"
					+ "   ATRASOS       ADVERTÊNCIAS\n" + "   DOENÇAS       INCAPACIDADES\n"
					+ "   LIMITAÇÕES    FALTA DE FAMÍLIA\n" + "             (OU EXCESSO DE FAMÍLIA)\n"
					+ "   POUCO DINHEIRO\n" + " (OU MUITO DINHEIRO)   \n" + "             DOENÇAS\n"
					+ "===================================");
			System.out.println("\nDiversos são os fatores que podem influenciar \nnegativamente a nossa saúde mental.");
			System.out.println("\nSaiba mais em: ");

			System.out.println("https://www.einstein.br/saudemental");
		}
		if (precisa == 3) {
			System.out.println("Qual região de São Paulo que você mora?"
					+ "\n1.Norte | 2.Sul | 3.Leste | 4.Oeste | 5.Sudeste | 6.Centro");
			regiao = ler.nextInt();

			if (regiao == 1) {
			} else if (regiao == 2) {
				System.out.println("\nQual bairro mais próximo de você?"
						+ "\n1.SANTO AMARO | 2.JD SÃO LUIZ | 3.JD SHANGRILA | 4.RIVIERA PAULISTA | 5.CAMPO LIMPO"
						+ "\n6.JD DOM BOSCO | 7.JD LIDIA | 8.BAL. MAR PAULISTA | 9.CIDADE DUTRA | 10. JD PANORAMA"
						+ "\n11.JD PEDREIRA | 12.GRAJAU | 13.JD NOVO HORIZONTE | 14.JD NOVO PARELHEIROS"
						+ "\n15.JD MORUMBI | 16.JD ROSCHEL");
				bairro = ler.nextInt();

				for (int i = 0; i < 50; ++i)
					System.out.println();

				if (bairro == 1) {
					end3.santoAmaro();

				}
				if (bairro == 2) {
					end3.jdSaoLuiz();

				}
				if (bairro == 3) {
					end3.jdShangrila();
				}
				if (bairro == 4) {
					end3.rivieraPaulista();
				}
				if (bairro == 5) {
					end3.campoLimpo();

				}
				if (bairro == 6) {
					end3.jdDomBosco();

				}
				if (bairro == 7) {
					end3.jdLidia();

				}
				if (bairro == 8) {
					end3.balnearioMarPaulista();

				}
				if (bairro == 9) {
					end3.cidadeDutra();

				}
				if (bairro == 10) {
					end3.jdPanorama();

				}
				if (bairro == 11) {
					end3.JdPedreira();

				}
				if (bairro == 12) {
					end3.grajau();

				}
				if (bairro == 13) {
					end3.jdNovoHorizonte();

				}
				if (bairro == 14) {
					end3.jdNovoParelheiros();

				}
				if (bairro == 15) {
					end3.jdMorumbi();

				}
				if (bairro == 16) {
					end3.jdRoschel();

				}
			}

			else if (regiao == 3) {
				System.out.println("\nQual bairro mais próximo de você?"
						+ "\n1.SÃO MATEUS | 2.ITAQUERA | 3.ITAIM PAULISTA | 4.GUAIANASES | 5.SÃO MIGUEL"
						+ "\n6.ERMELINO MATARAZZO | 7.JD NÉLIA | 8.CIDADE TIRADENTES | 9.CIDADE LIDER");
				bairro = ler.nextInt();

				for (int i = 0; i < 50; ++i)
					System.out.println();

				if (bairro == 1) {

					end.saomateus();

				}

				if (bairro == 2) {

					end.itaquera();

				}
				if (bairro == 3) {

					end.itaim();

				}
				if (bairro == 4) {

					end.guaianases();

				}
				if (bairro == 5) {

					end.saomiguel();

				}
				if (bairro == 6) {

					end.ermelino();

				}
				if (bairro == 7) {

					end.jdnelia();
				}

				if (bairro == 8) {

					end.cdtiradentes();

				}
				if (bairro == 9) {

					end.cdlider();

				}
			}

			else if (regiao == 4) {
			} else if (regiao == 5) {
			} else if (regiao == 6) {

				System.out.println("\nQual bairro mais próximo de você?"
						+ "\n1.CENTRO | 2.BOM RETIRO | 3.BELA VISTA | 4.ACLIMAÇÃO ");
				bairro = ler.nextInt();

				for (int i = 0; i < 50; ++i)
					System.out.println();

				if (bairro == 1) {

					end2.centro();

				}
				if (bairro == 2) {

					end2.bomRetiro();

				}
				if (bairro == 3) {

					end2.belaVista();

				}
				if (bairro == 4) {

					end2.aclimacao();

				}
			}
			System.out.println("\n" + name + ", uma cópia com essas informações foi enviada para o email: " + email);
		}

		if (precisa == 4) {
			if (quem == 1) {

				System.out.println("Qual região de São Paulo que você mora?"
						+ "\n1.Norte | 2.Sul | 3.Leste | 4.Oeste | 5.Sudeste | 6.Centro");
				regiao = ler.nextInt();

				for (int i = 0; i < 50; ++i)
					System.out.println();

				System.out.println("\n");

				System.out.println("================================================================="
						+ "\n=== RESPONDA AS SEGUINTES PERGUNTAS TENDO O SEGUINTE EM MENTE ==="
						+ "\n=================================================================");

				System.out.println(
						"\nAo longo das duas últimas semanas, quantas vezes você passou pelas seguintes situações");

				System.out.println("\nSentiu pouco interesse ou pouco prazer em fazer as coisas do dia-a-dia?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta1 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println("\nSe sentiu pra baixo ou deprimide?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta2 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println("\nTeve dificuldade para pegar no sono ou não teve uma noite tranquila?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta3 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println("\nSe sentiu cansade ou com pouca energia?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta4 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println("\nTeve falta de apetite ou apetite demais?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta5 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println("\nSe sentiu mal consigo mesmo ou teve sensação de fracasso?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta6 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println(
						"\nSentiu lendidão ao andar ou falar? Ou o oposto, se sentiu mais agitado do que o habitual?"
								+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta7 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println(
						"\nTeve dificuldade para se concentrar nas coisas do dia-a-dia, como ler o jornal ou ver televisão?"
								+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta8 = ler.nextInt();

				System.out.println("\n---------------------------------------------------------------------------");

				System.out.println("\nTeve pensamentos suícidas?"
						+ "\n1.Nunca | 2.Alguns dias | 3.Mais da metade dos dias | 4.Quase todos os dias");
				resposta9 = ler.nextInt();

				somaRespostas = resposta1 + resposta2 + resposta3 + resposta4 + +resposta5 + resposta6 + resposta7
						+ resposta8 + resposta9;

				for (int i = 0; i < 50; ++i)
					System.out.println();

				if (regiao == 1) {
				} else if (regiao == 2) {
					System.out.println("\nQual bairro mais próximo de você?"
							+ "\n1.SANTO AMARO | 2.JD SÃO LUIZ | 3.JD SHANGRILA | 4.RIVIERA PAULISTA | 5.CAMPO LIMPO"
							+ "\n6.JD DOM BOSCO | 7.JD LIDIA | 8.BAL. MAR PAULISTA | 9.CIDADE DUTRA | 10. JD PANORAMA"
							+ "\n11.JD PEDREIRA | 12.GRAJAU | 13.JD NOVO HORIZONTE | 14.JD NOVO PARELHEIROS"
							+ "\n15.JD MORUMBI | 16.JD ROSCHEL");
					bairro = ler.nextInt();

					for (int i = 0; i < 50; ++i)
						System.out.println();

					if (bairro == 1) {
						if (somaRespostas >= 18) { // Daqui inicia São Mateus
							write.msg1();
							end3.santoAmaro();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.santoAmaro();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.santoAmaro(); // até aqui ele cria o laço condicional pro somatório das respostas de
												// Santo
												// Amaro
						}

					}
					if (bairro == 2) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdSaoLuiz();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdSaoLuiz();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdSaoLuiz();
						}

					}
					if (bairro == 3) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdShangrila();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdShangrila();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdShangrila();
						}
					}
					if (bairro == 4) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.rivieraPaulista();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.rivieraPaulista();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.rivieraPaulista();
						}
					}

					if (bairro == 5) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.campoLimpo();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.campoLimpo();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.campoLimpo();
						}

					}
					if (bairro == 6) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdDomBosco();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdDomBosco();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdDomBosco();
						}

					}
					if (bairro == 7) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdLidia();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdLidia();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdLidia();
						}

					}
					if (bairro == 8) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.balnearioMarPaulista();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.balnearioMarPaulista();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.balnearioMarPaulista();
						}

					}
					if (bairro == 9) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.cidadeDutra();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.cidadeDutra();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.cidadeDutra();
						}

					}
					if (bairro == 10) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdPanorama();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdPanorama();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdPanorama();
						}

					}
					if (bairro == 11) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.JdPedreira();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.JdPedreira();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.JdPedreira();
						}

					}
					if (bairro == 12) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.grajau();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.grajau();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.grajau();
						}

					}
					if (bairro == 13) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdNovoHorizonte();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdNovoHorizonte();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdNovoHorizonte();
						}

					}
					if (bairro == 14) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdNovoParelheiros();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdNovoParelheiros();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdNovoParelheiros();
						}

					}
					if (bairro == 15) {

						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdMorumbi();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdMorumbi();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdMorumbi();
						}

					}
					if (bairro == 16) {
						end3.jdRoschel();
						if (somaRespostas >= 18) {
							write.msg1();
							end3.jdRoschel();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end3.jdRoschel();
						} else if (somaRespostas == 9) {
							write.msg3();
							end3.jdRoschel();
						}

					}
				}

				else if (regiao == 3) {
					System.out.println("\nQual bairro mais próximo de você?"
							+ "\n1.SÃO MATEUS | 2.ITAQUERA | 3.ITAIM PAULISTA | 4.GUAIANASES | 5.SÃO MIGUEL"
							+ "\n6.ERMELINO MATARAZZO | 7.JD NÉLIA | 8.CIDADE TIRADENTES | 9.CIDADE LIDER");
					bairro = ler.nextInt();

					for (int i = 0; i < 50; ++i)
						System.out.println();

					if (bairro == 1) {
						if (somaRespostas >= 18) { // Daqui inicia São Mateus
							write.msg1();
							end.saomateus();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.saomateus();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.saomateus(); // até aqui ele cria o laço condicional pro somatório das respostas de São
												// Mateus
						}
					}

					if (bairro == 2) {
						if (somaRespostas >= 18) { // Daqui inicia Itaquera
							write.msg1();
							end.itaquera();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.itaquera();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.itaquera(); // até aqui ele cria o laço condicional pro somatório das respostas de
											// Itaquera
						}
					}
					if (bairro == 3) {
						if (somaRespostas >= 18) { // Daqui inicia Itaim Paulista
							write.msg1();
							end.itaim();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.itaim();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.itaim(); // até aqui ele cria o laço condicional pro somatório das respostas de Itaim
											// Paulista
						}
					}
					if (bairro == 4) {
						if (somaRespostas >= 18) { // Inicia Guaianases aqui
							write.msg1();
							end.guaianases();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.guaianases();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.guaianases(); // ele cria o laço condicional pro somatório das respostas de Guaianases
						}
					}
					if (bairro == 5) {
						if (somaRespostas >= 18) { // Inicia São Miguel
							write.msg1();
							end.saomiguel();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.saomiguel();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.saomiguel(); // ele cria o laço condicional pro somatório das respostas de São Miguel
						}
					}
					if (bairro == 6) {
						if (somaRespostas >= 18) { // Inicia Ermelino
							write.msg1();
							end.ermelino();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.ermelino();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.ermelino(); // ele cria o laço condicional pro somatório das respostas de Ermelino

						}
					}
					if (bairro == 7) {
						if (somaRespostas >= 18) { // Inicia Jardim Nelia
							write.msg1();
							end.jdnelia();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.jdnelia();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.jdnelia(); // ele cria o laço condicional pro somatório das respostas de Jardim Nelia
						}
					}
					if (bairro == 8) {
						if (somaRespostas >= 18) { // Inicia Cidade Tiradentes
							write.msg1();
							end.cdtiradentes();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.cdtiradentes();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.cdtiradentes(); // ele cria o laço condicional pro somatório das respostas de Cidade
												// Tiradentes
						}
					}
					if (bairro == 9) {
						if (somaRespostas >= 18) { // Inicia Cidade Lider
							write.msg1();
							end.cdlider();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end.cdlider();
						} else if (somaRespostas == 9) {
							write.msg3();
							end.cdlider(); // ele cria o laço condicional pro somatório das respostas de Cidade Lider
						}
					}
				} else if (regiao == 4) {
				} else if (regiao == 5) {
				} else if (regiao == 6) {

					System.out.println("\nQual bairro mais próximo de você?"
							+ "\n1.CENTRO | 2.BOM RETIRO | 3.BELA VISTA | 4.ACLIMAÇÃO ");
					bairro = ler.nextInt();

					for (int i = 0; i < 50; ++i)
						System.out.println();

					if (bairro == 1) {
						if (somaRespostas >= 18) { // Daqui inicia Centro

							write.msg1();
							end2.centro();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end2.centro();
						} else if (somaRespostas == 9) {
							write.msg3();
							end2.centro(); // até aqui ele cria o laço condicional pro somatório das respostas de Centro
						}
					}
					if (bairro == 2) {
						if (somaRespostas >= 18) { // Daqui inicia Bom Retiro
							write.msg1();
							end2.bomRetiro();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end2.bomRetiro();
						} else if (somaRespostas == 9) {
							write.msg3();
							end2.bomRetiro(); // até aqui ele cria o laço condicional pro somatório das respostas de Bom
												// Retiro
						}
					}
					if (bairro == 3) {
						if (somaRespostas >= 18) { // Daqui inicia Bela Vista
							write.msg1();
							end2.belaVista();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg2();
							end2.belaVista();
						} else if (somaRespostas == 9) {
							write.msg3();
							end2.belaVista(); // até aqui ele cria o laço condicional pro somatório das respostas de
												// Bela Vista
						}
					}
					if (bairro == 4) {
						if (somaRespostas >= 18) { // Inicia Aclimação aqui
							write.msg1();
							end2.aclimacao();
						} else if (somaRespostas > 9 && somaRespostas < 18) {
							write.msg3();
							end2.aclimacao();
						} else if (somaRespostas == 9) {
							write.msg3();
							end2.aclimacao(); // ele cria o laço condicional pro somatório das respostas de Alcimação
						}
					}
				}
				System.out.println("\n" + name + ", uma cópia com essas informações foi enviada para o email " + email);
			}
		}

		if (quem == 2) {

			System.out.println("Qual região de São Paulo a pessoa mora?"
					+ "\n1.Norte | 2.Sul | 3.Leste | 4.Oeste | 5.Sudeste | 6.Centro");
			regiao = ler.nextInt();

			if (regiao == 1) {

			} else if (regiao == 2) {
				System.out.println("\nQual bairro mais próximo de você?"
						+ "\n1.SANTO AMARO | 2.JD SÃO LUIZ | 3.JD SHANGRILA | 4.RIVIERA PAULISTA | 5.CAMPO LIMPO"
						+ "\n6.JD DOM BOSCO | 7.JD LIDIA | 8.BAL. MAR PAULISTA | 9.CIDADE DUTRA | 10. JD PANORAMA"
						+ "\n11.JD PEDREIRA | 12.GRAJAU | 13.JD NOVO HORIZONTE | 14.JD NOVO PARELHEIROS"
						+ "\n15.JD MORUMBI | 16.JD ROSCHEL");
				bairro = ler.nextInt();

				for (int i = 0; i < 50; ++i)
					System.out.println();

				if (bairro == 1) {
					write.msg4();
					end3.santoAmaro();
				}
				if (bairro == 2) {
					write.msg4();
					end3.jdSaoLuiz();
				}
				if (bairro == 3) {
					write.msg4();
					end3.jdShangrila();
				}
				if (bairro == 4) {
					write.msg4();
					end3.rivieraPaulista();
				}
				if (bairro == 5) {
					write.msg4();
					end3.campoLimpo();
				}
				if (bairro == 6) {
					write.msg4();
					end3.jdDomBosco();
				}
				if (bairro == 7) {
					write.msg4();
					end3.jdLidia();
				}
				if (bairro == 8) {
					write.msg4();
					end3.balnearioMarPaulista();
				}
				if (bairro == 9) {
					write.msg4();
					end3.cidadeDutra();
				}
				if (bairro == 10) {
					write.msg4();
					end3.jdPanorama();
				}
				if (bairro == 11) {
					write.msg4();
					end3.JdPedreira();
				}
				if (bairro == 12) {
					write.msg4();
					end3.grajau();
				}
				if (bairro == 13) {
					write.msg4();
					end3.jdNovoHorizonte();
				}
				if (bairro == 14) {
					write.msg4();
					end3.jdNovoParelheiros();
				}
				if (bairro == 15) {
					write.msg4();
					end3.jdMorumbi();
				}

				if (bairro == 16) {
					write.msg4();
					end3.jdRoschel();
				}

			}

			else if (regiao == 3) {
				System.out.println("\nQual bairro mais próximo da pessoa?"
						+ "\n1.SÃO MATEUS | 2.ITAQUERA | 3.ITAIM PAULISTA | 4.GUAIANASES | 5.SÃO MIGUEL"
						+ "\n6.ERMELINO MATARAZZO | 7.JD NÉLIA | 8.CIDADE TIRADENTES | 9.CIDADE LIDER");
				bairro = ler.nextInt();

				for (int i = 0; i < 50; ++i)
					System.out.println();

				if (bairro == 1) {
					write.msg4();
					end.saomateus();
				} else if (bairro == 2) {
					write.msg4();
					end.itaquera();
				} else if (bairro == 3) {
					write.msg4();
					end.itaim();
				} else if (bairro == 4) {
					write.msg4();
					end.guaianases();
				} else if (bairro == 5) {
					write.msg4();
					end.saomiguel();
				} else if (bairro == 6) {
					write.msg4();
					end.ermelino();
				} else if (bairro == 7) {
					write.msg4();
					end.jdnelia();
				} else if (bairro == 8) {
					write.msg4();
					end.cdtiradentes();
				} else if (bairro == 9) {
					write.msg4();
					end.cdlider();
				}

			} else if (regiao == 4) {

			} else if (regiao == 5) {

			} else if (regiao == 6) {
				System.out.println("\nQual bairro mais próximo de você?"
						+ "\n1.CENTRO | 2.BOM RETIRO | 3.BELA VISTA | 4.ACLIMAÇÃO ");
				bairro = ler.nextInt();

				for (int i = 0; i < 50; i++) {
					System.out.println();
				}
				if (bairro == 1) {
					write.msg4();
					end2.centro();
				} else if (bairro == 2) {
					write.msg4();
					end2.bomRetiro();
				} else if (bairro == 3) {
					write.msg4();
					end2.belaVista();
				} else if (bairro == 4) {
					write.msg4();
					end2.aclimacao();
				}
			}
			System.out.println("\n" + name + ", uma cópia com essas informações foi enviada para o email: " + email);
		}
		
		System.out.println("=============================================================");
		
		System.out.println("\nGostaria de voltar ao início ? \n1-Sim | 2-Não");
		novamente = ler.nextInt();
			
		}while(novamente == 1);
		
		System.out.println("Programa finalizado, obrigade por utilizar o PAND.A!");
		ler.close();
		
		}
}
