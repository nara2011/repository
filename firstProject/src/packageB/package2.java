package packageB;

import packageA.package1;

public class package2 {

    public static void main(String[] args) {
        package1 person = new package1("Nara", 13, "Azerbaycan", 123);

     //   System.out.println(person.age);
        System.out.println(person.id);

        person.getDetails();
    }
}

