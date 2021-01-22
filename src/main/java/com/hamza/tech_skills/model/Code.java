package com.hamza.tech_skills.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(	name = "codeTable", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "code"),
		})
public class Code {
/*
public class HelloWorld {
  public static void main(String[] arg){
    System.out.println("Hello world");
  }
}
*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String code;

	public Code() {
	}

	public Code(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
