import java.util.ArrayList;

public class CodeTable {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        String letter = "";
        // Headings.
        String intBase3Col = "Base 3";
        String letterCol = "Letter";
        String intBase10Col = "Integer";
        String format = "| %-6s | %-7s | %-8s |\n";
        System.out.printf(format, intBase3Col, intBase10Col, letterCol);

        int numAlphabet = 27; // number of letters in code
        int q = 3; // ternary code
        double pos3 = Math.pow(q, 2),
                pos2 = Math.pow(q, 1),
                pos1 = Math.pow(q, 0); // positions

        for (int base10 = 0; base10 < numAlphabet; base10++) {
            for (int x = 0; x < q; x++) {
                for (int y = 0; y < q; y++) {
                    for (int z = 0; z < q; z++) {
                        if (base10 == x * pos3 + y * pos2 + z * pos1) {
                            if (base10 == 0) {
                                letter = "blank ";
                            } else {
                                letter = (char) (base10 + 64) + "";
                            }
                            String code = x + "" + y + "" + z;
                            System.out.printf(format, code, base10, letter);

                        }
                    }
                }
            }

        }

    }
}
