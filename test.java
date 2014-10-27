import java.util.Scanner;

public class Ask2

{

	 public static void main( String[] args )
	 {

	   Scanner input = new Scanner (System.in);


	   System.out.print( "Na eisageis ton meso oro twn mathimatwn sou: " );
	     double averageGrades = input.nextDouble();
		 input.nextLine();


       System.out.print( "Na eisageis thn vathmologia sou sto mathima z: " );
         double zGrade = input.nextDouble();
         input.nextLine();


       System.out.print( "Na eisageis thn vathmologia sou sto mathima c: " );
         double cGrade = input.nextDouble();
         input.nextLine();


       System.out.print( "Exeis kanei ergasia gia to mathima z?(an nai apanta me yes, an oxi apanta me no): " );
         String zAssigment = input.nextLine();


       System.out.print( "Exeis kanei ergasia gia to mathima c?(an nai apanta me yes, an oxi apanta me no): " );
         String cAssigment = input.nextLine();


         double averzGradecGrade = ( zGrade + cGrade )/2;


       if(( averageGrade > 8 &&  averzGradecGrade > 8.5 ) || ( averzGradecGrade >= 8.5 && zAssigment= "yes"  || cAssigment= "yes"  ));
       {
          System.out.println( "Tha dothei sustatikh epistolh" );
       }
       else
          System.out.println( "Den tha dothei sustatikh epistolh." );






}
	}
