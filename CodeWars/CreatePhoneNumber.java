public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    // First Three Numbers will be inside brackets
    String number = "";
    number = String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1],numbers[2], numbers[3],numbers[4], numbers[5],
                          numbers[6], numbers[7], numbers[8], numbers[9]);
    
    return number;
  }
}
