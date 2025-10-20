class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
     int n = names.length;
     if(n == 0){
          return "no one likes this";
      }
      if(n > 3){
          return names[0] + ", " + names[1] + " and " + Integer.toString(n-2) + " others like this";
     }
      else if(n >2){
         return names[0] + ", " + names[1] + " and " + names[2] + " like this";
      }
      else if(n == 2){
         return names[0] +  " and " + names[1]  + " like this";
      }
      else if(n == 1){
         return names[0] + " likes this";
      }
        return "";
    }
}
