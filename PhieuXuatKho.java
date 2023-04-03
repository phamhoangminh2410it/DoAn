import java.util.Scanner;

public class PhieuXuatKho extends Phieu
{
	private int ngayXuat;

	public PhieuXuatKho()
	{
	}

	public PhieuXuatKho(int ngayXuat, String maPhieu, int soPhieu, String tenKH, String tenSP, int soLuong, String diaChi, int soDT, String eMail, int soTK, int trangThai)
	{
		super(maPhieu, soPhieu, tenKH, tenSP, soLuong, diaChi, soDT, eMail, soTK);
		this.ngayXuat = ngayXuat;
	}

	public void setNgayXuat(int ngayXuat)
	{
		this.ngayXuat = ngayXuat;
	}

	public int getNgayXuat()
	{
		return this.ngayXuat;
	}

	public void nhapThongTin()
	{
		Scanner xuat = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap Ngay Xuat Kho: "); ngayXuat = xuat.nextInt();
	}

	public void hienThongTin()
	{
		super.hienThongTin();
		System.out.println("Ngay Xuat Kho: " + ngayXuat);
	}
}