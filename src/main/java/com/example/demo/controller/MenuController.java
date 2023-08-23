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

import com.example.demo.modal.Menu;
import com.example.demo.service.MenuService;

@RestController
public class MenuController {
	
		    @Autowired
			MenuService ms;
			
			@PostMapping("add")
			public Menu add(@RequestBody Menu m)
			{
				return ms.saveinfo(m);
			}
			@PostMapping("addn")
			public List<Menu> addDet(@RequestBody List<Menu> m)
			{
				return ms.savedetails(m);
			}
			@GetMapping("show")
			public List<Menu> show()
			{
				return ms.showinfo();
			}
			@GetMapping("{id}")
			public Optional<Menu> showid(@PathVariable int id){
				return ms.getid(id);
			}
			@PutMapping("put")
			public Menu modify(@RequestBody Menu m) {
				return ms.changeinfo(m);
			}
			
			@PutMapping("{id}")
			public String modbyid(@PathVariable int id, @RequestBody Menu m) {
				return ms.updatebyid(id,m);
			}
			
			@DeleteMapping("del")
			public String del() {
				ms.delete();
				return "Deleted Successfully";
			}
			@DeleteMapping("del/{id}")
			public void delid(@PathVariable int id) {
				ms.deleteoid(id);
			}
			
			

}

