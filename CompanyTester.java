package EmployeeForCompany.com;

import java.io.*;
import java.util.*;

public class CompanyTester implements Comparator<Employees> {

	
	
	private static final String Interger = null;
	@Override
	public int compare(Employees o1, Employees o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
	/// Option for Updation 
	public void displayUpdation() {
		System.out.println("Enter 1 TO UPDATE ID");
		System.out.println("Enter 2 TO UPDATE DEPARTMENT");
		System.out.println("Enter 3 TO UPDATE SALARY");
		System.out.println("Enter 4 TO UPDATE EXPERIENCE");
	}
	/////Menu method to display selection option 
	public void optionSelect() {
		System.out.println("Enter 1 To ADD EMPLOYEE");
		System.out.println("ENTER 2 TO PRINT EMPLOYEE IN THE LIST ");
		System.out.println("ENTER 3 TO PRINT EMPLOYEE BY 'Name'");
		System.out.println("ENTER 4 TO PRINT EMPLOYEE BY 'ID'");
		System.out.println("ENTER 5 TO UPDATE EMPLOYEE");
		System.out.println("ENTER 6 TO DELETE EMPLOYEE ");
		System.out.println("ENTER 7 TO Write EMPLOYEE IN TXT FILE ");
		System.out.println("ENTER 8 TO READ EMPLOYEE INFORMATION FROM TXT FILE\n ");
	}
	
	///Option 1 : to ADD the Employee Keyboard:
     public void addList(List list) {
    	 Employees emp=new Employees();
    	Scanner scan= new Scanner(System.in);
		System.out.println("ENTER NAME OF THE EMPLOYEE");
		emp.setName(scan.next().toString());
		
		System.out.println("ENTER ID OF THE EMPLOYEE");
	       emp.setId(scan.nextInt());
		
		System.out.println("ENTER DEPARTMENT OF THE EMPLOYEE");
		 emp.setDepartment(scan.next().toString());
		
		System.out.println("ENTER SALARY OF THE EMPLOYEE");
		emp.setSalary(scan.nextInt());
		
		System.out.println("ENTER EXPERIENCE OF THE EMPLOYEE");
		 emp.setExperience(scan.nextInt());
		
		
		list.add(emp);
	}
     
     
     ///Option 2 : to Print all the employee in List
     public void printList(List list) {
    	 
    	 for (int i = 0; i < list.size(); i++) {
 			System.out.println("The Name of Employee "+(i+1)+" is         :"+((Employees) list.get(i)).getName()+"\n"+
     	 "Employee ID is                    :"+((Employees) list.get(i)).getId()+"\n"+
 		 "Belongs to Department             :"+((Employees) list.get(i)).getDepartment()+"\n"+
     	 "With Salary                       :"+((Employees) list.get(i)).getSalary()+"\n"+
 		 "Having Experience of              :"+((Employees) list.get(i)).getExperience()+"\n");
 		}
     }
	
     ///Option 3 : to Print All Employee By Name 
     
 public void displayById(List list) {
    	 
	 Collections.sort(list,new CompanyTester());
	 for (int i = 0; i < list.size(); i++) {
			System.out.println("The Name of Employee "+(i+1)+" is               :"+((Employees) list.get(i)).getName()+"\n"+
 	     "Employee ID is                    :"+((Employees) list.get(i)).getId()+"\n"+
		 "Belongs to Department             :"+((Employees) list.get(i)).getDepartment()+"\n"+
 	     "With Salary                       :"+((Employees) list.get(i)).getSalary()+"\n"+
		 "Having Experience of              :"+((Employees) list.get(i)).getExperience()+"\n");
		}
     }
 
 
 ///Option 4: To Print All Employee By ID
 public void displayByName(List list) {
	 
	 Collections.sort(list);
    	 for (int i = 0; i < list.size(); i++) {
			System.out.println("The Name of Employee "+(i+1)+" is         :"+((Employees) list.get(i)).getName()+"\n"+
    	 "Employee ID is                    :"+((Employees) list.get(i)).getId()+"\n"+
		 "Belongs to Department             :"+((Employees) list.get(i)).getDepartment()+"\n"+
    	 "With Salary                       :"+((Employees) list.get(i)).getSalary()+"\n"+
		 "Having Experience of              :"+((Employees) list.get(i)).getExperience()+"\n");
		}
     }
 
///Option 5: To UPDATE All Employee By NAME
 public void updateByName(List list) {
	 boolean flag=false;
	 //Employees emp=new Employees();
	 int x=0;
	 System.out.println("ENTER THE EMPLOYEE NAME WHOM YOU UPDATE??");
	 Scanner scan= new Scanner(System.in);
	 String name=scan.next().toString();
	 for (int i = 0; i < list.size(); i++) {
		 //x++;
		if(name.equals(((Employees) list.get(i)).getName())) {
			flag=true;
			break;
		}
		x++;
	}
	 if(flag) {
		 System.out.println("------------Employee is found ---------");
		 System.out.println("ENTER NEW ID OF THE EMPLOYEE");
		 int id=scan.nextInt();
		 
		 System.out.println("ENTER NEW DEPARTMENT OF THE EMPLOYEE");
		 String dept=scan.next().toString();
		 
		 System.out.println("ENTER NEW SALARY OF THE EMPLOYEE");
         int sal=scan.nextInt();
         
         System.out.println("ENTER NEW EXEPERIENCE OF THE EMPLOYEE");
         int exp=scan.nextInt();
         
         Employees emp=new Employees(name,id,dept,sal,exp);
         list.set(x, emp);
         //printList( list);
         
         /*displayUpdation();
		 System.out.println("ENTER NUMBER FROM 1 TO 4\n");
		 
		 int select=scan.nextInt();
		 do {
			 switch(select) {
			 case 1:
				 System.out.println("ENTER NEW ID OF THE EMPLOYEE");
				 int id=scan.nextInt();
                 list.set(x, emp);
				 break;
				 
			 case 2:
               System.out.println("ENTER NEW DEPARTMENT OF THE EMPLOYEE");
		      ((Employees) list.get(x)).setDepartment(scan.next().toString());
				break;
				
			 case 3:
				 System.out.println("ENTER NEW SALARY OF THE EMPLOYEE");
			      ((Employees) list.get(x)).setSalary(scan.nextFloat());
				 break;
				 
			 case 4:
				 System.out.println("ENTER NEW EXEPERIENCE OF THE EMPLOYEE");
			     ((Employees) list.get(x)).setExperience(scan.nextInt());
			     break;
			     
			     default:
			    	 System.out.println("<<<<<Invalid Syntax>>>>>>");
			    	 break;
				 
			 }
			 displayUpdation();
			 System.out.println("ENTER NUMBER FROM 1 TO 4\n");
             select=scan.nextInt();
		 }while(select>0 && select<5);*/
         
		 System.out.println("<<<<<<<<Your are Done with Updating Employee Recoreds>>>>>");
		 System.out.println("<<<<<<<<------------------------------------------>>>>>\n");
	 }
	 else {
		 System.out.println("Invalid!!!!  Employee Name does not exit---?? ");
		 System.out.println("<<<<<<<<------------------------------------------>>>>>\n");
	 }
	 
 }
	
 
///Option 6: To Delete  Employee By NAME
 public void deleteEmployee(List list) {
	 
	 boolean flag=false;
	 
	 int x=0;
	 System.out.println("ENTER THE EMPLOYEE NAME TO DELETE?");
	 Scanner scan= new Scanner(System.in);
	 String name=scan.next().toString();
	 for (int i = 0; i < list.size(); i++) {
		 x++;
		if(name.equals(((Employees) list.get(i)).getName())) {
			flag=true;
			break;
		}
	}
	 if(flag) {
		 System.out.println("------------Employee is found ---------");
		 list.remove(x-1);
		 System.out.println("<<<<<<<<Your are Done with DELETING Employee Records>>>>>");
		 System.out.println("<<<<<<<<------------------------------------------>>>>>\n");
	 }
	 else {
		 System.out.println("Invalid!!!!  Employee Name does not exit---?? ");
		 System.out.println("<<<<<<<<------------------------------------------>>>>>\n");
	 }
	 
	 
	 
	 
 }
 //// Option 7: to Read file from txt file:
  public void writefile(List list) {
	 
	 try {
	BufferedWriter bw= new BufferedWriter(new FileWriter("/Users/aashishshrestha/Desktop/java.txt/save.txt"));
	
	for (int i = 0; i < list.size(); i++) {
		 bw.write(((Employees) list.get(i)).getName()+" ");
		 bw.write(((Employees) list.get(i)).getId()+" ");
		 bw.write(((Employees) list.get(i)).getDepartment()+" ");
		 bw.write(((Employees) list.get(i)).getSalary()+" ");
		 bw.write(((Employees) list.get(i)).getExperience()+"\n");
		 
	}
	 
	bw.close() ;
	 }catch(Exception e) {
		 return ;
	 }finally {
		
	 }
	 
	 
 }
  
  
  
 ////Option 8: to read file  from TXT 
  public void readFile(List list) {
	  
	  Employees emp= new Employees();
	  try {
		  BufferedReader br= new BufferedReader(new FileReader("/Users/aashishshrestha/Desktop/java.txt/output302.txt"));
		  String save;
		 
		  
		  while((save=br.readLine())!=null) {
			  int x=1;
			  String name="";
			  String id="";
			  String dept="";
			  String salary="";
			  String exp="";
			  
			  for (int i = 0; i < save.length(); i++) {
				if(save.charAt(i)!=' ') {
					
				if(x==1) {
					name=name+save.charAt(i);
				}
				else if(x==2){
					id=id+save.charAt(i);
				}
				else if(x==3){
					dept=dept+save.charAt(i);
				}
				else if(x==4){
					salary=salary+save.charAt(i);
				}
				else if(x==5){
					exp=exp+save.charAt(i);
				}
				else {
					break;
				}
				}
				else {
					x++;
				}
			}/// End of For loop 
			  
			emp=new Employees(name,Integer.parseInt(id),dept,Integer.parseInt(salary),Integer.parseInt(exp));
	
			list.add(emp);
		  }
		  
		  
		  
		 br.close() ;
	  }catch(Exception e) {
		  
		  System.out.println("This Error happen in readFile Method ");
		  System.out.println(e.fillInStackTrace()+"\n\n");
		  return ;
	  }
  }
	public static void main(String[] args) {
		CompanyTester com=new CompanyTester();
		Employees emp=new Employees();
		List<Employees>list= new ArrayList();
		
		com.optionSelect();
		System.out.println("SELECT A NUMBER FROM 1 TO 6 FOR ABOVE OPTION");
		Scanner scan= new Scanner(System.in);
		int option=scan.nextInt();
		
		do {
			
			switch(option) {
			
			case 1:
				com.addList(list) ;
				break;
				
			case 2:
				com.printList(list) ;
				break;
				
			case 3:
				
				com.displayById(list);
				break;
				
			case 4:
				com.displayByName(list);
				break;
				
			case 5:
				com.updateByName(list);
				break;
				
			case 6:
				com.deleteEmployee(list);
				break;
			case 7:
			  com.writefile(list);
				break;
				
			case 8:
				com.readFile(list);
				break;
				
			default:
           	System.out.println("InValid Syntax !!!!!!!!!\n");
				break;
	}                                      ///End of SWITCH
			
	
		com.optionSelect();
		System.out.println("SELECT A NUMBER FROM 1 TO 6 FOR ABOVE OPTION");
        option=scan.nextInt();
        
		}while(option>0 && option<9);
		
		System.out.println("\n You are Exit !!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
