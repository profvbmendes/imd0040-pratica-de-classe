package br.imd.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.imd.modelo.Vendedor;

public class VendedorRepository {

	public static final VendedorRepository INSTANCE;
	
	private Map<String, Vendedor> vendedores;
	
	static {
		INSTANCE = new VendedorRepository();
	}
	
	private VendedorRepository() {
		this.vendedores = new HashMap<>();
	}
	
	public static VendedorRepository getInstance() {
		return INSTANCE;
	}
	
	public void adicionarVendedor(Vendedor vendedor) {
		this.vendedores.putIfAbsent(vendedor.getCnpj(), vendedor);
	}
	
	public Optional<Vendedor> obterVendedorPorCnpj(String cnpj) {
		return Optional.ofNullable(vendedores.get(cnpj));
	}
	
}
