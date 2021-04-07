package br.imd;

import java.io.IOException;
import java.math.BigDecimal;

import br.imd.modelo.Comprador;
import br.imd.modelo.Produto;
import br.imd.modelo.Vendedor;
import br.imd.repository.CompradorRepository;
import br.imd.repository.ProdutoRepository;
import br.imd.repository.VendedorRepository;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application {

	private Stage primeiro;
	
	private BorderPane tlPrincipal;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		primeiro = primaryStage;
		primeiro.setTitle("Sistema de vendas");
		initData();
		initPrincipal();
	}

	private void initData() {
		CompradorRepository.getInstance().adicionarComprador(new Comprador("11111111111", "Comprador 1", new BigDecimal("100")));
		CompradorRepository.getInstance().adicionarComprador(new Comprador("22222222222", "Comprador 2", new BigDecimal("200")));
		CompradorRepository.getInstance().adicionarComprador(new Comprador("33333333333", "Comprador 3", new BigDecimal("300")));
		CompradorRepository.getInstance().adicionarComprador(new Comprador("44444444444", "Comprador 4", new BigDecimal("400")));
		

		Vendedor lojaRoupas = new Vendedor("11111111111", "Loja de roupas", new BigDecimal("100"));
		Vendedor otica = new Vendedor("22222222222", "Ótica", new BigDecimal("200"));
		Vendedor lanchonete = new Vendedor("33333333333", "Lanchonete", new BigDecimal("300"));
		VendedorRepository.getInstance().adicionarVendedor(lojaRoupas);
		VendedorRepository.getInstance().adicionarVendedor(otica);
		VendedorRepository.getInstance().adicionarVendedor(lanchonete);
		
		Produto camisa = new Produto("Camisa", new BigDecimal("50"));
		Produto bermuda = new Produto("Bermuda", new BigDecimal("100"));
		Produto calca = new Produto("Calca", new BigDecimal("150"));
		Produto cinto = new Produto("Cinto", new BigDecimal("25"));

		ProdutoRepository.getInstance().adicionarProduto(lojaRoupas.getCnpj(), camisa);
		ProdutoRepository.getInstance().adicionarProduto(lojaRoupas.getCnpj(), bermuda);
		ProdutoRepository.getInstance().adicionarProduto(lojaRoupas.getCnpj(), calca);
		ProdutoRepository.getInstance().adicionarProduto(lojaRoupas.getCnpj(), cinto);
		
		Produto oculosGrau = new Produto("Óculos de grau", new BigDecimal("500"));
		Produto oculosSol = new Produto("Óculos de sol", new BigDecimal("200"));
		

		ProdutoRepository.getInstance().adicionarProduto(otica.getCnpj(), oculosGrau);
		ProdutoRepository.getInstance().adicionarProduto(otica.getCnpj(), oculosSol);
		
		Produto sanduiche = new Produto("Sanduíche", new BigDecimal("5"));
		Produto suco = new Produto("Suco", new BigDecimal("1"));
		Produto salgado = new Produto("Salgado", new BigDecimal("1"));
		Produto chocolate = new Produto("Chocolate", new BigDecimal("1"));
		Produto chiclete = new Produto("Chiclete", new BigDecimal("0.5"));

		ProdutoRepository.getInstance().adicionarProduto(lanchonete.getCnpj(), sanduiche);
		ProdutoRepository.getInstance().adicionarProduto(lanchonete.getCnpj(), suco);
		ProdutoRepository.getInstance().adicionarProduto(lanchonete.getCnpj(), salgado);
		ProdutoRepository.getInstance().adicionarProduto(lanchonete.getCnpj(), chocolate);
		ProdutoRepository.getInstance().adicionarProduto(lanchonete.getCnpj(), chiclete);
	}

	private void initPrincipal() {
		try {
			// Carrega o arquivo fxml.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("visao/TelaPrincipal.fxml"));
			tlPrincipal = (BorderPane) loader.load();
			
			// Mostra a scene (cena) contendo o layout.
			Scene scene = new Scene(tlPrincipal);
			primeiro.setScene(scene);
			primeiro.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
