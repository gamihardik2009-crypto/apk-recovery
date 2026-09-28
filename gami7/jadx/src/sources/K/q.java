package K;

import D.C0046o;
import J.B0;
import J.C0255b;
import J.C0291t0;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends G {

    /* renamed from: e, reason: collision with root package name */
    public static final q f4486e;

    /* renamed from: g, reason: collision with root package name */
    public static final q f4488g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4489c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f4485d = new q(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final q f4487f = new q(1, 2, 2);

    static {
        int i2 = 1;
        f4486e = new q(i2, i2, 1);
        int i3 = 1;
        f4488g = new q(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i2, int i3, int i4) {
        super(i2, i3);
        this.f4489c = i4;
    }

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        int i2;
        int i3;
        switch (this.f4489c) {
            case 0:
                Object c3 = ((y2.a) c0046o.d(0)).c();
                C0255b c0255b = (C0255b) c0046o.d(1);
                int c4 = c0046o.c(0);
                z2.h.d(interfaceC0259d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c0255b.getClass();
                g02.P(g02.c(c0255b), c3);
                interfaceC0259d.d(c4, c3);
                interfaceC0259d.b(c3);
                break;
            case 1:
                C0255b c0255b2 = (C0255b) c0046o.d(0);
                int c5 = c0046o.c(0);
                interfaceC0259d.c();
                c0255b2.getClass();
                interfaceC0259d.a(c5, g02.y(g02.c(c0255b2)));
                break;
            case 2:
                Object d3 = c0046o.d(0);
                C0255b c0255b3 = (C0255b) c0046o.d(1);
                int c6 = c0046o.c(0);
                if (d3 instanceof B0) {
                    ((ArrayList) c0292u.f4241c).add(((B0) d3).f3969a);
                }
                int c7 = g02.c(c0255b3);
                int g3 = g02.g(g02.H(c7, c6));
                Object[] objArr = g02.f4017c;
                Object obj = objArr[g3];
                objArr[g3] = d3;
                if (!(obj instanceof B0)) {
                    if (obj instanceof C0291t0) {
                        ((C0291t0) obj).d();
                        break;
                    }
                } else {
                    int o3 = g02.o() - g02.H(c7, c6);
                    B0 b02 = (B0) obj;
                    C0255b c0255b4 = b02.f3970b;
                    if (c0255b4 == null || !c0255b4.a()) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        i2 = g02.c(c0255b4);
                        i3 = g02.o() - g02.f(g02.f4016b, g02.p(g02.q(i2) + i2));
                    }
                    c0292u.h(b02.f3969a, o3, i2, i3);
                    break;
                }
                break;
            default:
                Object d4 = c0046o.d(0);
                int c8 = c0046o.c(0);
                if (d4 instanceof B0) {
                    ((ArrayList) c0292u.f4241c).add(((B0) d4).f3969a);
                }
                int g4 = g02.g(g02.H(g02.f4032s, c8));
                Object[] objArr2 = g02.f4017c;
                Object obj2 = objArr2[g4];
                objArr2[g4] = d4;
                if (!(obj2 instanceof B0)) {
                    if (obj2 instanceof C0291t0) {
                        ((C0291t0) obj2).d();
                        break;
                    }
                } else {
                    c0292u.h(((B0) obj2).f3969a, g02.o() - g02.H(g02.f4032s, c8), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // K.G
    public final String b(int i2) {
        switch (this.f4489c) {
            case 0:
                if (!K1.f.s(i2, 0)) {
                    break;
                }
                break;
            case 1:
                if (!K1.f.s(i2, 0)) {
                    break;
                }
                break;
            case 2:
                if (!K1.f.s(i2, 0)) {
                    break;
                }
                break;
            default:
                if (!K1.f.s(i2, 0)) {
                    break;
                }
                break;
        }
        return super.b(i2);
    }

    @Override // K.G
    public final String c(int i2) {
        switch (this.f4489c) {
            case 0:
                if (!AbstractC0423a.F(i2, 0)) {
                    if (!AbstractC0423a.F(i2, 1)) {
                        break;
                    }
                }
                break;
            case 1:
                if (!AbstractC0423a.F(i2, 0)) {
                    break;
                }
                break;
            case 2:
                if (!AbstractC0423a.F(i2, 0)) {
                    if (!AbstractC0423a.F(i2, 1)) {
                        break;
                    }
                }
                break;
            default:
                if (!AbstractC0423a.F(i2, 0)) {
                    break;
                }
                break;
        }
        return super.c(i2);
    }
}
