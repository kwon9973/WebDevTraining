package reflection;

import java.lang.reflect.Field;

class whatever{
	private String name;
	private String age;
	private String major;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return name +" " +age +" " + major;
	}
	private void secretMethod() {
		System.out.println("비밀");
	}
}

public class Ref{void main(String[] args) {
		//getClassInfo();
		
		//getFieldInfo();
		
		//getMethodInfo();
		
		//createObject();
	}
	/*
	private static void createObject() {
		// TODO Auto-generated method stub
		System.out.println("리플렉션 만들기");
		Class student = Student.class;
		try {
			//newInstance()는 생성자 호추ㄹ함
			Student student = (Student) studentClass.newInstance();
			System.out.println("결과" + student  );
		}catch{
			
		}
	}

	private static void getMethodInfo() {
		// TODO Auto-generated method stub
		System.out.println("a메서드 점보");
		
		Class studentClass = Student.class;
		
		//dk
		Method[] methods = studentClass.getDeclaredMethod();
		for(Method: method) {
			String returnType= method.getSimpleName();
		}
	}

	private static void getFieldInfo() {
		// TODO Auto-generated method stub
		Class studentClass = Student.class;
		
		//모든필드가져오기
		Field[] fields = studentClass.getDeclaredFields();
		System.out.println("student 클래스의 모든필드.");
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
	}
	private static void getClassInfo() {
		
		System.out.println("===클래스 정보 알아내기===");
		Class studentClass1 = reflect.student.class;
		
		Student student = new Student();
		Class studentClass2 = student.getClass();
		
		try {
			Class studentClass3 = Class.forName("reflect.student");
			
			System.out.println("방법1");
			System.out.println("클래스 이름: "+ studentClass1.getName());
			System.out.println("간단한 클래스 이름" + studentClass1.getSimpleName());
			
			System.out.println("방법 2");
			System.out.println("클래스이름"+studentClass2.getName());

			System.out.println("방법 3");
			System.out.println("클래스이름"+studentClass3.getName());
			System.out.println("클래스이름"+studentClass3.getPackageName());
			
			
			System.out.println(studentClass1 == studentClass2 && studentClass2 == studentClass3);
			
			
			
			
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}*/
}
