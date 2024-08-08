package com.moraes.mockapi.api.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Slf4j
@Service
public class JsonFileService {

	private final ObjectMapper objectMapper;

	public JsonFileService(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@SneakyThrows
	public Map<String, Object> loadJsonAsMap(String fileName) {
		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
			if (inputStream == null) {
				throw new IllegalArgumentException("File not found: " + fileName);
			}
			return objectMapper.readValue(inputStream, new TypeReference<>() {
			});
		} catch (IOException e) {
			log.error("Error loading JSON file: {}", fileName, e);
			throw e;
		}
	}
}
