package com.controle.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.controle.entities.Ligacao;

	public interface LigacaoRepository extends JpaRepository<Ligacao, Long> {
	
}
