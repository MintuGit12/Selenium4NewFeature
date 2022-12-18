package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import com.mysql.jdbc.Driver;

public class JDBCTableValidate {

	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root","root");
		Statement stat = conn.createStatement();
		/*boolean b = stat.execute("create table EmployeeTableVali(ename varchar(40))");
		if(b==true)
		{
			ResultSet rs = stat.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getString(0));
			}
		}
		else
		{
			int count = stat.getUpdateCount();
			System.out.println(count);
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the employee :");
		String name = sc.next();
		boolean b=false;
		System.out.println("already data present in table ");
		ResultSet rs1 = stat.executeQuery("select * from EmployeeTableVali");
		while(rs1.next())
		{
			String per = rs1.getString(1);
			System.out.println(rs1.getString(1));
			if(per.equals(name))
			b=true;
		}
		if(b==false)
		{
			Statement stat1 = conn.createStatement();
			int boo = stat.executeUpdate("insert into EmployeeTableVali values('"+name+"')");
			System.out.println("table updated "+boo);
				ResultSet rs2 = stat1.executeQuery("select * from EmployeeTableVali");
				while(rs2.next())
				{
					System.out.println(rs2.getString(1)+" updated result");
				}
				
			}
		else
			
		{
			System.out.println("name alredy exists enter another name ");
		}
	}
}


