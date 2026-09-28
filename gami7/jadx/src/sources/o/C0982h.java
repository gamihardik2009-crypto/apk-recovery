package o;

import B1.C;
import C0.C0024g;
import C0.J;
import D.X;
import I0.s;
import I0.z;
import J.C0285q;
import m2.C0880v;
import z.EnumC1407G;
import z.S;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982h extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9193i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f9194j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9195k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f9197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f9198n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0982h(Object obj, boolean z3, Object obj2, Object obj3, Object obj4, int i2) {
        super(3);
        this.f9193i = i2;
        this.f9195k = obj;
        this.f9194j = z3;
        this.f9196l = obj2;
        this.f9197m = obj3;
        this.f9198n = obj4;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        Object obj4 = this.f9198n;
        boolean z3 = true;
        Object obj5 = this.f9197m;
        Object obj6 = this.f9196l;
        Object obj7 = this.f9195k;
        switch (this.f9193i) {
            case 0:
                C0976b c0976b = (C0976b) obj;
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0285q.g(c0976b) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0285q.A()) {
                    c0285q.P();
                } else {
                    String str = (String) ((y2.e) obj7).j(c0285q, 0);
                    if (!(true ^ H2.l.V(str))) {
                        throw new IllegalStateException("Label must not be blank".toString());
                    }
                    AbstractC0990p.b(str, this.f9194j, c0976b, (V.o) obj6, (y2.f) obj5, (y2.a) obj4, c0285q, (intValue << 6) & 896, 0);
                }
                return C0880v.f8657a;
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                s sVar = (s) obj7;
                if (!booleanValue) {
                    intValue2 = sVar.i(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = sVar.i(intValue3);
                }
                if (this.f9194j) {
                    z zVar = (z) obj6;
                    long j3 = zVar.f3933b;
                    int i2 = J.f472c;
                    if (intValue2 != ((int) (j3 >> 32)) || intValue3 != ((int) (j3 & 4294967295L))) {
                        int min = Math.min(intValue2, intValue3);
                        EnumC1407G enumC1407G = EnumC1407G.f11511h;
                        X x2 = (X) obj5;
                        if (min >= 0) {
                            int max = Math.max(intValue2, intValue3);
                            C0024g c0024g = zVar.f3932a;
                            if (max <= c0024g.f500a.length()) {
                                if (booleanValue || intValue2 == intValue3) {
                                    x2.t(false);
                                    x2.r(enumC1407G);
                                } else {
                                    x2.h(true);
                                }
                                ((S) obj4).f11561t.l(new z(c0024g, C.j(intValue2, intValue3), (J) null));
                                return Boolean.valueOf(z3);
                            }
                        }
                        x2.t(false);
                        x2.r(enumC1407G);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
        }
    }
}
