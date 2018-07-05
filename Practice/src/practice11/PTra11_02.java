package practice11;

import java.util.Scanner;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[]A =FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		Scanner scanner = new Scanner(System.in);
		String B = scanner.nextLine();

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		System.out.println();
		for (Book i : A) {
			if (i.title.contains(B)) {
				System.out.println(i.dispBookInfo());
			}
		}




	}
}
