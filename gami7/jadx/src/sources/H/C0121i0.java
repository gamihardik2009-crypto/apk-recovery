package H;

import J.C0285q;
import com.example.bulksmsscheduler.R;
import m.AbstractC0831e;
import m.AbstractC0852z;
import m2.C0880v;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1096J;

/* renamed from: H.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121i0 extends z2.i implements y2.f {

    /* renamed from: j, reason: collision with root package name */
    public static final C0121i0 f2713j = new C0121i0(3, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0121i0 f2714k = new C0121i0(3, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0121i0 f2715l = new C0121i0(3, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0121i0 f2716m = new C0121i0(3, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C0121i0 f2717n = new C0121i0(3, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C0121i0 f2718o = new C0121i0(3, 5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0121i0(int i2, int i3) {
        super(i2);
        this.f2719i = i3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f2719i) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q.A()) {
                    c0285q.P();
                }
                return C0880v.f8657a;
            case 1:
                W3 w3 = (W3) obj;
                C0285q c0285q2 = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0285q2.g(w3) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC0118h4.b(w3, null, false, null, 0L, 0L, 0L, 0L, 0L, c0285q2, intValue & 14, 510);
                }
                return C0880v.f8657a;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    t5.b(D1.w(R.string.m3c_time_picker_am, c0285q3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 0, 0, 131070);
                }
                return C0880v.f8657a;
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    t5.b(D1.w(R.string.m3c_time_picker_pm, c0285q4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 0, 0, 131070);
                }
                return C0880v.f8657a;
            case 4:
                InterfaceC1096J interfaceC1096J = (InterfaceC1096J) obj;
                long j3 = ((O0.a) obj3).f5132a;
                int l3 = interfaceC1096J.l(X2.f2154a);
                int i2 = l3 * 2;
                AbstractC1103Q a3 = ((InterfaceC1093G) obj2).a(B1.C.d0(0, i2, j3));
                return interfaceC1096J.C(a3.f9834h, a3.f9835i - i2, C0971w.f9166h, new U2(l3, 0, a3));
            default:
                m.k0 k0Var = (m.k0) obj;
                C0285q c0285q5 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q5.V(-1635067817);
                EnumC0095e2 enumC0095e2 = EnumC0095e2.f2517h;
                EnumC0095e2 enumC0095e22 = EnumC0095e2.f2518i;
                Object n3 = k0Var.a(enumC0095e2, enumC0095e22) ? AbstractC0831e.n(67, 0, AbstractC0852z.f8613c, 2) : (k0Var.a(enumC0095e22, enumC0095e2) || k0Var.a(EnumC0095e2.f2519j, enumC0095e22)) ? new m.w0(83, 67, AbstractC0852z.f8613c) : AbstractC0831e.m(0.0f, null, 7);
                c0285q5.r(false);
                return n3;
        }
    }
}
