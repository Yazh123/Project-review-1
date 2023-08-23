package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Menu;
import com.example.demo.repository.MenuRepo;

@Service
public class MenuService {
			@Autowired
			MenuRepo mr;
			
			public Menu saveinfo(Menu m)
			{
				return mr.save(m);
			}
			public List<Menu> savedetails(List<Menu> m)
			{
				return (List<Menu>)mr.saveAll(m);
			}
			
			public List<Menu> showinfo(){
				return mr.findAll();
			}
			
			public Menu changeinfo(Menu m)
			{
				return mr.saveAndFlush(m);
			}
			
			public void delete() {
				mr.deleteAll();
			}
			public void deleteoid(int id)
			{
				mr.deleteById(id);
			}
			
			public Optional<Menu> getid(int id){
				return mr.findById(id);
			}
			
			public String updatebyid(int id,Menu m) {
				mr.saveAndFlush(m);
				if(mr.existsById(id)) {
					return "Your updation has been recieved ";
				}
				else {
					return "Please Enter a valid Id";
				}
			}

}

