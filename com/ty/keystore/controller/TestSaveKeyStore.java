package com.ty.keystore.controller;

import com.ty.keystore.dao.KeyStoreDao;
import com.ty.keystore.dto.KeyStore;

public class TestSaveKeyStore {
public static void main(String[] args) {
	KeyStore keyStore=new KeyStore();
	keyStore.setKeyid(3);
	keyStore.setComment("personal account");
	keyStore.setDescription("instagram");
	keyStore.setKey("tej@mail.com");
	keyStore.setValue("64646@shg");
	keyStore.setId(1);
	KeyStoreDao dao=new KeyStoreDao();
	int result=dao.saveKeyStore(keyStore);
	if(result>0)
	{
		System.out.println("Query saved");
	}
	else
	{
		System.out.println("Query not saved");
	}
}
}
