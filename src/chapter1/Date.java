package chapter1;

import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        // 打印当前月的日历
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        // 获取当前日期的日历对象
        Calendar firstDate = Calendar.getInstance();
        // 把日历对象设定为当前月的第一天
        firstDate.set(Calendar.DAY_OF_MONTH, 1);
        // 获取当前月最大日期
        int maxDay = firstDate.getActualMaximum(Calendar.DAY_OF_MONTH);
        for ( int i = 0; i < maxDay; i++ ) {
            // 当前日期是周几
            int i1 = firstDate.get(Calendar.DAY_OF_WEEK);
            // 当前日期是几号
            int i2 = firstDate.get(Calendar.DAY_OF_MONTH);
            if ( i == 0) {
                if ( i1 == Calendar.SUNDAY ) {
                    for ( int j = 0; j < 6; j++ ) {
                        System.out.print("\t");
                    }
                    System.out.println(i2);
                }else {
                    // 周日是1，周一是2...周六是7
                    for ( int k = 0; k < i1 - 2; k++ ) {
                        System.out.print("\t");
                    }
                    System.out.print(i2);
                    System.out.print("\t");
                }
            }else {
                // 不是一号的情况
                if ( i1 == Calendar.SUNDAY ) {
                    System.out.println(i2);
                }else {
                    System.out.print(i2);
                    System.out.print("\t");
                }
            }
            // 打印日历后，日期增加一天
            firstDate.add(Calendar.DATE, 1);
        }
    }
}
