public class Main {
    public static void main(String[] args) {

        tasc1();
//        tasc2();
        tasc3();
        tasc4();

    }

    public static void tasc1() {
        System.out.println("Задача 1");
//        1.
        int[] pet = new int[3];
        pet[0] = 1;
        int cat = pet[0];
        pet[1] = 2;
        int pig = pet[1];
        pet[2] = 3;
        int dog = pet[2];

//        1.1
        double[] porc = new double[]{7.57, 5.654, 9.6, 2.23, 8.65};
        porc[1] = 7.654;
        porc[0] = 1.57;
        porc[3] = 9.986;
        porc[2] = 7.777;

//        1.2
        int[] boxToy = new int[]{1, 3, 5, 7, 8, 2, 9, 35, 1,};
//    }

//    public static void tasc2() {


//   Задача 2
//    1

        for (int i = 0; i < pet.length; i++) {
            System.out.print(pet[i]);
            if (i != pet.length)
                System.out.print(", ");
        }
        System.out.println();
//        1.1
        for (double t : porc) {
            System.out.print(t + " ");
        }
        System.out.println();


//        1.2
        for (int f = 0; f < boxToy.length; f++) {
            System.out.print(boxToy[f]);
            System.out.print(", ");
        }
    }

    public static void tasc3() {
        System.out.println("Задача 3");

        int[] pet = new int[3];
        pet[0] = 1;
        int cat = pet[0];
        pet[1] = 2;
        int pig = pet[1];
        pet[2] = 3;
        int dog = pet[2];
        for (int f = pet.length - 1; f >= 0; f--) {
            System.out.print(pet[f]);
            System.out.print(", ");
        }
        System.out.println();

        double[] porc = new double[]{7.57, 5.654, 9.6, 2.23, 8.65};
        porc[1] = 7.654;
        porc[0] = 1.57;
        porc[3] = 9.986;
        porc[2] = 7.777;
        for (int f = porc.length - 1; f >= 0; f--) {
            System.out.print(porc[f]);
            System.out.print(", ");
        }
        System.out.println();

        int[] boxToy = new int[]{1, 3, 5, 7, 8, 2, 9, 35, 1,};
        for (int f = boxToy.length - 1; f >= 0; f--) {
            System.out.print(boxToy[f]);
            System.out.print(", ");
        }
    }

    public static void tasc4() {
        System.out.println("Задача 4");

        int[] pet = new int[3];
        pet[0] = 1;
        int cat = pet[0];
        pet[1] = 2;
        int pig = pet[1];
        pet[2] = 3;
        int dog = pet[2];

        for (int t = 0; t < pet.length; t++) {
            if (pet[t] % 2 != 0) {
                pet[t] += 1;
                System.out.println(pet[t] + " ");
            }
        }
    }
}

