package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.example.bulksmsscheduler.R;
import java.util.Arrays;
import java.util.Locale;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class F5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1482i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M5 f1483j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1484k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1485l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(int i2, M5 m5, int i3, long j3) {
        super(2);
        this.f1482i = i2;
        this.f1483j = m5;
        this.f1484k = i3;
        this.f1485l = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            int i2 = C0186r3.a(this.f1482i, 1) ? R.string.m3c_time_picker_minute_suffix : this.f1483j.f1753a ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
            int i3 = this.f1484k;
            Object[] objArr = {Integer.valueOf(i3)};
            String w2 = D1.w(i2, c0285q);
            Locale locale = Y0.c.a((Configuration) c0285q.l(AndroidCompositionLocals_androidKt.f6780a)).get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Object[] copyOf = Arrays.copyOf(objArr, 1);
            String format = String.format(locale, w2, Arrays.copyOf(copyOf, copyOf.length));
            V.g gVar = V.b.f5835l;
            c0285q.V(733328855);
            V.l lVar = V.l.f5857b;
            s.r f3 = AbstractC1177p.f(gVar, false, c0285q, 6);
            c0285q.V(-1323940314);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i5 = AbstractC1108W.i(lVar);
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
            c0285q.V(992582240);
            boolean g3 = c0285q.g(format);
            Object K3 = c0285q.K();
            if (g3 || K3 == C0275l.f4150a) {
                K3 = new A0.o(format, 12);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            t5.b(AbstractC0064a.a(i3, 2, 6), A0.m.b(lVar, false, (y2.c) K3), this.f1485l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131064);
            B1.t.u(c0285q, false, true, false, false);
        }
        return C0880v.f8657a;
    }
}
