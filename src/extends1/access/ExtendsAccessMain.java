package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}


/**
 * Parent.publicMethod
 * Parent.protectedMethod
 * ==Parent 메서드 안==
 * publicValue = 1
 * protectedValue = 1
 * defaultValue = 0
 * privateValue = 0
 * Parent.defaultMethod
 * Parent.privateMethod
 */