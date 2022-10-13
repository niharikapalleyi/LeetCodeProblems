package difficultyLevelEasy.problems.strings;

public class ReverseString {
	
    public void reverseString(char[] s) {
        
        int j = s.length -1;
        int mid = s.length / 2;
        
        for(int i=0; i<= mid; i++){
           if(i <= j){
               char temp = s[i];
               s[i] = s[j];
               s[j] = temp;
               j--;
           }
        }
        
    }
}