package com.account.connector;

import java.io.IOException;
import java.util.List;

import com.account.model.Account;
import com.account.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;



public class AccountsConnector {
	private JsonUtil jsUtil; 
	
	public AccountsConnector(String fileName) {
		// TODO Auto-generated constructor stub
		this.jsUtil= new JsonUtil(fileName);
	}

	public List<Account> getAllAccounts() throws IOException {
		String jsonData =jsUtil.getJsonString();

    	ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	
		TypeReference<List<Account>> mapType = new TypeReference<List<Account>>() {};
		System.out.println("What is json data "+ jsonData );
    	List<Account> jsonToAccountList = objectMapper.readValue(jsonData, mapType);
    	
    	return jsonToAccountList;
	}

}
