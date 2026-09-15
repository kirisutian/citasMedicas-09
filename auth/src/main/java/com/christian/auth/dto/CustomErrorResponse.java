package com.christian.auth.dto;

public record CustomErrorResponse(
        int codigo,
        String mensaje
) { }

