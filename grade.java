import java.util.*;
class grade{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		float total_marks=0;
		String b[]={"Hindi","English","Physics","Chemistry","Maths"};
		for(int i=0;i<5;i++)
		{	
		    System.out.print("Enter Marks of "+b[i]+" : ");
			try
			{
			a[i]=Integer.parseInt(sc.next());
			}
			catch(Exception e)
			{
				System.out.println("Please enter valid Marks");
					i--;
			}
		}

		for(int i=0;i<5;i++){
			total_marks+=a[i];
		}
		System.out.println("Total Marks : "+total_marks);
		float avg_per=total_marks/500*100;
		System.out.println("Total Average Percentage : "+avg_per);
		System.out.print("Grade : ");
		if(avg_per>=90){
			System.out.println("Outstanding");
		}else if(avg_per>=80){
			System.out.println("Good");
		}else if(avg_per>=70){
			System.out.println("Satisfactory");
		}else if(avg_per>=60){
			System.out.println("Needs Improvement");
		}else{
			System.out.println("Unsatisfactory");
		}
		
	}
}