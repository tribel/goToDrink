package com.gobuhat.tribel.beans;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class MessageBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private final String nameRequired = "���� ����� �� ����� ���� ������!";
	private final String telephoneRequired = "������� ������������ ����!";
	private final String dateRequired = "����� ������ ����������� ��� ����������!";
	private final String addressRequired = "���� ������ �� ����� ���� ������!";
	
	public String getNameRequired() {
		return nameRequired;
	}
	public String getTelephoneRequired() {
		return telephoneRequired;
	}
	public String getDateRequired() {
		return dateRequired;
	}
	public String getAddressRequired() {
		return addressRequired;
	}
	
	
}