package staticBlock;

public class StaticExample {
    static int a = 8;
    static int b;
    static {
        // will run only once when the first object is created i.e. when the class is loaded
        System.out.println("This is static");
        b = 32;
    }


    public static void main(String[] args) {

        if(args.length > 0){
            System.out.println("The cmd line arguments");

            for(String e : args){
                System.out.println(e);
            }
        }else{
            System.out.println("no args found");
        }

        StaticExample obj = new StaticExample();
        System.out.println(obj.a + " " + obj.b);

        obj.b = 100;

        StaticExample obj2 = new StaticExample();

        System.out.println(obj2.a + ' ' + obj2.b);

    }

}
