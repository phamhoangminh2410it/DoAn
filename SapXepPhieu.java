import java.util.Comparator;

public class SapXepPhieu implements Comparator <Phieu>
{
	public int compare(Phieu a1, Phieu a2)
	{
		int sub = a1.getSoPhieu() - a2.getSoPhieu();
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