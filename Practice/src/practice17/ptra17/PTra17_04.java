/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;
import practice09.util.Util;
public class PTra17_04 {
	public static void main(String[] args) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		String str = "スッキリわかるJava入門";
		Util.dispMessageSlowly(str, 500);

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

	}
}
