package com.example;

// 1) Top-Level Class
public class OuterClass {

    //some types of nested class 
    public int x = 42;

    public void method1() {
        // local classes are inner classes but not members of the outer class
        // 2) Local Inner Class
        class LocalClass {

            public void localPrint() {
                System.out.println("In local class");
                System.out.println(x);
            }
        }
        LocalClass lc = new LocalClass();
        lc.localPrint();
    }

    public void method2() {
        // 3) Anonymous Local Inner Class
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("In an anonymous local class method");
                System.out.println(x);
            }
        };
        r.run();
    }

    // 4) Anonymous Inner Class
    public Runnable r = new Runnable() {

        @Override
        public void run() {
            System.out.println("In an anonymous class method");
            System.out.println(x);
        }
    };
    // 5) Anonymous Inner Class
    Object o = new Object() {

        @Override
        public String toString() {
            return "In an anonymous class method";
        }
    };

    // 6) Inner Class
    public class InnerClass {

        // hides OuterClass x
        public int x = 43;
        //static requires final
        public static final int y = 44;
        public static int c = 32;

        public void innerPrint() {
            System.out.println("In a inner class method");
            System.out.println(x + c);
        }
    }
    
    // not an inner class because it is static
    // 7) Static Nested Class
    public static class StaticNestedClass {

        public void staticNestedPrint() {
            System.out.println("In a static nested class method");
            //compile error
            //System.out.println(x);
        }
    }

    // nesting...
    // 8) Inner Class
    public class A {
        // 9) Inner Class 
        public class B {

            public void method() {
                // 10) Local Inner Class
                class C {
                }
            }
        }
    }
}