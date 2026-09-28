package r0;

import J.C0292u;
import g2.C0690a;
import n2.AbstractC0946A;
import t0.AbstractC1239H;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.o0;
import t0.p0;
import u0.C1314v;

/* renamed from: r0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089C implements InterfaceC1109X {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1090D f9806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9807b;

    public C1089C(C1090D c1090d, Object obj) {
        this.f9806a = c1090d;
        this.f9807b = obj;
    }

    @Override // r0.InterfaceC1109X
    public final void a() {
        C1090D c1090d = this.f9806a;
        c1090d.e();
        C1236E c1236e = (C1236E) c1090d.q.remove(this.f9807b);
        if (c1236e != null) {
            if (c1090d.f9821v <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose".toString());
            }
            C1236E c1236e2 = c1090d.f9808h;
            int indexOf = c1236e2.p().indexOf(c1236e);
            int size = c1236e2.p().size();
            int i2 = c1090d.f9821v;
            if (indexOf < size - i2) {
                throw new IllegalStateException("Item is not in pre-composed item range".toString());
            }
            c1090d.f9820u++;
            c1090d.f9821v = i2 - 1;
            int size2 = (c1236e2.p().size() - c1090d.f9821v) - c1090d.f9820u;
            c1236e2.f10396r = true;
            c1236e2.H(indexOf, size2, 1);
            c1236e2.f10396r = false;
            c1090d.d(size2);
        }
    }

    @Override // r0.InterfaceC1109X
    public final int b() {
        C1236E c1236e = (C1236E) this.f9806a.q.get(this.f9807b);
        if (c1236e != null) {
            return c1236e.n().size();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [g2.a] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [V.n] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // r0.InterfaceC1109X
    public final void c(C0690a c0690a) {
        C0292u c0292u;
        V.n nVar;
        o0 o0Var;
        C1236E c1236e = (C1236E) this.f9806a.q.get(this.f9807b);
        if (c1236e == null || (c0292u = c1236e.f10378C) == null || (nVar = (V.n) c0292u.f4244f) == null) {
            return;
        }
        V.n nVar2 = nVar.f5858h;
        if (!nVar2.f5869t) {
            AbstractC0946A.r("visitSubtreeIf called on an unattached node");
            throw null;
        }
        L.d dVar = new L.d(new V.n[16]);
        V.n nVar3 = nVar2.f5863m;
        if (nVar3 == null) {
            AbstractC1248f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        while (dVar.l()) {
            V.n nVar4 = (V.n) dVar.n(dVar.f4620j - 1);
            if ((nVar4.f5861k & 262144) != 0) {
                for (V.n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f5863m) {
                    if ((nVar5.f5860j & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC1256n abstractC1256n = nVar5;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof p0) {
                                p0 p0Var = (p0) abstractC1256n;
                                boolean a3 = z2.h.a("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", p0Var.w());
                                o0 o0Var2 = o0.f10611i;
                                if (a3) {
                                    c0690a.l(p0Var);
                                    o0Var = o0Var2;
                                } else {
                                    o0Var = o0.f10610h;
                                }
                                if (o0Var == o0.f10612j) {
                                    return;
                                }
                                if (o0Var == o0Var2) {
                                    break;
                                }
                            } else if ((abstractC1256n.f5860j & 262144) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar6 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r8 = r8;
                                while (nVar6 != null) {
                                    if ((nVar6.f5860j & 262144) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r8.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r8.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = AbstractC1248f.f(r8);
                        }
                    }
                }
            }
            AbstractC1248f.b(dVar, nVar4);
        }
    }

    @Override // r0.InterfaceC1109X
    public final void d(long j3, int i2) {
        C1090D c1090d = this.f9806a;
        C1236E c1236e = (C1236E) c1090d.q.get(this.f9807b);
        if (c1236e == null || !c1236e.D()) {
            return;
        }
        int size = c1236e.n().size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + size + ')');
        }
        if (!(!c1236e.E())) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
        }
        C1236E c1236e2 = c1090d.f9808h;
        c1236e2.f10396r = true;
        ((C1314v) AbstractC1239H.a(c1236e)).u((C1236E) c1236e.n().get(i2), j3);
        c1236e2.f10396r = false;
    }
}
