public class Multiply {
    public static Double multiply(Double a, Double b) {
        if(a == 0.0 || a == null){
          return 0.0;
        }
      else if(b == 0.0 || b == null)
        {
        return 0.0;
      }
      return a*b;
    }
}
