package N2;

import J2.H;
import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import java.util.ArrayList;
import m2.C0880v;
import n2.AbstractC0961m;
import q2.C1074e;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* renamed from: N2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0368g implements w {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1078i f5043h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5044i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5045j;

    public AbstractC0368g(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        this.f5043h = interfaceC1078i;
        this.f5044i = i2;
        this.f5045j = i3;
    }

    @Override // M2.InterfaceC0343g
    public Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        Object e3 = J2.B.e(new C0366e(interfaceC0344h, this, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    @Override // N2.w
    public final InterfaceC0343g c(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        InterfaceC1078i interfaceC1078i2 = this.f5043h;
        InterfaceC1078i A3 = interfaceC1078i.A(interfaceC1078i2);
        int i4 = this.f5045j;
        int i5 = this.f5044i;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            i3 = i4;
        }
        return (z2.h.a(A3, interfaceC1078i2) && i2 == i5 && i3 == i4) ? this : g(A3, i2, i3);
    }

    public String e() {
        return null;
    }

    public abstract Object f(L2.u uVar, InterfaceC1073d interfaceC1073d);

    public abstract AbstractC0368g g(InterfaceC1078i interfaceC1078i, int i2, int i3);

    public InterfaceC0343g h() {
        return null;
    }

    public L2.w i(InterfaceC0328z interfaceC0328z) {
        int i2 = this.f5044i;
        if (i2 == -3) {
            i2 = -2;
        }
        y2.e c0367f = new C0367f(this, null);
        L2.g c3 = B2.a.c(i2, this.f5045j, 4);
        InterfaceC1078i h2 = J2.B.h(interfaceC0328z.r(), this.f5043h, true);
        Q2.d dVar = H.f4356a;
        if (h2 != dVar && h2.s(C1074e.f9782h) == null) {
            h2 = h2.A(dVar);
        }
        L2.t tVar = new L2.t(h2, c3);
        tVar.m0(3, tVar, c0367f);
        return tVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e3 = e();
        if (e3 != null) {
            arrayList.add(e3);
        }
        C1079j c1079j = C1079j.f9784h;
        InterfaceC1078i interfaceC1078i = this.f5043h;
        if (interfaceC1078i != c1079j) {
            arrayList.add("context=" + interfaceC1078i);
        }
        int i2 = this.f5044i;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f5045j;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(B1.t.F(i3)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return B1.t.k(sb, AbstractC0961m.L(arrayList, ", ", null, null, null, 62), ']');
    }
}
