package H;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;
import m2.C0865g;

/* loaded from: classes.dex */
public final class J extends I {

    /* renamed from: d, reason: collision with root package name */
    public static final ZoneId f1611d = ZoneId.of("UTC");

    /* renamed from: b, reason: collision with root package name */
    public final int f1612b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1613c;

    public J(Locale locale) {
        this.f1612b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            arrayList.add(new C0865g(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f1613c = arrayList;
    }

    @Override // H.I
    public final K a(long j3) {
        return d(Instant.ofEpochMilli(j3).atZone(f1611d).withDayOfMonth(1).toLocalDate());
    }

    @Override // H.I
    public final H b() {
        LocalDate now = LocalDate.now();
        return new H(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(f1611d).toInstant().toEpochMilli());
    }

    public final H c(long j3) {
        LocalDate localDate = Instant.ofEpochMilli(j3).atZone(f1611d).toLocalDate();
        return new H(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000);
    }

    public final K d(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f1612b;
        if (value < 0) {
            value += 7;
        }
        return new K(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f1611d).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
