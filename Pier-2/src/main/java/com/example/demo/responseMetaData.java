package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class responseMetaData {

	private String statusDesc;
	private String conversationId;
	private String refId;
	private String operation;
	private String version;
	private String statusCode;

}
