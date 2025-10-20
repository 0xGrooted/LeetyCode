public class FindOutlier {
  static int find(int[] integers) {
    // Find the single even number or odd number
    // Length >= 3
    
    // Brainstorming solutions:
    //  - For loop through once 0(n)
    //      Find the only odd number.
    //  - 
    
    int oddCount = 0;
    int eCount = 0;
    int Oddindex =0;
    int Evenindex = 0;
    
    for(int i =0; i< integers.length; i++){
      if(integers[i] % 2 == 0){
        eCount++;
        Evenindex = i;
      }
      else{
        oddCount++;
        Oddindex = i;
      }
    }
    if(oddCount == 1){return integers[Oddindex];}
    else if(eCount == 1){return integers[Evenindex];}
    return 0;
  }
}
