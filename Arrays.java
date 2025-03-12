public class Arrays {
    public static void main(String[] args) {
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        double[] arrDouble = new double[3];
        arrDouble[0] = 1.57;
        arrDouble[1] = 7.654;
        arrDouble[2] = 9.986;

        boolean[] arrBoolean = new boolean[3];
        arrBoolean[0] = true;
        arrBoolean[1] = false;
        arrBoolean[2] = true;

        System.out.println("Задача 2");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]);
            if (i < arrInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]);
            if (i < arrDouble.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrBoolean.length; i++) {
            System.out.print(arrBoolean[i]);
            if (i < arrBoolean.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");

        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(arrInt[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.print(arrDouble[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrBoolean.length - 1; i >= 0; i--) {
            System.out.print(arrBoolean[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("Задача 4");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i] = arrInt[i] + 1;
                System.out.println("Элемент массива №" + i + " был изменен на " + (arrInt[i]));
            } else {
                System.out.println("Элемент массива №" + i + " со значением " + arrInt[i] +
                        " изменен не был!");
            }
        }
    }
}
