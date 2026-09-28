package R2;

import J2.AbstractC0309f;
import J2.InterfaceC0310g;
import J2.w0;
import O2.t;
import O2.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;
import n2.AbstractC0961m;
import n2.AbstractC0962n;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class e extends AbstractC0309f implements f, w0 {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5523m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state");

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1078i f5524h;

    /* renamed from: j, reason: collision with root package name */
    public Object f5526j;
    private volatile Object state = h.f5530a;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f5525i = new ArrayList(2);

    /* renamed from: k, reason: collision with root package name */
    public int f5527k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Object f5528l = h.f5533d;

    public e(InterfaceC1078i interfaceC1078i) {
        this.f5524h = interfaceC1078i;
    }

    @Override // J2.w0
    public final void a(t tVar, int i2) {
        this.f5526j = tVar;
        this.f5527k = i2;
    }

    @Override // J2.AbstractC0309f
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5523m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f5531b) {
                return;
            }
            v vVar = h.f5532c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f5525i;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            this.f5528l = h.f5533d;
            this.f5525i = null;
            return;
        }
    }

    public final Object d(InterfaceC1073d interfaceC1073d) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5523m;
        Object obj = atomicReferenceFieldUpdater.get(this);
        z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar = (c) obj;
        Object obj2 = this.f5528l;
        ArrayList arrayList = this.f5525i;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (cVar2 != cVar) {
                    cVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f5531b);
            this.f5528l = h.f5533d;
            this.f5525i = null;
        }
        return cVar.b(cVar.f5512c.i(cVar.f5510a, cVar.f5513d, obj2), interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cb A[PHI: r11
      0x00cb: PHI (r11v6 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:17:0x00c8, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(q2.InterfaceC1073d r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.e.f(q2.d):java.lang.Object");
    }

    public final c k(Object obj) {
        ArrayList arrayList = this.f5525i;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((c) next).f5510a == obj) {
                obj2 = next;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    @Override // y2.c
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        b((Throwable) obj);
        return C0880v.f8657a;
    }

    public final void m(c cVar, boolean z3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5523m;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        Object obj = cVar.f5510a;
        if (!z3) {
            ArrayList arrayList = this.f5525i;
            z2.h.c(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f5510a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f5511b.i(obj, this, cVar.f5513d);
        if (this.f5528l != h.f5533d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z3) {
            ArrayList arrayList2 = this.f5525i;
            z2.h.c(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.f5516g = this.f5526j;
        cVar.f5517h = this.f5527k;
        this.f5526j = null;
        this.f5527k = -1;
    }

    public final int n(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5523m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC0310g)) {
                if (z2.h.a(obj3, h.f5531b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (z2.h.a(obj3, h.f5532c)) {
                    return 2;
                }
                if (z2.h.a(obj3, h.f5530a)) {
                    List l3 = AbstractC0962n.l(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, l3)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList Q3 = AbstractC0961m.Q((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, Q3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c k3 = k(obj);
            if (k3 != null) {
                y2.f fVar = k3.f5515f;
                y2.c cVar = fVar != null ? (y2.c) fVar.i(this, k3.f5513d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, k3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC0310g interfaceC0310g = (InterfaceC0310g) obj3;
                this.f5528l = obj2;
                v z3 = interfaceC0310g.z(C0880v.f8657a, cVar);
                if (z3 == null) {
                    this.f5528l = null;
                    return 2;
                }
                interfaceC0310g.E(z3);
                return 0;
            }
            continue;
        }
    }
}
