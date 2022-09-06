package com.crud.e;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:55004")
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/getdata")
	public List<Studentmodel2>  getdata()
	{
		return service.getdata();
	}
	
	@PostMapping("/insertdata")
	public Studentmodel2 insertdata(@RequestBody Studentmodel2 model) {
		
		return service.insertdata(model);
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Studentmodel2> getbyid(@PathVariable int id )
	{
		return service.getbyid(id);
	}
	
	@DeleteMapping("/delbyid/{id}")
	public String delbyid(@PathVariable int id)
	{
		return service.delbyid(id);
	}
	
	@PutMapping("/update")
	public Studentmodel2 update(@RequestBody Studentmodel2 model)
	{
		return service.update(model);
	}
	
}