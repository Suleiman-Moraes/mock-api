package com.moraes.mockapi.api.controller;

import com.moraes.mockapi.api.service.JsonFileService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping
@AllArgsConstructor
public class MockController {

	private final JsonFileService jsonFileService;

	@GetMapping("/api")
	public ResponseEntity<Map<String, Object>> test() {
		final URI swagger = ServletUriComponentsBuilder.fromCurrentRequest().path("/swagger-ui/index.html").build()
				.toUri();
		return ResponseEntity.ok(Map.of("result", "Test Successfully", "swagger", swagger.toString(), "test",
				jsonFileService.loadJsonAsMap("test.json")));
	}
}
