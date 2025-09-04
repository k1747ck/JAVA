//when we do same work but in different type that is called poly morphism 
// two types - function overloading (compile polymorphism) and function  overwriting(runtime polymorphism)
// different functions with same name


class Student
{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " ", age );
    }
}

public class Polymorphism {
      public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Khushi";
        s1.age = 20;

        s1.printInfo(s1.name , s1.age);
        }
}