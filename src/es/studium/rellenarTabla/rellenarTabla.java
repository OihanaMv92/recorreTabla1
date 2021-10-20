package es.studium.rellenarTabla;

public class rellenarTabla
{
	public static void main(String[] arg)
	{
		int pares [] = new int[20];
		for (int i=0;i<=19;i++)
		{
			pares[i]=(i+1)*2;
		}
			for (int i=0;i<=19;i++)
			{
				System.out.println(pares[i]);
			}
	}
}
