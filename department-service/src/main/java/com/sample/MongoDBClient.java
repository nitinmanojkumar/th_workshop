package com.sample;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;

public class MongoDBClient {

	public static void main(String[]args) {
		
		
		MongoClient mongoclient=MongoClients.create();
		
		MongoIterable<String> dbnames=mongoclient.listDatabaseNames();
		for(String name:dbnames) {
			System.out.println(name);
		}
		
	}
	
	
}
