package O2;

import B1.C;
import J2.AbstractC0324v;
import J2.C0319p;
import J2.C0320q;
import J2.C0325w;
import J2.InterfaceC0326x;
import J2.Q;
import J2.Z;
import J2.r0;
import J2.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC0868j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* renamed from: O2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0369a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f5165a = new v("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f5166b = new v("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f5167c = new v("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final v f5168d = new v("REUSABLE_CLAIMED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final v f5169e = new v("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final v f5170f = new v("NO_THREAD_ELEMENTS", 0);

    public static final J2.r a(y2.c cVar, Object obj, J2.r rVar) {
        try {
            cVar.l(obj);
        } catch (Throwable th) {
            if (rVar == null || rVar.getCause() == th) {
                return new J2.r("Exception in undelivered element handler for " + obj, th);
            }
            C.p(rVar, th);
        }
        return rVar;
    }

    public static final Object b(t tVar, long j3, y2.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f5206j >= j3 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f5173h.get(tVar);
            v vVar = f5166b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) eVar.j(Long.valueOf(tVar.f5206j + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f5173h;
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t c(Object obj) {
        if (obj != f5166b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void d(Throwable th, InterfaceC1078i interfaceC1078i) {
        Throwable runtimeException;
        Iterator it = f.f5176a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0326x) it.next()).f(th, interfaceC1078i);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C.p(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C.p(th, new g(interfaceC1078i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f5166b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(InterfaceC1078i interfaceC1078i, Object obj) {
        if (obj == f5170f) {
            return;
        }
        if (!(obj instanceof B)) {
            Object y3 = interfaceC1078i.y(null, x.f5212k);
            z2.h.d(y3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((y) y3).c(obj);
            return;
        }
        B b3 = (B) obj;
        y[] yVarArr = b3.f5163c;
        int length = yVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            y yVar = yVarArr[length];
            z2.h.c(yVar);
            yVar.c(b3.f5162b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final void h(InterfaceC1073d interfaceC1073d, Object obj, y2.c cVar) {
        if (!(interfaceC1073d instanceof h)) {
            interfaceC1073d.t(obj);
            return;
        }
        h hVar = (h) interfaceC1073d;
        Throwable a3 = AbstractC0868j.a(obj);
        Object c0320q = a3 == null ? cVar != null ? new C0320q(obj, cVar) : obj : new C0319p(a3, false);
        InterfaceC1073d interfaceC1073d2 = hVar.f5180l;
        interfaceC1073d2.n();
        AbstractC0324v abstractC0324v = hVar.f5179k;
        if (abstractC0324v.w()) {
            hVar.f5181m = c0320q;
            hVar.f4355j = 1;
            abstractC0324v.r(interfaceC1073d2.n(), hVar);
            return;
        }
        Q a4 = r0.a();
        if (a4.E()) {
            hVar.f5181m = c0320q;
            hVar.f4355j = 1;
            a4.z(hVar);
            return;
        }
        a4.D(true);
        try {
            Z z3 = (Z) interfaceC1073d2.n().s(C0325w.f4437i);
            if (z3 == null || z3.b()) {
                Object obj2 = hVar.f5182n;
                InterfaceC1078i n3 = interfaceC1073d2.n();
                Object l3 = l(n3, obj2);
                u0 y3 = l3 != f5170f ? J2.B.y(interfaceC1073d2, n3, l3) : null;
                try {
                    interfaceC1073d2.t(obj);
                } finally {
                    if (y3 == null || y3.n0()) {
                        g(n3, l3);
                    }
                }
            } else {
                CancellationException i2 = z3.i();
                hVar.c(c0320q, i2);
                hVar.t(C1.y.n(i2));
            }
            while (a4.G()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.AbstractC0369a.i(java.lang.String, long, long, long):long");
    }

    public static int j(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) i(str, i2, i3, i4);
    }

    public static final Object k(InterfaceC1078i interfaceC1078i) {
        Object y3 = interfaceC1078i.y(0, x.f5211j);
        z2.h.c(y3);
        return y3;
    }

    public static final Object l(InterfaceC1078i interfaceC1078i, Object obj) {
        if (obj == null) {
            obj = k(interfaceC1078i);
        }
        return obj == 0 ? f5170f : obj instanceof Integer ? interfaceC1078i.y(new B(((Number) obj).intValue(), interfaceC1078i), x.f5213l) : ((y) obj).e(interfaceC1078i);
    }
}
