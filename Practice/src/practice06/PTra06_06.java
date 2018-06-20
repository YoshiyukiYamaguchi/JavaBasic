package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 *  j----------------------------------
		 i 0□□□□□  12345
		 * 1■□□□□  67891
		 * 2■■□□□  12345
		 * 3■■■□□  67891
		 * 4■■■■□  12345
		 */
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
             if (i==0) {
            	 System.out.print("□");
             }else if(i<=1&&j<=1)  {
            	 System.out.print("■");
             }

		}
        	System.out.println();

}
	}}


