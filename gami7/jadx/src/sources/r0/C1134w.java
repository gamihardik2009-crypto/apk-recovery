package r0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n2.C0970v;
import t0.C1236E;
import t0.C1242K;

/* renamed from: r0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134w implements a0, InterfaceC1096J {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1136y f9895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1090D f9896i;

    public C1134w(C1090D c1090d) {
        this.f9896i = c1090d;
        this.f9895h = c1090d.f9815o;
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I C(int i2, int i3, Map map, y2.c cVar) {
        return this.f9895h.V(i2, i3, map, cVar);
    }

    @Override // r0.InterfaceC1126o
    public final boolean F() {
        return this.f9895h.F();
    }

    @Override // O0.b
    public final long G(long j3) {
        return this.f9895h.G(j3);
    }

    @Override // O0.b
    public final long J(float f3) {
        return this.f9895h.J(f3);
    }

    @Override // O0.b
    public final long M(long j3) {
        return this.f9895h.M(j3);
    }

    @Override // O0.b
    public final float P(float f3) {
        return this.f9895h.c() * f3;
    }

    @Override // O0.b
    public final float Q(long j3) {
        return this.f9895h.Q(j3);
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I V(int i2, int i3, Map map, y2.c cVar) {
        return this.f9895h.V(i2, i3, map, cVar);
    }

    @Override // O0.b
    public final float c() {
        return this.f9895h.f9905i;
    }

    @Override // r0.a0
    public final List f0(Object obj, y2.e eVar) {
        C1090D c1090d = this.f9896i;
        C1236E c1236e = (C1236E) c1090d.f9814n.get(obj);
        List m3 = c1236e != null ? c1236e.m() : null;
        if (m3 != null) {
            return m3;
        }
        L.d dVar = c1090d.f9819t;
        int i2 = dVar.f4620j;
        int i3 = c1090d.f9812l;
        if (i2 < i3) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        if (i2 == i3) {
            dVar.b(obj);
        } else {
            Object[] objArr = dVar.f4618h;
            Object obj2 = objArr[i3];
            objArr[i3] = obj;
        }
        c1090d.f9812l++;
        HashMap hashMap = c1090d.q;
        if (!hashMap.containsKey(obj)) {
            c1090d.f9818s.put(obj, c1090d.g(obj, eVar));
            C1236E c1236e2 = c1090d.f9808h;
            if (c1236e2.f10379D.f10466c == 3) {
                c1236e2.Q(true);
            } else {
                C1236E.S(c1236e2, true, 6);
            }
        }
        C1236E c1236e3 = (C1236E) hashMap.get(obj);
        if (c1236e3 == null) {
            return C0970v.f9165h;
        }
        List s02 = c1236e3.f10379D.f10480r.s0();
        L.a aVar = (L.a) s02;
        int i4 = aVar.f4612h.f4620j;
        for (int i5 = 0; i5 < i4; i5++) {
            ((C1242K) aVar.get(i5)).f10450O.f10465b = true;
        }
        return s02;
    }

    @Override // O0.b
    public final long g0(float f3) {
        return this.f9895h.g0(f3);
    }

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f9895h.f9904h;
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f9895h.l(f3);
    }

    @Override // O0.b
    public final int m0(long j3) {
        return this.f9895h.m0(j3);
    }

    @Override // O0.b
    public final float o0(int i2) {
        return this.f9895h.o0(i2);
    }

    @Override // O0.b
    public final float p0(long j3) {
        return this.f9895h.p0(j3);
    }

    @Override // O0.b
    public final float r0(float f3) {
        return f3 / this.f9895h.c();
    }

    @Override // O0.b
    public final float s() {
        return this.f9895h.f9906j;
    }
}
