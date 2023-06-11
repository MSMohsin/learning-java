import java.util.Scanner;

public class first {

  static int sum (int a, int b){
    return(a+b);
  }
  public static void main(String[] args) {
    System.out.println("lo World bitchooooo");
    // thats how you do comments

    /*
     * now thats a
     * multi
     * line
     * comment
     */

    /*
     * variables
     * syntax
     * > datatype variable_name = value
     * e.g: String name = "harry";
     */
    // STRINGS
    String name = "mohsin";
    System.out.println(name);

    // INTEGER
    int i = 56;
    System.out.println(i);

    // FLOAT
    float a = 5.99f;
    System.out.println(a);

    // BOOLEAN
    boolean brown = true;
    System.out.println(brown);

    // multi line variable
    int w = 7, e = 90, t = 4, y = 56;
    System.out.println(y);

    // CHAR
    char gg = 's';
    System.out.println(gg);

    // check out primitive and non primitive data types

    // float only prints few decimals
    float hh = 33.888787654f;
    System.out.println(hh);

    // while double prints more than few decimals
    double ggf = 33.8880787654d;
    System.out.println(ggf);

    // OPERATORS AND OPERANDS
    int k = 6, b = 4;
    System.out.println("the sum of k & b is: ");

    System.out.println(k + b);

    // to print the value in same line just remove 'ln'
    int ke = 6, be = 4;
    System.out.print("the sum of ke & be is: ");

    System.out.println(ke + be);

    // subtraction
    int num1 = 6, num2 = 4;
    System.out.print("the sub val of num1 & num2 is: ");

    System.out.println(num1 - num2);

    // division
    int num3 = 10, num4 = 2;
    System.out.print("the divisal of num3 & num4 is: ");

    System.out.println(num3 / num4);

    // multiplication
    int num5 = 6, num6 = 4;
    System.out.print("the product of num5 & num6 is: ");

    System.out.println(num5 * num6);

    // modulus
    System.out.print("the modulus of num5 & num6 is: ");
    System.out.println(num5 % num6);

    // increment/decrement
    // System.out.println(num5++); //here num5 has become 7 but its not printed coz
    // of sign
    // System.out.println(++num5); //here num5 has become 8 and is printed coz it
    // has already became 7 and coz of sign its printed
    // System.out.println(num5--); //here num5 has become 7 but its not printed coz
    // of sign
    // System.out.println(--num5); //here num5 has become 6 and is printed coz it
    // has already became 7 and coz of sign its printed

    // // assignment operators
    int numb = 16, numc = 30;
    numb += 4;
    numc -= 6;
    numb *= 2;
    numc /= 2;
    numb %= 15;
    System.out.println("new val of numb is: " + numb);
    System.out.println("new val of numc is: " + numc);

    // /*
    // * Comparison Operators:
    // * 1. == : checks for equality of two values
    // * 2. != : checks if two values are not equal
    // * 3. <
    // * 4. >
    // * 5. <=
    // * 6. >=

    // // logical operators
    // * 1. && Logical and operator returns true only if both conditions are true
    // * 2. || Logical or operator returns true if any one condition is true
    // * 3. ! Logical not Reverse the result from true to false and vice versa
    // * */

    // // TAKING INPUT
    // // in string
    // Scanner any = new Scanner(System.in);
    // System.out.println("enter your value");
    // String abc = any.nextLine();
    // System.out.println(abc);

    // // in integer
    // Scanner lat = new Scanner(System.in);
    // System.out.println("enter integer");
    // int lat_out = lat.nextInt();
    // System.out.println(lat_out);

    // // to check length
    // System.out.println(abc.length());

    // // concatenation
    // String bcc = "hahaha", cbb="funny";
    // System.out.println(bcc + " " + cbb);

    // // upper or lower case
    // System.out.println(abc.toUpperCase());
    // System.out.println(abc.toLowerCase());

    // // special characters
    // System.out.println("my name is \"mohsin\"");
    // System.out.println("my name is \'mohsin\'");
    // System.out.println("my name is mohsin\t");
    // System.out.println("my name is mohsin\\");

    // // string methods
    // String name_updated = "Mohsin Sheikh";
    // System.out.println(name_updated);
    // System.out.println(name_updated.contains("sin"));
    // System.out.println(name_updated.startsWith("She"));
    // System.out.println(name_updated.endsWith("kh"));
    // System.out.println(name_updated.charAt(5));
    // System.out.println(name_updated.indexOf("he"));

    // MATHEMATICS IN JAVA
    // math is already imported in most cases
    // int numb1 = 7, numb2 = 9;
    // System.out.println(Math.max(numb1, numb2));
    // System.out.println(Math.min(numb1, numb2));
    // System.out.println(Math.sqrt(numb2));
    // System.out.println(Math.abs(-98)); // it changes - to +
    // System.out.println(Math.random());
    // System.out.println(2 + (10 - 2) * Math.random()); // generating random no b/w
    // two nos

    // IF-ELSE in java
    // Scanner newp = new Scanner(System.in);
    // System.out.println("enter your age");
    // int now = newp.nextInt();
    // System.out.println(now);

    // if(now<18){
    // System.out.println("sorry kid");
    // }
    // else if(now<22){
    // System.out.println("just a teenager");
    // }
    // else{
    // System.out.println("welcome king");
    // }

    // Switch statements in java
    // switch(now){
    // case 16:
    // System.out.println("you are 16 yrs old");
    // break; //break here is important as it stops next cases from printing

    // case 22:
    // System.out.println("you are 22 yrs old");
    // break;

    // case 36:
    // System.out.println("you are 36 yrs old");
    // break;

    // default: //default is like else statement
    // System.out.println("none of the cases matched");
    // }

    // QUICK QUIZ

    // Scanner days = new Scanner(System.in);
    // System.out.println("enter the number of your day in a week from 1 to 7");
    // int daysin = days.nextInt();

    // switch (daysin) {
    // case 1:
    // System.out.println("today is monday");
    // break;

    // case 2:
    // System.out.println("today is tuesday");
    // break;

    // case 3:
    // System.out.println("today is wednesday");
    // break;

    // case 4:
    // System.out.println("today is thursday");
    // break;

    // case 5:
    // System.out.println("today is friday");
    // break;

    // case 6:
    // System.out.println("today is saturday");
    // break;

    // case 7:
    // System.out.println("today is sunday");
    // break;
    // }

    // loops in java

    /*
     * While Loop
     * while (condition) {
     * // This code will keep executing until the condition is true
     * }
     */

    // int kwq = 0;
    // while (kwq < 100) {
    //   System.out.println(kwq);
    //   kwq += 1;
    // }

    // do while
    // it will run atleast one time before even checking the condition

    // int j = 0;
    // do {
    //   System.out.println(j);
    //   j += 1;
    // } while (j > 100); //here the condition is false but as it is out it will execute atleast once

    //for loop
    /*
     * for(statement1; st2; st3){
      //print code
    }  st1 ==> only runs once before executing the code
       st2 ==> it a condition that need to be checked in loop
       st3 ==> it will execute after every loop
     */
    // for(int n=0; n<10; n++){
    //   System.out.println(n);
    //  }


     // break and continue
    //  for(int z=0;z<=10; z++){
    //   if(z>2){
    //   break;
    //   }
    //   else{
    //   System.out.println(z);
    //   }
    //  }

    //  for(int zi=0;zi<=10; zi++){
    //   if(zi==2){
    //   continue;
    //   }
      // System.out.println(zi);
    //  }


    // Arrays in java
    // int [] arr = {2,4,6,8};
    // System.out.println(arr[1]); //calling certain elements in an array
    // arr[1]= 7; //updates the no at index no 1
    // System.out.println(arr[1]);
    // System.out.println(arr.length); //it shows the length

    // //classical way to uterate loop
    // for(int d=0; d<arr.length; d++ ){  //showing all elements inn an array
    //   System.out.println(arr[d]);
    // }

    // //modern way of iterating the loop
    // for(int kuch:arr){
    //   System.out.println(kuch);
    // }



    //Multi dimensional array in java
    int [][] multi = {{2,4,6,8},{1,3,5,7}}; //each square bracket defines a dimension
    //two square bracket means it has 2 dimensions
    System.out.println(multi[1][2]);

    //String array in java
    String [] ccx = {"Muhammad", "mohsin", "sheikh"};
    for(String value:ccx){
      System.out.println(value);
    }


    //TRY & CATCH
    // try{
    //  //the below sout wont work coz len 4 dont exixt in ccx
    //  System.out.println(ccx[4]); //so if we run this it'll throw an error
    //  //coz of this error next code wont execute

    // }  //so thats why we use try/catch
    // catch(Exception f){ //here we have catch the error and stored it in f
    //   System.out.println(f);
    // }
    // System.out.println("lam sam"); //mow as we have resolved the error this line will execute


    //Methods in java

    /*
     //we need to write below two lines at the top right under 'public class'
        static int sum (int a, int b){
          return(a+b);
        }
    */

    System.out.println(sum(3, 66));



    /*
     * MINI PROJECT
     * CALCULATOR
     */

     float inp_1, inp_2;
     System.out.println("enter first number");
     Scanner calc = new Scanner(System.in);
     inp_1 = calc.nextFloat();

     System.out.println("enter second number");
     Scanner calc2 = new Scanner(System.in);
     inp_2 = calc2.nextFloat();

     System.out.println("you have entered " + inp_1 + " and " + inp_2);

     String prompt = "Enter 0 for addition  1 for subtraction  2 for multiplication  3 for division  4 for adding power";
     System.out.println(prompt);

     int collecting = calc.nextInt();
     switch (collecting){ 

      case 0:
      System.out.println("adding thsese number ");
      System.out.print("the result is ");
      System.out.println(inp_1 + inp_2);
      break;

      case 1:
      System.out.println("subtracting thsese number ");
      System.out.print("the result is ");
      System.out.println(inp_1 - inp_2);
      break;

      case 2:
      System.out.println("multiplying thsese number ");
      System.out.print("the result is ");
      System.out.println(inp_1 * inp_2);
      break;

      case 3:
      System.out.println("dividing thsese number ");
      System.out.print("the result is ");
      System.out.println(inp_1 / inp_2);
      break;

      case 4:
      System.out.println("adding value 2 as power to value 1 ");
      System.out.print("the result is ");
      System.out.println(Math.pow(inp_1, inp_2));
      break;


      default:
      System.out.println("invalid");




     }

    Double pow2, pow3;
    System.out.print("enter your value ");
    Scanner val1 = new Scanner(System.in);
    pow2 = val1.nextDouble();

    System.out.print("enter the power you want to add ");
    Scanner val2 = new Scanner(System.in);
    pow3 = val2.nextDouble();

    Double x = Math.pow(pow2, pow3);
    System.out.println(x);


     Double power1 = Math.pow(4, 2);

     System.out.println(power1);







































  }





}