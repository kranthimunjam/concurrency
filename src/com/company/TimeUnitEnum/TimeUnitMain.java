package com.company.TimeUnitEnum;

import java.util.concurrent.TimeUnit;

public class TimeUnitMain {
    public static void main(String[] args){
        // convert to a time unit given duration and unit.
        System.out.println(TimeUnit.DAYS.convert(172800L, TimeUnit.SECONDS));
        System.out.println(TimeUnit.HOURS.convert(172800L, TimeUnit.SECONDS));
        System.out.println(TimeUnit.MINUTES.convert(172800L, TimeUnit.SECONDS));

        // given seconds, convert it into days, hours, minutes.  result is same as above.
        System.out.println(TimeUnit.SECONDS.toDays(172800L));
        System.out.println(TimeUnit.SECONDS.toHours(172800L));
        System.out.println(TimeUnit.SECONDS.toMinutes(172800L));
    }
}
