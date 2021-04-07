package br.imd.controller;

import java.util.Optional;

import br.imd.modelo.Comprador;
import br.imd.modelo.Produto;
import br.imd.modelo.Vendedor;
import br.imd.repository.CompradorRepository;
import br.imd.repository.ProdutoRepository;
import br.imd.repository.VendedorRepository;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class TelaPrincipalController {

	@FXML
	private TextField cpfField;

	@FXML
	private TextField cnpjField;

	@FXML
	private ComboBox<Produto> produtosSelect;

	@FXML
	private Label nomeComprador;

	@FXML
	private Label nomeVendedor;

	@FXML
	public void initialize() {
		this.cpfField.focusedProperty().addListener(this::cpfFocusChanged);
		this.cnpjField.focusedProperty().addListener(this::cnpjFocusChanged);
		this.produtosSelect.setOnAction((event) -> {
			
			System.out.println(this.produtosSelect.getSelectionModel().getSelectedItem().getNome());
		});
	}

	@FXML
	private void handleAtualizarButtonClicked(MouseEvent event) {
	}

	private void cpfFocusChanged(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
		if (!newValue) { // onBlur
			nomeComprador.setText(CompradorRepository.getInstance().obterCompradorPorCpf(cpfField.getText())
					.map(Comprador::getNome).orElse("Comprador não encontrado!"));
		} else {
			nomeComprador.setText("Informe o CPF do comprador");
		}
	}

	private void cnpjFocusChanged(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
		if (!newValue) {
			Optional<Vendedor> vendedorOpt = VendedorRepository.getInstance().obterVendedorPorCnpj(cnpjField.getText());
			nomeVendedor.setText(vendedorOpt.map(Vendedor::getNome).orElse("Vendedor não encontrado!"));
			vendedorOpt.ifPresent(vendedor -> {
				this.produtosSelect.getItems()
						.addAll(ProdutoRepository.getInstance().obterProdutosPorVendedor(vendedor.getCnpj()));

			});
		} else {
			nomeVendedor.setText("Informe o CNPJ do vendedor");
		}
	}

}
