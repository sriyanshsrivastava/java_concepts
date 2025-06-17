package oops.java;
/*
 * 💡 What is an annotation in Java?
 *
 * 👉 An annotation is a special form of metadata that provides information to the compiler or runtime,
 *    but does not directly affect the program's logic.
 *
 * 👉 Purpose of annotations:
 *    - To give instructions to the compiler (e.g., @Override to ensure method overrides correctly).
 *    - To give information to tools/frameworks (e.g., @Entity, @Autowired in Spring).
 *    - To process code during compilation or runtime using reflection or annotation processors.
 *
 * 👉 Examples of built-in annotations:
 *    - @Override → ensures we are overriding a method of superclass.
 *    - @Deprecated → marks the method/class as deprecated, shows warning if used.
 *    - @SuppressWarnings → tells compiler to ignore certain warnings.
 *
 * 👉 Custom annotations:
 *    - We can create our own annotations using @interface.
 *    - Example:
 *        @interface MyAnnotation {
 *            String value();
 *        }
 *
 * 👉 How annotations work:
 *    - They can have elements (like parameters).
 *    - They can have different retention policies:
 *        - SOURCE → available only at source code level (discarded by compiler).
 *        - CLASS → available in bytecode but not at runtime.
 *        - RUNTIME → available at runtime (used by reflection, frameworks).
 *
 * ✅ Summary:
 * Annotations help separate metadata from logic — they add meaning to code that tools, compiler,
 * or frameworks can use without changing what the code actually does.
 */

class A3{
    public void show(){
        System.out.println("In A3 Show.");
    }
}

class B3 extends A3{
    @Override // this is annotation means we are saying compiler that I am overriding the method if we do mistake it will show me at first place.
    public void show(){
        System.out.println("In B3 Show.");
    }
    // if we don't use annotation it will not give error, and we won't know if we have really overridden or not.
    // so annotation helps with this problem.
}

public class Annotations {
    public static void main(String[] args) {
        B3 obj = new B3();
        obj.show();
    }
}
/*
 * 💡 Common built-in annotations in Java:
 *
 * 👉 @Override
 *    - Indicates that a method is intended to override a method from a superclass.
 *
 * 👉 @Deprecated
 *    - Marks a method, class, or field as deprecated (not recommended for use, may be removed in future).
 *
 * 👉 @SuppressWarnings
 *    - Tells the compiler to ignore specified warnings (e.g., unchecked, deprecation).
 *    - Example: @SuppressWarnings("unchecked")
 *
 * 👉 @FunctionalInterface (Java 8+)
 *    - Ensures an interface has exactly one abstract method (used for lambda expressions).
 *
 * 👉 @SafeVarargs
 *    - Suppresses warnings for varargs usage with generics in final, static, or private methods.
 *
 * 👉 @Native
 *    - Marks constants in an interface or class so they can be referenced in native code.
 *
 * 👉 @Retention
 *    - Specifies how long annotations are retained (SOURCE, CLASS, RUNTIME).
 *
 * 👉 @Target
 *    - Specifies where the annotation can be applied (method, field, class, etc.).
 *
 * 👉 @Documented
 *    - Ensures the annotation appears in Javadoc.
 *
 * 👉 @Inherited
 *    - Allows subclasses to inherit an annotation from their superclass.
 *
 * ✅ Note: These are part of java.lang.annotation or java.lang package and commonly used for
 * compiler instructions, documentation, or frameworks.
 */

