package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String t = JOptionPane.showInputDialog("What's your sign?");
	
	if(t.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "Tell your partner how much you love them today.");
	}
	if(t.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "You need others to support you.");
	}
	if(t.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "Today you'll feel the need for something different.");
	}
	if(t.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "Today you can use one of those connections youve built up.");
	}
	if(t.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "Money worries can bring you stress today.");
	}
	if(t.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "Someone or something from your past will threaten to bring you down today.");
	}
	if(t.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "You can bust through obstacles to get things done."); 
				}
	if(t.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "You'll have strong energy in your communication."); 
				}
	if(t.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "keep calm.");
				}
	if(t.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, " Something will tempt you to do something you know is wrong.");
		if(t.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You can explore opportunities.");
		}		
		if(t.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You need someone who is as motivated as you.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}}
