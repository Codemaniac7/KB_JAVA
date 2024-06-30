package OptionalQuest;

public class triangle {
    public static void main(String[] args) {
        System.out.println("\t" + "*");
        System.out.println("   " + "***");
        System.out.println("  " + "*****");
        System.out.println(" " + "*******");
        System.out.println("" + "*********");
        System.out.println();
        String star = " *";
        StringBuilder sb = new StringBuilder();
        int j = 7;
        for (int i = 0; i < 7; i++) {
            sb.append(star);
            System.out.println(sb);
        }
    }
}
