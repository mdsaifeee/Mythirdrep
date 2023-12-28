package com.bank.app.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.app.dao.BankDao;
import com.bank.app.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bdao;
	public String addbankdetails(List<Bank> b) {
		return bdao.addbankdetails(b);
	}
	public Bank getonebank( int id) {
		return bdao.getonebank(id);
	}
	public String updateonebank(Bank b) {
		return bdao.updateonebank(b);
	}
	public String removeonebank(int id) {
		return bdao.removeonebank(id);
	}
	public List<Bank> getallbank() {
		return bdao.getallbank();
	}
	public String getbranchbyifsc(String ifsc) {
		return bdao.getbranchbyifsc(ifsc);
	}
}
