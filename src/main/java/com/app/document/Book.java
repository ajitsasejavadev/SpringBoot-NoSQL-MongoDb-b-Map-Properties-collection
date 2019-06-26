package com.app.document;

import java.util.Map;
import java.util.Properties;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	
	
	private String id;  //UUID
	
	private Integer bookId;
	private String bookCode;
	private String bookAuth;
	private Double bookCost;
	
	//collection type variable
	
	private Map<String, String> codes;
	private Properties grades;
	
	public Book() {
		super();
	}

	public Book(Integer bookId, String bookCode, String bookAuth, Double bookCost, Map<String, String> codes,
			Properties grades) {
		super();
		this.bookId = bookId;
		this.bookCode = bookCode;
		this.bookAuth = bookAuth;
		this.bookCost = bookCost;
		this.codes = codes;
		this.grades = grades;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookAuth() {
		return bookAuth;
	}

	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}

	public Map<String, String> getCodes() {
		return codes;
	}

	public void setCodes(Map<String, String> codes) {
		this.codes = codes;
	}

	public Properties getGrades() {
		return grades;
	}

	public void setGrades(Properties grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookId=" + bookId + ", bookCode=" + bookCode + ", bookAuth=" + bookAuth
				+ ", bookCost=" + bookCost + ", codes=" + codes + ", grades=" + grades + "]";
	}
	
}
