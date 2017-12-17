package edu.tinchiway.dao;

import edu.tinchiway.domain.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmpMapper {
    @Select("select emp_no,e_name,job,salary,dept_no from emp")
    List<Employee> list();

    List<String> strList();

}
