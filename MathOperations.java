
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
        
        System.out.println("Arithmetic: ");
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;
        
        System.out.println("The sum of two numbers is: "+sum);
        System.out.println("The difference of two numbers is: "+diff);
        System.out.println("The multiple of two numbers is: "+mul);
        System.out.println("The division of two numbers is: "+div);
        
        System.out.println("Unary: ");
        System.out.println(a);
        System.out.println(++a);
        
        System.out.println("Assignment: ");
        int c=7;
        
        System.out.println("Relational: ");
        if(a==b){
            System.out.println("a and b are equal.");
        }
        else{ System.out.println("a and b are not equal");
        }
        if(a>=b){
            System.out.println("a is greater than or equals to b.");
        }
        else{ System.out.println("a is not greater than or not equals to b");
        }
        if(a<=b){
            System.out.println("b is greater or equals to than a");
        }
        else{ System.out.println("b is not greater than or equals to a");
        }
        if(a!=b){
            System.out.println("a is not the same as b");
        }
        else{ System.out.println("a is same as b");
        }
        if(a>b){
            System.out.println("a is greater than b.");
        }
        else{ System.out.println("a is not greater than b");
        }
        if(a<b){
            System.out.println("b is greater than a");
        }
        else{ System.out.println("b is not greater than a");
        }
        
        System.out.println("Logical: ");
        if(a>9 && b>4){
            System.out.println("a is larger than 9 and b is larger than 4");
        }
        else{
            System.out.println("not larger");
        }
        if(a<9 || b<4){
            System.out.println("smaller");
        }
        else{
            System.out.println("not smaller");
        }
        
        System.out.println("Ternary: ");
        String value=(c>6) ? "value of c is greater than 6" : "value of c is not greather than 6";
        System.out.println(value);
    }
}