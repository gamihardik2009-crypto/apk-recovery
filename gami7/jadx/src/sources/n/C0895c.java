package n;

import J.C0292u;
import J2.InterfaceC0328z;
import android.view.ViewGroup;
import android.view.ViewParent;
import m2.C0880v;
import p.C1005a;
import p.C1014e0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895c extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public r.n f8748l;

    /* renamed from: m, reason: collision with root package name */
    public int f8749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0914w f8750n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f8751o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r.l f8752p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0895c(C0914w c0914w, long j3, r.l lVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8750n = c0914w;
        this.f8751o = j3;
        this.f8752p = lVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0895c) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0895c(this.f8750n, this.f8751o, this.f8752p, interfaceC1073d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [V.n] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C0292u c0292u;
        r.n nVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8749m;
        C0914w c0914w = this.f8750n;
        if (i2 == 0) {
            C1.y.J(obj);
            C1005a c1005a = C1014e0.f9586v;
            V.n nVar2 = c0914w.f5858h;
            if (!nVar2.f5869t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            V.n nVar3 = nVar2.f5862l;
            C1236E v3 = AbstractC1248f.v(c0914w);
            boolean z3 = false;
            loop0: while (v3 != null) {
                if ((((V.n) v3.f10378C.f4244f).f5861k & 262144) != 0) {
                    while (nVar3 != null) {
                        if ((nVar3.f5860j & 262144) != 0) {
                            AbstractC1256n abstractC1256n = nVar3;
                            ?? r13 = 0;
                            while (abstractC1256n != 0) {
                                if (abstractC1256n instanceof t0.p0) {
                                    t0.p0 p0Var = (t0.p0) abstractC1256n;
                                    if (z2.h.a(c1005a, p0Var.w())) {
                                        z3 = z3 || ((C1014e0) p0Var).f9587u;
                                        if (!(!z3)) {
                                            break loop0;
                                        }
                                    }
                                } else if ((abstractC1256n.f5860j & 262144) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                    V.n nVar4 = abstractC1256n.f10608v;
                                    int i3 = 0;
                                    abstractC1256n = abstractC1256n;
                                    r13 = r13;
                                    while (nVar4 != null) {
                                        if ((nVar4.f5860j & 262144) != 0) {
                                            i3++;
                                            r13 = r13;
                                            if (i3 == 1) {
                                                abstractC1256n = nVar4;
                                            } else {
                                                if (r13 == 0) {
                                                    r13 = new L.d(new V.n[16]);
                                                }
                                                if (abstractC1256n != 0) {
                                                    r13.b(abstractC1256n);
                                                    abstractC1256n = 0;
                                                }
                                                r13.b(nVar4);
                                            }
                                        }
                                        nVar4 = nVar4.f5863m;
                                        abstractC1256n = abstractC1256n;
                                        r13 = r13;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC1256n = AbstractC1248f.f(r13);
                            }
                        }
                        nVar3 = nVar3.f5862l;
                    }
                }
                v3 = v3.s();
                nVar3 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (t0.n0) c0292u.f4243e;
            }
            if (!z3) {
                int i4 = AbstractC0915x.f8892b;
                ViewParent parent = AbstractC1248f.x(c0914w).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
            }
            long j3 = AbstractC0915x.f8891a;
            this.f8749m = 1;
            if (J2.B.f(j3, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = this.f8748l;
                C1.y.J(obj);
                c0914w.f8871G = nVar;
                return C0880v.f8657a;
            }
            C1.y.J(obj);
        }
        nVar = new r.n(this.f8751o);
        this.f8748l = nVar;
        this.f8749m = 2;
        if (this.f8752p.b(nVar, this) == enumC1145a) {
            return enumC1145a;
        }
        c0914w.f8871G = nVar;
        return C0880v.f8657a;
    }
}
