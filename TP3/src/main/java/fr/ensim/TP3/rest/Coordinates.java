package fr.ensim.TP3.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Coordinates(String type, Coordinates value) {
}
