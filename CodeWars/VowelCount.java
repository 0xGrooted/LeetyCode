public class Vowels {

  public static int getCount(String str) {
    int count =0;
    for(int i =0;i < str.length(); i++){
      if(isVowel(str.charAt(i))){
        count ++;
      }
    }
    return count;
  }
  
  private static boolean isVowel(char v){
    if(v == 'a' || v =='e' || v == 'i' || v == 'o' || v == 'u'){
      return true;
    }
    return false;
  }
}
