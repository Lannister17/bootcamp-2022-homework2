package methods;

public class methods {
    public static void main(String[] args) {
        sayibulmaca();
        mesajver("saçödmöçasdöçadsmççö");
    }

    public static void sayibulmaca() {
        int[] numbers = new int[]{0,1,3,5,7,9};
        int finding = 6;
        boolean isCorrect = false;

        for (int sayi : numbers) {
            if (finding == sayi){
                isCorrect = true;
            }
        }

        if (isCorrect){
            System.out.println(finding + " Dizinin elemanlarından biridir..");
        }else {
            System.out.println(finding + " Dizinin elemanlarından biri değildir..");
        }
    }

    public static void mesajver (String message) {
        System.out.println(message);
    }
}
