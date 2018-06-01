import java.security.SecureRandom;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MagicEightBall {

    public static void main(String[] args) {

        String answers[] = {"It is certain", "It is decidedly so", "Without a doubt",
                "Yes - definitely", "You may rely on it", "As I see it, yes",
                "Most likely", "Outlook good", "Signs point to yes",
                "Yes", "Reply hazy, try again", "Ask again later",
                "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                "Don't count on it", "My reply is no", "My sources say no",
                "Outlook not so good", "Very doubtful"};

        //constructs a random number generator
        SecureRandom randomNumber = new SecureRandom();
        ImageIcon image = new ImageIcon("8ball_small.jpg");
        int counter = 0;

        //while loop allows the user to continue asking questions until they click no
        while(counter != 1) {
            //prompts the user to enter a question
            String answer = JOptionPane.showInputDialog(null,
                    "Type your questions below",
                   "YOU ASKED: ", JOptionPane.INFORMATION_MESSAGE);

            //displays the answer
            if(answer != null)
                JOptionPane.showMessageDialog(null,   answers[randomNumber.nextInt(answers.length)],
                        "The Magic-8 Ball SAYS: ", JOptionPane.PLAIN_MESSAGE, image);

            //gives the user the option to click yes or no to continue asking questions
            counter = JOptionPane.showConfirmDialog(null, "Do you have another question for the Magic 8-Ball?", "",
                    JOptionPane.YES_NO_OPTION, 0, image);
        }

        //displays name after user enters no
        JOptionPane.showMessageDialog(null, "Programmed by Fadhl Deen", "Goodbye!",
                JOptionPane.PLAIN_MESSAGE, image);
    }
}
