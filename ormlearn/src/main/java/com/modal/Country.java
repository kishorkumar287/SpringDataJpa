package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	@Id
	private String co_code;
	private String co_name;
	public Country() {
		super();
	}
	public Country(String co_code, String co_name) {
		super();
		this.co_code = co_code;
		this.co_name = co_name;
	}
	public String getCo_code() {
		return co_code;
	}
	public void setCo_code(String co_code) {
		this.co_code = co_code;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	@Override
	public String toString() {
		return "Country [co_code=" + co_code + ", co_name=" + co_name + "]";
	}
}
