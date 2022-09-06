package com.crud.e;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	
	@Autowired
	StudentRepo studentrepo;

	public List<Studentmodel2> getdata() {
		return studentrepo.findAll();
	}

	public Studentmodel2 update(Studentmodel2 model) {
		return studentrepo.save(model);
	}

	public String delbyid(int id) {
		 studentrepo.deleteById(id);
		 return "deleted student data succesfully";
	}

	public Optional<Studentmodel2> getbyid(int id) {
		return studentrepo.findById(id);
	}

	public Studentmodel2 insertdata(Studentmodel2 model) {
		return studentrepo.save(model);
	}



	
}