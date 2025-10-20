public class RemoveChars {
    public static String remove(String str) {
      if(str.length() <= 2 ){
          return (String) "";
      }
      StringBuilder sb = new StringBuilder();
      for(int i =1; i < str.length()-1;i++){
        sb.append(str.charAt(i));
      }
      return sb.toString(); 
    }
}
