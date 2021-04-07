package br.imd.repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import br.imd.modelo.Produto;

public class ProdutoRepository {

	public static final ProdutoRepository INSTANCE;

	private Map<UUID, Produto> todosOsProdutos;

	private Map<String, Map<UUID, Produto>> produtosPorVendedor;

	static {
		INSTANCE = new ProdutoRepository();
	}

	private ProdutoRepository() {
		this.todosOsProdutos = new HashMap<>();
		this.produtosPorVendedor = new HashMap<>();
	}

	public static ProdutoRepository getInstance() {
		return INSTANCE;
	}

	public boolean adicionarProduto(String cnpjVendedor, Produto produto) {
		Map<UUID, Produto> catalogoVendedor = produtosPorVendedor.computeIfAbsent(cnpjVendedor,
				cnpj -> new HashMap<>());

		return todosOsProdutos.putIfAbsent(produto.getCodigo(), produto) == null
				&& catalogoVendedor.putIfAbsent(produto.getCodigo(), produto) == null;
	}

	public Optional<Produto> obterProdutoPorCodigo(UUID codigo) {
		return Optional.ofNullable(todosOsProdutos.get(codigo));
	}

	public Collection<Produto> obterProdutosPorVendedor(String cnpjVendedor) {
		Map<UUID, Produto> catalogoVendedor = produtosPorVendedor.get(cnpjVendedor);
		if (catalogoVendedor == null) {
			return Collections.emptyList();
		} else {
			return catalogoVendedor.values();
		}
	}

}
