package com.christian.msv.citas.service;

import com.christian.commons.service.CrudService;
import com.christian.msv.citas.dto.CitaRequest;
import com.christian.msv.citas.dto.CitaResponse;

public interface CitaService extends CrudService<CitaRequest, CitaResponse> {

    void actualizarEstadoCita(Long idCita, Long idEstadoCita);
}
