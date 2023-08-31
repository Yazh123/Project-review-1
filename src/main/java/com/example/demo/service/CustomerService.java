package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo mr;
	
	public Customer savecustomerinfo(Customer m)
	{
		return mr.save(m);
	}
	public List<Customer> savecustomerdetails(List<Customer> m)
	{
		return (List<Customer>)mr.saveAll(m);
	}
	
	public List<Customer> showcustomerinfo(){
		return mr.findAll();
	}
	
	public Customer changecustomerinfo(Customer m)
	{
		return mr.saveAndFlush(m);
	}
	
	public void deletecustomer() {
		mr.deleteAll();
	}
	public void deletecustomeroid(int id)
	{
		mr.deleteById(id);
	}
	
	public Optional<Customer> getcustomerid(int id){
		return mr.findById(id);
	}
	
	public String updatecustomerbyid(int id,Customer m) {
		mr.saveAndFlush(m);
		if(mr.existsById(id)) {
			return "Your updation has been recieved ";
		}
		else {
			return "Please Enter a valid Id";
		}
	}
	
	public List<Customer> getbypage(int pgno,int pgsize, String s){
    	Page<Customer> p= mr.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.ASC,s)));
    	return p.getContent();
    }
    
	public List<Customer> getcusts(int o){
	   	return mr.getcustbyid(o);
	   }
	   
	   public List<Customer> getname (int o, String name){
	   	return mr.getcustbyParam(o,name);
	   }
	   
	  public Integer deleteDetails(int s1) {
			  return mr.deletecust(s1);
		  }
	   
	  public Integer updateDetailsdq(int s,int s1) {
		  return mr.updatecustdq(s, s1);
	  }
	  
	  public Integer updateDetailssq(int s,int s1) {
		  return mr.updatecustsq(s, s1);
	  }
	  
	  public Integer updateDetailsmq(int s,int s1) {
		  return mr.updatecustmq(s, s1);
	  }
	  
	  public Integer updateDetailsname(String s,int s1) {
		  return mr.updatecustname(s, s1);
	  }
}
