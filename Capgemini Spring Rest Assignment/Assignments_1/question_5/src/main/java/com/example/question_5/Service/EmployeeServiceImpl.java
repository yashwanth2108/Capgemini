package com.example.question_5.Service;

import com.example.question_5.Model.Employee;
import com.example.question_5.Model.EmployeeList;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class EmployeeServiceImpl{

//    EmployeeList  employees = new EmployeeList();
//    ArrayList<Employee> employeeList = employees.getEmployeesList();
//
//    @Override
//    public <S extends Employee> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Employee> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Employee> findById(Long aLong) {
//        for (Employee employee : employeeList)
//        {
//            if(employee.getEmployeeId().equals(aLong))
//            {
//                return Optional.of(employee);
//            }
//        }
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        for (Employee employee : employeeList)
//        {
//            if(employee.getEmployeeId().equals(aLong))
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public Iterable<Employee> findAll() {
//        return employeeList;
//    }
//
//    @Override
//    public Iterable<Employee> findAllById(Iterable<Long> iterable) {
//        ArrayList<Employee> employees1 = new ArrayList<>();
//        Iterator<Long> iterator = iterable.iterator();
//        while (iterator.hasNext())
//        {
//            for(Employee employee : employeeList)
//            {
//                if(iterator.next().equals(employee.getEmployeeId()))
//                {
//                    employees1.add(employee);
//                    break;
//                }
//            }
//        }
//        return employees1;
//    }
//
//    @Override
//    public long count() {
//        return employeeList.size();
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//        int size = employeeList.size();
//        employeeList.removeIf(employee -> employee.getEmployeeId().equals(aLong));
//        employees.setEmployeesList(employeeList);
//    }
//
//    @Override
//    public void delete(Employee employee) {
//        int size = employeeList.size();
//        employeeList.removeIf(emp -> emp.equals(employee));
//        employees.setEmployeesList(employeeList);
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Employee> iterable) {
//        List<Employee> result = new ArrayList<Employee>();
//        Iterator iterator = iterable.iterator();
//        while (iterator.hasNext())
//        {
//            result.add((Employee) iterator.next());
//        }
//        employeeList.removeAll(result);
//    }
//
//    @Override
//    public void deleteAll() {
//        employeeList.removeAll(employeeList);
//    }
//
//    @Override
//    public String addEmployee(Employee employee) {
//        employeeList.add(employee);
//        return "---- Employee Added Successfully ----";
//    }
//
//    @Override
//    public String searchEmployee(Long empId) {
//
//        for(Employee employee : employeeList)
//        {
//            if(employee.getEmployeeId().equals(empId))
//                return employee.toString();
//        }
//
//        return "There is no Employee related to this ID "+empId;
//    }
//
//    @Override
//    public String deleteEmployee(Long empId) {
//        int size = employeeList.size();
//        employeeList.removeIf(employee -> employee.getEmployeeId().equals(empId));
//        employees.setEmployeesList(employeeList);
//        if(employeeList.size()==size)
//            return "There is no Employee related to this ID "+empId;
//        else
//            return "---- Employee Deleted Successfully ----";
//    }
//
//    @Override
//    public ArrayList<Employee> finAllEmployee() {
//        return employeeList;
//    }
//
//    @Override
//    public String updateEmployeeDetails(Employee employee) {
//        int i = 0;
//        for(Employee emp : employeeList)
//        {
//            if(employee.getEmployeeId().equals(emp.getEmployeeId()))
//            {
//                employeeList.set(i,employee);
//                return "---- Employee Updated Successfully ----";
//            }
//            i++;
//        }
//        return "There is no Employee Id Related To this Data";
//    }
}
