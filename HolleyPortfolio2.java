import java.util.*;

public class HolleyPortfolio2 {
public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 Scanner input = new Scanner(System.in);
 
 int user = 0;
 int num = 0;
 int select = 0;
 int affirm = 0;
 String str = "";
 RomanNumeral Calculator = new RomanNumeral(); 
 
  do {
     System.out.println("---Roman Numeral Calculator---");
     System.out.println("");
     System.out.println("Pick your menu you want to start with: ");
     System.out.println("1: Calculator");
     System.out.println("2: Converter");
     System.out.println("3: Exit");
     
     select = input.nextInt();
     
     if (select == 1) {
     System.out.println("---Calculator---");
     System.out.println("1: Addition");
     System.out.println("2: Subtraction");
     System.out.println("3: Multiplication");
     System.out.println("4: Division");
     System.out.println();
      
     user = scan.nextInt();
     
     switch (user) {
     case 1: { System.out.println("Enter the first roman numeral: "); //Addition Calculator
               String romannum1 = input.next();
               System.out.println("Enter the second roman numeral: ");
               String romannum2 = input.next();
               Calculator.AddCal(romannum1, romannum2);
               System.out.println("\n");
              } 
     break;
     case 2: { System.out.println("Enter the first roman numeral: "); //Subtraction Calculator
               String romannum1 = input.next();
               System.out.println("Enter the second roman numeral: ");
               String romannum2 = input.next();
               Calculator.SubtractCal(romannum1, romannum2);
               System.out.println("\n");
             }
     break;
     case 3: { System.out.println("Enter the first roman numeral: "); //Multiplication Calculator
               String romannum1 = input.next();
               System.out.println("Enter the second roman numeral: ");
               String romannum2 = input.next();
               Calculator.MultiplyCal(romannum1, romannum2);
               System.out.println("\n");
             }

     break;
     case 4: { System.out.println("Enter the first roman numeral: "); //Division Calculator
               String romannum1 = input.next();
               System.out.println("Enter the second roman numeral: ");
               String romannum2 = input.next();
               Calculator.DivisionCal(romannum1, romannum2);
               System.out.println("\n");
             }
     break;
     default: System.out.println("Pick 1-4 only!");
         }
        }
        
     if (select == 2) {
     System.out.println("---Conversions---");
     System.out.println("1: To Roman Numeral");
     System.out.println("2: From Roman Numeral");
     
     affirm = scan.nextInt();
     
     switch (affirm) {
     
     case 1: { System.out.println("Enter a integer to convert to roman numeral: ");
               num = input.nextInt();
               String var = ToRoman(num); //Convert from integer to roman numeral
               System.out.println("This answer is: " + var);
               System.out.println("\n");
             }
     break;
     case 2: { System.out.print("Enter a roman numeral to convert to integer: ");
               str = input.next();
               int number = Calculator.ToInteger(str); //Convert from integer to roman numeral
               System.out.println("The answer is: " + number);
               System.out.println("\n");
             }
     break;
     default: System.out.println("Come on Stupid....1-2 Only!");
     break;
       }
      }
    } while (select != 3); // End Loop
  }
 
 
public static String ToRoman(int num) {   
   int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
   String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
   StringBuilder roman = new StringBuilder();  
   
   for (int i = 0;i < values.length; i++) {  

    while(num >= values[i]) {  
      num = num - values[i];  
      roman.append(romanLetters[i]);  
      }  
    }  
   return roman.toString();  
 }    
}

