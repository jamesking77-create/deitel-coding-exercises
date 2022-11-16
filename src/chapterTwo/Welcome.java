package chapterTwo;

public class Welcome {
	public static void main(String[] args){
		System.out.println("Hello james.");
		greetings();
		topics();
		chapters();  
		chapter2();
		chapter3();
		chapter4();
		
	}
		public static void greetings(){
			System.out.print("welcome to your first java class");
			 System.out.println("we are pleased to have you. ");	
				System.out.println("please open to chapter one of the topic.\nlet's get started.\nchapter one. ");
	}

				public static void topics(){
					System.out.println("creating your first java file. ");
					 System.out.printf( "%s%n%s%n%s%n", "please install your jdk. ", "please open your notepad on your computer.", "chapter one.");
				
	}    

	      			  public static void chapters(){
					System.out.printf("%s%n%s%n%s%n", "class Welcome.", "part one. ", "page 3. ");
			 
	}

			public static void chapter2(){
				System.out.printf("%s%n%s%n%s%n%s%n","chapter 2. ", "access modifier.", "part two. ", "page 20. ");
			 
	}


		public static void chapter3(){
		System.out.printf("%s%n%s%n%s%n%s%n","chapter 3. ", "method call.", "part three. ", "page 50. ");
			 
	}


		public static void chapter4(){

		System.out.printf("%s%n%S%n%s%n","keywords.","comments.","traditonal comments.");
}
	
	
}