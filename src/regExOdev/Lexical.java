/**
*
* @author Lütfi Mert Kahraman (lutfi.kahraman@ogr.sakarya.edu.tr)
* @since 3.04.2022
* <p>
* Operatör ve operand bilgisini tutan sýnýf
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
		System.out.println("Operatör Bilgisi:");
		System.out.println("\tTekli Operatör Sayýsý: " + unaryNumOp);
		System.out.println("\tÝkili Operatör Sayýsý: " + binaryNumOp);
		System.out.println("\tSayýsal Operatör Sayýsý: " + numOp);
		System.out.println("\tÝliþkisel Operatör Sayýsý: " + relationalOp);
		System.out.println("\tMantýksal Operatör Sayýsý: " + logicOp);
		System.out.println("Operand Bilgisi:");
		System.out.println("\tToplam Operand Sayýsý: " + operand);
	}
}
