public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String text){
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		for (int i = 0; i < text.length()/2; i++){
			if (text.charAt(i) != text.charAt(text.length() -1 - i))
		return false;
	}
	return true;
}
	public static int getAge(String names[], int age[], String name){
		for (int i = 0;i < age.length;i++){
			if (name.equals(names[i])){
				return age[i];
			}
		}
		return -1;
	}
	public static int countWords(String text, char letter){
		int wordCount = 0;
		String [] phrase = text.split(" ");
		for (int i = 0;i < phrase.length;i++){
			for (int k = 0;k < phrase[i].length();k++){
				if (phrase[i].charAt(k) == letter){
				wordCount+=1;
				break;
			}
		}
		}
			return wordCount;
	}
}

