package Main;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Locale;

public class URI_1216 {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        String name="";
	        int n; int count=0;
	        double sum=0.0;

	        name = br.readLine();
		while(name != null) {
			n = Integer.parseInt(br.readLine());

			sum+=n;
			count++;

			name = br.readLine();
		}

		System.out.printf("%.1f\n",(double)sum/count);
	}
}

