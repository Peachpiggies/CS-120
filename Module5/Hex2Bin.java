import java.util.Scanner;

public class Hex2Bin {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Hexadecimal string: ");
    String hexString = in.nextLine().toLowerCase();

    String binaryString = "";
    String binaryTable[] = { "0000", "0001", "0010", "0011",
                             "0100", "0101", "0110", "0111",
                             "1000", "1001", "1010", "1011",
                             "1100", "1101", "1110", "1111" };

    for (int i = 0; i < hexString.length(); i++) {
      char hexChar = hexString.charAt(i);
      int hexValue = Character.digit(hexChar, 16);
      binaryString += binaryTable[hexValue];
      binaryString += " ";
    }

    System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s", hexString, binaryString);
    in.close();
  }
}
