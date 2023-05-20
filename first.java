public class first {
    public static void main(String[] args) {
       System.out.println("lo World bitchooooo");
       //thats how you do comments

       /*now thats a
       * multi
       * line
       * comment
       */

       /*variables
           syntax
              > datatype variable_name = value
                e.g: String name = "harry";
        */
        // STRINGS
        String name = "mohsin"; 
        System.out.println(name);

        //INTEGER
        int i = 56;
        System.out.println(i);

        //FLOAT
        float a = 5.99f;
        System.out.println(a);

        //BOOLEAN
        boolean brown = true;
        System.out.println(brown);

        //multi line variable
        int w = 7, e=90, t=4, y=56;
        System.out.println(y);

        //CHAR
        char gg = 's';
        System.out.println(gg);

        //check out primitive and non primitive data types
        
        // float only prints few decimals
        float hh = 33.888787654f;
        System.out.println(hh);
        
        //while double prints more than few decimals
        double ggf = 33.8880787654d;
        System.out.println(ggf);
        

        // OPERATORS AND OPERANDS 
        int k =6, b=4;
        System.out.println("the sum of k & b is: ");

        System.out.println(k + b);
       
       // to print the value in same line just remove 'ln'
        int ke =6, be=4;
        System.out.print("the sum of ke & be is: ");

        System.out.println(ke + be);
        
        // subtraction
        int num1 =6, num2=4;
        System.out.print("the sub val of num1 & num2 is: ");

        System.out.println(num1 - num2);

        // division
        int num3 =10, num4=2;
        System.out.print("the divisal of num3 & num4 is: ");

        System.out.println(num3 / num4);

        // multiplication
        int num5 =6, num6=4;
        System.out.print("the product of num5 & num6 is: ");

        System.out.println(num5 * num6);

        // modulus
        System.out.print("the modulus of num5 & num6 is: ");
        System.out.println(num5 % num6);


        // increment/decrement
        System.out.println(num5++); //here num5 has become 7 but its not printed coz of sign
        System.out.println(++num5); //here num5 has become 8 and is printed coz it has already became 7 and coz of sign its printed
        System.out.println(num5--); //here num5 has become 7 but its not printed coz of sign
        System.out.println(--num5); //here num5 has become 6 and is printed coz it has already became 7 and coz of sign its printed


        // assignment operators
        int numb=16, numc=30;
        numb += 4;
        numc -= 6;
        numb *= 2;
        numc /= 2;
        numb %= 15;
        System.out.println("new val of numb is: " + numb);
        System.out.println("new val of numc is: " + numc);




                




        

        

        
        
        
        
        
        
        
        
        
        
        

        
    }
  }