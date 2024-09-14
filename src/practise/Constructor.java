//package practise;
//
//class Student { 
//	static String name;
//	static int age;
//
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//
//	}
//
//
//public class Constructor {
//
//	public static void main(String[] args) {
//		Student input = new Student("Anoop", 28);
//		
//	    System.out.println(name);
//	    System.out.println(age);
//	}
//
//}
//}

//Ques:1 Once we globalizing the value in the class, why we can not 
// call in another class without making any object?

//Ques:2 when we create another object and passing different value 
//why the value is not changing in the class
 
// Ques:3  
  

package practise;

class Student { 
    String name;
    int age;
    
    

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }

}
public class Constructor {

    public static void main(String[] args) {
        Student input = new Student("Anoop", 28);     
         Student obj = new Student("Grand", 280); 
        input.printInfo();
    }
}



//class Constructor{
//	static int x= 40;
//	
//	public static void main(String[] args) {
//		System.out.println(x);
//		
//	}
//}

















