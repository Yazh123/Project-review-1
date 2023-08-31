package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
			    @Autowired
				CustomerService ms;
				
				@PostMapping("addc")
				public Customer addcustomer(@RequestBody Customer m)
				{
					return ms.savecustomerinfo(m);
				}
				@PostMapping("addnc")
				public List<Customer> addDet(@RequestBody List<Customer> m)
				{
					return ms.savecustomerdetails(m);
				}
				@GetMapping("showc")
				public List<Customer> show()
				{
					return ms.showcustomerinfo();
				}
				@GetMapping("/customer/{id}")
				public Optional<Customer> showid(@PathVariable int id){
					return ms.getcustomerid(id);
				}
				@PutMapping("putc")
				public Customer modify(@RequestBody Customer m) {
					return ms.changecustomerinfo(m);
				}
				
				@PutMapping("/customer/{id}")
				public String modbyid(@PathVariable int id, @RequestBody Customer m) {
					return ms.updatecustomerbyid(id,m);
				}
				
				@DeleteMapping("delc")
				public String del() {
					ms.deletecustomer();
					return "Deleted Successfully";
				}
		
				@DeleteMapping("delc/{id}")
				public void delid(@PathVariable int id) {
					ms.deletecustomeroid(id);
				}
				
				@GetMapping("paging/{pgno}/{pgsize}/{name}")
			    public List<Customer> showpageinfo(@PathVariable int pgno, @PathVariable int pgsize,@PathVariable String name){
			    	return ms.getbypage(pgno, pgsize,name);
			    }
				
				
				 @GetMapping("/id/{id}")
				 public List<Customer> getown(@PathVariable int id)
				 {
					 return ms.getcusts(id);
				 }
			    
			    @GetMapping("/id/{id}/name/{name}")
				 public List<Customer> getco(@PathVariable int id,@PathVariable String name)
				 {
					 return ms.getname(id,name);
				 }
			    
			    
			    @DeleteMapping("/deletenew/{id}")
			    public String deleteinfo(@PathVariable("id") int id) {
			    	ms.deleteDetails(id);
			    	return " updated";
			    }
			    
			    @PutMapping("/updatedq/{dquantity}/{custid}")
			    public String updatedqinfo(@PathVariable("dquantity") int dquantity, @PathVariable("custid") int custid) {
			    	ms.updateDetailsdq(dquantity,custid);
			    	return " updated";
			    }
			    
			    @PutMapping("/updatesq/{squantity}/{custid}")
			    public String updatesqinfo(@PathVariable("squantity") int squantity, @PathVariable("id") int custid) {
			         ms.updateDetailssq(squantity,custid);
			         return " updated";
			    }
			    
			    @PutMapping("/updatemq/{mquantity}/{custid}")
			    public String updatemqinfo(@PathVariable("mquantity") int mquantity, @PathVariable("custid") int custid) {
			         ms.updateDetailsmq(mquantity,custid);
			         return " updated";
			    }
			    
			    @PutMapping("/updatename/{name}/{custid}")
			    public String updatenameinfo(@PathVariable String name, @PathVariable int id) {
			    	ms.updateDetailsname(name,id);
			    	return " updated";
			    }

}


