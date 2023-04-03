import java.util.Scanner;
import java.io.Serializable;

public class NhaCungCap implements Serializable
{
	private int maNCC;
 	private String tenNCC;
 	private String diaChi;
 	private int soDT;
 	private int maSoThue;

 	public NhaCungCap()
 	{
 	}

 	public NhaCungCap(int maNCC, String tenNCC, String diaChi, int soDT, int maSoThue)
 	{
 		this.maNCC = maNCC;
 		this.tenNCC = tenNCC;
 		this.diaChi = diaChi;
 		this.soDT = soDT;
		this.maSoThue = maSoThue;
 	}

 	public void setMaNhaCungCap(int maNCC)
 	{
 		this.maNCC = maNCC;
 	}

 	public int getMaNhaCungCap()
 	{
 		return this.maNCC;
 	}

 	public void setTenNhaCungCap(String tenNCC)
 	{
 		this.tenNCC = tenNCC;
 	}

 	public String getTenNhaCungCap()
 	{
 		return this.tenNCC;
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

	public void setMaSoThue(int maSoThue)
 	{
 		this.maSoThue = maSoThue;
 	}

 	public int getMaSoThue()
 	{
 		return this.maSoThue;
 	}

 	public void nhapNhaCungCap()
 	{
 		Scanner cungcap = new Scanner(System.in);
                System.out.print("Nhap Ma Cung Cap: "); maNCC = cungcap.nextInt();
                cungcap.nextLine();
 		System.out.print("Nhap Ten Nha Cung Cap: "); tenNCC = cungcap.nextLine();
 		System.out.print("Nhap Dia Chi Nha Cung Cap: "); diaChi = cungcap.nextLine();
 		System.out.print("Nhap So Dien Thoai Nha Cung Cap: "); soDT = cungcap.nextInt();
 		System.out.print("Nhap Ma So Thue: "); maSoThue = cungcap.nextInt();
 	}

 	public void hienNhaCungCap()
 	{
                System.out.println("\nMa Cung Cap: " + maNCC);
 		System.out.println("Ten Nha Cung Cap: " + tenNCC);
		System.out.println("Dia Chi Nha Cung Cap: " + diaChi);
		System.out.println("So Dien Thoai Nha Cung Cap: " + soDT);
		System.out.println("Ma So Thue: " + maSoThue);
 	}

 	public void nhapThongTin()
 	{
 		Scanner nhacungcap = new Scanner(System.in);
                System.out.print("Nhap Ma Cung Cap: "); maNCC = nhacungcap.nextInt();
                nhacungcap.nextLine();
 		System.out.print("Nhap Ten Nha Cung Cap: "); tenNCC = nhacungcap.nextLine();
 		System.out.print("Nhap Dia Chi Nha Cung Cap: "); diaChi = nhacungcap.nextLine();
 		System.out.print("Nhap So Dien Thoai Nha Cung Cap: "); soDT = nhacungcap.nextInt();
 		System.out.print("Nhap Ma So Thue: "); maSoThue = nhacungcap.nextInt();
 	}

	public void hienThongTin()
 	{
                System.out.println("\nMa Cung Cap: " + maNCC);
		System.out.println("Ten Nha Cung Cap: " + tenNCC);
		System.out.println("Dia Chi Nha Cung Cap: " + diaChi);
		System.out.println("So Dien Thoai Nha Cung Cap: " + soDT);
		System.out.println("Ma So Thue: " + maSoThue);
 	}
}