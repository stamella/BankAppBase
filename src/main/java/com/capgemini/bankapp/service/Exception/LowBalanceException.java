package com.capgemini.bankapp.service.Exception;

public class LowBalanceException extends Exception {
	public LowBalanceException(String message) {
		super(message);
	}

}
