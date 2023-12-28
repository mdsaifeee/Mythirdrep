package com.bank.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bank.app.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value="select branch from bank where ifsc = ?",nativeQuery=true)
	public String getbranchbyifsc(String ifsc);
}
