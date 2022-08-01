package Chapter5;

public class Singleton {
    //Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    private volatile static Singleton uniqueInstance;

    //기타 인스턴스 변수

    //private 생성자이므로 Singleton에서만 클래스의 인스턴스를 만들 수 있습니다.
    private Singleton() {}

    //getInstance() 메소드는 클래스의 인스턴스를 만들어서 리턴합니다.
    public static synchronized Singleton getInstance() {
        //인스턴스의 존재 여부를 판단하여 인스턴스를 리턴합니다.
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
