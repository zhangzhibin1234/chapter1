package thinkInjava;

/**
 * @className:RunnableMethodReference
 * @desc:
 * @author:zzb
 * @date:2021/1/2621:31 version:1.0
 **/
class Go{
    static void go(){
        System.out.println("GO() :go");
    }
}
public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        new Thread(()-> System.out.println("lamda表达式")).start();

        new Thread(Go::go).start();

    }
}
