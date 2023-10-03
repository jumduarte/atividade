package com.controle.service;
	
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.entities.Agenda;
import com.controle.repository.AgendaRepository;

	@Service
	public class AgendaServices {
		
		private final AgendaRepository agendaRepository;
		
		@Autowired 
		public AgendaServices(AgendaRepository agendaRepository) {
			this.agendaRepository = agendaRepository;
		}
		
		public List<Agenda> buscaTodasAgendas(){
			return agendaRepository.findAll();
		}
		
		public Agenda buscaAgendaId(Long id) {
			Optional <Agenda> agenda = agendaRepository.findById(id);
			return agenda.orElse(null);
		}
		
		public Agenda salvaAgenda(Agenda produto) {
			return agendaRepository.save(produto);
		}
		
		public Agenda alterarAgenda(Long id, Agenda alterarProd) {
			Optional <Agenda> existeAgenda = agendaRepository.findById(id);
			if(existeAgenda.isPresent()) {
				alterarProd.setId(id);
				return agendaRepository.save(alterarProd);
			}
			return null;
		}
		
		public boolean apagarProduto(Long id) {
			Optional <Agenda> existeAgenda = agendaRepository.findById(id);
			if (existeAgenda.isPresent()) {
				agendaRepository.deleteById(id);
				return true;
			}
			return false;
		}

	}