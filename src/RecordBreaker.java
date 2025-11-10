import java.util.*;
public class RecordBreaker {
	public static List recordBreaker(int scores[])
	{
		
		int len=scores.length;
		int min=scores[0];
		int max=scores[0];
		int minCount=0;
		int maxCount=0;
		for(int i=0;i<scores.length;i++)
		{
			if(min>scores[i])
			{	min=scores[i];
				minCount++;
			}
			if(max<scores[i])
			{
				max=scores[i];
				maxCount++;
			}
		}
		return Arrays.asList(maxCount,minCount);
	}
	public static void main(String[] args) {
		int scores[]= {10,5,20,20,4,5,2,25,1};
		System.out.println(recordBreaker(scores));
		
	}
}
