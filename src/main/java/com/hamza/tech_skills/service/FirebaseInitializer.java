package com.hamza.tech_skills.service;

import java.io.IOException;
import java.io.InputStream;

//import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
//7StRpMpGVhGnFjM85uYt

@Service
public class FirebaseInitializer {

	private void initDB() throws IOException{
		InputStream serviceAccount = this.getClass().getClassLoader().getResourceAsStream("./tech-skills-ae7a8-firebase-adminsdk-u8gev-efc6d5c2cd.json");
		
				FirebaseOptions options = new FirebaseOptions.Builder()
		  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
		  .build();
				
		if(FirebaseApp.getApps().isEmpty()) {
			FirebaseApp.initializeApp(options);
		}
	}
	
	public Firestore getFirebase() {
		return FirestoreClient.getFirestore();
	}
}
