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
// class Calculator
// {
//     public int add(int n1, int n2, int n3)
//     {
//         return n1 + n2 + n3;
//     }
//     public int add1(int n1,int n2)
//     {
//         return n1 + n2;
//     }
//     public int add(double n1,int n2)
//     {
//         return n1 + n2;
//     }
// }

// public class Oops
// {
//     public static void main(String[] args) {
//         Calculator obj = new Calculator();
//         int r1 = obj.add1(3, 4);
//         System.out.println(r1);
//     }
// }



// // Stack and Heap in java 
// class Calculator
// {
//     int num;
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }
// }
// public class Oops {
//     public static void main(String[] args) {
//         int data = 10;
//         Calculator obj = new Calculator();
//         int r1 = obj.add(3,4);
//         System.out.println(r1);
//     }

    
// }

// Need of an Array in Java
// to store multiple value in single (space)go also to access easily


// public class Oops
// {
//     public static void main(String[] args) 
//     {
//         int nums[][] = new int[3][4];
        

//         for (int i=0;i<3;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//                nums[i][j] = (int)(Math.random()*10);
                
//             }
        
//         }


//         for (int i=0;i<4;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//                 System.out.print( nums [i][j] + " ");
//             }
//             System.out.println();
//         }

//         for (int n[]: nums)
//         {
//             for(int m:n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// Jagged and 3D array

// public class Oops
// {
//     public static void main(String[] args) 
//     {
//         int nums[][] = new int[3][]; // jagged 

//         nums[0]= new int[3];
//         nums[1]= new int[4];
//         nums[2]= new int[2];
        

//         for (int i=0;i<nums[i].length;i++)
//         {
//             for(int j=0;j<nums[i].length;j++)
//             {
//                nums[i][j] = (int)(Math.random()*10);
                
//             }
        
//         }


//         for (int i=0;i<4;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//                 System.out.print( nums [i][j] + " ");
//             }
//             System.out.println();
//         }

//         for (int n[]: nums)
//         {
//             for(int m:n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// // 3 D array
// public class Oops
// {
//     public static void main(String[] args) 
//     {
//         int nums[][][] = new int[3][4][5]; // 3 dimentional array

       
        

//         for (int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums[i].length;j++)
//             {
//                 for(int k=0;k<nums[i][j].length;k++)
//                 {
//                  nums[i][j][k] = (int)(Math.random()*10);
//                 }
                
//             }
        
//         }


//         for (int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums[i].length;j++)
//             {
//                  for(int k=0;k<nums[i][j].length;k++)
//                  {
//                     System.out.println( nums[i][j][k] + " ");
//             }
//             System.out.println();
//             }
//             System.out.println();
//         }

//         for (int n[][]: nums)
//         {
//             for (int m[]: n)
//             {
//                 for(int k: m)
//                 {
//                     System.out.print(k + " ");
//                 }
//             System.out.println();
//             }
//         }
//     }
// }

