package com.ty.keystore.dto;

public class KeyStore {
	private int keyid;
	private String comment;
	private String description;
	private String key;
	private String value;
	private int id;
	public int getKeyid() {
		return keyid;
	}
	public void setKeyid(int keyid) {
		this.keyid = keyid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "KeyStore [keyid=" + keyid + ", comment=" + comment + ", description=" + description + ", key=" + key
				+ ", value=" + value + ", id=" + id + "]";
	}

}
