/**
*
* @author Lütfi Mert Kahraman (lutfi.kahraman@ogr.sakarya.edu.tr)
* @since 3.04.2022
* <p>
* Programýn tasarlandýðý ana main sýnýfý
* </p>
*/

package regExOdev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Program {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0].toString());

		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String s, text = null;

		while ((s = bufferedReader.readLine()) != null) {

			text += s + "\r";

		}

		Pattern pattern = Pattern.compile("//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/");
		Matcher matcher = pattern.matcher(text);
		StringBuffer sb = new StringBuffer();

		while (matcher.find()) {
			matcher.appendReplacement(sb, "$1");

		}

		matcher.appendTail(sb);
		text = sb.toString();
		sb = new StringBuffer();

		pattern = Pattern.compile("\".*?\"");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			matcher.appendReplacement(sb, "");
		}

		matcher.appendTail(sb);
		text = sb.toString();
		sb = new StringBuffer();

		pattern = Pattern.compile("\\+{2}|--");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseUnaryNumOp();
			matcher.appendReplacement(sb, "");
		}

		matcher.appendTail(sb);
		text = sb.toString();
		sb = new StringBuffer();

		pattern = Pattern.compile("\\+=|-=|/=|\\*=|%=|&=|\\|=|\\^=");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseBinaryNumOp();
			matcher.appendReplacement(sb, "");
		}

		matcher.appendTail(sb);
		text = sb.toString();
		sb = new StringBuffer();

		pattern = Pattern.compile("<=|>=|==|!=");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseRelationalOp();
			matcher.appendReplacement(sb, "");
		}

		matcher.appendTail(sb);
		text = sb.toString();
		sb = new StringBuffer();

		pattern = Pattern.compile("\\&{2}|\\|{2}");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseLogicOp();
			matcher.appendReplacement(sb, "");
		}

		matcher.appendTail(sb);
		text = sb.toString();
		sb = new StringBuffer();

		pattern = Pattern.compile("\\+|-|\\*|/|%|&|\\||\\^|=");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseBinaryNumOp();
		}

		pattern = Pattern.compile(">|<");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseRelationalOp();
		}

		pattern = Pattern.compile("!");
		matcher = pattern.matcher(text);

		while (matcher.find()) {
			Lexical.IncreaseLogicOp();
		}

		Lexical.Print();
		fileReader.close();

	}

}
