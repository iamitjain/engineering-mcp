package com.company.engineering.tools.system;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class VersionTool {

	@Value("${spring.application.name}")
	private String applicationName;

	@Tool(
		name = "engineering_version",
		description = "Returns Engineering MCP version."
	)
	public Map<String, Object> version() {

		Map<String, Object> result = new LinkedHashMap<>();

		result.put("application", applicationName);
		result.put("version", "1.0.0");
		result.put("java", System.getProperty("java.version"));

		return result;
	}
}