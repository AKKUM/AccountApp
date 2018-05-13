package com.account.connector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class AccountsConnectorTest {
	String deleteFile = "{\"Reason\":\"File Could not delete\"}";
	String addSuucess ="{\"Reason\":\"Successfully added account\"}";
	String removeSuucess ="{\"Reason\":\"Successfully removed account\"}";
	String removeFail ="{\"Reason\":\"Account Not found\"}";
	
	@Test
	public void getAllAccountsSuccess() throws IOException {
		
	}
	
	@Test
	public void getAllAccountsFailed() throws IOException {
		
	}

	@Test
	public void getAddAccountsSuccess() throws IOException	{
		
	}
	@Test
	public void getAddAccountsFailed() throws IOException {
		
	}
	
	@Test
	public void deleteAccountsSuccess() throws IOException{

	}
	
	@Test
	public void deleteAccountsAccountNOTFound() throws IOException{

	}
	
	@Test
	public void deleteAccountsFailed() throws IOException{

	}


}
