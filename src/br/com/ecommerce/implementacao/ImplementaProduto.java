package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.CD;
import br.com.ecommerce.modelo.Livro;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.tela.Magica;

public class ImplementaProduto {

	public static void main(String[] args) {
		
		Produto produto = null;
		char valida;
		do {
			valida = Magica.t("Digite '1' para cadastrar CD." + "\n" + "Digite '2' para cadastrar um Livro.").charAt(0);
			if (valida == '1') {
				produto = new CD(
						Magica.i("Código:"),
						Magica.t("Descrição:"),
						Magica.i("Quantidade:"),
						Magica.f("Valor de Venda:"),
						Magica.f("Valor de Compra"),
						Magica.t("Gravadora:"),
						Magica.t("Artista:"));
			}
			else if (valida == '2') {
				produto = new Livro(
						Magica.i("Código:"),
						Magica.t("Descrição:"),
						Magica.i("Quantidade:"),
						Magica.f("Valor de Venda:"),
						Magica.f("Valor de Compra"),
						Magica.t("Editora:"),
						Magica.t("Autor:"));
			}
			else {
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
			System.out.println(produto.getAll());
			System.out.println("---------------------------------");
		}while((JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro produto?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION)) == 0);		
	}

}
