public class Main {
    public static void main(String[] args) {

        tasc1();
    }

    public static void tasc1() {
        System.out.println("Задача 1");
//        1.
        int[] weights = new int[5];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.println(weights[i]);
        }
//        1.1
        double[] porc = new double[]{7.57, 5.654, 9.6, 2.23, 8.65};
        porc[1] = 7.654;
        porc[0] = 1.57;
        porc[3] = 9.986;
        porc[2] = 7.777;
        for (int t = 0; t < 12; t++) {
            System.out.println(porc[t]);
        }
//        1.2
        int[] boxToy = new int[]{1,3,5,7,8,2,9,35,1};



    }
}