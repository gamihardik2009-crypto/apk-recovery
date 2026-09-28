package s0;

import J.C0292u;
import V.n;
import n1.E;
import n2.AbstractC0946A;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.InterfaceC1255m;
import t0.n0;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1191e extends InterfaceC1193g, InterfaceC1255m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [V.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [s0.e, t0.m] */
    @Override // s0.InterfaceC1193g
    default Object i(C1194h c1194h) {
        C0292u c0292u;
        n nVar = ((n) this).f5858h;
        boolean z3 = nVar.f5869t;
        if (!z3) {
            AbstractC0946A.q("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z3) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        n nVar2 = nVar.f5862l;
        C1236E v3 = AbstractC1248f.v(this);
        while (v3 != null) {
            if ((((n) v3.f10378C.f4244f).f5861k & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5860j & 32) != 0) {
                        AbstractC1256n abstractC1256n = nVar2;
                        ?? r4 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof InterfaceC1191e) {
                                InterfaceC1191e interfaceC1191e = (InterfaceC1191e) abstractC1256n;
                                if (interfaceC1191e.m().g(c1194h)) {
                                    return interfaceC1191e.m().j(c1194h);
                                }
                            } else if ((abstractC1256n.f5860j & 32) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                n nVar3 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r4 = r4;
                                while (nVar3 != null) {
                                    if ((nVar3.f5860j & 32) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new L.d(new n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r4.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r4.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = AbstractC1248f.f(r4);
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        return c1194h.f10200a.c();
    }

    default E m() {
        return C1188b.f10193a;
    }
}
