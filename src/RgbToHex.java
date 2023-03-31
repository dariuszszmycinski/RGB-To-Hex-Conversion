public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return hex(r) + hex(g) + hex(b);
    }
    static String hex(int i) {
        if (i < 0) i = 0;
        if (i > 255) i = 255;
        return ("00" + Integer.toHexString(i)).substring(Integer.toHexString(i).length()).toUpperCase();
    }
}
