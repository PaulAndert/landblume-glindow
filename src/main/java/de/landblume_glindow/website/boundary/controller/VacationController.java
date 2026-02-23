package de.landblume_glindow.website.boundary.controller;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import de.landblume_glindow.website.boundary.dto.VacationDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import de.landblume_glindow.website.boundary.endpoints.VacationEndpoints;

public interface VacationController {
    String USECASE = "Vacation";

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Active vacations were successfully loaded.",
                content = {
                    @Content(
                        mediaType = "application/json", 
                        schema = @Schema(implementation = VacationDto.class)
                    )
                }
            ),
            @ApiResponse(
                responseCode = "400",
                description = "Bad request. The request parameters are invalid.",
                content = @Content
            ),
            @ApiResponse(
                responseCode = "401",
                description = "Unauthorized. Authentication is required or invalid.",
                content = @Content
            ),
            @ApiResponse(
                responseCode = "403",
                description = "Forbidden. The client does not have permission to access this resource.",
                content = @Content
            ),
            @ApiResponse(
                responseCode = "404",
                description = "Not found. No active vacations were found.",
                content = @Content
            ),
            @ApiResponse(
                responseCode = "405",
                description = "Method not allowed. The HTTP method is not supported for this endpoint.",
                content = @Content
            ),
            @ApiResponse(
                responseCode = "500",
                description = "Internal server error. An unexpected error occurred while loading active vacations.",
                content = @Content
            )
        }
    )
    @Tag(name = USECASE)
    @Operation(summary = "Load all active vacations", description = "Retrieves all vacations for which the current date is between the start and end dates.")
    @GetMapping(value = VacationEndpoints.VACATION_LOAD_ACTIV, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<VacationDto>> loadActiveVacations();

}