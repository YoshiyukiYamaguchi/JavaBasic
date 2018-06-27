package practice10;

public class PTra10_01 {

	/*
	 * ★ 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		User
	 * フィールド
	 * 		userId		:	int型
	 * 		userNm		：	String型
	 * 		mail		：	String型
	 * 		password	:	String型
	 * メソッド
	 * 		なし
	 */

	public static void main(String[] args) {
		User us = new User();
		us.userId = 12345;
		System.out.println(us.userId);

		User us1 = new User ();
		us1.userNm = "Yocchi";
		System.out.println(us1.userNm);

		User us2 = new User();
		us2.mail = "aaa@bbb";
		System.out.println(us2.mail);

		User us3 = new User();
		us3.password = "yocchi123";
		System.out.println(us3.password);



		}


		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください


		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

	}
