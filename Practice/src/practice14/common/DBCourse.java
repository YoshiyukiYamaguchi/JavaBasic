package practice14.common;

public class DBCourse implements Course  {

	@Override
	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}

	@Override
	public String[] getCourseUnit() {
		String[] B = {"DB基礎","SQR基礎","正規化","SQR応用"};
		return B;
	}


}
