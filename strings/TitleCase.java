package strings;

import java.util.Scanner;

public class TitleCase {
	
	public static String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String words[]=title.split("\\s+");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            if(word.length()==1 || word.length()==2){
                word=word.toLowerCase();
                result.append(word);
                result.append(" ");
            }
            else{
                char firstChar=Character.toUpperCase(word.charAt(0));
                String titleCase=word.substring(1,word.length());
                result.append(firstChar);
                result.append(titleCase);
                result.append(" ");
            }
            
        }
        return result.toString().trim();
    }
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			String title=scanner.nextLine();
			System.out.println(capitalizeTitle(title));
		}
}
