import java.util.Scanner;
import java.io.Serializable;

public class Phieu implements Serializable
{
	private String maPhieu;
	private int soPhieu;
 	private String tenKH;
	private String tenSP;
	private int soLuong;
 	private String diaChi;
 	private int soDT;
 	private String eMail;
 	private int soTK;

 	public Phieu()
 	{
 	}

 	public Phieu(String maPhieu, int soPhieu, String tenKH, String tenSP, int soLuong, String diaChi, int soDT, String eMail, int soTK)
 	{
 		this.maPhieu = maPhieu;
 		this.soPhieu = soPhieu;
 		this.tenKH = tenKH;
 		this.tenSP = tenSP;
 		this.soLuong = soLuong;
 		this.diaChi = diaChi;
 		this.soDT = soDT;
 		this.eMail = eMail;
 		this.soTK = soTK;
 	}

 	public void setMaPhieu(String maPhieu)
 	{
 		this.maPhieu = maPhieu;
 	}

 	public String getMaPhieu()
 	{
 		return this.maPhieu;
 	}

 	public void setSoPhieu(int soPhieu)
 	{
 		this.soPhieu = soPhieu;
 	}

 	public int getSoPhieu()
 	{
 		return this.soPhieu;
 	}

 	public void setTenKhachHang(String tenKH)
 	{
 		this.tenKH = tenKH;
 	}

 	public String getTenKhachHang()
 	{
 		return this.tenKH;
 	}

 	public void setTenSanPham(String tenSP)
 	{
 		this.tenSP = tenSP;
 	}

 	public String getTenSanPham()
 	{
 		return this.tenSP;
 	}

 	public void setSoLuong(int soLuong)
 	{
 		this.soLuong = soLuong;
 	}

 	public int getSoLuong()
 	{
 		return this.soLuong;
 	}

 	public void setDiaChi(String diaChi)
 	{
 		this.diaChi = diaChi;
 	}

 	public String getDiaChi()
 	{
 		return this.diaChi;
 	}

 	public void setSoDienThoai(int soDT)
 	{
 		this.soDT = soDT;
 	}

 	public int getSoDienThoai()
 	{
 		return this.soDT;
 	}

 	public void setEmail(String eMail)
 	{
 		this.eMail = eMail;
 	}

 	public String getEmail()
 	{
 		return this.eMail;
 	}

 	public void setSoTaiKhoan(int soTK)
 	{
 		this.soTK = soTK;
 	}

 	public int getSoTaiKhoan()
 	{
 		return this.soTK;
 	}

 	public void nhapThongTin()
 	{
 		Scanner phieu = new Scanner(System.in);
 		System.out.print("Nhap Ma Phieu: "); maPhieu = phieu.nextLine();
 		System.out.print("Nhap So Phieu: "); soPhieu = phieu.nextInt(); phieu.nextLine();
 		System.out.print("Nhap Ten Khach Hang: "); tenKH = phieu.nextLine();
 		System.out.print("Nhap Ten San Pham: "); tenSP = phieu.nextLine();
 		System.out.print("Nhap So Luong: "); soLuong = phieu.nextInt(); phieu.nextLine();
 		System.out.print("Nhap Dia Chi: "); diaChi = phieu.nextLine();
 		System.out.print("Nhap So Dien Thoai: "); soDT = phieu.nextInt(); phieu.nextLine();
 		System.out.print("Nhap Email: "); eMail = phieu.nextLine();
 		System.out.print("Nhap So Tai Khoan: "); soTK = phieu.nextInt();
 	}

 	public void hienThongTin()
 	{
 		System.out.println("\nMa Phieu: " + maPhieu);
 		System.out.println("So Phieu: " + soPhieu);
 		System.out.println("Ten Khach Hang: " + tenKH);
 		System.out.println("Ten San Pham: " + tenSP);
 		System.out.println("So Luong: " + soLuong);
 		System.out.println("Dia chi: " + diaChi);
 		System.out.println("So Dien Thoai: " + soDT);
 		System.out.println("Email: " + eMail);
 		System.out.println("So Tai Khoan: " + soTK);
 	}
}