import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLy
{
	ArrayList <KinhMat> kinh;
	ArrayList <Phieu> phieu;

	public QuanLy()
	{
		kinh = new ArrayList <> ();
		phieu = new ArrayList <> ();
	}

	public void themDSKinhMat(KinhMat a)
	{
		Scanner ds = new Scanner(System.in);
		System.out.print("\nNhap So Luong Can Them: "); int n = ds.nextInt();
		for (int i=0; i<n; i++)
		{
			System.out.println("\nLan them thu " + (i+1) + ": ");
			if (a instanceof KinhThuoc)
			{
				a = new KinhThuoc();
				a.nhapThongTin();
			}
			else if (a instanceof KinhBaoHo)
			{
				a = new KinhBaoHo();
				a.nhapThongTin();
			}
			else if (a instanceof KinhThoiTrang)
			{
				a = new KinhThoiTrang();
				a.nhapThongTin();
			}
			else if (a instanceof KinhRam)
			{
				a = new KinhRam();
				a.nhapThongTin();
			}
			kinh.add(a);
		}
	}
        
        public void TongSoLuongKM()
        {
                int tong = 0;
                for (KinhMat x: kinh)
                {
                        tong += x.getSoLuong();
                }
                System.out.println("Tong So Luong Kinh Mat Trong Kho: " + tong);
        }
        
        public void TongGiaSanPhamKM()
        {
                long tong = 0;
                for (KinhMat x: kinh)
                {
                        tong += x.getGiaSanPham() * x.getSoLuong();
                }
                System.out.println("Tong Gia San Pham Kinh Mat: " + tong);
        }
        
        public void TongSoLuongConLai()
        {
                int tongKM = 0; int tongPhieu = 0;
                for (KinhMat x: kinh)
                {
                        tongKM += x.getSoLuong();
                }
                for (Phieu y: phieu)
                {
                        tongPhieu += y.getSoLuong();
                }
                int conLai = tongKM - tongPhieu;
                System.out.println("Tong So Luong Kinh Mat Trong Kho Con Lai: " + conLai);
        }

	public void suaNhaCungCapKinhThuoc(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhThuoc) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhThuoc) x).getNhaCungCap().size(); i++)
				{
					if (((KinhThuoc) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhThuoc) x).getNhaCungCap().get(i).nhapNhaCungCap();
					}
				}
			}
		}
	}

	public void themNhaCungCapKinhThuoc(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThuoc)
			{
				((KinhThuoc) x).nhapDSNhaCungCap();
			}
		}
	}

	public void xoaNhaCungCapKinhThuoc(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhThuoc) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhThuoc) x).getNhaCungCap().size(); i++)
				{
					if (((KinhThuoc) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhThuoc) x).getNhaCungCap().remove(i);
					}
				}
			}
		}
	}

	public void suaNhaCungCapKinhBaoHo(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhBaoHo) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhBaoHo) x).getNhaCungCap().size(); i++)
				{
					if (((KinhBaoHo) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhBaoHo) x).getNhaCungCap().get(i).nhapNhaCungCap();
					}
				}
			}
		}
	}

	public void themNhaCungCapKinhBaoHo(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhBaoHo)
			{
				((KinhBaoHo) x).nhapDSNhaCungCap();
			}
		}
	}

	public void xoaNhaCungCapKinhBaoHo(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhBaoHo) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhBaoHo) x).getNhaCungCap().size(); i++)
				{
					if (((KinhBaoHo) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhBaoHo) x).getNhaCungCap().remove(i);
					}
				}
			}
		}
	}

	public void suaNhaCungCapKinhThoiTrang(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhThoiTrang) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhThoiTrang) x).getNhaCungCap().size(); i++)
				{
					if (((KinhThoiTrang) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhThoiTrang) x).getNhaCungCap().get(i).nhapNhaCungCap();
					}
				}
			}
		}
	}

	public void themNhaCungCapKinhThoiTrang(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThoiTrang)
			{
				((KinhThoiTrang) x).nhapDSNhaCungCap();
			}
		}
	}

	public void xoaNhaCungCapKinhThoiTrang(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhThoiTrang) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhThoiTrang) x).getNhaCungCap().size(); i++)
				{
					if (((KinhThoiTrang) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhThoiTrang) x).getNhaCungCap().remove(i);
					}
				}
			}
		}
	}

	public void suaNhaCungCapKinhRam(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhRam) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhRam) x).getNhaCungCap().size(); i++)
				{
					if (((KinhRam) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhRam) x).getNhaCungCap().get(i).nhapNhaCungCap();
					}
				}
			}
		}
	}

	public void themNhaCungCapKinhRam(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhRam)
			{
				((KinhRam) x).nhapDSNhaCungCap();
			}
		}
	}

	public void xoaNhaCungCapKinhRam(int maNCC, String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (((KinhRam) x).getMaSanPham().compareTo(maSP) == 0)
			{
				for (int i=0; i<((KinhRam) x).getNhaCungCap().size(); i++)
				{
					if (((KinhRam) x).getNhaCungCap().get(i).getMaNhaCungCap() == maNCC)
					{
						((KinhRam) x).getNhaCungCap().remove(i);
					}
				}
			}
		}
	}

	public void suaKinhThuoc(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThuoc)
			{
				if (((KinhThuoc) x).getMaSanPham().compareTo(maSP) == 0)
				{
					x.nhapThongTin();
				}
			}
		}
	}

	public void xoaKinhThuoc(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThuoc)
			{
				if (((KinhThuoc) x).getMaSanPham().compareTo(maSP) == 0)
				{
					kinh.remove(x);
				}
			}
		}
	}

	public void suaKinhBaoHo(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhBaoHo)
			{
				if (((KinhBaoHo) x).getMaSanPham().compareTo(maSP) == 0)
				{
					x.nhapThongTin();
				}
			}
		}
	}

	public void xoaKinhBaoHo(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhBaoHo)
			{
				if (((KinhBaoHo) x).getMaSanPham().compareTo(maSP) == 0)
				{
					kinh.remove(x);
				}
			}
		}
	}

	public void suaKinhThoiTrang(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThoiTrang)
			{
				if (((KinhThoiTrang) x).getMaSanPham().compareTo(maSP) == 0)
				{
					x.nhapThongTin();
				}
			}
		}
	}

	public void xoaKinhThoiTrang(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThoiTrang)
			{
				if (((KinhThoiTrang) x).getMaSanPham().compareTo(maSP) == 0)
				{
					kinh.remove(x);
				}
			}
		}
	}

	public void suaKinhRam(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhRam)
			{
				if (((KinhRam) x).getMaSanPham().compareTo(maSP) == 0)
				{
					x.nhapThongTin();
				}
			}
		}
	}

	public void xoaKinhRam(String maSP)
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhRam)
			{
				if (((KinhRam) x).getMaSanPham().compareTo(maSP) == 0)
				{
					kinh.remove(x);
				}
			}
		}
	}

	public void hienDSKinhMat(KinhMat a)
	{
		System.out.println();
		for (KinhMat x: kinh)
		{
			x.hienThongTin();
		}
	}

	public void hienDSKinhThuoc(KinhMat a)
	{
		System.out.println();
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThuoc)
			{
				x.hienThongTin();
			}
		}
	}

	public void hienDanhSachKinhThuoc()
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThuoc)
			{
				((KinhThuoc) x).hienThongTin();
			}
		}
                TongSoLuongKM();
                TongGiaSanPhamKM();
	}

	public void hienDanhSachKinhBaoHo()
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhBaoHo)
			{
				((KinhBaoHo) x).hienThongTin();
			}
		}
                TongSoLuongKM();
                TongGiaSanPhamKM();
	}

	public void hienDanhSachKinhThoiTrang()
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThoiTrang)
			{
				((KinhThoiTrang) x).hienThongTin();
			}
		}
                TongSoLuongKM();
                TongGiaSanPhamKM();
	}

	public void hienDanhSachKinhRam()
	{
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhRam)
			{
				((KinhRam) x).hienThongTin();
			}
		}
                TongSoLuongKM();
                TongGiaSanPhamKM();
	}

	public void hienDSKinhBaoHo(KinhMat a)
	{
		System.out.println();
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhBaoHo)
			{
				x.hienThongTin();
			}
		}
	}

	public void hienDSKinhThoiTrang(KinhMat a)
	{
		System.out.println();
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhThoiTrang)
			{
				x.hienThongTin();
			}
		}
	}

	public void hienDSKinhRam(KinhMat a)
	{
		System.out.println();
		for (KinhMat x: kinh)
		{
			if (x instanceof KinhRam)
			{
				x.hienThongTin();
			}
		}
	}
        
        public void themDSPhieu(Phieu a)
	{
		Scanner ds = new Scanner(System.in);
		System.out.print("\nNhap So Luong Can Them: "); int n = ds.nextInt();
		for (int i=0; i<n; i++)
		{
			System.out.println("\nLan them thu " + (i+1) + ": ");
			if (a instanceof PhieuNhapKho)
			{
				a = new PhieuNhapKho();
				a.nhapThongTin();
			}
			else if (a instanceof PhieuXuatKho)
			{
				a = new PhieuXuatKho();
				a.nhapThongTin();
			}
			phieu.add(a);
		}
	}

	public void hienDSPhieu(Phieu a)
	{
		System.out.println();
		for (Phieu y: phieu)
		{
			y.hienThongTin();
		}
	}

	public void suaPhieuNhapKho(String maPhieu)
	{
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuNhapKho)
			{
				if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
				{
					y.nhapThongTin();
				}
			}
		}
	}

	public void xoaPhieuNhapKho(String maPhieu)
	{
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuNhapKho)
			{
				if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
				{
					phieu.remove(y);
				}
			}
		}
	}

	public void suaPhieuXuatKho(String maPhieu)
	{
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuXuatKho)
			{
				if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
				{
					y.nhapThongTin();
				}
			}
		}
	}

	public void xoaPhieuXuatKho(String maPhieu)
	{
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuXuatKho)
			{
				if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
				{
					phieu.remove(y);
				}
			}
		}
	}

	public void hienDSPhieuNhapKho(Phieu a)
	{
		System.out.println();
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuNhapKho)
			{
				y.hienThongTin();
			}
		}
	}

	public void hienDanhSachPhieuNhapKho()
	{
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuNhapKho)
			{
				((PhieuNhapKho) y).hienThongTin();
			}
		}
	}

	public void hienDanhSachPhieuXuatKho()
	{
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuXuatKho)
			{
				((PhieuXuatKho) y).hienThongTin();
			}
		}
                TongSoLuongConLai();
	}

	public void hienDSPhieuXuatKho(Phieu a)
	{
		System.out.println();
		for (Phieu y: phieu)
		{
			if (y instanceof PhieuXuatKho)
			{
				y.hienThongTin();
			}
		}
	}

	public void menuChangesKM()
	{
                System.out.println("._____________________________________________.");
                System.out.println("|---------- PHAN THAY DOI THONG TIN ----------|");
                System.out.println("|1.  Sua thong tin Kinh Thuoc                 |");
                System.out.println("|2.  Xoa thong tin Kinh Thuoc                 |");
                System.out.println("|3.  Sua thong tin Kinh Bao Ho                |");
                System.out.println("|4.  Xoa thong tin Kinh Bao Ho                |");
                System.out.println("|5.  Sua thong tin Kinh Thoi Trang            |");
                System.out.println("|6.  oa thong tin Kinh Thoi Trang             |");
                System.out.println("|7.  Sua thong tin Kinh Ram                   |");
                System.out.println("|8.  Xoa thong tin Kinh Ram                   |");
                System.out.println("|9.  Sua nha cung cap Kinh Thuoc              |");
                System.out.println("|10. Them nha cung cap Kinh Thuoc             |");
                System.out.println("|11. Xoa nha cung cap Kinh Thuoc              |");
                System.out.println("|12. Sua nha cung cap Kinh Bao Ho             |");
                System.out.println("|13. Them nha cung cap Kinh Bao Ho            |");
                System.out.println("|14. Xoa nha cung cap Kinh Bao Ho             |");
                System.out.println("|15. Sua nha cung cap Kinh Thoi Trang         |");
                System.out.println("|16. Them nha cung cap Kinh Thoi Trang        |");
                System.out.println("|17. Xoa nha cung cap Kinh Thoi Trang         |");
                System.out.println("|18. Sua nha cung cap Kinh Ram                |");
                System.out.println("|19. Them nha cung cap Kinh Ram               |");
                System.out.println("|20. Xoa nha cung cap Kinh Ram                |");
                System.out.println(".---------- NHAN SO 0 DE EXIT! ---------------.");
	}

	public void SuaDoiKM()
	{
		Scanner sd = new Scanner(System.in);
		int chon;
		menuChangesKM();
		do
		{
			System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
			switch (chon)
			{
                                case 1:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Thuoc: ");
					sd.nextLine();
					maSP = sd.nextLine();
					suaKinhThuoc(maSP);
				} break;
                                case 2:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Thuoc: ");
					sd.nextLine();
					maSP = sd.nextLine();
					xoaKinhThuoc(maSP);
				} break;
                                case 3:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Bao Ho: ");
					sd.nextLine();
					maSP = sd.nextLine();
					suaKinhBaoHo(maSP);
				} break;
                                case 4:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Bao Ho: ");
					sd.nextLine();
					maSP = sd.nextLine();
					xoaKinhBaoHo(maSP);
				} break;
                                case 5:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Thoi Trang: ");
					sd.nextLine();
					maSP = sd.nextLine();
					suaKinhThoiTrang(maSP);
				} break;
                                case 6:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Thoi Trang: ");
					sd.nextLine();
					maSP = sd.nextLine();
					xoaKinhThoiTrang(maSP);
				} break;
                                case 7:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Ram: ");
					sd.nextLine();
					maSP = sd.nextLine();
					suaKinhRam(maSP);
				} break;
                                case 8:
				{
					String maSP;
					System.out.print("\nNhap Ma San Pham Kinh Ram: ");
					sd.nextLine();
					maSP = sd.nextLine();
					xoaKinhRam(maSP);
				} break;
                                case 9:
				{
					System.out.print("\nNhap Ma San Pham Kinh Thuoc: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Thuoc: "); int maNCC = sd.nextInt();
					suaNhaCungCapKinhThuoc(maNCC, maSP);
				} break;
                                case 10:
				{
					System.out.print("\nNhap Ma San Pham Kinh Thuoc: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					themNhaCungCapKinhThuoc(maSP);
				} break;
                                case 11:
				{
					System.out.print("\nNhap Ma San Pham Kinh Thuoc: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Thuoc: "); int maNCC = sd.nextInt();
					xoaNhaCungCapKinhThuoc(maNCC, maSP);
				} break;
                                case 12:
				{
					System.out.print("\nNhap Ma San Pham Kinh Bao Ho: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Bao Ho: "); int maNCC = sd.nextInt();
					suaNhaCungCapKinhBaoHo(maNCC, maSP);
				} break;
                                case 13:
				{
					System.out.print("\nNhap Ma San Pham Kinh Bao Ho: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					themNhaCungCapKinhBaoHo(maSP);
				} break;
                                case 14:
				{
					System.out.print("\nNhap Ma San Pham Kinh Bao Ho: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Bao Ho: "); int maNCC = sd.nextInt();
					xoaNhaCungCapKinhBaoHo(maNCC, maSP);
				} break;
                                case 15:
				{
					System.out.print("\nNhap Ma San Pham Kinh Thoi Trang: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Thoi Trang: "); int maNCC = sd.nextInt();
					suaNhaCungCapKinhThoiTrang(maNCC, maSP);
				} break;
                                case 16:
				{
					System.out.print("\nNhap Ma San Pham Kinh Thoi Trang: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					themNhaCungCapKinhThoiTrang(maSP);
				} break;
                                case 17:
				{
					System.out.print("\nNhap Ma San Pham Kinh Thoi Trang: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Thoi Trang: "); int maNCC = sd.nextInt();
					xoaNhaCungCapKinhThoiTrang(maNCC, maSP);
				} break;
                                case 18:
				{
					System.out.print("\nNhap Ma San Pham Kinh Ram: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Ram: "); int maNCC = sd.nextInt();
					suaNhaCungCapKinhRam(maNCC, maSP);
				} break;
                                case 19:
				{
					System.out.print("\nNhap Ma San Pham Kinh Ram: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					themNhaCungCapKinhRam(maSP);
				} break;
                                case 20:
				{
					System.out.print("\nNhap Ma San Pham Kinh Ram: ");
					sd.nextLine();
					String maSP = sd.nextLine();
					System.out.print("Nhap Ma Nha Cung Cap Kinh Ram: "); int maNCC = sd.nextInt();
					xoaNhaCungCapKinhRam(maNCC, maSP);
				} break;
			}
		} while(chon != 0);
	}

	public void menuChangesPhieu()
	{
                System.out.println("._____________________________________________.");
		System.out.println("|---------- PHAN THAY DOI THONG TIN ----------|");
		System.out.println("|1. Sua thong tin Phieu Nhap Kho              |");
		System.out.println("|2. Xoa thong tin Phieu Nhap Kho              |");
		System.out.println("|3. Sua thong tin Phieu Xuat Kho              |");
		System.out.println("|4. Xoa thong tin Phieu Xuat Kho              |");
		System.out.println(".------------ NHAN SO 0 DE EXIT! -------------.");
	}

	public void SuaDoiPhieu()
	{
		Scanner sd = new Scanner(System.in);
		int chon;
		menuChangesPhieu();
		do
		{
			System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
			switch (chon)
			{
                                case 1:
				{
					String maPhieu;
					System.out.print("\nNhap Ma Phieu Nhap Kho: ");
					sd.nextLine();
					maPhieu = sd.nextLine();
					suaPhieuNhapKho(maPhieu);
				} break;
                                case 2:
				{
					String maPhieu;
					System.out.print("\nNhap Ma Phieu Nhap Kho: ");
					sd.nextLine();
					maPhieu = sd.nextLine();
					xoaPhieuNhapKho(maPhieu);
				} break;
                                case 3:
				{
					String maPhieu;
					System.out.print("\nNhap Ma Phieu Xuat Kho: ");
					sd.nextLine();
					maPhieu = sd.nextLine();
					suaPhieuXuatKho(maPhieu);
				} break;
                                case 4:
				{
					String maPhieu;
					System.out.print("\nNhap Ma Phieu Xuat Kho: ");
					sd.nextLine();
					maPhieu = sd.nextLine();
					xoaPhieuXuatKho(maPhieu);
				} break;
			}
		} while(chon != 0);
	}

	public void ghiFileKM(String fileName)
	{
		try
		{
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.flush();
			objOut.writeObject(kinh);
			objOut.close();
			fileOut.close();
			System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void docFileKM(String fileName)
	{
		try
		{
			kinh = new ArrayList <> ();
			FileInputStream fin = new FileInputStream(fileName);
			ObjectInputStream fout = new ObjectInputStream(fin); kinh = (ArrayList) fout.readObject();
			hienDanhSachKinhMat();
			fin.close();
			fout.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nKhong Thay File");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
        
        public void ghiFileP(String fileName)
	{
		try
		{
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.flush();
			objOut.writeObject(phieu);
			objOut.close();
			fileOut.close();
			System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void docFileP(String fileName)
	{
		try
		{
			phieu = new ArrayList <> ();
			FileInputStream fin = new FileInputStream(fileName);
			ObjectInputStream fout = new ObjectInputStream(fin); phieu = (ArrayList) fout.readObject();
			hienDanhSachPhieu();
			fin.close();
			fout.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nKhong Thay File");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void hienDanhSachPhieu()
	{
		for (Phieu y: phieu)
		{
			y.hienThongTin();
		}
	}
        
        public void hienDanhSachKinhMat()
        {
                for (KinhMat x: kinh)
                {
                        x.hienThongTin();
                }
        }

	public void sapXepTheoSoPhieu()
	{
		Collections.sort(phieu, new SapXepPhieu());
		System.out.println("\nDanh Sach Hoa Don Sau Khi Sap Xep");
		hienDanhSachPhieu();
	}
        
        public void sapXepTheoSoLuongKinhMat()
        {
                Collections.sort(kinh, new SapXepKinhMat());
                System.out.println("\nDanh Sach Kinh Mat Sau Khi Sap Xep");
                hienDanhSachKinhMat();
        }

	public void hienPhieuTenKhachHang_MINH()
	{
		for (Phieu y: phieu)
		{
			if (y instanceof Phieu && ((Phieu) y).getTenKhachHang().equalsIgnoreCase("Minh") == true)
			{
				y.hienThongTin();
			}
		}
	}
        
        public void hienKinhMatNguonGoc_USA()
        {
                for (KinhMat x: kinh)
                {
                        if (x instanceof KinhMat && ((KinhMat) x).getNguonGoc().equalsIgnoreCase("Usa") == true)
                        {
                                x.hienThongTin();
                        }
                }
        }

	public void menuChinh()
	{
                System.out.println(".__________________________________________________________________________________________.");
		System.out.println("|-------------------------- CHUONG TRINH QUAN LY KHO KINH MAT -----------------------------|");
                System.out.println("|1.  Nhap Danh Sach Phieu Nhap Kho                                                         |");
		System.out.println("|2.  Nhap Danh Sach Phieu Xuat Kho                                                         |");
		System.out.println("|3.  Hien Thi Danh Sach Phieu Nhap Kho                                                     |");
		System.out.println("|4.  Hien Thi Danh Sach Phieu Xuat Kho                                                     |");
		System.out.println("|5.  Chinh Sua Thong Tin (Nhap Kho, Xuat Kho)                                              |");               
		System.out.println("|6.  Sap Xep Danh Sach Phieu Theo So Phieu                                                 |");
		System.out.println("|7.  Thong Ke Danh Sach Hoa Don Co Ten Khach Hang la 'MINH'                                |");
                System.out.println("|8.  Luu File Da Nhap (DSPhieu)                                                            |");
		System.out.println("|9.  Doc Du Lieu Tu File (DSPhieu)                                                         |");
		System.out.println("|10. Nhap Danh Sach Kinh Thuoc Va Nha Cung Cap Cua Kinh Thuoc                              |");
		System.out.println("|11. Nhap Danh Sach Kinh Bao Ho Va Nha Cung Cap Cua Kinh Bao Ho                            |");
		System.out.println("|12. Nhap Danh Sach Kinh Thoi Trang Va Nha Cung Cap Cua Kinh Thoi Trang                    |");
		System.out.println("|13. Nhap Danh Sach Kinh Ram Va Nha Cung Cap Cua Kinh Ram                                  |");
		System.out.println("|14. Hien Thi Danh Sach Kinh Thuoc                                                         |");
		System.out.println("|15. Hien Thi Danh Sach Kinh Bao Ho                                                        |");
		System.out.println("|16. Hien Thi Danh Sach Kinh Thoi Trang                                                    |");
		System.out.println("|17. Hien Thi Danh Sach Kinh Ram                                                           |");
		System.out.println("|18. Chinh Sua Thong Tin (Kinh Thuoc, Kinh Bao Ho, Kinh Thoi Trang, Kinh Ram, Nha Cung Cap)|");
                System.out.println("|19. Sap Xep Danh Sach Kkinh Mat Theo So Luong                                             |");
                System.out.println("|20. Thong Ke Danh Sach Kinh Mat Co Nguon Goc 'USA'                                        |");
		System.out.println("|21. Luu File Da Nhap (DSKinhMat)                                                          |");
		System.out.println("|22. Doc Du Lieu Tu File (DSKinhMat)                                                       |");
		System.out.println(".----------------------- NHAN PHIM 0 DE EXIT! AND NO SEE YOU AGAIN ------------------------.");
	}
}