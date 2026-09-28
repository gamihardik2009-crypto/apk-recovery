package C1;

import a.AbstractC0423a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import androidx.lifecycle.EnumC0466o;
import c0.AbstractC0569I;
import c0.C0567G;
import c0.InterfaceC0576P;
import com.example.bulksmsscheduler.data.AppDatabase;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import n1.C0945f;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import n2.C0970v;

/* loaded from: classes.dex */
public class b implements InterfaceC0576P {

    /* renamed from: i, reason: collision with root package name */
    public static b f620i;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f621h;

    public /* synthetic */ b(int i2, boolean z3) {
        this.f621h = i2;
    }

    public static final float a(float f3, float[] fArr, float[] fArr2) {
        float f4;
        float f5;
        float f6;
        float f7;
        float max;
        float abs = Math.abs(f3);
        float signum = Math.signum(f3);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i2 = -(binarySearch + 1);
            int i3 = i2 - 1;
            if (i3 >= fArr.length - 1) {
                float f8 = fArr[fArr.length - 1];
                float f9 = fArr2[fArr.length - 1];
                if (f8 == 0.0f) {
                    return 0.0f;
                }
                return (f9 / f8) * f3;
            }
            if (i3 == -1) {
                float f10 = fArr[0];
                f6 = fArr2[0];
                f7 = f10;
                f5 = 0.0f;
                f4 = 0.0f;
            } else {
                float f11 = fArr[i3];
                float f12 = fArr[i2];
                f4 = fArr2[i3];
                f5 = f11;
                f6 = fArr2[i2];
                f7 = f12;
            }
            max = signum * (((f6 - f4) * Math.max(0.0f, Math.min(1.0f, f5 == f7 ? 0.0f : (abs - f5) / (f7 - f5)))) + f4);
        }
        return max;
    }

    public static C0945f b(Context context, n1.s sVar, Bundle bundle, EnumC0466o enumC0466o, n1.m mVar) {
        String uuid = UUID.randomUUID().toString();
        z2.h.e(uuid, "randomUUID().toString()");
        z2.h.f(sVar, "destination");
        z2.h.f(enumC0466o, "hostLifecycleState");
        return new C0945f(context, sVar, bundle, enumC0466o, mVar, uuid, null);
    }

    public static Typeface d(String str, H0.k kVar, int i2) {
        Typeface create;
        if (H0.i.a(i2, 0) && z2.h.a(kVar, H0.k.f3401j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f3405h, H0.i.a(i2, 1));
        return create;
    }

    public static Typeface e(String str, H0.k kVar, int i2) {
        if (H0.i.a(i2, 0) && z2.h.a(kVar, H0.k.f3401j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int y3 = l0.c.y(kVar, i2);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(y3) : Typeface.create(str, y3);
    }

    public static List h(R1.a aVar, LocalDate localDate, LocalTime localTime, List list, List list2, int i2) {
        LocalTime of;
        LocalTime of2;
        boolean z3;
        int i3 = i2;
        R1.c cVar = R1.c.f5485j;
        z2.h.f(aVar, "settings");
        z2.h.f(list, "clients");
        z2.h.f(list2, "templates");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((R1.e) obj).f5494e) {
                arrayList.add(obj);
            }
        }
        List T3 = AbstractC0961m.T(arrayList, new T1.a());
        if (list.isEmpty() || T3.isEmpty()) {
            return C0970v.f9165h;
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        try {
            of = LocalTime.parse(aVar.f5467b);
        } catch (Exception unused) {
            of = LocalTime.of(9, 0);
        }
        LocalTime localTime2 = of;
        try {
            of2 = LocalTime.parse(aVar.f5468c);
        } catch (Exception unused2) {
            of2 = LocalTime.of(18, 0);
        }
        LocalTime localTime3 = of2;
        LocalDate plusWeeks = localDate.plusWeeks(i3);
        LocalDateTime of3 = LocalDateTime.of(plusWeeks, localTime);
        for (Object obj2 : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            R1.b bVar = (R1.b) obj2;
            while (true) {
                z3 = aVar.f5469d;
                if (!z3 || of3.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    break;
                }
                of3 = of3.plusDays(1L).with((TemporalAdjuster) localTime2);
            }
            if (of3.toLocalTime().isBefore(localTime2)) {
                of3 = of3.with((TemporalAdjuster) localTime2);
            } else if (of3.toLocalTime().isAfter(localTime3)) {
                of3 = of3.plusDays(1L).with((TemporalAdjuster) localTime2);
                while (z3 && of3.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    of3 = of3.plusDays(1L).with((TemporalAdjuster) localTime2);
                }
            }
            LocalDateTime localDateTime = of3;
            R1.e eVar = (R1.e) T3.get((i4 + i3) % T3.size());
            int length = eVar.f5492c.length();
            String str = eVar.f5493d;
            if (length > 0) {
                str = eVar.f5492c + ' ' + str;
            }
            String b02 = bVar.f5481g ? H2.l.b0(str, "{name}", bVar.f5476b) : H2.l.h0(H2.l.b0(H2.l.b0(str, "{name}", ""), "  ", " ")).toString();
            String str2 = "Week " + plusWeeks.format(DateTimeFormatter.ofPattern("dd/MM"));
            String uuid = UUID.randomUUID().toString();
            z2.h.e(uuid, "toString(...)");
            String localDate2 = localDateTime.toLocalDate().toString();
            z2.h.e(localDate2, "toString(...)");
            String localTime4 = localDateTime.toLocalTime().toString();
            z2.h.e(localTime4, "toString(...)");
            arrayList2.add(new R1.f(uuid, bVar.f5475a, eVar.f5490a, localDate2, localTime4, cVar, 0, null, str2, b02));
            of3 = localDateTime.plusMinutes(aVar.f5470e);
            i3 = i2;
            i4 = i5;
            localTime2 = localTime2;
            plusWeeks = plusWeeks;
            localTime3 = localTime3;
        }
        return arrayList2;
    }

    public static R1.c n(String str) {
        z2.h.f(str, "value");
        try {
            return R1.c.valueOf(str);
        } catch (Exception unused) {
            return R1.c.f5485j;
        }
    }

    @Override // c0.InterfaceC0576P
    public AbstractC0569I c(long j3, O0.k kVar, O0.b bVar) {
        return new C0567G(AbstractC0423a.n(0L, j3));
    }

    public Typeface f(H0.k kVar, int i2) {
        switch (this.f621h) {
            case 4:
                return d(null, kVar, i2);
            default:
                return e(null, kVar, i2);
        }
    }

    public Typeface g(H0.m mVar, H0.k kVar, int i2) {
        String str;
        switch (this.f621h) {
            case 4:
                mVar.getClass();
                return d("sans-serif", kVar, i2);
            default:
                mVar.getClass();
                int i3 = kVar.f3405h / 100;
                if (i3 >= 0 && i3 < 2) {
                    str = "sans-serif-thin";
                } else if (2 > i3 || i3 >= 4) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            str = "sans-serif-medium";
                        } else if ((6 > i3 || i3 >= 8) && 8 <= i3 && i3 < 11) {
                            str = "sans-serif-black";
                        }
                    }
                    str = "sans-serif";
                } else {
                    str = "sans-serif-light";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface e3 = e(str, kVar, i2);
                    if (!z2.h.a(e3, Typeface.create(Typeface.DEFAULT, l0.c.y(kVar, i2))) && !z2.h.a(e3, e(null, kVar, i2))) {
                        typeface = e3;
                    }
                }
                return typeface == null ? e("sans-serif", kVar, i2) : typeface;
        }
    }

    public AppDatabase i(Context context) {
        AppDatabase appDatabase = AppDatabase.f7383n;
        if (appDatabase == null) {
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                z2.h.e(applicationContext, "getApplicationContext(...)");
                r1.q g3 = AbstractC0946A.g(applicationContext, AppDatabase.class, "sms_scheduler_database");
                g3.f9981l = false;
                g3.f9982m = true;
                appDatabase = (AppDatabase) g3.b();
                AppDatabase.f7383n = appDatabase;
            }
        }
        return appDatabase;
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public int k(Object obj) {
        return ((Z0.b) obj).f6395c;
    }

    public boolean l(Object obj) {
        return ((Z0.b) obj).f6396d;
    }

    public boolean m(Spannable spannable) {
        return false;
    }

    public String toString() {
        switch (this.f621h) {
            case 19:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public b(Context context) {
        this.f621h = 2;
        context.getApplicationContext();
    }

    public b(int i2) {
        this.f621h = i2;
        switch (i2) {
            case 28:
                new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                new G0.b();
                G0.c cVar = new G0.c();
                cVar.f1226a = G0.a.f1218a;
                cVar.f1227b = G0.a.f1219b;
                cVar.f1228c = 0;
                break;
        }
    }
}
