package com.company.engineering.tools.system;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class PingTool {

	@Tool(
		name = "engineering_ping",
		description = "Checks whether the Engineering MCP server is running."
	)
	public String ping() {
		return "Pong from Engineering MCP";
	}
}