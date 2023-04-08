import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DangNhap {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Đăng Nhập Hệ Thống");
        frame.setSize(350, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Tên Đăng Nhập:");
        userLabel.setBounds(10, 10, 120, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(120, 10, 160, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Mật Khẩu:");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(120, 40, 160, 25);
        frame.add(passwordText);

        JButton loginButton = new JButton("Đăng Nhập");
        loginButton.setBounds(120, 80, 100, 25);
        loginButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                if (("phamhoangminh2410it".equals(user)) && ("phamhoangminh2410".equals(password)))
                {
                    QuanLy a = new QuanLy();
                    KinhMat b;
                    Phieu c;
                    int chon;
                    Scanner sc = new Scanner(System.in);
                    a.menuChinh();
                    do
                    {
			System.out.print("\nNhap Lua Chon: "); chon = sc.nextInt();
			switch (chon)
			{
                            case 1:
                            {
				c = new PhieuNhapKho();
				a.themDSPhieu(c);
                            } break;
                            case 2:
                            {
				c = new PhieuXuatKho();
				a.themDSPhieu(c);
                            } break;
                            case 3:
                            {
				a.hienDanhSachPhieuNhapKho();
                            } break;
                            case 4:
                            {
				a.hienDanhSachPhieuXuatKho();
                            } break;
                            case 5:
                            {
				a.SuaDoiPhieu();
                            } break;
                            case 6:
                            {
				a.sapXepTheoSoPhieu();
                            } break;
                            case 7:
                            {
				a.hienPhieuTenKhachHang_MINH();
                            } break;
                            case 8:
                            {
				String tenFile;
				System.out.print("\nNhap Ten File Muon Luu: "); sc.nextLine();
				tenFile = sc.nextLine();
				a.ghiFileP(tenFile);
                            } break;
                            case 9:
                            {
				String tenFile;
				System.out.print("Nhap Ten File Muon Doc: "); sc.nextLine();
				tenFile = sc.nextLine();
				a.docFileP(tenFile);
                            } break;
                            case 10:
                            {
				b = new KinhThuoc();
				a.themDSKinhMat(b);
                            } break;
                            case 11:
                            {
                                b = new KinhBaoHo();
				a.themDSKinhMat(b);
                            } break;
                            case 12:
                            {
				b = new KinhThoiTrang();
				a.themDSKinhMat(b);
                            } break;
                            case 13:
                            {
				b = new KinhRam();
				a.themDSKinhMat(b);
                            } break;
                            case 14:
                            {
				a.hienDanhSachKinhThuoc();
                            } break;
                            case 15:
                            {
				a.hienDanhSachKinhBaoHo();
                            } break;
                            case 16:
                            {
				a.hienDanhSachKinhThoiTrang();
                            } break;
                            case 17:
                            {
				a.hienDanhSachKinhRam();
                            } break;
                            case 18:
                            {
				a.SuaDoiKM();
                            } break;
                            case 19:
                            {
                                a.sapXepTheoSoLuongKinhMat();
                            } break;
                            case 20:
                            {
                                a.hienKinhMatNguonGoc_USA();
                            } break;
                            case 21:
                            {
				String tenFile;
				System.out.print("\nNhap Ten File Muon Luu: "); sc.nextLine();
				tenFile = sc.nextLine();
				a.ghiFileKM(tenFile);
                            } break;
                            case 22:
                            {
				String tenFile;
				System.out.print("Nhap Ten File Muon Doc: "); sc.nextLine();
				tenFile = sc.nextLine();
				a.docFileKM(tenFile);
                            } break;
			}
                    } while(chon != 0);
                }
            }
        });
        frame.add(loginButton);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}