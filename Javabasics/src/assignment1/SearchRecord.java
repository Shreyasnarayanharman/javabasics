package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchRecord {
	static int slno;
	static String name;
	static String address;
	static String city;

	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc=new Scanner(System.in);
		PreparedStatement pstmt = null;
		String query1 = "INSERT INTO Employees(slno, name, address, city)" + "VALUES (?, ?, ?,?)";
		while(true) {
		System.out.println("JDBC Programming Menu");
		System.out.println("1. Insert Record");
		System.out.println("2. Search Record");
		System.out.println("3. Delete Record");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","");
			Statement statement = con.createStatement();
			switch(choice) {
			case 1:
				input(sc);
				pstmt = con.prepareStatement(query1);
				pstmt.setInt(1, slno);
				pstmt.setString(2, name);
				pstmt.setString(3, address);
				pstmt.setString(4, city);
				int status = pstmt.executeUpdate();
				if(status > 0) {
					System.out.println("Record is inserted successfully !!!");
				}
				break;
			case 2:System.out.println("Enter the Employee name you want to search:");
			name = sc.next();
			ResultSet resultSet = statement.executeQuery( "select * from employees " +
                    "where name='"+name+"' ");
			if(resultSet.next()) {
			int slno = resultSet.getInt("slno");
			String name = resultSet.getString("name");
			String address = resultSet.getString("address");
			String city =  resultSet.getString("city");
			System.out.println(slno +"--"+name+"--"+address+"--"+city);
			}
			else {
				System.out.println("Record not found");
			}
			break;
			case 3: System.out.println("Enter the Employee name you want to delete:");
			name = sc.next();
		    statement.executeUpdate( "delete from employees " +
	                "where name='"+name+"' ");
		    System.out.println("Record deleted successfully");
			break;
			default: System.out.println("Invalid choice");
			}

		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}

	public static void input(Scanner sc) {
		System.out.println("Enter the Employee id:");
		slno = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		name = sc.next();
		System.out.println("Enter the Employee Address:");
		address = sc.next();
		System.out.println("Enter the Employee city:");
		city = sc.next();
	}
}