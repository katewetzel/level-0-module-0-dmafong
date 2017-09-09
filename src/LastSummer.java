import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog( "what is your name");
	JOptionPane.showMessageDialog(null,"I know what you did last summer");
	JOptionPane.showMessageDialog(null,"I know that you swam last summer "+name);
}
}
