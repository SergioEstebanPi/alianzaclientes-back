package com.alianza.adminclientes.models;

import java.util.Date;

public class Cliente {

	private Long id;
	private String shared_key;
	private String business_id;
	private String email;
	private String phone;
	private Date date_added;

	public void prePersist() {
		date_added = new Date();
	}

	public Cliente() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSharedKey() {
		return shared_key;
	}

	public void setSharedKey(String nombre) {
		this.shared_key = nombre;
	}

	public String getBusinessId() {
		return business_id;
	}

	public void setBusinessId(String business_id) {
		this.business_id = business_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateAdded() {
		return date_added;
	}

	public void setDateAdded(Date createAt) {
		this.date_added = createAt;
	}

}
