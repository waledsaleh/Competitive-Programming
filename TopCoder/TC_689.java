package Main;

public class TC_689 {

	public static void main(String[] args) {
		
		System.out.println(haveSimilar(
				new String[]	

						{"0SF3XEBeuTYmsBVWZXDTgtA9Dz7ag36gdwW9gmiWDvu7QZ", "rYoXXc", "7T2", "AIIFs34Q254Dq8gDSdJShugjGI8BDc3WjiHY", "Sz2PKteTet4MY9KQBhRypNj3hmnuMP23dR15JcAwJSpUZvepq", "tB4Usc1TGcTvemUtAkVbBxOO3FSsNTR98a1iMmkFpS", "6", "ktgtLgrvC9IqysbyB0dgcFjKbZ81lDa6AJ5TNCQOh8", "N8QeKvTfS1EwNapsQytWu4MY2iSLf6dMC", "JL2p35U", "IgLY4Ql2WKQQkm8xCvOAzckdkmSSXKoj17p4", "xDjrkWvSPinjgfUWBNO", "V9p", "rHOTFfQL5Net4bQRffal", "4jh0TOcxEfw9PE7WRhPF90IT8LmPIwxrxFewfly", "WY5ocl5iBQXG3c8Rq4JXINlI6McWwtxv2h82YW1BvBcIfRH", "vGUOmvgNlDnqiOwrls1yejL6cQufYdf", "N7IKxoWwEOYe1O5L0zp96xI6NVOkanqftsqQLNvCbrv81jWePr", "B9fwmXTSEqunqV98z0iPGi", "mzpB673yjAiN7XWa6Br0CwUDiMuMPQBc1RjgFT", "OzOO305i27335", "6laiCSTbcVPHHMugE6R8l19", "HTJACUTgptBFO2hcuADe2nO6", "EI8w8dYSJ0aHt1dPuM5cfm7ZBzufQRyWXCEQ8TQkJU3wwOt60o", "fINcur1IFOi3A2Kk7TBTzbuW8VEbjRF6Xs0Migt0VnxBO", "vLfep", "qmTN4zon7cp2xJ", "HA0CRuXwtMbqMKfrFIy5o9E8TfNbGiexUctojU1uap7ox9j2", "fErwtSaetq", "I", "BeEWPGU9Y1vLMIwPcL08Y", "3aLNl50Fi69jPuFf1o", "w2dZvKVI5HjlI3paHmXx6FPDTMhl7SJ9", "AepCG8fMXwU9C5", "MmsthnIsITIUGm", "1nz45MO2MXxOQKfS", "P5VSPlWVPfOksatQl7if0Ewx", "VMx3acezsPW2YgV", "oZNOPlDVYTXg43GkmXF8MIIrULkkS4TNYrAvLcEZKr6zF", "60ab3GK3FhmIir5F6jAwlSaRSo2hCN"}));
	}
static String haveSimilar(String[] handles) {
	
	for(int i=0; i < handles.length;++i)handles[i]=handles[i].replace("O", "0").
			replace("l", "1").replace("I", "1");
	
	for(int i = 0; i <handles.length-1;++i){
	
		for(int j = i+1 ; j <handles.length;++j){
		 if(handles[i].equals(handles[j]))return "Similar handles found";
			
		
		}
		
		
	}
	
	return "Similar handles not found";
}
}
