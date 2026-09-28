package s0;

import V.n;
import java.util.HashSet;
import n1.C0944e;
import n2.AbstractC0946A;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.C1245c;
import t0.f0;
import u0.C1314v;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190d {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f10194a;

    /* renamed from: b, reason: collision with root package name */
    public final L.d f10195b = new L.d(new C1245c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final L.d f10196c = new L.d(new C1194h[16]);

    /* renamed from: d, reason: collision with root package name */
    public final L.d f10197d = new L.d(new C1236E[16]);

    /* renamed from: e, reason: collision with root package name */
    public final L.d f10198e = new L.d(new C1194h[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f10199f;

    public C1190d(f0 f0Var) {
        this.f10194a = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [V.n] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(n nVar, C1194h c1194h, HashSet hashSet) {
        n nVar2 = nVar.f5858h;
        if (!nVar2.f5869t) {
            AbstractC0946A.r("visitSubtreeIf called on an unattached node");
            throw null;
        }
        L.d dVar = new L.d(new n[16]);
        n nVar3 = nVar2.f5863m;
        if (nVar3 == null) {
            AbstractC1248f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        while (dVar.l()) {
            n nVar4 = (n) dVar.n(dVar.f4620j - 1);
            if ((nVar4.f5861k & 32) != 0) {
                for (n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f5863m) {
                    if ((nVar5.f5860j & 32) != 0) {
                        ?? r6 = 0;
                        AbstractC1256n abstractC1256n = nVar5;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof InterfaceC1191e) {
                                InterfaceC1191e interfaceC1191e = (InterfaceC1191e) abstractC1256n;
                                if (interfaceC1191e instanceof C1245c) {
                                    C1245c c1245c = (C1245c) interfaceC1191e;
                                    if ((c1245c.f10557u instanceof InterfaceC1189c) && c1245c.f10559w.contains(c1194h)) {
                                        hashSet.add(interfaceC1191e);
                                    }
                                }
                                if (!(!interfaceC1191e.m().g(c1194h))) {
                                    break;
                                }
                            } else if ((abstractC1256n.f5860j & 32) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                n nVar6 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r6 = r6;
                                while (nVar6 != null) {
                                    if ((nVar6.f5860j & 32) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new L.d(new n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r6.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r6.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = AbstractC1248f.f(r6);
                        }
                    }
                }
            }
            AbstractC1248f.b(dVar, nVar4);
        }
    }

    public final void a() {
        if (this.f10199f) {
            return;
        }
        this.f10199f = true;
        C0944e c0944e = new C0944e(6, this);
        L.d dVar = ((C1314v) this.f10194a).f11220w0;
        if (dVar.h(c0944e)) {
            return;
        }
        dVar.b(c0944e);
    }
}
