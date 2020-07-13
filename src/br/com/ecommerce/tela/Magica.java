package br.com.ecommerce.tela;
import javax.swing.JOptionPane;

public class Magica {
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog
	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog convertendo para int
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog convertendo para float
	public static Float f(String msg) {
		return Float.parseFloat(t(msg));
	}

}
