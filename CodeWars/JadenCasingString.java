public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
    
    if(phrase == null || phrase.isEmpty()){return null;}
    
    String answer = "";
    String[] split = phrase.split(" ");
    
    StringBuilder JadenCase = new StringBuilder();
    
    for(String w : split){
      String FirstLetter = w.substring(0,1).toUpperCase();
      String restOfWord = w.substring(1);
      JadenCase.append(FirstLetter).append(restOfWord).append(" ");
    }
    return JadenCase.toString().trim();
	}

}
