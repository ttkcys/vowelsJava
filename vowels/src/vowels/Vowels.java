package vowels;

public class Vowels {

    public static void main(String[] args) {

        //a,e,i,o,u,y
        char letter = 'k';

        switch (letter) {
            case 'A':
            case 'a':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Bold vowels");
                break;
            default:
                System.out.println("Thin vowels");

        }
    }

}
