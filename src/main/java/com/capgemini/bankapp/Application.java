package com.capgemini.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.bankapp.config.AppConfig;
import com.capgemini.bankapp.controller.BankAccountController;
import com.capgemini.bankapp.service.Exception.LowBalanceException;

public class Application {
	public static void main(String args[]) throws LowBalanceException {
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		BankAccountController bankAccountController = context.getBean("bankAccountController",BankAccountController.class);
		System.out.println(bankAccountController.getBalance(1234));
		System.out.println(bankAccountController.withdraw(2272,5000));	
		System.out.println(bankAccountController.deposit(3990,1000));	
		System.out.println(bankAccountController.fundTransfer(1234,2272,2000));
	}

}
