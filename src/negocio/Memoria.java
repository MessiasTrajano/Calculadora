package negocio;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Memoria {

	private String conta = "";
	private ArrayList<String> sinais;
	private String sinal;


	private double saida = 0;

	public Memoria() {
		sinais = new ArrayList<String>();
		sinais.add("+");
		sinais.add("-");
		sinais.add("*");
		sinais.add("/");
	}

	public double[] getNumeros() {

		String[] partes = conta.split(Pattern.quote(sinal));
		double[] numero = new double[2];

		for(int i = 0; i < partes.length; i++) {
			numero[i] = Double.parseDouble(partes[i]);
		}
		return numero;
	}
	
//	primeiraParte operação segundaParte =  resultado
	//[1,2,3,4,5,6]
	public void setNumero(String operacao) {

		if(operacao.equals("=")) {
			saida = calcular();

		} else if(sinais.contains(operacao)) {
			sinal = operacao;
		}
			conta = conta + operacao;

	}
	public double calcular(){
		double[] numero = new double[2];
		numero= getNumeros();

		double parte1 = numero[0];
		double parte2 = numero[1];

		if(sinal.equals("+")) {
			return parte1 + parte2;

		} else if (sinal.equals("-")) {
			return parte1 - parte2;

		} else if (sinal.equals("*")) {
			return parte1 * parte2;

		} else if (sinal.equals("/")) {
			if (parte2 == 0) {

				return 0;
			}
			return parte1 / parte2;
		}else{
			return 0;
		}
	}
	public String resultado(){
		if(saida == 0) {
			return "";
		}
		else{
			return "" + saida;
		}

	}

	public void limpar(){
		saida = 0;
		conta = "";

	}
}
