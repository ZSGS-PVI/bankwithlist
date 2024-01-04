package com.digitalbanking.userview_pannel.Repository;

import java.util.ArrayList;
import java.util.List;

import com.digitalbanking.userview_pannel.bank.model.AccountHolder;


public class BankRepository {


	private static BankRepository  repository;

	private List<AccountHolder> accountHolderList = new ArrayList<AccountHolder>();

	private BankRepository() {

	}

	public static BankRepository getInstance() {
		if (repository == null) {
			repository = new BankRepository();
		}
		return repository;
	}

	// 1.add
	public void insertStudent(AccountHolder accountholder) {
		accountHolderList.add( accountholder);
	}
	
	public List<AccountHolder> getAccountholder(){
		return accountHolderList;
	}

}
