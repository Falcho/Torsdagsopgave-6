package Task1;

public class Main {

    public static void main(String[] args) {
        Prints print = new Prints();
        //   System.out.println("flows.methodA(\"Hello, world\");");
        //   flows.methodA("Hello, world");
        System.out.println("flows.methodA(\"start\");");
        print.methodA("start");
        System.out.println("flows.methodB(\"Hello, world\");");
        print.methodB("Hello, world");
        System.out.println("flows.methodC(\"Hello, world\");");
        print.methodC("Hello, world");
        System.out.println("flows.methodD(25);");
        print.methodD(25);


    }
}