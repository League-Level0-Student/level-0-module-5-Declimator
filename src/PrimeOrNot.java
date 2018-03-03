import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	boolean IsPrime=true;
	String x=JOptionPane.showInputDialog("Choose any number");
	int eks=Integer.parseInt(x);
for(int y=2;y<eks;y++) {
	if(eks%y==0) {
		JOptionPane.showMessageDialog(null, eks + " is not prime.");
		IsPrime=false;
		break;
	}

}
if(IsPrime) {
	JOptionPane.showMessageDialog(null, eks + " is prime.");
}
}
}
