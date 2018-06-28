package practice10;

public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください


		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください


		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner = new java.util.Scanner(System.in);


		// ★ 入力された値を、String型の変数lineに格納してください
		String line = scanner.nextLine();
		String [] a = line.split(",");


		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）

		User us = new User();
		us.userNm = a[1];
		us.mail = a[2];
		us.password = a[3];
		System.out.println(a[0]);

		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		int b = Integer.parseInt(a[0]);
		us.userId = b;
		



		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです


		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

	}
}
