package cn.hubu.MyDate;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/***
 * ���ӻ���������
 * @author Rain
 *
 */
public class VisualCalendar {
	public static void main(String[] args) {
		String temp = "2016-1-8";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = (Date) df.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.set(calendar.DATE,1);//
			int max = calendar.getActualMaximum(calendar.DATE);//��ȡ��������
			System.out.println(calendar.DATE);
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			for (int i = 1; i < calendar.DAY_OF_WEEK; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <= max ; i++) {
				System.out.print(i+"\t");
				int a = calendar.get(calendar.DAY_OF_WEEK);
				if (a == calendar.SATURDAY) {
					System.out.print("\n");
				}
				calendar.add(calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
