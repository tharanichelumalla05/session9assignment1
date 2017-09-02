/*program for creating abstract class parent and defining an abstract method in it and implementing in the child class*/

package session9;//here i have created package as session9

public class AbstractMethod {  
	//declares a class called AbstractMethod
		//classes are the basics of opps(object oriented programming)
	public static void main(String[]args){
		//TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		Cat obj = new PetCat();//here we cannot  instantiate the object class 
		                                 
		obj.Meow();//obj taken as meow
		obj.run();//obj taken as run
		obj.dance();//obj taken as dance
		obj.eat();//obj taken as eat
	}
}
    abstract class Cat{            //a class is declared as abstract is known as abstract class
    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class
    
    	public void Meow(){       //here  i have created a method and i have declared and defined it 
    		   System.out.println("cat has a property of shouting meow....");
    		 //systemm is used to return code
    			//out is a static number
    			//Println is used to print text can has property of shouting meow and gives output
    	   }
   
    	public abstract void run();  //here i have declared  the abstract methods and implemented them in the child class  
        public abstract void dance();//methods are run,dance,eat
        public abstract void eat();
       }

  class PetCat extends Cat{   //here i have extended the parent to the child class
	   public void run(){  //void as no return type 
		   //here i have implemented the methods  in this class
		   System.out.println("pet cat can run ....");
		 //systemm is used to return code
			//out is a sta//systetic number
			//Println is used to print text pet cat can run and gives output
		   
	   }
	   public  void dance (){//void as no return type
		   System.out.println("pet cat can  also dance...");  
		 //systemm is used to return code
			//out is a sta//systetic number
			//Println is used to print text oet cat can also dance and gives output
	   }
	   public  void eat(){//void as no return type
		   System.out.println("pet cat eat well");
		 //systemm is used to return code
			//out is a sta//systetic number
			//Println is used to print text pet cat eat well and gives output
	   }
   }
