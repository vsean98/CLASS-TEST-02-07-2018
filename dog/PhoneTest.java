package dog;
import java.util.Scanner; 
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       
        Dog phone1=new Dog("iphone4","Apple",2013,800);
        
        System.out.println(phone1.Brand);
        System.out.println(phone1.PhoneName);
        System.out.println(phone1.yearReleased);

        
        Dog phone2=new Dog("Galaxy","Samsung",2013,300);
        System.out.println(phone2.Brand);
         System.out.println(phone2.PhoneName);
        System.out.println(phone2.yearReleased);
      
        
        Dog phone3=new Dog("Galaxy Note 7","Samsung",2015,600);
        System.out.println(phone3.Brand);
        System.out.println(phone3.PhoneName);
        System.out.println(phone3.yearReleased);
		
        System.out.println("Please enter the number phone you want");    

        Scanner scanner=new Scanner(System.in);

        double  anwser=scanner.nextDouble();
        
	
        if(anwser==1)
        System.out.println(phone1.price);
	
	else if (anwser==2)
	System.out.println(phone2.price);
	
	else
	System.out.println(phone3.price);
	
	
	
	
	}

}
