package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import com.hamza.tech_skills.service.FirebaseInitializer;

import model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	FirebaseInitializer db;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() throws InterruptedException, ExecutionException {
		List<Employee> empList = new ArrayList<Employee>();
		CollectionReference employee= db.getFirebase().collection("Employee");
		ApiFuture<QuerySnapshot> querySnapshot= employee.get();
		for(DocumentSnapshot doc:querySnapshot.get().getDocuments()) {
			Employee emp = doc.toObject(Employee.class);
			empList.add(emp);
		}
		return empList;
	}
	
	@PostMapping("/saveEmployee")
	public int saveEmployee(@RequestBody Employee employee) {
		CollectionReference employeeCR= db.getFirebase().collection("Employee");
		employeeCR.document(String.valueOf(employee.getId())).set(employee);
		return employee.getId();
	}
	
	@PostMapping("/getEmplyee")
	public Employee getEmployee(@RequestParam("id") int id) {
		return new Employee();
	}
	
	@PostMapping("/addEmployee")
	public int addEmployee(@RequestBody Employee employee ) {
		return 1;
	}
}
