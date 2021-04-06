package com.employee.hib.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYEE", schema = "CISADM")
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id", updatable = false, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="EMP_SEQ", allocationSize=25)

	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_SEQ")

//	@Column(name = "ID")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
//	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}
}