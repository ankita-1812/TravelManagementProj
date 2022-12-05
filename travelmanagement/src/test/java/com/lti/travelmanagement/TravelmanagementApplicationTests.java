package com.lti.travelmanagement;


import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.travelmanagement.beans.Employee;
import com.lti.travelmanagement.beans.TravelRequest;
import com.lti.travelmanagement.dao.AdminDao;
import com.lti.travelmanagement.dao.EmployeeDao;
import com.lti.travelmanagement.dao.EmployeeDaoImpl;
import com.lti.travelmanagement.dao.TravelRequestDaoImpl;
import com.lti.travelmanagement.exceptions.EmployeeNotFoundException;
import com.lti.travelmanagement.services.AdminService;
import com.lti.travelmanagement.services.EmployeeService;
import com.lti.travelmanagement.services.EmployeeServiceImpl;

@SpringBootTest
class TravelmanagementApplicationTests {

	  @Autowired
      EmployeeDaoImpl employeeDao;
	  @Autowired
	  EmployeeServiceImpl adminService;
	  @Autowired
	  TravelRequestDaoImpl trvlDao;
	  @PersistenceContext
	  EntityManager em;
     
	  

	  
      
      
      @Test
      public void findEmployeeById() throws EmployeeNotFoundException {
//    	  Employee e=new Employee(109,"Ranveer","rs@gmail.com","mumbai","HR DEPT","797748919");
    	  Employee e=em.find(Employee.class, 101);
//    	  employeeDao.addEmployee(e);
          Employee result = employeeDao.findEmployeeById(e.getEmpId());
         Assertions.assertNotNull(result);
          
//          assertThat(actualResult).isFalse();
      }
      @Test
      public void findAllRes(){
    	  
    	  TravelRequest r=new TravelRequest(1189,"2023-01-02","pending","2023-01-02","2023-01-22","office","India","USA",180,"Train");
    	 
//    	  r.setEmployee(109);
//    	  adminService.addEmployeeRequest(103, r);
          Set<TravelRequest> travelrequestset=employeeDao.findAllTravelRequests(103);
          Assertions.assertTrue(travelrequestset.size()>0);  
          
      }
      @Test
      public void finreqbyId() throws EmployeeNotFoundException {
//    	  Employee e=new Employee(101,"Ranveer","rs@gmail.com","mumbai","HR DEPT","797748919");
//          Employee result = employeeDao.findEmployeeById(e.getEmpId());
//       
        
      			
//          TravelRequest r=new TravelRequest(1189,"2023-01-02","pending","2023-01-02","2023-01-22","office","India","USA",180,"Train");
//          r.setEmployee(e);
          List<TravelRequest> actualResult=trvlDao.findByStatus("approved");
          Assertions.assertTrue(actualResult.size()>0);     
          }



     
      

}
