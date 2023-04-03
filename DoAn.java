import java.util.Scanner;

public class DoAn
{
	public static void main(String[] args)
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