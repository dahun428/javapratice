package cloudstudying;


class Student implements Cloneable{
	String name ;
	Student(String name){
		this.name = name ;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class pratice44 {
	
	public static void main(String[] args)  {
		
		Student s1 = new Student("������");
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
