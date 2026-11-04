package xu_li_chuoi;

public class Xu_li_chuoi {

//        
// * StringCases.java
// * Tong hop cac truong hop xu ly chuoi thuong gap trong de thi Java.
// * Bien dich: javac -encoding UTF-8 StringCases.java
// * Chay:      java StringCases
    // ===================== 1. IN HOA / IN THUONG =====================
    // In hoa chu cai dau cua chuoi: "lan anh" -> "Lan anh"
    public static String capitalizeFirst(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    // In hoa chu cai dau cua tung tu: "lan anh" -> "Lan Anh"
    public static String capitalizeEachWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return s;
        }
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }

    // In hoa toan bo: "lan anh" -> "LAN ANH"
    public static String upperAll(String s) {
        return s == null ? null : s.toUpperCase();
    }

    // In hoa chu cai cuoi: "lan anh" -> "lan anH"
    public static String capitalizeLast(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int n = s.length();
        return s.substring(0, n - 1) + Character.toUpperCase(s.charAt(n - 1));
    }

    // Doi hoa <-> thuong: "Lan Anh" -> "lAN aNH"
    public static String swapCase(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    // ===================== 2. DAO VI TRI / DAO NGUOC =====================
    // Doi cho 2 ky tu o vi tri i va j: ("abcd", 0, 3) -> "dbca"
    public static String swapChars(String s, int i, int j) {
        if (s == null || i < 0 || j < 0 || i >= s.length() || j >= s.length()) {
            return s;
        }
        char[] arr = s.toCharArray();
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return new String(arr);
    }

    // Doi cho 2 ky tu dau: "abcd" -> "bacd"
    public static String swapFirstTwo(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        // Phai co "" o dau, neu khong 2 char se bi cong thanh so int
        return "" + s.charAt(1) + s.charAt(0) + s.substring(2);
    }

    // Dao nguoc ca chuoi: "lan anh" -> "hna nal"
    public static String reverseString(String s) {
        return s == null ? null : new StringBuilder(s).reverse().toString();
    }

    // Dao nguoc thu tu cac tu: "lan anh" -> "anh lan"
    public static String reverseWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return s;
        }
        String[] w = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            sb.append(w[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // Dao nguoc tung tu: "lan anh" -> "nal hna"
    public static String reverseEachWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return s;
        }
        String[] w = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < w.length; i++) {
            sb.append(new StringBuilder(w[i]).reverse());
            if (i < w.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // ===================== 3. XOA KHOANG TRANG =====================
    // Bo khoang trang dau/cuoi va gop nhieu khoang trang thanh 1
    public static String normalizeSpaces(String s) {
        return s == null ? null : s.trim().replaceAll("\\s+", " ");
    }

    // Bo het khoang trang
    public static String removeAllSpaces(String s) {
        return s == null ? null : s.replace(" ", "");
    }

    // ===================== 4. TACH HO / TEN / TEN DEM =====================
    public static String getHo(String fullName) {
        String[] w = fullName.trim().split("\\s+");
        return w[0];
    }

    public static String getTen(String fullName) {
        String[] w = fullName.trim().split("\\s+");
        return w[w.length - 1];
    }

    // Ten dem: cac tu tu w[1] den w[length-2]; neu khong co thi tra ve ""
    public static String getTenDem(String fullName) {
        String[] w = fullName.trim().split("\\s+");
        if (w.length < 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < w.length - 1; i++) {
            sb.append(w[i]);
            if (i < w.length - 2) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // ===================== 5. DEM =====================
// -> đếm số từ 
    public static int countWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        return s.trim().split("\\s+").length;
    }
// đếm 1 kiis tự cụ thể 

    public static int countChar(String s, char target) {
        int dem = 0;
        for (char c : s.toCharArray()) {
            if (c == target) {
                dem++;
            }
        }
        return dem;
    }
// -> đếm nguyen âm 

    public static int countVowels(String s) {
        int dem = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                dem++;
            }
        }
        return dem;
    }
// -> đếm chữ cái 

    public static int countLetters(String s) {
        int dem = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                dem++;
            }
        }
        return dem;
    }
// -> đếm chữ số 

    public static int countDigits(String s) {
        int dem = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                dem++;
            }
        }
        return dem;
    }

//    Character.isUpperCase(c)   // đếm chữ hoa
//  Character.isLowerCase(c)   // đếm chữ thường
//  c == ' '                   // đếm khoảng trắng
//  !Character.isLetterOrDigit(c)  // đếm ký tự đặc biệt
//    
//
    // ===================== 6. KIEM TRA DOI XUNG =====================
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // ===================== 6B. XOA KY TU =====================
    // Xoa ky tu dau: "lan anh" -> "an anh"
    public static String removeFirst(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(1);
    }

    // Xoa ky tu cuoi: "lan anh" -> "lan an"
    public static String removeLast(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, s.length() - 1);
    }

    // Xoa ky tu o vi tri index bat ky: ("lan anh", 3) -> "lananh"
    public static String removeAt(String s, int index) {
        if (s == null || index < 0 || index >= s.length()) {
            return s;
        }
        return s.substring(0, index) + s.substring(index + 1);
        // Cach khac: new StringBuilder(s).deleteCharAt(index).toString()
    }

    // Xoa mot khoang tu vi tri from den to-1: ("abcdef", 1, 4) -> "aef"
    public static String removeRange(String s, int from, int to) {
        if (s == null || from < 0 || to > s.length() || from > to) {
            return s;
        }
        return new StringBuilder(s).delete(from, to).toString();
    }

    // Xoa n ky tu dau: ("abcdef", 2) -> "cdef"
    public static String removeFirstN(String s, int n) {
        if (s == null || n <= 0) {
            return s;
        }
        if (n >= s.length()) {
            return "";
        }
        return s.substring(n);
    }

    // Xoa n ky tu cuoi: ("abcdef", 2) -> "abcd"
    public static String removeLastN(String s, int n) {
        if (s == null || n <= 0) {
            return s;
        }
        if (n >= s.length()) {
            return "";
        }
        return s.substring(0, s.length() - n);
    }

    // Xoa tat ca ky tu c: ("lan anh", 'a') -> "ln nh"
    public static String removeAllChar(String s, char c) {
        if (s == null) {
            return null;
        }
        return s.replace(String.valueOf(c), "");
    }

    // Chi xoa lan xuat hien dau tien cua ky tu c: ("lan anh", 'a') -> "ln anh"
    public static String removeFirstOccurrence(String s, char c) {
        if (s == null) {
            return null;
        }
        int idx = s.indexOf(c);
        if (idx < 0) {
            return s;
        }
        return s.substring(0, idx) + s.substring(idx + 1);
    }

    // Xoa chuoi con (moi lan xuat hien): ("lan anh", "an") -> "l h"
    public static String removeSubstring(String s, String sub) {
        if (s == null || sub == null || sub.isEmpty()) {
            return s;
        }
        return s.replace(sub, "");
    }

    // Xoa tu o vi tri k (tinh tu 0): ("nguyen van hung", 1) -> "nguyen hung"
    public static String removeWordAt(String s, int k) {
        if (s == null || s.trim().isEmpty()) {
            return s;
        }
        String[] w = s.trim().split("\\s+");
        if (k < 0 || k >= w.length) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < w.length; i++) {
            if (i == k) {
                continue;
            }
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(w[i]);
        }
        return sb.toString();
    }

    // Xoa cac ky tu trung lap, giu lan dau: "banana" -> "ban"
    public static String removeDuplicates(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) < 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // ===================== MAIN: CHAY THU TAT CA =====================
    public static void main(String[] args) {
        String s = "lan anh";
        String messy = "   tran    van   hung  ";
        String fullName = "nguyen van thanh hung";

        System.out.println("===== 1. IN HOA / IN THUONG =====");
        System.out.println("capitalizeFirst(\"" + s + "\")     = " + capitalizeFirst(s));
        System.out.println("capitalizeEachWord(\"" + s + "\")  = " + capitalizeEachWord(s));
        System.out.println("upperAll(\"" + s + "\")            = " + upperAll(s));
        System.out.println("capitalizeLast(\"" + s + "\")      = " + capitalizeLast(s));
        System.out.println("swapCase(\"Lan Anh\")            = " + swapCase("Lan Anh"));

        System.out.println("\n===== 2. DAO VI TRI / DAO NGUOC =====");
        System.out.println("swapChars(\"abcd\", 0, 3)  = " + swapChars("abcd", 0, 3));
        System.out.println("swapFirstTwo(\"abcd\")     = " + swapFirstTwo("abcd"));
        System.out.println("reverseString(\"" + s + "\")     = " + reverseString(s));
        System.out.println("reverseWords(\"" + s + "\")      = " + reverseWords(s));
        System.out.println("reverseEachWord(\"" + s + "\")   = " + reverseEachWord(s));

        System.out.println("\n===== 3. XOA KHOANG TRANG =====");
        System.out.println("normalizeSpaces = [" + normalizeSpaces(messy) + "]");
        System.out.println("removeAllSpaces = [" + removeAllSpaces(messy) + "]");
        System.out.println("trim()          = [" + messy.trim() + "]");

        System.out.println("\n===== 4. HO / TEN DEM / TEN =====");
        System.out.println("Ho:      " + getHo(fullName));
        System.out.println("Ten dem: " + getTenDem(fullName));
        System.out.println("Ten:     " + getTen(fullName));

        System.out.println("\n===== 5. DEM =====");
        System.out.println("countWords(\"" + normalizeSpaces(messy) + "\") = " + countWords(messy));
        System.out.println("countChar(\"" + s + "\", 'a')  = " + countChar(s, 'a'));
        System.out.println("countVowels(\"" + s + "\")     = " + countVowels(s));
        System.out.println("countLetters(\"abc123\")       = " + countLetters("abc123"));
        System.out.println("countDigits(\"abc123\")        = " + countDigits("abc123"));

        System.out.println("\n===== 6. DOI XUNG =====");
        System.out.println("isPalindrome(\"abcba\") = " + isPalindrome("abcba"));
        System.out.println("isPalindrome(\"abcd\")  = " + isPalindrome("abcd"));

        System.out.println("\n===== 7. TIM KIEM / KIEM TRA =====");
        System.out.println("contains(\"an\")       = " + s.contains("an"));
        System.out.println("indexOf(\"an\")        = " + s.indexOf("an"));
        System.out.println("lastIndexOf(\"an\")    = " + s.lastIndexOf("an"));
        System.out.println("startsWith(\"la\")     = " + s.startsWith("la"));
        System.out.println("endsWith(\"nh\")       = " + s.endsWith("nh"));
        System.out.println("isEmpty()            = " + s.isEmpty());
        System.out.println("isBlank() (Java 11)  = " + "   ".isBlank());

        System.out.println("\n===== 8. SO SANH =====");
        String a = "Lan";
        String b = "lan";
        System.out.println("equals            = " + a.equals(b));
        System.out.println("equalsIgnoreCase  = " + a.equalsIgnoreCase(b));
        System.out.println("compareTo         = " + a.compareTo(b));
        System.out.println("new String(\"x\") == \"x\" : " + (new String("x") == "x") + "  (khong dung == de so sanh chuoi)");

        System.out.println("\n===== 9. THAY THE / XOA =====");
        System.out.println("replace(\"a\", \"o\")           = " + s.replace("a", "o"));
        System.out.println("replaceFirst(\"a\", \"o\")      = " + s.replaceFirst("a", "o"));
        System.out.println("replaceAll(\"[0-9]\", \"\")     = " + "ab12cd34".replaceAll("[0-9]", ""));
        System.out.println("replaceAll(\"[aeiou]\", \"\")   = " + s.replaceAll("[aeiou]", ""));

        System.out.println("\n===== 10. TACH / GHEP =====");
        String[] parts = "a,b,c".split(",");
        System.out.println("split(\",\") length = " + parts.length);
        System.out.println("String.join(\"-\")   = " + String.join("-", parts));
        System.out.println("split(\" \") voi nhieu khoang trang -> " + "a  b".split(" ").length + " phan tu (co phan tu rong)");
        System.out.println("split(\"\\\\s+\")        -> " + "a  b".split("\\s+").length + " phan tu");

        System.out.println("\n===== 11. CHUYEN CHUOI <-> SO =====");
        int n = Integer.parseInt("123");
        double d = Double.parseDouble("4.5");
        System.out.println("parseInt(\"123\") + 1      = " + (n + 1));
        System.out.println("parseDouble(\"4.5\") + 1   = " + (d + 1));
        System.out.println("String.valueOf(123)      = " + String.valueOf(n));
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("parseInt(\"abc\") -> NumberFormatException");
        }

        System.out.println("\n===== 12. CAC LOI HAY GAP =====");
        try {
            "abc".charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("charAt(5) tren \"abc\" -> StringIndexOutOfBoundsException");
        }
        String empty = "";
        System.out.println("capitalizeFirst(\"\")   = [" + capitalizeFirst(empty) + "] (da xu ly chuoi rong)");
        System.out.println("capitalizeFirst(null) = " + capitalizeFirst(null) + " (da xu ly null)");
        char c1 = 'a', c2 = 'b';
        System.out.println("'a' + 'b'            = " + (c1 + c2) + " (cong 2 char ra so int)");
        System.out.println("\"\" + 'a' + 'b'       = " + ("" + c1 + c2));
        String t = "abc";
        t.toUpperCase();
        System.out.println("t.toUpperCase() khong gan lai -> t van la \"" + t + "\"");
        t = t.toUpperCase();
        System.out.println("t = t.toUpperCase()          -> t la \"" + t + "\"");
    }
}
