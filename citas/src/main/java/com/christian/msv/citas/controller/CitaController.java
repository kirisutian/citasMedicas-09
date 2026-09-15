package com.christian.msv.citas.controller;

import com.christian.commons.controller.CrudController;
import com.christian.msv.citas.dto.CitaRequest;
import com.christian.msv.citas.dto.CitaResponse;
import com.christian.msv.citas.service.CitaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Tag(name = "API Citas", description = "Métodos para la gestión de citas")
public class CitaController extends CrudController<CitaRequest, CitaResponse, CitaService> {

    public CitaController(CitaService service) {
        super(service);
    }

    @Operation(
            summary = "Actualizar estado de la cita",
            description = "Actualiza el estado de una cita utilizando " +
                    "el identificador de la cita y el identificador del nuevo estado."
    )
    @PatchMapping("/{idCita}/estado/{idEstado}")
    public ResponseEntity<Void> actualizarEstadoCita(
            @PathVariable @Positive(message = "El idCita debe ser positivo") Long idCita,
            @PathVariable @Positive(message = "El idEstado debe ser positivo") Long idEstado) {

        service.actualizarEstadoCita(idCita, idEstado);
        return ResponseEntity.noContent().build();
    }
}
