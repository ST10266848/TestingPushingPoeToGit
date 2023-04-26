//In java write a program where a user can input a title of a movie that is no more than 20 characters long, 
//next they need to enter the movie code which is at least 4 characters long starting with a capital letter
//and contains a number. 
//If the movie is mmore than 20 characters a message saying "no more than 20 characters" must display
//If the movie code is not formatted properly a message saying "incorrect formatting" must show
//If the movie is 20 characters long a message saying "Movie entered into database" must show.
//If the movie code is correctly formatted a message saying "Movie code saved" must show. 
//(Use JOptionPane)
//.could be userful for POE Part 1

package movie;
import javax.swing.JOptionPane;

public class Movie {

    public static void main(String[] args) {
        //prompt the user to enter the movie 
        String title = JOptionPane.showInputDialog("Enter the movie title (no more than 20 characters):");
        
        // Check if the title is too long
        if (title.length() > 20) {
            JOptionPane.showMessageDialog(null, "Error: Movie title cannot be more than 20 characters:");
            return;
        }
        
        // Prompt the user to enter the movie code
        String code = JOptionPane.showInputDialog("Enter the movie code (at least 4 characters with a capital letter " + "and a number):");
        
        // Check if the code is formatted properly
        if (!code.matches("[A-Z].*[0-9].*") || code.length() < 9) {
            JOptionPane.showMessageDialog(null, "Error: Incorrect movie code formatting.");
            return;
        }
        
        // Check if the title is exactly 20 characters long
        if (title.length() == 20) {
            JOptionPane.showMessageDialog(null, "Movie entered into database.");
        } else {
            JOptionPane.showMessageDialog(null, "Movie title saved.");
        }
        
        // Check if the code is correctly formatted
        JOptionPane.showMessageDialog(null, "Movie code saved.");
    }
       
}
