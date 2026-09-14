package com.sparta.nam.oop;

public class App {
    public static void main(String[] args) {
        Person nish = new Person("Nish", "Mandal", 1);
//        Vehicle example = new Vehicle();
//        System.out.println(nish.getAge());
//        nish.setAge(37);
//        System.out.println(nish.getAge());
//        System.out.println(nish.getFullName());
//        Person eghosa = new Person("Eghosa", "Ogua");

        // compile time polymorphism
//        add(1,2);
//        add(1,2,3);

        Hunter mikyle = new Hunter("Mikyle", "Yakub", 25, "Canon");
        Hunter ramla = new Hunter("Ramla", "Ramla", 21, "Nikon");
//        System.out.println(mikyle.getAge());
//        System.out.println(mikyle.shoot());
//        Vehicle vec = new Vehicle(1,1,1,1);
//        System.out.println(vec);
//        System.out.println(nish);
//        System.out.println(mikyle.toString());
//        System.out.println(mikyle.hashCode());
//        System.out.println(mikyle.getClass());
//        System.out.println(mikyle.equals(ramla));
        // Hunter.shoot(); // shoot is NOT a static method. I must create a Hunter object to use the shoot method
//        System.out.println(Hunter.sayHello()); // I do not need to create a Object from the class to use a static method

        // Polymorphc Arrays

//        Person[] objs = new Person[2];
        Person nish1 = new Person("Nish", "Mandal", 19);
        Person nish2 = new Hunter("Nish", "Kumar", 29, "Nikon");
        Vehicle v1 = new Vehicle(12,20);
        Airplane a1 = new Airplane(12,20,"NishFlies");

//        objs[0] = nish1;
//        objs[1] = nish2;
//        objs[2] = v1;
//        objs[3] = a1;
//
//        for (Person person: objs){
//            System.out.println(person);
//        }
//
//        spartaWrite(nish1);

        Movable[] moveables = {nish1,nish2,v1,a1};
        for (Movable movable:moveables){
            System.out.println(movable.move());
        }


    }

//    public static void spartaWrite(Person p){
//        System.out.println(p);
//        if (p instanceof Hunter){
//            Hunter hunterObj = (Hunter) p;
//            System.out.println(hunterObj.shoot());
//       }
    }


//    // Method overloading
//    public static int add(int a, int b){
//        return a + b;
//    }
//
//    public static double add(double a, double b){
//        return a + b;
//    }
//
//    public static int add(int a, int b, int c){
//        return a + b + c;
//    }
//}
