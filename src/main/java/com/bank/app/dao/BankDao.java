package com.bank.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.app.entity.Bank;
import com.bank.app.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository brepo;
	public String addbankdetails(List<Bank> b) {
		brepo.saveAll(b);
		return "Successfully Added";
	}
	public Bank getonebank( int id) {
		return brepo.findById(id).get();
	}
	public String updateonebank(Bank b) {
		brepo.save(b);
		return "Successfully Updated";
	}
	public String removeonebank(int id) {
		brepo.deleteById(id);
		return "Successfully Deleted";
	}
	public List<Bank> getallbank() {
		return brepo.findAll();
	}
	public String getbranchbyifsc(String ifsc) {
		return brepo.getbranchbyifsc(ifsc);
	}
}
