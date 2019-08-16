package JavaAssesment;
import java.util.ArrayList;
import java.util.List;

public class prime {
	public static void main(String[] args) {
	   List<Integer> AdPrime = new ArrayList<Integer>();
	   int[] arr = {13,3,2,34,55,11,23};
		prime pm = new prime();
		for(int x = 0; x< arr.length;x++)
		{
			if(pm.isPrime(arr[x])==true)
					{
				int num1=arr[x]%10;
				int num2=arr[x]/10;
				int sum=num1+num2;
				if(pm.isPrime(sum)==true)
				{
						AdPrime.add(arr[x]);
				}
			}
		}
	System.out.println(AdPrime);
}
	//checking prime Number Function
public boolean isPrime(int num) {
	for(int x = 2;x<Math.sqrt(num);x++) {
		if(num%x!=0)
		{
			continue;
		}
		else {
			return false;
		}
	}
	return true;
}
   
}
