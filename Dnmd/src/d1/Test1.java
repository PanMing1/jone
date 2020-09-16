package d1;
class Test2 {
    String name;
    int age;
    @Override
    public String toString() {
        return name+",ÄêÁä£º"+age;
    }
}

public class Test1 {
    public static void main(String[] args) {
    	Test2 p=new Test2();
        p.age=20;
        p.name="Àî¶«";
        System.out.println("info:"+p);
         
        Test2 t = new Test2();
        System.out.println(t);
    }
}