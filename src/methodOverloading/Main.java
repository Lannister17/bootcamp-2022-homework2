package methodOverloading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int result = dortIslem.topla(12,15);
        System.out.println(result);
        int result2 = dortIslem.topla(12,11,10);
        System.out.println(result2);
    }
}
