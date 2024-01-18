class RomanNumeral {

public String ToRoman(int num) { // Changes Integer to Roman

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



int Romnum(char Num) {
if (Num == 'I') // roman numeral = 1
  return 1;
if (Num == 'V') // roman numeral = 5
  return 5;
if (Num == 'X') // roman numeral = 10
  return 10;
if (Num == 'L') // roman numeral = 50
  return 50;
if (Num == 'C') // roman numeral = 100
  return 100;
if (Num == 'M') // roman numeral = 1000
  return 1000;
else return -1;
}

public int ToInteger(String str) { //Changes Roman to Integer

int RomanInt = 0; 

for (int i = 0; i < str.length(); i++) {

int R1 = Romnum(str.charAt(i));

if (i + 1 < str.length()) {

int R2 = Romnum(str.charAt(i + 1));

if (R1 >= R2) {
  RomanInt = RomanInt + R1;
  }

else {
  RomanInt = RomanInt + R2 - R1;
  i++;
     }
  }

else {
  RomanInt = RomanInt + R1;
  }
}

return RomanInt;
}


public void AddCal(String romannum1,String romannum2)
{
String calculation = "";

int rnum1 = ToInteger(romannum1); //Changes roman to integer
int rnum2 = ToInteger(romannum2);

int Answer = rnum1 + rnum2;

System.out.println("------------");
System.out.println("Addition Calculator:");
System.out.println();
System.out.println("Calculation: " + rnum1 + " + " + rnum2 + " = " + Answer );
System.out.println("------------");

calculation = ToRoman(Answer);

System.out.println("Calculation: " + romannum1 + " + " + romannum2 + " = " + calculation );}



public void SubtractCal(String romannum1,String romannum2) {
String calculation = "";

int rnum1 = ToInteger(romannum1);
int rnum2 = ToInteger(romannum2);

int Answer = rnum1 - rnum2;

System.out.println("------------");
System.out.println("Subtraction Calculator: ");
System.out.println();
System.out.println("Calculation: " + rnum1 + " - " + rnum2 + " = " + Answer );
System.out.println("------------");

calculation = ToRoman(Answer);

System.out.println("Calculation: " + romannum1 + " - " + romannum2 + " = " + calculation );
}



public void MultiplyCal(String romannum1,String romannum2) {
String calculation = " ";

int rnum1 = ToInteger(romannum1);
int rnum2 = ToInteger(romannum2);

int Answer = rnum1 * rnum2;

System.out.println("------------");
System.out.println("Multiplication Calculator: ");
System.out.println();
System.out.println("Calculation: " + rnum1 + " * " + rnum2 + " = " + Answer );
System.out.println("------------");

calculation = ToRoman(Answer);

System.out.println("Calculation: " + romannum1 + " * " + romannum2 + " = " + calculation );

}



public void DivisionCal(String romannum1,String romannum2) {
String calculation = " ";

int rnum1 = ToInteger(romannum1);
int rnum2 = ToInteger(romannum2);

int Answer = rnum1 / rnum2;

System.out.println("------------");
System.out.println("Division Calculator: ");
System.out.println();
System.out.println("Calculation: " + rnum1 + " / " + rnum2 + " = " + Answer );
System.out.println("------------");

calculation = ToRoman(Answer);

System.out.println("Calculation: " + romannum1 + " / " + romannum2 + " = " + calculation );  }
 }   
