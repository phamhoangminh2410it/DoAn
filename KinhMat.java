import java.util.Scanner;
import java.io.Serializable;

public class KinhMat implements Serializable
{
	private String tenTH;
	private String tenSP;
	private String maSP;
	private String desCription;
	private int soLuong;
	private double giaSP;
	private String nguonGoc;

	public KinhMat()
	{
	}

	public KinhMat(String tenTH, String tenSP, String maSP, String desCription, int soLuong, double giaSP, String nguonGoc)
	{
		this.tenTH = tenTH;
		this.tenSP = tenSP;
		this.maSP = maSP;
		this.desCription = desCription;
		this.soLuong = soLuong;
		this.giaSP = giaSP;
		this.nguonGoc = nguonGoc;
	}

	public void setTenThuongHieu(String tenTH)
	{
		this.tenTH = tenTH;
	}

	public String getTenThuongHieu()
	{
		return this.tenTH;
	}

	public void setTenSanPham(String tenSP)
	{
		this.tenSP = tenSP;
	}

	public String getTenSanPham()
	{
		return this.tenSP = tenSP;
	}

	public void setMaSanPham(String maSP)
	{
		this.maSP = maSP;
	}

	public String getMaSanPham()
	{
		return this.maSP;
	}

	public void setDescription(String desCription)
	{
		this.desCription = desCription;
	}

	public String getDescription()
	{
		return this.desCription;
	}

	public void setSoLuong(int soLuong)
	{
		this.soLuong = soLuong;
	}

	public int getSoLuong()
	{
		return this.soLuong;
	}

	public void setGiaSanPham(double giaSP)
	{
		this.giaSP = giaSP;
	}

	public double getGiaSanPham()
	{
		return this.giaSP;
	}

	public void setNguonGoc(String nguonGoc)
	{
		this.nguonGoc = nguonGoc;
	}

	public String getNguonGoc()
	{
		return this.nguonGoc;
	}

	public void nhapThongTin()
	{
		Scanner kinhmat = new Scanner(System.in);
		System.out.print("Nhap Ten Thuong Hieu: "); tenTH = kinhmat.nextLine();
		System.out.print("Nhap Ten San Pham: "); tenSP = kinhmat.nextLine();
		System.out.print("Nhap Ma San Pham: "); maSP = kinhmat.nextLine();
		System.out.print("Nhap Mo Ta San Pham: "); desCription = kinhmat.nextLine();
		System.out.print("Nhap So Luong San Pham: "); soLuong = kinhmat.nextInt();
		System.out.print("Nhap Gia Ban San Pham: "); giaSP = kinhmat.nextDouble(); kinhmat.nextLine();
		System.out.print("Nhap Nguon Goc San Pham: "); nguonGoc = kinhmat.nextLine();
	}

	public void hienThongTin()
	{
		System.out.println("\nTen Thuong Hieu: " + tenTH);
		System.out.println("Ten San Pham: " + tenSP);
		System.out.println("Ma San Pham: " + maSP);
		System.out.println("Mo Ta San Pham: " + desCription);
		System.out.println("So luong San Pham: " + soLuong);
		System.out.println("Gia Ban San Pham: " + giaSP);
		System.out.println("Nguon Goc San Pham: " + nguonGoc);
	}
}
