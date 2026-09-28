package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0302z;
import J2.InterfaceC0328z;
import c0.AbstractC0571K;
import c0.C0603v;
import com.example.bulksmsscheduler.R;
import java.time.LocalDate;
import m2.C0880v;
import n2.AbstractC0949a;
import s.AbstractC1173l;
import s.C1168g;
import s.C1170i;
import u.C1270a;

/* renamed from: H.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190s1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I f3076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3077j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E2.d f3078k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B0 f3079l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V.o f3080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f3081n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f3082o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190s1(I i2, long j3, E2.d dVar, B0 b02, V.o oVar, y2.c cVar, InterfaceC0180q3 interfaceC0180q3) {
        super(2);
        this.f3076i = i2;
        this.f3077j = j3;
        this.f3078k = dVar;
        this.f3079l = b02;
        this.f3080m = oVar;
        this.f3081n = cVar;
        this.f3082o = interfaceC0180q3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1170i c1170i;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            I i2 = this.f3076i;
            H b3 = i2.b();
            K d3 = ((J) i2).d(LocalDate.of(b3.f1544h, b3.f1545i, 1));
            K a3 = i2.a(this.f3077j);
            E2.d dVar = this.f3078k;
            int i3 = dVar.f1076h;
            int i4 = a3.f1653a;
            u.x a4 = u.y.a(Math.max(0, (i4 - i3) - 3), 2, c0285q);
            C0093e0 c0093e0 = (C0093e0) c0285q.l(AbstractC0107g0.f2597a);
            B0 b02 = this.f3079l;
            long j3 = b02.f1315a;
            float f3 = ((O0.e) c0285q.l(AbstractC0223x4.f3310a)).f5138h;
            boolean booleanValue = ((Boolean) c0285q.l(AbstractC0107g0.f2598b)).booleanValue();
            if (C0603v.c(j3, c0093e0.f2498p) && booleanValue) {
                j3 = AbstractC0107g0.f(c0093e0, f3);
            }
            c0285q.V(773894976);
            c0285q.V(-492369756);
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (K3 == w2) {
                C0302z c0302z = new C0302z(C0257c.B(c0285q));
                c0285q.e0(c0302z);
                K3 = c0302z;
            }
            c0285q.r(false);
            InterfaceC0328z interfaceC0328z = ((C0302z) K3).f4298h;
            c0285q.r(false);
            String w3 = D1.w(R.string.m3c_date_picker_scroll_to_earlier_years, c0285q);
            String w4 = D1.w(R.string.m3c_date_picker_scroll_to_later_years, c0285q);
            C1270a c1270a = new C1270a();
            V.o b4 = A0.m.b(androidx.compose.foundation.a.b(this.f3080m, j3, AbstractC0571K.f7193a), false, C0200u.f3154t);
            C1168g c1168g = AbstractC1173l.f10154f;
            C1170i c1170i2 = new C1170i(A1.f1293g);
            c0285q.V(-969328877);
            boolean i5 = c0285q.i(dVar) | c0285q.g(a4) | c0285q.i(interfaceC0328z) | c0285q.g(w3) | c0285q.g(w4) | c0285q.e(i4);
            int i6 = d3.f1653a;
            boolean e3 = i5 | c0285q.e(i6) | c0285q.g(this.f3081n) | c0285q.g(this.f3082o) | c0285q.g(b02);
            Object K4 = c0285q.K();
            if (e3 || K4 == w2) {
                c1170i = c1170i2;
                K4 = new C0184r1(this.f3078k, a4, interfaceC0328z, w3, w4, i4, i6, this.f3081n, this.f3082o, this.f3079l);
                c0285q.e0(K4);
            } else {
                c1170i = c1170i2;
            }
            c0285q.r(false);
            AbstractC0949a.d(c1270a, b4, a4, null, false, c1170i, c1168g, null, false, (y2.c) K4, c0285q, 1769472, 408);
        }
        return C0880v.f8657a;
    }
}
