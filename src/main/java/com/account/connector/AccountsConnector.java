package com.account.connector;

import java.io.IOException;
import java.util.List;

import com.account.model.Account;
import com.account.util.JsonUtil;



public class AccountsConnector {
	private JsonUtil jsUtil; 
	
	public AccountsConnector(String fileName) {
		// TODO Auto-generated constructor stub
		this.jsUtil= new JsonUtil(fileName);
	}

	public List<Account> getAllAccounts() throws IOException {
		return null;
	}

}
