/**
*
* @author L�tfi Mert Kahraman (lutfi.kahraman@ogr.sakarya.edu.tr)
* @since 3.04.2022
* <p>
* Operat�r ve operand bilgisini tutan s�n�f
* </p>
*/

package regExOdev;

public class Lexical {
	private static int numOp;
	private static int logicOp;
	private static int unaryNumOp;
	private static int binaryNumOp;
	private static int relationalOp;
	private static int operand;

	public static void IncreaseLogicOp() {
		logicOp++;
		operand += 2;
	}

	public static void IncreaseLogicNot() {
		logicOp++;
		operand++;
	}

	public static void IncreaseUnaryNumOp() {
		numOp++;
		unaryNumOp++;
		operand++;

	}

	public static void IncreaseBinaryNumOp() {
		numOp++;
		binaryNumOp++;
		operand += 2;
	}

	public static void IncreaseRelationalOp() {
		relationalOp++;
		operand += 2;
	}

	public static void Print() {
		System.out.println("Operat�r Bilgisi:");
		System.out.println("\tTekli Operat�r Say�s�: " + unaryNumOp);
		System.out.println("\t�kili Operat�r Say�s�: " + binaryNumOp);
		System.out.println("\tSay�sal Operat�r Say�s�: " + numOp);
		System.out.println("\t�li�kisel Operat�r Say�s�: " + relationalOp);
		System.out.println("\tMant�ksal Operat�r Say�s�: " + logicOp);
		System.out.println("Operand Bilgisi:");
		System.out.println("\tToplam Operand Say�s�: " + operand);
	}
}
