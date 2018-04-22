package matematica;

import view.Calculadora;

public class Calculos {
	
	public double somar(double n1, double n2) {
		double resultado = n1+n2;
		return resultado;
	}

	public double subtrair(double n1, double n2) {
		double resultado = n1-n2;
		return resultado;
	}
	
	public double multiplicar(double n1, double n2) {
		double resultado = n1*n2;
		return resultado;
	}
	
	public double dividir(double n1, double n2) {
		double resultado = n1/n2;
		return resultado;
	}
	
	public double raizQ(double n1) {
		double resultado = Math.sqrt(n1);
		return resultado;
	}
	
	public double reciproco(double n1) {
		double resultado = 1/n1;
		return resultado;
	}
	
	public double inverter(double n1) {
		double resultado = n1*(-1);
		return resultado;
	}
	
	public double porcentagem(double n1, double n2) {
		double resultado = n1*(n2/100);
		return resultado;
		
	}
	

}

