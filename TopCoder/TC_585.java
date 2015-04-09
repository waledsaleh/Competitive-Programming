package Main;

import java.util.Scanner;

public class TC_585 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(calculate(new int []	

				{1,1}));
		
	}
	static int calculate(int[] seq)
	{
		if(seq.length==1)return 1;
		int count =0;
		boolean check = false;
		int i= 0 ,j=i+1;
		for(;j <seq.length;)
		{
			if(seq[j]==seq[i])
			{
				i++;
				j++;
				count++;
			}
			else if(seq[j]>seq[i])
			{
				check =true;
				i++;
				j++;
			}
			else
			{
				if(check)
				{
					count++;
					check=false;
					i++;
					j++;
				}
				else
				{
					count++;
					j++;
					i++;
				}
			}
				
		}
		if(seq[seq.length-1]<=seq[seq.length-2]&&!check||check)count++;
		
		return count;
	}
}
// Another Solution

/*Vector<String> v = new Vector<String>();
if(seq.length==1)return 1;
String q ="";

for(int i = 1  ; i < seq.length;++i)
{
	if(seq[i]>seq[i-1])
	{
		q +=seq[i-1]+""+seq[i];
		i++;
	}
	else
	{
		if(!q.equals(""))
		v.add(q);
		
		v.add(seq[i-1]+"");
			
		q="";
		
		
	}
}
if(!q.equals(""))
v.add(q);

if(seq[seq.length-1]>seq[seq.length-2])
{
	q+=(seq[seq.length-1]+""+seq[seq.length-2]);
}
else
{
	v.add(seq[seq.length-1]+"");
	return v.size();
}

return v.size();
}
*/