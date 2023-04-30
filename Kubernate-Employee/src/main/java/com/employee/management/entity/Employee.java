package com.employee.management.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
	public class Employee {	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "employee_Id")
		private long employeeID;

		@Column(name = "employee_Name")
		private String employeeName;

		@Column(name = "Date_Of_Birth")
		private LocalDate dateOfBirth;

		public LocalDate getDateOfBirth() {
			
			return dateOfBirth;
		}

		public long getEmployeeID() {
			return employeeID;
		}

		public String getEmployeeName() {
			return employeeName;
		}

	}
