package com.lti.travelmanagement.beans;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="AdminTable")
public class Admin {
    
    @Id
    @Column(name="AdminId", length=10)
    private int admin_id;
    
    @Column(name="AdminUsername", length=30)
    private String admin_username;
    
    @Column(name="AdminName", length=30)
    private String admin_name;
    
    @Column(name="Admin", length=40)
    private String admin_emailId;
    
  
   
   public Admin() {
	   
   }
   public Admin(int admin_id, String admin_username, String admin_name, String admin_emailId) {
        super();
        this.admin_id = admin_id;
        this.admin_username = admin_username;
        this.admin_name = admin_name;
        this.admin_emailId = admin_emailId;
    }



   public int getAdmin_id() {
        return admin_id;
    }



   public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }



   public String getAdmin_username() {
        return admin_username;
    }



   public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }



   public String getAdmin_name() {
        return admin_name;
    }



   public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }



   public String getAdmin_emailId() {
        return admin_emailId;
    }



   public void setAdmin_emailId(String admin_emailId) {
        this.admin_emailId = admin_emailId;
    }



   @Override
    public String toString() {
        return "Admin [admin_id=" + admin_id + ", admin_username=" + admin_username + ", admin_name=" + admin_name
                + ", admin_emailId=" + admin_emailId + "]";
    }
    
    
    
    
}