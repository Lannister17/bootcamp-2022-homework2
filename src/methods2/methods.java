package methods2;

public class methods {
    public static void main(String[] args) {
        String mesaj ="Bugün hava cok güzel..";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(message());
        int toplam = topla2(1,2,3,4,5,6,7,8,9,10);
        System.out.println(toplam);
    }
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }
    public static void delete(){
        System.out.println("silindi..");
    }
    public static int sayı(){
    return 7;
    }
    public static int topla(int sayi1,int sayi2){
    return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int total = 0;
        for (int number : sayilar){
            total = total + number;
        }
        return total;
    }
    public static String message(){
        return "Ankara";
    }
}
