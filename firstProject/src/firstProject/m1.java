package firstProject;

public class m1 {

    public static void main(String[] args) {
        SayHelloClass sayHelloObject = new SayHelloClass();
        sayHelloObject.sayHelloMethod();
    }
}

class SayHelloClass {
    public void sayHelloMethod() {
        System.out.println("Hello");
    }
}


