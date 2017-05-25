package book;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class BookM extends JFrame {

	private JPanel contentPane;
	private JTextField TF_code;
	private JTextField TF_name;
	private JTextField TF_num;
	private JTextField TF_address;
	private JPanel panelText_user;
	private JPanel panelButton_user;
	private JScrollPane scrollPanel_user;
	private JTextField textField;

	public void usercontroll(){
		
		panelText_user = new JPanel();
		contentPane.add(panelText_user);
		panelText_user.setLayout(null);
		
		JLabel lblUser_code = new JLabel("회원코드");
		lblUser_code.setBounds(12, 10, 57, 15);
		panelText_user.add(lblUser_code);
		
		TF_code = new JTextField();
		TF_code.setBounds(81, 7, 116, 21);
		panelText_user.add(TF_code);
		TF_code.setColumns(10);
		
		JLabel lblUser_name = new JLabel("회원이름");
		lblUser_name.setBounds(12, 35, 57, 15);
		panelText_user.add(lblUser_name);
		
		TF_name = new JTextField();
		TF_name.setBounds(81, 32, 116, 21);
		panelText_user.add(TF_name);
		TF_name.setColumns(10);
		
		JLabel lblUser_num = new JLabel("회원번호");
		lblUser_num.setBounds(12, 60, 57, 15);
		panelText_user.add(lblUser_num);
		
		TF_num = new JTextField();
		TF_num.setBounds(81, 57, 116, 21);
		panelText_user.add(TF_num);
		TF_num.setColumns(10);
		
		JLabel lblUser_address = new JLabel("회원주소");
		lblUser_address.setBounds(12, 85, 57, 15);
		panelText_user.add(lblUser_address);
		
		TF_address = new JTextField();
		TF_address.setBounds(81, 82, 116, 21);
		panelText_user.add(TF_address);
		TF_address.setColumns(10);
		
		panelButton_user = new JPanel();
		panelButton_user.setBounds(454, 100, 418, 110);
		contentPane.add(panelButton_user);
		panelButton_user.setLayout(null);
		
		JButton btnNewButton = new JButton("회원추가");
		btnNewButton.setBounds(12, 10, 97, 23);
		panelButton_user.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원삭제");
		btnNewButton_1.setBounds(12, 41, 97, 23);
		panelButton_user.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원수정");
		btnNewButton_2.setBounds(12, 74, 97, 23);
		panelButton_user.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원검색");
		btnNewButton_3.setBounds(121, 10, 97, 23);
		panelButton_user.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원목록");
		btnNewButton_4.setBounds(121, 41, 97, 23);
		panelButton_user.add(btnNewButton_4);
		
		String colNames[] = {"회원코드","회원이름","회원번호","회원주소"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		
		scrollPanel_user = new JScrollPane(table);
		scrollPanel_user.setBounds(12, 220, 860, 382);
		contentPane.add(scrollPanel_user);
		
		setVisible(true);
		
	}
	public void bookcontroll(){
		
		panelText_user = new JPanel();
		panelText_user.setBounds(12, 100, 430, 110);
		contentPane.add(panelText_user);
		panelText_user.setLayout(null);
		
		JLabel lblBook_code = new JLabel("도서코드");
		lblBook_code.setBounds(12, 10, 77, 15);
		panelText_user.add(lblBook_code);
		
		TF_code = new JTextField();
		TF_code.setBounds(101, 7, 116, 21);
		panelText_user.add(TF_code);
		TF_code.setColumns(10);
		
		JLabel lblBook_name = new JLabel("도서이름");
		lblBook_name.setBounds(12, 35, 77, 15);
		panelText_user.add(lblBook_name);
		
		TF_name = new JTextField();
		TF_name.setBounds(101, 32, 116, 21);
		panelText_user.add(TF_name);
		TF_name.setColumns(10);
		
		JLabel lblBook_num = new JLabel("도서출판사");
		lblBook_num.setBounds(12, 60, 77, 15);
		panelText_user.add(lblBook_num);
		
		TF_num = new JTextField();
		TF_num.setBounds(101, 57, 116, 21);
		panelText_user.add(TF_num);
		TF_num.setColumns(10);
		
		JLabel lblBook_address = new JLabel("도서작가");
		lblBook_address.setBounds(12, 85, 77, 15);
		panelText_user.add(lblBook_address);
		
		TF_address = new JTextField();
		TF_address.setBounds(101, 82, 116, 21);
		panelText_user.add(TF_address);
		TF_address.setColumns(10);
		
		JLabel lblBook_value = new JLabel("도서개수");
		lblBook_value.setBounds(229, 10, 77, 15);
		panelText_user.add(lblBook_value);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(302, 7, 116, 21);
		panelText_user.add(textField);
		
		panelButton_user = new JPanel();
		panelButton_user.setBounds(454, 100, 418, 110);
		contentPane.add(panelButton_user);
		panelButton_user.setLayout(null);
		
		JButton btnNewButton = new JButton("도서추가");
		btnNewButton.setBounds(12, 10, 97, 23);
		panelButton_user.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("도서삭제");
		btnNewButton_1.setBounds(12, 41, 97, 23);
		panelButton_user.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("도서수정");
		btnNewButton_2.setBounds(12, 74, 97, 23);
		panelButton_user.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("도서검색");
		btnNewButton_3.setBounds(121, 10, 97, 23);
		panelButton_user.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("도서목록");
		btnNewButton_4.setBounds(121, 41, 97, 23);
		panelButton_user.add(btnNewButton_4);
		
		String colNames[] = {"도서코드","도서이름","도서출판사","도서저자","도서개수"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		
		scrollPanel_user = new JScrollPane(table);
		scrollPanel_user.setBounds(12, 220, 860, 382);
		contentPane.add(scrollPanel_user);
		
		setVisible(true);
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookM frame = new BookM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUser = new JButton("회원관리");
		btnUser.setBounds(12, 10, 97, 23);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					panelText_user.removeAll();
					panelButton_user.removeAll();
					scrollPanel_user.removeAll();
				} catch (Exception e) {
					System.out.println("실행");
				}
				usercontroll();
				panelText_user.validate();
				panelButton_user.validate();
				scrollPanel_user.validate();
			}
		});
		contentPane.add(btnUser);
		
		JButton btnBook = new JButton("도서관리");
		btnBook.setBounds(420, 10, 97, 23);
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					panelText_user.removeAll();
					panelButton_user.removeAll();
					scrollPanel_user.removeAll();
				} catch (Exception e2) {
					System.out.println("실행");
					e2.printStackTrace();
				}
				bookcontroll();
				panelText_user.validate();
				panelButton_user.validate();
				scrollPanel_user.validate();
			}
		});
		contentPane.add(btnBook);
		
		JButton btnLent = new JButton("대출관리");
		btnLent.setBounds(775, 10, 97, 23);
		btnLent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelButton_user.removeAll();
				panelText_user.removeAll();
				scrollPanel_user.removeAll();
			}
		});
		contentPane.add(btnLent);
	}
}
