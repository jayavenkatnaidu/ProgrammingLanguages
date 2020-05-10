public class ControlSwitch {
    public static void main(String args[]) {
        char color = 'g';

        switch (color) {

            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'w':
                System.out.println("White");
                break;

            default:
                System.out.println("No Color");
        }
    }
}
