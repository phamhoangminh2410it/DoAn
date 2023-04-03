import java.util.Comparator;

public class SapXepKinhMat implements Comparator <KinhMat>
{
	public int compare(KinhMat a1, KinhMat a2)
	{
		int sub = a1.getSoLuong()- a2.getSoLuong();
		if (sub < 0)
		{
			return -1;
		}
		else if (sub == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}