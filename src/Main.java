import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Variables in JAVA
//        String a="java1";
//
//        String b="java2";
//         //Primitive types of Datatypes  in java
//        byte age=30;
//        long phone=837193854L;
//        float pi=3.14F;
//        char a="#";
//        boolean isAdult=false;

        //Non- Primitive types of Datatypes  in java
//        String name= "nasim";
//        String Friend =new String("sam");
//        System.out.println(name.length());   //Length function in java

        //Concatinate
//        String name1="raju";
//        System.out.println(name1.charAt(3));
//
//        //Replace Function
//
//        String name="raju";
//
//       String name2= name1.replace('a','c');
//        System.out.println(name2);

        //Substring Method in java  ,Strings are inMutable
        //String name="raju and sam";
//       System.out.println(name.substring(0,8));


        //length
//        System.out.println(marks.length);

        //sort
//        System.out.println(marks[0]);
//
//        Arrays.sort(marks);
//        System.out.println(marks[0]);
//
//        int[] marks={67,90,85};
//        int[][] result={{67,90,85},{96,98,93}};
//        System.out.println(result[1][0]);


        //Casting
//        double price=100;
//        double fp=price+18;
//
//        System.out.println(fp);


        //Explicit Casting
//        int p=100;
//        int fp = p+ (int) 23.34;
//        System.out.println(fp);

        //constants
//        int age=20;
//         age=21;
//        age=22;
//
//        final float pi=3.14F;
//        pi=2.3F;


        //operators
//        double a=16;
//        double b=3;
//        double c=a%b;
//        System.out.println(c);

        //assignment oparators
//        int num=2;
//
//        System.out.println(--num);
//        System.out.println(num);

        //Maths Function(Max,min)
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please input your age ");
//        int age = sc.nextLine(age);


        //conditional Oparators[IF ELSE ]
//        int canvote=17;
//        if (canvote>18){
//            System.out.println("he can vote ");
//        } else
//            System.out.println("he can;t vote");

        //Logical Operators(&& and operator )
//        int a=23;
//        int b=34;
//        if (a<30  && b<40 )
//            System.out.println("both less 50");

        //|| Logical OR
//        if (a<50 || b<50)
//        System.out.println(" less than 50");

        //Conditional statements
//        int pen=12;
//        int notebook=45;

//        Scanner sc = new Scanner(System.in);
//        int cash = sc.nextInt();
//        if (cash < 10) {
//            System.out.println("can not buy anything  ");
//            System.out.println("Get more cash ");
//
//        } else if (cash > 10 && cash < 50) {
//            System.out.println("can get 1 thing");
//        } else {
//            System.out.println("can get both items");
//        }


//        Switch statements ,BREAK KEYWORD
//        int day = 1;
//        switch (day) {
//            case 1:
//
//                System.out.println("monday");
//                break;
//            case 2:
//
//                System.out.println("tuesday");
//            default:
//                System.out.println("wed - sunday ");
//        }


        //print number  that is odd and Even on Java
       int num,remainder;
           System.out.println("please enter the number ");
           Scanner sc=new Scanner(System.in);
              num= sc.nextInt();
              sc.close();

              remainder = num % 2;
                    if(remainder==0)
                        System.out.println(num + " Its an  even number ");
                     else
                        System.out.println(num + " Its an odd number ");

                     //print number form 0 to 100





    }
}
