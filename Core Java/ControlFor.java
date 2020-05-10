public class ControlFor {
    public static void main(String[] args) {

        //nested for loops to print triangular *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
