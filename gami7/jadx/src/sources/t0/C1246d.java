package t0;

import J.C0292u;
import c0.C0573M;
import s0.C1194h;
import s0.InterfaceC1193g;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246d implements InterfaceC1193g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10561h;

    public /* synthetic */ C1246d(int i2) {
        this.f10561h = i2;
    }

    public void a(C1236E c1236e, long j3, r rVar, boolean z3, boolean z4) {
        switch (this.f10561h) {
            case 1:
                c1236e.w(j3, rVar, z3, z4);
                break;
            default:
                C0292u c0292u = c1236e.f10378C;
                Z z5 = (Z) c0292u.f4242d;
                C0573M c0573m = Z.f10530N;
                ((Z) c0292u.f4242d).X0(Z.f10534R, z5.Q0(j3, true), rVar, true, z4);
                break;
        }
    }

    public int b() {
        switch (this.f10561h) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [V.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [V.n] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public boolean c(V.n nVar) {
        switch (this.f10561h) {
            case 1:
                ?? r12 = 0;
                while (true) {
                    int i2 = 0;
                    if (nVar == 0) {
                        return false;
                    }
                    if (nVar instanceof k0) {
                        if (((k0) nVar).l0()) {
                            return true;
                        }
                    } else if ((nVar.f5860j & 16) != 0 && (nVar instanceof AbstractC1256n)) {
                        V.n nVar2 = nVar.f10608v;
                        r12 = r12;
                        nVar = nVar;
                        while (nVar2 != null) {
                            if ((nVar2.f5860j & 16) != 0) {
                                i2++;
                                r12 = r12;
                                if (i2 == 1) {
                                    nVar = nVar2;
                                } else {
                                    if (r12 == 0) {
                                        r12 = new L.d(new V.n[16]);
                                    }
                                    if (nVar != 0) {
                                        r12.b(nVar);
                                        nVar = 0;
                                    }
                                    r12.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f5863m;
                            r12 = r12;
                            nVar = nVar;
                        }
                        if (i2 == 1) {
                        }
                    }
                    nVar = AbstractC1248f.f(r12);
                }
                break;
            default:
                return false;
        }
    }

    public boolean d(C1236E c1236e) {
        switch (this.f10561h) {
            case 1:
                return true;
            default:
                A0.k o3 = c1236e.o();
                boolean z3 = false;
                if (o3 != null && o3.f62j) {
                    z3 = true;
                }
                return !z3;
        }
    }

    @Override // s0.InterfaceC1193g
    public Object i(C1194h c1194h) {
        return c1194h.f10200a.c();
    }
}
