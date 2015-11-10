package com.av.webapp.springhibernate.model;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class SampleObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5234186024126622448L;

	private String item1;
	private String item2;

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

}
