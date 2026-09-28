package N2;

import M2.InterfaceC0343g;
import O2.AbstractC0369a;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* renamed from: N2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0364c {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1073d[] f5032a = new InterfaceC1073d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final O2.v f5033b = new O2.v("NULL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final O2.v f5034c = new O2.v("UNINITIALIZED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final O2.v f5035d = new O2.v("DONE", 0);

    public static /* synthetic */ InterfaceC0343g a(w wVar, Q2.d dVar, int i2, int i3, int i4) {
        InterfaceC1078i interfaceC1078i = dVar;
        if ((i4 & 1) != 0) {
            interfaceC1078i = C1079j.f9784h;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return wVar.c(interfaceC1078i, i2, i3);
    }

    public static final Object b(InterfaceC1078i interfaceC1078i, Object obj, Object obj2, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        Object l3 = AbstractC0369a.l(interfaceC1078i, obj2);
        try {
            E e3 = new E(interfaceC1073d, interfaceC1078i);
            z2.v.d(2, eVar);
            Object j3 = eVar.j(obj, e3);
            AbstractC0369a.g(interfaceC1078i, l3);
            if (j3 == EnumC1145a.f10026h) {
                z2.h.f(interfaceC1073d, "frame");
            }
            return j3;
        } catch (Throwable th) {
            AbstractC0369a.g(interfaceC1078i, l3);
            throw th;
        }
    }
}
