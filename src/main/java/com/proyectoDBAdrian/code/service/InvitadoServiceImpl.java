package com.proyectoDBAdrian.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoDBAdrian.code.model.Invitado;
import com.proyectoDBAdrian.code.repository.InvitadoRepository;

@Service
public class InvitadoServiceImpl implements InvitadoService {
	
	@Autowired
	private InvitadoRepository invitadoRepository;

	@Override
	public List<Invitado> obtenerListaInvitados() {
		return invitadoRepository.findAll();
	}
	
}
