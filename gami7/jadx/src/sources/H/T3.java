package H;

import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import m.AbstractC0837j;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import u0.C1282e0;
import u0.C1285g;
import u0.InterfaceC1283f;

/* loaded from: classes.dex */
public final class T3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2009l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W3 f2010m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1283f f2011n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3(W3 w3, InterfaceC1283f interfaceC1283f, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2010m = w3;
        this.f2011n = interfaceC1283f;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((T3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new T3(this.f2010m, this.f2011n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        long j3;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2009l;
        W3 w3 = this.f2010m;
        if (i2 == 0) {
            C1.y.J(obj);
            if (w3 != null) {
                X3 x3 = w3.f2118a;
                int i3 = x3.f2161d;
                boolean z3 = x3.f2159b != null;
                int d3 = AbstractC0837j.d(i3);
                long j4 = Long.MAX_VALUE;
                if (d3 == 0) {
                    j3 = 4000;
                } else if (d3 == 1) {
                    j3 = 10000;
                } else {
                    if (d3 != 2) {
                        throw new J2.r();
                    }
                    j3 = Long.MAX_VALUE;
                }
                InterfaceC1283f interfaceC1283f = this.f2011n;
                if (interfaceC1283f != null) {
                    C1285g c1285g = (C1285g) interfaceC1283f;
                    if (j3 < 2147483647L) {
                        int i4 = z3 ? 7 : 3;
                        int i5 = Build.VERSION.SDK_INT;
                        AccessibilityManager accessibilityManager = c1285g.f11050a;
                        if (i5 >= 29) {
                            int a3 = C1282e0.f11045a.a(accessibilityManager, (int) j3, i4);
                            if (a3 != Integer.MAX_VALUE) {
                                j4 = a3;
                            }
                        } else if (!z3 || !accessibilityManager.isTouchExplorationEnabled()) {
                            j4 = j3;
                        }
                        j3 = j4;
                    }
                }
                this.f2009l = 1;
                if (J2.B.f(j3, this) == enumC1145a) {
                    return enumC1145a;
                }
            }
            return C0880v.f8657a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1.y.J(obj);
        InterfaceC0310g interfaceC0310g = w3.f2119b;
        if (interfaceC0310g.b()) {
            interfaceC0310g.t(EnumC0125i4.f2740h);
        }
        return C0880v.f8657a;
    }
}
