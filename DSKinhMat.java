import java.util.Scanner;
import java.util.ArrayList;

public class DSKinhMat
{
	ArrayList <KinhMat> kinh;

	public DSKinhMat()
	{
		kinh = new ArrayList <> ();
	}

	public void themDSKinhMat(KinhMat a)
	{
		Scanner ds = new Scanner(System.in);
		System.out.print("\nNhap So Luong Can Them: "); int n = ds.nextInt();
		for (int i=0; i<n; i++)
		{
			System.out.println("\nLan them thu " + (i+1) + ": "); a.nhapThongTin(); kinh.add(a);
		}
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

	public void hienDS(KinhMat a)
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

	public void menuChangesKM()
	{
		System.out.println("._____________________________________________.");
                System.out.println("|---------- PHAN THAY DOI THONG TIN ----------|");
                System.out.println("|1. Sua thong tin Kinh Thuoc                  |");
                System.out.println("|2. Xoa thong tin Kinh Thuoc                  |");
                System.out.println("|3. Sua thong tin Kinh Bao Ho                 |");
                System.out.println("|4. Xoa thong tin Kinh Bao Ho                 |");
                System.out.println("|5. Sua thong tin Kinh Thoi Trang             |");
                System.out.println("|6. Xoa thong tin Kinh Thoi Trang             |");
                System.out.println("|7. Sua thong tin Kinh Ram                    |");
                System.out.println("|8. Xoa thong tin Kinh Ram                    |");
                System.out.println("|9. Sua nha cung cap Kinh Thuoc               |");
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
}