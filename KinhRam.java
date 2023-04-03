import java.util.Scanner;
import java.util.ArrayList;

public class KinhRam extends KinhMat
{
	private ArrayList <NhaCungCap> ncc;
	NhaCungCap nhacungcapa;

	public KinhRam()
	{
	}

	public KinhRam(ArrayList <NhaCungCap> ncc, String tenTH, String tenSP, String maSP, String desCription, int soLuong, double giaBan, String nguonGoc)
	{
		super(tenTH, tenSP, maSP, desCription, soLuong, giaBan, nguonGoc);
	}

	public void setNhaCungCap(ArrayList <NhaCungCap> ncc)
	{
		this.ncc = ncc;
	}

	public ArrayList <NhaCungCap> getNhaCungCap()
	{
		return ncc;
	}

	public void setNhacungcapa(NhaCungCap nhacungcapa)
	{
		this.nhacungcapa = nhacungcapa;
	}

	public NhaCungCap getNhacungcapa()
	{
		return nhacungcapa;
	}

	public void nhapThongTin()
	{
		super.nhapThongTin();
		nhapDSNhaCungCap();
	}

	public void nhapDSNhaCungCap()
	{
		Scanner ds = new Scanner(System.in);
		System.out.print("\nNhap So Nha Cung Cap Can Them: "); int n = ds.nextInt();
		ncc = new ArrayList <> ();
		for (int i=0; i<n; i++)
		{
			nhacungcapa = new NhaCungCap();
			nhacungcapa.nhapNhaCungCap();
			ncc.add(nhacungcapa);
		}
	}

	public void hienDSNhaCungCap()
	{
		for (NhaCungCap x: ncc)
		{
			x.hienNhaCungCap();
		}
	}

	public void hienThongTin()
	{
		super.hienThongTin();
		hienDSNhaCungCap();
	}

	public void hienThongTinKinhRam()
	{
		super.hienThongTin();
	}
}