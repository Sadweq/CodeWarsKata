//DESCRIPTION
/*
You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early
to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with
 a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings
 representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block in a direction and you
  know it takes you one minute to traverse one city block, so create a function that will return true if the walk the
  app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you
  to your starting point. Return false otherwise.

        Note: you will always receive a valid array containing a random assortment of direction letters
        ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).

*/

//My solution
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int i = 0;
        int verticalPosition = 0;
        int horizontalPosition = 0;
        do {
            switch (walk[i]) {
                case 'n':
                    verticalPosition += 1;
                    break;
                case 'e':
                    horizontalPosition += 1;
                    break;
                case 'w':
                    horizontalPosition -= 1;
                    break;
                case 's':
                    verticalPosition -= 1;
                    break;
                default:
                    break;
            }
            i += 1;
        } while (i < walk.length);
        if (horizontalPosition == 0 && verticalPosition == 0 && i == 10) return true;

        return false;
    }
}
