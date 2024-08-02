create database Employees;
use Employees;
create table Employee(
EmployeeID int primary key,
EmployeeName varchar(30),
DepartmentID int,
foreign key (DepartmentID) references Departments(DepartmentID)
);
create table Deparments(
DepartmentID int primary key,
DepartmentName varchar(30)
);
create table Projects(
ProjectID int primary key,
ProjectName varchar(30),
DepartmentID int ,
foreign key (DepartmentID) references Departments(DepartmentID)
);
insert into Employee values
(1,'JOHN',1),(2,'JANE',2),(3,'MARK',1),(4,'EMILY',3),(5,'KAREN',5);

insert into Departments values
(1,'SALES'),(2,'HR'),(3,'IT'),(4,'MARKETING'),(5,NULL);

insert into Projects values(101, 'Project A', 1),(102, 'Project B', 2),(103, 'Project C', 3),
(104, 'Project D', 4),(105, 'Project E', NULL);

-- joins
-- 1
SELECT e.EmployeeID,e.EmployeeName,d.DepartmentName FROM EmpLoyee e
INNER JOIN Departments d ON e.DepartmentID=d.DepartmentID;

-- 2
SELECT e.EmployeeID,e.EmployeeName,e.DepartmentName from EmpLoyee e
LEFT JOIN Departments d ON e.DepartmentID=d.DepartmentID;

-- 3 
SELECT d.DepartmentName,e.EmployeeName FROM EmpLoyee e
RIGHT JOIN Departments d ON e.DepartmentID=d.DepartmentID;

-- 4 
SELECT e.EmployeeID,e.EmployeeName,p.ProjectName,p.DepartmentID
FROM Employee e INNER JOIN Projects p on e.DepartmentID=p.DepartmentID;

-- 5  
SELECT e.EMPLOYEEID,e.EMPLOYEENAME,e.DepartmentID,d.DepartmentName,d.DepartmentID
FROM Employee e INNER JOIN Departments d
ON e.DepartmentID>d.DepartmentID WHERE d.DepartmentID IN (SELECT DepartmentID FROM Departments where DepartmentName="HR");

-- 6

SELECT p.ProjectName,d.DepartmentName FROM Projects p 
INNER JOIN Departments d on p.DepartmentID=d.DepartmentID;

-- 7

SELECT DepartmentID FROM Departments WHERE DepartmentID is NOT NULL;
SELECT e.EmployeeName,d.DepartmentName FROM Employee e 
LEFT JOIN Departments d ON e.DepartmentID=d.DepartmentID
WHERE e.DepartmentID IS NULL;

-- 8

SELECT e.EmployeeName,d.DepartmentName FROM Employee e 
RIGHT JOIN Departments d ON e.DepartmentID=d.DepartmentID
WHERE e.DepartmentID IS NULL  ;

-- 9
SELECT d.DepartmentName,COUNT(e.DepartmentID)  FROM Employee e 
INNER JOIN Departments d ON e.DepartmentID=d.DepartmentID
GROUP BY e.DepartmentID;

-- Questions
-- 1 Retrieve the list of employees along with their department names where employees are associated with departments.
-- 2 Retrieve all employees and their associated department names. If an employee does not belong to a department, show NULL.
-- 3 Retrieve all departments and the names of employees in those departments. If a department does not have any employees, show NULL.
-- 4 Retrieve all possible combinations of employees and projects.
-- 5 Retrieve the list of employees whose department ID is greater than the department ID of 'HR' department.
-- 6 Retrieve the list of projects along with their department names, where the projects are associated with departments
-- 7 Find employees who are not assigned to any department
-- 8 Find departments that have no employees
-- 9 Find all departments along with the number of employees in each department



-- Sub Queries
-- 1
select EmployeeName from Employee where DepartmentID in
(select DepartmentID from Employee where EmployeeName='John');

-- 2
select DepartmentID from Employee group by DepartmentID 
having count(EmployeeID)>1;

-- 3
select ProjectName from Projects where DepartmentId is null;

-- 4
select DepartmentID from Employee group by DepartmentID
order by count(EmployeeID) desc limit 1;

-- 5
select EmployeeID, EmployeeName from Employee where DepartmentID = 
(select DepartmentId from Departments where DepartmentName='Sales');

-- 6
select DepartmentName from Departments where DepartmentID not in
(select DepartmentID from Projects where DepartmentID is not null);
-- 7

select EmployeeID, EmployeeName from Employee where DepartmentID not in
(select DepartmentID from Projects where DepartmentID is not null);

-- 8
select d.DepartmentName, count(e.EmployeeID) as NumberOfEmployees 
from Departments d join Employee e on d.DepartmentID=e.DepartmentID
where d.DepartmentID in(select DepartmentID from Employee
 group by DepartmentID having count(EmployeeID)>2) group by d.DepartmentName;
 
-- 9
select ProjectID, ProjectName from Projects where DepartmentID =
(select DepartmentID from Departments where DepartmentName='IT');

-- 10
select EmployeeID, EmployeeName from Employee where DepartmentID not in
(select DepartmentID from Departments where DepartmentName='Marketing');

-- Questions
-- 1 Find the names of employees who work in the same department as 'John'
-- 2 Find departments that have more than one employee
-- 3 Find the projects that are not assigned to any department
-- 4 Find the department with the maximum number of employees.
-- 5 Find employees who are working on projects in the 'Sales' department.
-- 6 Find the names of departments that do not have any projects.
-- 7 Find employees who are not working on any project.
-- 8 Find the department names and the number of employees in each department, only for departments with more than two employees.
-- 9 Find the projects handled by employees in the 'IT' department.
-- 10 Find the names of employees who do not work in the 'Marketing' department.