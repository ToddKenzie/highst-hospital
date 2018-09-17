# High St. Hospital

**Module 4 Bridge Project**

## Objectives

Using OOP principles, create classes for various people at the hospital.

### Notes from the documentation

High St. Hospital has the following model at its facility:

* Employee
	* calculatePay() abstract method with no specifications
	* appropriate getter methods and toString()
* Patient
	* default BLOOD_LEVEL of 20
	* default HEALTH_LEVEL of 10

High St. Hospital has the following classifications at its facility

* *Doctor* is a type of Hospital Employee and gets paid 90,000
* *Nurse* is a type of Hospital Employee and gets paid 50,000
* *Surgeon* is a type of Doctor and gets paid 120,000
* *Receptionist* is a type of Hospital Employee and gets paid 45,000
* *Janitor* is a type of Hospital Employee and gets paid 40,000

The following Instance Data will need to be taken care of for each employee

* Employee: Employee Name, Employee Number
* *Doctor*: Employee Name, Employee Number, Specialty Area (Heart, Brain, Foot, etc…)
* *Surgeon*: Employee Name, Employee Number, Specialty Area, and whether they are operating or not)
* *Nurse*: Employee Name, Employee Number, and Number of Patients they are taking care of
* *Receptionist*: Employee Name, Employee Number, whether they are on the phone or not
* *Janitor*: Employee Name, Employee Number, whether they are sweeping or not

Not all employees in the hospital have the same capabilities. Only certain staff members can implement **MedicalDuties** such as drawBlood() and careForPatient()