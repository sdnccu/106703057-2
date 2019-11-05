package Window;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class newWindow {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			newWindow window = new newWindow();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new RowLayout(SWT.VERTICAL));
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setLayoutData(new RowData(SWT.DEFAULT, 259));
		RowLayout rl_composite_1 = new RowLayout(SWT.VERTICAL);
		rl_composite_1.pack = false;
		rl_composite_1.justify = true;
		rl_composite_1.marginHeight = 5;
		composite_1.setLayout(rl_composite_1);
		
		Label lblNextPage = new Label(composite_1, SWT.NONE);
		lblNextPage.setText("Next Page");
		
		Button btnCheckButton_1 = new Button(composite_1, SWT.CHECK);
		btnCheckButton_1.setText("No");
		
		Button btnCheckButton_2 = new Button(composite_1, SWT.CHECK);
		btnCheckButton_2.setText("Not sure");
		
		Button btnCheckButton = new Button(composite_1, SWT.CHECK);
		btnCheckButton.setText("Yes");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayoutData(new RowData(353, SWT.DEFAULT));
		composite.setLayout(new RowLayout(SWT.VERTICAL));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayoutData(new RowData(345, 39));
		
		Button btnCh = new Button(composite_2, SWT.RADIO);
		btnCh.setBounds(0, 0, 51, 28);
		btnCh.setText("Read");
		
		DateTime dateTime = new DateTime(composite_2, SWT.BORDER);
		dateTime.setBounds(125, 0, 88, 24);
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setLayout(new StackLayout());
		composite_3.setLayoutData(new RowData(344, 149));
		
		Composite composite_4 = new Composite(composite, SWT.NONE);
		composite_4.setLayout(new GridLayout(2, false));
		composite_4.setLayoutData(new RowData(350, 62));
		
		Button button = new Button(composite_4, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		button.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		button.setText("< Back");
		
		Button btnNext = new Button(composite_4, SWT.NONE);
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		GridData gd_btnNext = new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1);
		gd_btnNext.heightHint = 28;
		gd_btnNext.widthHint = 143;
		btnNext.setLayoutData(gd_btnNext);
		btnNext.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNext.setText("Next >");

	}
}
