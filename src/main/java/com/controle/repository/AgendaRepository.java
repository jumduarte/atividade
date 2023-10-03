package com.controle.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.entities.Agenda;

	public interface AgendaRepository extends JpaRepository<Agenda, Long> {
		
	}

