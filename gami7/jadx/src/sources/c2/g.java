package c2;

import H.D1;
import J.C0266g0;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W0;
import J2.B;
import J2.InterfaceC0328z;
import V.l;
import V.o;
import Y1.G;
import Y1.H;
import androidx.lifecycle.Q;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import m2.C0880v;
import n1.y;
import s.C1160M;
import s.T;
import y.C1396d;

/* loaded from: classes.dex */
public final class g implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f7349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DateTimeFormatter f7350i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f7351j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W0 f7352k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7354m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7355n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0266g0 f7356o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y f7357p;

    public g(H h2, DateTimeFormatter dateTimeFormatter, InterfaceC0328z interfaceC0328z, W0 w02, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03, C0266g0 c0266g0, y yVar) {
        this.f7349h = h2;
        this.f7350i = dateTimeFormatter;
        this.f7351j = interfaceC0328z;
        this.f7352k = w02;
        this.f7353l = interfaceC0258c0;
        this.f7354m = interfaceC0258c02;
        this.f7355n = interfaceC0258c03;
        this.f7356o = c0266g0;
        this.f7357p = yVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        z2.h.f((T) obj, "$this$TopAppBar");
        if ((intValue & 81) == 16 && c0285q.A()) {
            c0285q.P();
        } else {
            float f3 = 8;
            o l3 = androidx.compose.foundation.layout.a.l(l.f5857b, 0.0f, 0.0f, f3, 0.0f, 11);
            float f4 = 16;
            C1160M c1160m = new C1160M(f4, f3, f4, f3);
            C1396d a3 = y.e.a(f3);
            final InterfaceC0258c0 interfaceC0258c0 = this.f7354m;
            final InterfaceC0258c0 interfaceC0258c02 = this.f7355n;
            final H h2 = this.f7349h;
            final DateTimeFormatter dateTimeFormatter = this.f7350i;
            final InterfaceC0328z interfaceC0328z = this.f7351j;
            final W0 w02 = this.f7352k;
            final InterfaceC0258c0 interfaceC0258c03 = this.f7353l;
            final C0266g0 c0266g0 = this.f7356o;
            final y yVar = this.f7357p;
            D1.a(new y2.a() { // from class: c2.e
                @Override // y2.a
                public final Object c() {
                    H h3 = H.this;
                    z2.h.f(h3, "$viewModel");
                    InterfaceC0328z interfaceC0328z2 = interfaceC0328z;
                    z2.h.f(interfaceC0328z2, "$scope");
                    W0 w03 = w02;
                    z2.h.f(w03, "$settings$delegate");
                    InterfaceC0258c0 interfaceC0258c04 = interfaceC0258c03;
                    z2.h.f(interfaceC0258c04, "$resumeTime$delegate");
                    InterfaceC0258c0 interfaceC0258c05 = interfaceC0258c0;
                    z2.h.f(interfaceC0258c05, "$stopTime$delegate");
                    InterfaceC0258c0 interfaceC0258c06 = interfaceC0258c02;
                    z2.h.f(interfaceC0258c06, "$skipSundays$delegate");
                    C0266g0 c0266g02 = c0266g0;
                    z2.h.f(c0266g02, "$smsInterval$delegate");
                    y yVar2 = yVar;
                    z2.h.f(yVar2, "$navController");
                    R1.a aVar = (R1.a) w03.getValue();
                    if (aVar == null) {
                        aVar = new R1.a();
                    }
                    R1.a aVar2 = aVar;
                    LocalTime localTime = (LocalTime) interfaceC0258c04.getValue();
                    DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
                    String format = localTime.format(dateTimeFormatter2);
                    z2.h.e(format, "format(...)");
                    String format2 = ((LocalTime) interfaceC0258c05.getValue()).format(dateTimeFormatter2);
                    z2.h.e(format2, "format(...)");
                    B.r(Q.j(h3), null, 0, new G(h3, R1.a.a(aVar2, format, format2, ((Boolean) interfaceC0258c06.getValue()).booleanValue(), (int) c0266g02.g(), false, false, null, 481), null), 3);
                    B.r(interfaceC0328z2, null, 0, new f(h3, yVar2, null), 3);
                    return C0880v.f8657a;
                }
            }, l3, false, a3, null, null, null, c1160m, null, AbstractC0626c.f7327i, c0285q, 817889328, 372);
        }
        return C0880v.f8657a;
    }
}
