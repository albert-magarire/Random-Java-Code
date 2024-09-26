public class App {
    public static void main(String[] args) throws Exception {
        Test1 t1 = new Test1(3,4,5);
        Test1 t2 = t1;

    }
}

class Test1 {
    int x1;
    int x2 = 10;
    int x3;
    //Default Constructor
    Test1(){
        System.out.println("HELLO");
    }

    //Main Constructor
    Test1(int a, int b, int c){
        x1 = a;
        x2 = b;
        x3 = c;
    }
}

class Test2{
    int x2;

    Test2(int a){
        x2 = a;
    }
}