package effectivejava.chapter4.item19;

// Class whose constructor invokes an overridable method. NEVER DO THIS! (Page 95)
public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        System.out.println("Super overrideMe()");
        overrideMe();
        System.out.println("Super overrideMe()");
    }

    public void overrideMe() {
        System.out.println("Super override me");
    }
}
