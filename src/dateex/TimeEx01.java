package dateex;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

//������ �ڹ� 1.7 ����
//java.sql.Date
//java.sql.Time(x)
//java.sql.Timestamp
//java.util.Calendar(x)
//java.util.Date

//�Ź��� �ڹ� 1.8�̻�
//java.time.LocalDate 
//java.time.LocalDateTime
//java.time.LocalTime

public class TimeEx01 {

	public static void main(String[] args) {
		// Calendar �Ⱦ�
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		String today = formater.format(cal.getTime());
		System.out.println("cal.getTime():" + cal.getTime());
		System.out.println("today:" + today);

		// 2.java.util.Date �Ⱦ� 1970.01.01 �������� �ؼ� ����� �и��ʸ� ���

		Date time2 = new Date();
		System.out.println("time2:" + time2);
		System.out.println("time2.getTIme():" + time2.getTime());
		System.out.println("time2.getDay():" + time2.getDay());

		// 3.java.sql.Date �Ⱦ�
		// java.util.Date �� �̹� import �Ǿ� �ֱ� ������ java.sql �ٿ���
		java.sql.Date time3 = new java.sql.Date(24 * 3600 * 1000 * 2);
		System.out.println("time3:" + time3);

		// 4.java.sql.Timestamp
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = new Date();
		String timestamp = sf.format(d.getTime());
		Timestamp ts = Timestamp.valueOf(timestamp);
		System.out.println("ts:" + ts);

		// 5.LocalDateTime(LocalDateTime to Timestamp)
		Timestamp nowDate = Timestamp.valueOf(LocalDateTime.now());
		System.out.println("nowDate:" + nowDate);
		
		// 6.LocalDateTime(Timestamp to LocaldateTime)
		LocalDateTime ldt = nowDate.toLocalDateTime();
		System.out.println("ldt:" + ldt);
		
		System.out.println("LocalDateTime:" + LocalDateTime.now());
		System.out.println("LocalDate:" + LocalDate.now());
		System.out.println("LocalTime:" + LocalTime.now());
	}

}
