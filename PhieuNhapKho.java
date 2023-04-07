import java.util.Scanner;

public class PhieuNhapKho extends Phieu
{
	private int ngayNhap;

	public PhieuNhapKho()
	{
	}

	public PhieuNhapKho(int ngayNhap, String maPhieu, int soPhieu, String tenKH, String tenSP, int soLuong, String diaChi, long soDT, String eMail, long soTK)
	{
		super(maPhieu, soPhieu, tenKH, tenSP, soLuong, diaChi, soDT, eMail, soTK);
		this.ngayNhap = ngayNhap;
	}

	public void setNgayNhap(int ngayNhap)
	{
		this.ngayNhap = ngayNhap;
	}

	public int getNgayNhap()
	{
		return this.ngayNhap;
	}

	public void nhapThongTin()
	{
		Scanner nhap = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap Ngay Nhap Kho: "); ngayNhap = nhap.nextInt();
	}

	public void hienThongTin()
	{
		super.hienThongTin();
		System.out.println("Ngay Nhap Kho: " + ngayNhap);
	}
}