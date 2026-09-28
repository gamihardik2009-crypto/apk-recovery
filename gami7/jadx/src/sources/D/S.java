package D;

import J2.InterfaceC0328z;
import J2.p0;
import a0.AbstractC0427d;
import a0.C0442s;
import a0.EnumC0441r;
import android.os.Bundle;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import c.C0557g;
import i.C0703d;
import i.C0705f;
import j.AbstractC0739E;
import j.C0769y;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0946A;
import t0.C1236E;
import t0.C1251i;
import t0.q0;
import u1.C1325b;
import u1.InterfaceC1327d;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f762b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f763c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f764d;

    public S(u1.f fVar) {
        this.f761a = 4;
        this.f763c = fVar;
        this.f764d = new u1.e();
    }

    public static final void a(S s3) {
        ((C0769y) s3.f763c).a();
        int i2 = 0;
        s3.f762b = false;
        L.d dVar = (L.d) s3.f764d;
        int i3 = dVar.f4620j;
        if (i3 > 0) {
            Object[] objArr = dVar.f4618h;
            do {
                ((y2.a) objArr[i2]).c();
                i2++;
            } while (i2 < i3);
        }
        dVar.g();
    }

    public static final void b(S s3) {
        C0769y c0769y = (C0769y) s3.f763c;
        Object[] objArr = c0769y.f8066b;
        long[] jArr = c0769y.f8065a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            C0442s c0442s = (C0442s) objArr[(i2 << 3) + i4];
                            c0442s.getClass();
                            EnumC0441r enumC0441r = (EnumC0441r) ((C0769y) AbstractC0427d.F(c0442s).f763c).e(c0442s);
                            if (enumC0441r == null) {
                                AbstractC0946A.s("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            c0442s.f6494w = enumC0441r;
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        c0769y.a();
        s3.f762b = false;
        ((L.d) s3.f764d).g();
    }

    public void c(C1236E c1236e) {
        if (!c1236e.D()) {
            AbstractC0946A.r("DepthSortedSet.add called on an unattached node");
            throw null;
        }
        if (this.f762b) {
            InterfaceC0862d interfaceC0862d = (InterfaceC0862d) this.f763c;
            Integer num = (Integer) ((Map) interfaceC0862d.getValue()).get(c1236e);
            if (num == null) {
                ((Map) interfaceC0862d.getValue()).put(c1236e, Integer.valueOf(c1236e.q));
            } else {
                if (num.intValue() != c1236e.q) {
                    AbstractC0946A.r("invalid node depth");
                    throw null;
                }
            }
        }
        ((q0) this.f764d).add(c1236e);
    }

    public void d() {
        ((L2.g) this.f763c).a(new CancellationException("onBack cancelled"));
        ((p0) this.f764d).a(null);
    }

    public boolean e(C1236E c1236e) {
        boolean contains = ((q0) this.f764d).contains(c1236e);
        if (!this.f762b || contains == ((Map) ((InterfaceC0862d) this.f763c).getValue()).containsKey(c1236e)) {
            return contains;
        }
        AbstractC0946A.r("inconsistency in TreeSet");
        throw null;
    }

    public int f() {
        C0046o c0046o = (C0046o) this.f764d;
        int i2 = c0046o.f872b;
        int i3 = c0046o.f873c;
        if (i2 < i3) {
            return 2;
        }
        return i2 > i3 ? 1 : 3;
    }

    public void g() {
        u1.f fVar = (u1.f) this.f763c;
        C0472v e3 = fVar.e();
        if (e3.f6909c != EnumC0466o.f6899i) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        e3.a(new C1325b(fVar));
        u1.e eVar = (u1.e) this.f764d;
        eVar.getClass();
        if (!(!eVar.f11262b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        e3.a(new n1.h(1, eVar));
        eVar.f11262b = true;
        this.f762b = true;
    }

    public void h(Bundle bundle) {
        if (!this.f762b) {
            g();
        }
        C0472v e3 = ((u1.f) this.f763c).e();
        if (!(!(e3.f6909c.compareTo(EnumC0466o.f6901k) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e3.f6909c).toString());
        }
        u1.e eVar = (u1.e) this.f764d;
        if (!eVar.f11262b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!eVar.f11264d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        eVar.f11263c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f11264d = true;
    }

    public void i(Bundle bundle) {
        z2.h.f(bundle, "outBundle");
        u1.e eVar = (u1.e) this.f764d;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f11263c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0705f c0705f = eVar.f11261a;
        c0705f.getClass();
        C0703d c0703d = new C0703d(c0705f);
        c0705f.f7801j.put(c0703d, Boolean.FALSE);
        while (c0703d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0703d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1327d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public boolean j(C1236E c1236e) {
        if (!c1236e.D()) {
            AbstractC0946A.r("DepthSortedSet.remove called on an unattached node");
            throw null;
        }
        boolean remove = ((q0) this.f764d).remove(c1236e);
        if (this.f762b) {
            if (!z2.h.a((Integer) ((Map) ((InterfaceC0862d) this.f763c).getValue()).remove(c1236e), remove ? Integer.valueOf(c1236e.q) : null)) {
                AbstractC0946A.r("invalid node depth");
                throw null;
            }
        }
        return remove;
    }

    public String toString() {
        switch (this.f761a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.f762b + ", crossed=" + B1.t.D(f()) + ", info=\n\t" + ((C0046o) this.f764d) + ')';
            case 3:
                return ((q0) this.f764d).toString();
            default:
                return super.toString();
        }
    }

    public S(int i2) {
        this.f761a = i2;
        switch (i2) {
            case 3:
                this.f762b = false;
                this.f763c = B2.a.x(EnumC0863e.f8644i, C1251i.f10594k);
                this.f764d = new q0(new t0.d0(1));
                break;
            default:
                long[] jArr = AbstractC0739E.f7971a;
                this.f763c = new C0769y();
                this.f764d = new L.d(new y2.a[16]);
                break;
        }
    }

    public S(InterfaceC0328z interfaceC0328z, boolean z3, y2.e eVar) {
        this.f761a = 2;
        this.f762b = z3;
        this.f763c = B2.a.c(-2, 1, 4);
        this.f764d = J2.B.r(interfaceC0328z, null, 0, new C0557g(eVar, this, null), 3);
    }

    public S(boolean z3, C0048q c0048q, C0046o c0046o) {
        this.f761a = 0;
        this.f762b = z3;
        this.f763c = c0048q;
        this.f764d = c0046o;
    }
}
