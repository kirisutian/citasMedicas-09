package com.christian.commons.dto;

public record CustomErrorResponse(
        int codigo,
        String mensaje
) {}