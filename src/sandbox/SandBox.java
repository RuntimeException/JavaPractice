package sandbox;

class A {
}

class B extends A {
}

public class SandBox {

    public static void main(String[] args) {
        B[] b = new B[10]; // OK
        A[] a = b; // OK
        a[0] = new A(); // OK, de futásidõben ArrayStoreException
    }

}
