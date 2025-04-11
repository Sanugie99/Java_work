package ex02_DB;

import java.sql.*;
import java.util.List;



public class EmpSelect {
	public static void main(String[] args) {
		
		List<Emp> list = EmpMethod.find();
		
		for(Emp e : list) {
			System.out.printf("사원번호: %d, 이름: %s, 직종: %s, 급여: %d",e.getEmpno(),e.getEname(),e.getJob(),e.getSalary());
		}
	}
}
