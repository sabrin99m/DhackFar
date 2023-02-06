import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DhackInterface {

	protected Shell shell;
	private Text txtBh;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DhackInterface window = new DhackInterface();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(192, 192, 192));
		shell.setImage(SWTResourceManager.getImage(DhackInterface.class, "/doc/resources/background.gif"));
		shell.setSize(744, 491);
		shell.setText("SWT Application");

		Button btnLogin = new Button(shell, SWT.BORDER);
		btnLogin.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnLogin.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnLogin.setBounds(280, 199, 138, 51);
		btnLogin.setText("LOGIN");

		txtBh = new Text(shell, SWT.READ_ONLY);
		txtBh.setText("Data");
		txtBh.setBounds(0, 406, 80, 31);

		DateTime dateTime = new DateTime(shell, SWT.BORDER);
		dateTime.setBounds(0, 404, 125, 33);

		DateTime dateTime_1 = new DateTime(shell, SWT.BORDER | SWT.TIME);
		dateTime_1.setBounds(131, 404, 125, 33);

	}
}
