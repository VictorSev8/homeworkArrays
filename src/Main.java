public class Main {
    public static void main(String[] args) {
        // TASK 1
        System.out.println("Task1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        int[] vegetables = {3, 6, 9, 4, 5};

        // TASK 2
        System.out.println("TASK 2");
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int a = 0; a < doubles.length; a++) {
            if (a == doubles.length - 1) {
                System.out.println(doubles[a]);
                break;
            }
            System.out.print(doubles[a] + ", ");
        }
        for (int b = 0; b < vegetables.length; b++) {
            if (b == vegetables.length - 1) {
                System.out.println(vegetables[b]);
                break;
            }
            System.out.print(vegetables[b] + " ");
        }

        // TASK 3
        System.out.println("TASK 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }

        for (int a = doubles.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.println(doubles[a]);
                break;
            }
            System.out.print(doubles[a] + ", ");
        }

        for (int b = vegetables.length - 1; b >= 0; b--) {
            if (b == 0) {
                System.out.println(vegetables[b]);
                break;
            }
            System.out.print(vegetables[b] + ", ");
        }

        // TASK 4
        System.out.println("TASK 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 0) {
                System.out.print(weight[i] + ", ");
            } else {
                weight[i] = weight[i] + 1;
                System.out.print(weight[i] + ", ");
            }
        }
    }
}

