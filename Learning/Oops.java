// class inOops 
// {
//     int a;

//      public int add(int n1, int n2)
//      {
//         int r = n1+ n2;
//         return r;
//         // System.out.println("in add");
//         // return 0;
//      }

// }
// public class Oops {
//     public static void main(String[] args)
//      {
//         int num1 = 4;
//         int num2 = 5;

//         inOops iOops = new inOops();

//         int result = iOops.add(4,5);

//         //  int result = num1 + num2;
//         System.out.println(result);

        
//     }
// }


// // object oriented programming
// // object - properties and behaviour


// class Computer
// {
//     public void playMusic()
//     {
//         System.out.println("Music Playing...");
//     }
//     public String getMeAPen(int cost)
//     {
//         if(cost >= 10)
//         return "Pen";
//         else
//         return "Nothing";
//     }
// }
// public class Oops
// {
//     public static void main(String[] args) {
        
//         Computer obj = new Computer();
//         obj.playMusic();
//         String str = obj.getMeAPen(2);
//         System.out.println(str);
//     }
// }
class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public int add1(int n1,int n2)
    {
        return n1 + n2;
    }
    public int add(double n1,int n2)
    {
        return n1 + n2;
    }
}

public class Oops
{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add1(3, 4);
        System.out.println(r1);
    }
}