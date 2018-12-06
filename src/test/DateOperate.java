package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import ot.utils.Basic;

public class DateOperate extends Basic{
	static Calendar cal = Calendar.getInstance();
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		out("start");
		
		test03();
		
		out("end");
	}

	// フォーマット
	// https://java-reference.com/java_date_format.html
	private static void test03() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		out(sdf.format(cal.getTime()));
		out(sdf2.format(cal.getTime()));
	}
	
	// コピーはclone
	private static void test02() {
		Calendar cal2 = (Calendar)cal.clone();
		
		cal2.add(Calendar.DATE, 1);
		
		out(cal.getTime());
		out(cal2.getTime());
	}
	
	// 値取得
	private static void test01() {
		out(cal);
		out(cal.get(Calendar.YEAR));
		out(cal.get(Calendar.MONTH));
		out(cal.get(Calendar.DATE));
		
		out(cal.getTime());
		out(cal.getTimeZone());
	}
}
