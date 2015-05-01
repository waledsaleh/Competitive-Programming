package Main;

public class TC_225 {

	public static void main(String[] args) {

		System.out.println(applyDecoration("Bob",new String[]{"surround", "append", "prepend"},
				new String[]{"-=", "(", ")"}));
		
		
	}
	static String applyDecoration(String name, String[] commands, String[] decorations)
	{
		
		for(int i = 0 ; i<commands.length;++i)
		{
			switch(commands[i])
			{
			case "surround":name = decorations[i]+""+name+""+new StringBuilder(decorations[i]).reverse().toString();break;
			case "append": name +=decorations[i];break;
			case "prepend": name =decorations[i]+""+name;break;
			}
			
		}
		return name;
		
	}
}
