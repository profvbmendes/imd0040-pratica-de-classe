package br.imd.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.imd.modelo.Comprador;

public class CompradorRepository {

	public static final CompradorRepository INSTANCE;
	
	private Map<String, Comprador> compradores;
	
	static {
		INSTANCE = new CompradorRepository();
	}
	
	private CompradorRepository() {
		this.compradores = new HashMap<>();
	}
	
	public static CompradorRepository getInstance() {
		return INSTANCE;
	}
	
	public void adicionarComprador(Comprador comprador) {
		this.compradores.putIfAbsent(comprador.getCpf(), comprador);
	}
	
	public Optional<Comprador> obterCompradorPorCpf(String cpf) {
		return Optional.ofNullable(compradores.get(cpf));
	}
	
}
