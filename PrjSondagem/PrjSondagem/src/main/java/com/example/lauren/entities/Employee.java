package com.example.lauren.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tb_employee_project", joinColumns = @JoinColumn(name = "project_id"), 
	inverseJoinColumns = @JoinColumn(name = "employee_id"))
	private List<Project> project;

}
