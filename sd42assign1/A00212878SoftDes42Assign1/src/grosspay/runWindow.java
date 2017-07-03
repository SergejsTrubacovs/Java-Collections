//A00212878
package grosspay;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class runWindow {
	
	HashSet<GrossPay> set = new HashSet();
    int current =0;

	private JFrame frmGrossPay;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldDepartment;
	private JTextField textFieldPosition;
	private JTextField textFieldRate;
	private JTextField textFieldHours;
	private JTextField textFieldGrossPay;
	private JTextField textFieldSetNewRate;
	
	//private static DecimalFormat df2 = new DecimalFormat(".##");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					runWindow window = new runWindow();
					window.frmGrossPay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public runWindow() {
		initialize();
		
		double rate1 = 38.00;
		double rate2 = 45.57;
		double rate3 = 63.08;
		double rate4 = 76.45;
		double rate5 = 98.56;
		
		Collections.addAll(set ,
				new GrossPay("Joe", "Mullins", "Engineering", "Lecturer", rate1, 12, 0.00),
				new GrossPay("Joan", "Macgill", "Science", "Researcher", rate1, 35, 0.00),
				new GrossPay("Jim", "Mitchell", "Business", "Researcher", rate1, 25,0.00),
				new GrossPay("John", "Magner", "Humanities", "Lecturer", rate3, 16, 0.00),
				new GrossPay("Jean", "Madden", "Design", "Professor", rate4, 14, 0.00),
				new GrossPay("Jack", "Minogue", "Hospitality", "Administrator", rate2, 37, 0.00),
				new GrossPay("Josephine", "Mahony", "Nursing", "Head", rate5, 40, 0.00),
				new GrossPay("Juan", "Mosley", "Engineering", "Professor", rate4, 11, 0.00),
				new GrossPay("Jamie", "Mulllen", "Science", "Researcher", rate1, 37, 0.00),
				new GrossPay("Julie", "Mooney", "Business", "Lecturer", rate3, 18, 0.00),
				new GrossPay("Jane", "Mccarthy", "Design", "Administrator", rate2, 45, 0.00),
				new GrossPay("James", "May", "Hospitality", "Researcher", rate1, 9, 0.00),
				new GrossPay("Joseph", "Manning", "Hospitality", "Lecturer", rate3, 16, 0.00),
				new GrossPay("Judith", "Milner", "Nursing", "Lecturer", rate3, 20, 0.00),
				new GrossPay("Jerome", "Murphy", "Engineering", "Head", rate5, 42, 0.00),
				new GrossPay("Jude", "Manley", "Science", "Head", rate5, 41, 0.00),
				new GrossPay("Juanita", "Mahon", "Engineering", "Administrator", rate2, 49, 0.00),
				new GrossPay("Justin", "Maguire", "Business", "Lecturer", rate3, 16, 0.00),
				new GrossPay("Jacqulinen", "Musgrave", "Business", "Professor", rate4, 10, 0.00),
				new GrossPay("Julia", "Moore", "Science", "Administrator", rate2, 38, 0.00)
				);
		display(gotoEl(0));
	}
	
	public GrossPay search(String s) {
		GrossPay res=null;
		  Iterator iter =set.iterator();
		  while(iter.hasNext())
		  {         GrossPay element =(GrossPay)iter.next();
		            if (s.equals(element.readSurname())) res=element;
		  }
		  return res;
	}
	
	public GrossPay gotoEl(int index){
		GrossPay res=null;
		  Iterator iter =set.iterator();
		  int count=0;
		  while(iter.hasNext()&& count<=index)
		  {         res =(GrossPay)iter.next();
		            count++;
		  }		  
		  return res;
	}
		
	public void display(GrossPay element){
		textFieldName.setText(element.readName());
		textFieldSurname.setText(element.readSurname());
		textFieldDepartment.setText(element.readDepartment());
		textFieldPosition.setText(element.readPosition());
		textFieldRate.setText(""+element.readRate());
		textFieldHours.setText(""+element.readHours());
		textFieldGrossPay.setText(""+element.readGrossPay());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGrossPay = new JFrame();
		frmGrossPay.setTitle("A00212878 Gross Pay");
		frmGrossPay.setBounds(100, 100, 599, 453);
		frmGrossPay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGrossPay.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(55, 102, 100, 20);
		frmGrossPay.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSurname.setBounds(55, 133, 100, 20);
		frmGrossPay.getContentPane().add(lblSurname);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(55, 164, 100, 20);
		frmGrossPay.getContentPane().add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPosition.setBounds(55, 195, 100, 20);
		frmGrossPay.getContentPane().add(lblPosition);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRate.setBounds(55, 226, 100, 20);
		frmGrossPay.getContentPane().add(lblRate);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHours.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHours.setBounds(55, 257, 100, 20);
		frmGrossPay.getContentPane().add(lblHours);
		
		JLabel lblGrossPay = new JLabel("Gross Pay");
		lblGrossPay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrossPay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrossPay.setBounds(55, 288, 100, 20);
		frmGrossPay.getContentPane().add(lblGrossPay);
		
		JLabel lblTitle = new JLabel("Gross Pay");
		lblGrossPay.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblGrossPay.setBounds(244, 45, 118, 25);
		frmGrossPay.getContentPane().add(lblTitle);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldName.setBounds(181, 103, 160, 23);
		frmGrossPay.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(181, 134, 160, 23);
		frmGrossPay.getContentPane().add(textFieldSurname);
		
		textFieldDepartment = new JTextField();
		textFieldDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldDepartment.setColumns(10);
		textFieldDepartment.setBounds(181, 166, 160, 23);
		frmGrossPay.getContentPane().add(textFieldDepartment);
		
		textFieldPosition = new JTextField();
		textFieldPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(181, 197, 160, 23);
		frmGrossPay.getContentPane().add(textFieldPosition);
		
		textFieldRate = new JTextField();
		textFieldRate.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldRate.setColumns(10);
		textFieldRate.setBounds(181, 227, 160, 23);
		frmGrossPay.getContentPane().add(textFieldRate);
		
		textFieldHours = new JTextField();
		textFieldHours.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldHours.setColumns(10);
		textFieldHours.setBounds(181, 259, 160, 23);
		frmGrossPay.getContentPane().add(textFieldHours);
		
		textFieldGrossPay = new JTextField();
		textFieldGrossPay.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldGrossPay.setColumns(10);
		textFieldGrossPay.setBounds(181, 289, 160, 23);
		frmGrossPay.getContentPane().add(textFieldGrossPay);
		
		textFieldSetNewRate = new JTextField();
		textFieldSetNewRate.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldSetNewRate.setColumns(10);
		textFieldSetNewRate.setBounds(181, 320, 160, 23);
		frmGrossPay.getContentPane().add(textFieldSetNewRate);
				
		JButton btnFirst = new JButton("First");
		btnFirst.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				current=0;
				display(gotoEl(current));
				
				double rate = Double.parseDouble(textFieldRate.getText());
				double hours = Double.parseDouble(textFieldHours.getText());
				DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				String grossPay = decimalFormat.format(rate * hours);
				textFieldGrossPay.setText(grossPay);
			}
		});
		btnFirst.setBounds(367, 102, 130, 25);
		frmGrossPay.getContentPane().add(btnFirst);
		
		JButton btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				current = set.size()-1;
				display(gotoEl(current));
				
				double rate = Double.parseDouble(textFieldRate.getText());
				double hours = Double.parseDouble(textFieldHours.getText());
				DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				String grossPay = decimalFormat.format(rate * hours);
				String.format ("%.2f", rate);
				textFieldGrossPay.setText(grossPay);
			}
		});
		btnLast.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLast.setBounds(367, 133, 130, 25);
		frmGrossPay.getContentPane().add(btnLast);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (current<set.size()-1)current++;
				display(gotoEl(current));
				
				double rate = Double.parseDouble(textFieldRate.getText());
				double hours = Double.parseDouble(textFieldHours.getText());
				DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				String grossPay = decimalFormat.format(rate * hours);
				textFieldGrossPay.setText(grossPay);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(367, 164, 130, 25);
		frmGrossPay.getContentPane().add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (current>0)current--;
				display(gotoEl(current));
				
				double rate = Double.parseDouble(textFieldRate.getText());
				double hours = Double.parseDouble(textFieldHours.getText());
				DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				String grossPay = decimalFormat.format(rate * hours);
				textFieldGrossPay.setText(grossPay);
			}
		});
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrevious.setBounds(367, 195, 130, 25);
		frmGrossPay.getContentPane().add(btnPrevious);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldSurname.setText("");
				textFieldDepartment.setText("");
				textFieldPosition.setText("");
				textFieldRate.setText("");
				textFieldHours.setText("");
				textFieldGrossPay.setText("");
				textFieldSetNewRate.setText("");				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(367, 226, 130, 25);
		frmGrossPay.getContentPane().add(btnClear);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double rate = Double.parseDouble(textFieldRate.getText());
				double hours = Double.parseDouble(textFieldHours.getText());
				DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				String grossPay = decimalFormat.format(rate * hours);
				textFieldGrossPay.setText(grossPay);
				
				GrossPay element = new GrossPay(
						textFieldName.getText(),
						textFieldSurname.getText(),
						textFieldDepartment.getText(),
						textFieldPosition.getText(),
						Double.parseDouble(textFieldRate.getText()),
						Double.parseDouble(textFieldHours.getText()),
						Double.parseDouble(textFieldGrossPay.getText()));
				set.add(element);
				current=set.size()-1;
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInsert.setBounds(367, 257, 130, 25);
		frmGrossPay.getContentPane().add(btnInsert);
		
		JButton btnSetNewRate = new JButton("Set New Rate");
		btnSetNewRate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GrossPay el=search(textFieldSurname.getText());
				double newRate = Double.parseDouble(textFieldSetNewRate.getText());

				if (el!=null) {
				      el.setNewRate(newRate);
				      DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				      String strNewRate = decimalFormat.format(newRate);
				
				      textFieldRate.setText(strNewRate);
				}
				
				double rate = Double.parseDouble(textFieldRate.getText());
				double hours = Double.parseDouble(textFieldHours.getText());
				DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				String grossPay = decimalFormat.format(rate * hours);
				textFieldGrossPay.setText(grossPay);
			}
		});
		btnSetNewRate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSetNewRate.setBounds(367, 319, 130, 25);
		frmGrossPay.getContentPane().add(btnSetNewRate);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GrossPay el = search(textFieldSurname.getText());
				if (el==null) {
					textFieldName.setText("");
					textFieldSurname.setText("Not Found");
					textFieldDepartment.setText("");
					textFieldPosition.setText("");
					textFieldRate.setText("");
					textFieldHours.setText("");
					textFieldGrossPay.setText("");
					textFieldSetNewRate.setText("");
				}
				else { 
					display(el);
				}				
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(367, 288, 130, 25);
		frmGrossPay.getContentPane().add(btnSearch);
		
		JLabel lblGrossPay_1 = new JLabel("Gross Pay");
		lblGrossPay_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrossPay_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrossPay_1.setBounds(55, 288, 100, 20);
		frmGrossPay.getContentPane().add(lblGrossPay_1);
	}
}

//Sergejs
//Trubacovs
//Engineering
//Reseacher
