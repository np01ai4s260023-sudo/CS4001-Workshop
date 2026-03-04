public class DefaultValues {
    
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    
    // local variables dont have default values
    // java only gives defaults to class fields/member variables
    // if you try this inside main without initializing, it wont compile
    
    public static void main(String[] args) {
        
        DefaultValues obj = new DefaultValues();
        
        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.i);
        System.out.println(obj.l);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.c);
        System.out.println(obj.bool);
    }
}