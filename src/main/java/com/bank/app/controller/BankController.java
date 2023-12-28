package com.bank.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.bank.app.entity.Bank;
import com.bank.app.service.BankService;

@RestController
@RequestMapping(value="/admin")
public class BankController {
	@Autowired 
	BankService bser;
	@PostMapping(value="/addbankdetails")
	public String addbankdetails(@RequestBody List<Bank> b) {
		return bser.addbankdetails(b);
	}
	@GetMapping(value="/getonebank/{id}")
	public Bank getonebank(@PathVariable int id) {
		return bser.getonebank(id);
	}
	@GetMapping(value="/getallbank")
	public List<Bank> getallbank() {
		return bser.getallbank();
	}
	@PutExchange(value="/updateonebank")
	public String updateonebank(@RequestBody Bank b) {
		return bser.updateonebank(b);
	}
	@DeleteMapping(value="/removeonebank/{id}")
	public String removeonebank(@PathVariable int id) {
		return bser.removeonebank(id);
	}
	@GetMapping(value="/getbranchbyifsc/{ifsc}")
	public String getbranchbyifsc(@PathVariable String ifsc) {
		return bser.getbranchbyifsc(ifsc);
	}
}
