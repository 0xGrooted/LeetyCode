public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        // Clamp and convert each color component
        String hexR = toHex(r);
        String hexG = toHex(g);
        String hexB = toHex(b);

        // Join three 2-character hexadecimal strings
        return hexR + hexG + hexB;
    }
    private static String toHex(int c) {
        int clamped;
        if (c < 0) {
            clamped = 0;
        } else if (c > 255) {
            clamped = 255;
        } else {
            clamped = c;
        }
        String hex = Integer.toHexString(clamped).toUpperCase();
        
        if (hex.length() == 1) {
            return "0" + hex;
        }
        
        return hex;
    }
}
