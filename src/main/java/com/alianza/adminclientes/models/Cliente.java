package com.alianza.adminclientes.models;

public class Cliente {

	private int id;
	private String shared_key;
	private String business_id;
	private String email;
	private String phone;
	private String date_added;

	public Cliente() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSharedKey() {
		return shared_key;
	}

	public void setSharedKey(String shared_key) {
		this.shared_key = shared_key;
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

	public String getDateAdded() {
		return date_added;
	}

	public void setDateAdded(String date_added) {
		this.date_added = date_added;
	}

}
