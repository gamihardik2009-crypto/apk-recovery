package L2;

import B.F;
import B1.C;
import C0.C0024g;
import C0.G;
import C0.H;
import C0.J;
import I0.z;
import J.InterfaceC0258c0;
import J.W0;
import J2.B;
import J2.Z;
import O2.AbstractC0369a;
import R0.C0371a;
import a.AbstractC0423a;
import a0.C0442s;
import android.view.DragEvent;
import androidx.lifecycle.InterfaceC0470t;
import b.C0499w;
import c.C0560j;
import c0.AbstractC0598q;
import c0.C0573M;
import c0.C0575O;
import c0.C0580U;
import c0.C0589h;
import c0.C0603v;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import e0.InterfaceC0654d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import l.C0790E;
import l.C0791F;
import l.C0805n;
import l.EnumC0812v;
import l.L;
import m2.C0880v;
import n1.C0945f;
import p.C0;
import p.C1027l;
import p.C1055z0;
import q2.InterfaceC1078i;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import s.AbstractC1166e;
import s.C1156I;
import s.C1157J;
import s.C1158K;
import s.C1161N;
import s.InterfaceC1159L;
import t.C1220o;
import t0.AbstractC1248f;
import t0.o0;
import t0.p0;
import u0.C1314v;
import u0.ViewOnDragListenerC1307r0;
import z.S;

/* loaded from: classes.dex */
public final class d extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4695j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4696k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4697l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i2) {
        super(1);
        this.f4694i = i2;
        this.f4695j = obj;
        this.f4696k = obj2;
        this.f4697l = obj3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        boolean booleanValue;
        switch (this.f4694i) {
            case 0:
                O2.v vVar = i.f4727l;
                Object obj2 = this.f4695j;
                if (obj2 != vVar) {
                    y2.c cVar = ((g) this.f4696k).f4713i;
                    InterfaceC1078i interfaceC1078i = ((R2.e) ((R2.f) this.f4697l)).f5524h;
                    J2.r a3 = AbstractC0369a.a(cVar, obj2, null);
                    if (a3 != null) {
                        B.m(a3, interfaceC1078i);
                    }
                }
                return C0880v.f8657a;
            case 1:
                J2.r a4 = AbstractC0369a.a((y2.c) this.f4696k, this.f4695j, null);
                if (a4 != null) {
                    B.m(a4, (InterfaceC1078i) this.f4697l);
                }
                return C0880v.f8657a;
            case 2:
                S.h hVar = (S.h) this.f4696k;
                LinkedHashMap linkedHashMap = hVar.f5563b;
                Object obj3 = this.f4695j;
                if (!(!linkedHashMap.containsKey(obj3))) {
                    throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
                }
                hVar.f5562a.remove(obj3);
                LinkedHashMap linkedHashMap2 = hVar.f5563b;
                S.f fVar = (S.f) this.f4697l;
                linkedHashMap2.put(obj3, fVar);
                return new S.g(fVar, hVar, obj3, 0);
            case 3:
                p0 p0Var = (p0) obj;
                Y.d dVar = (Y.d) p0Var;
                if (((ViewOnDragListenerC1307r0) ((C1314v) AbstractC1248f.w((Y.d) this.f4696k)).getDragAndDropManager()).f11136b.contains(dVar)) {
                    F f3 = (F) this.f4697l;
                    if (C.l(dVar, K1.f.e(((DragEvent) f3.f165i).getX(), ((DragEvent) f3.f165i).getY()))) {
                        ((z2.s) this.f4695j).f11909h = p0Var;
                        return o0.f10612j;
                    }
                }
                return o0.f10610h;
            case 4:
                C0442s c0442s = (C0442s) obj;
                if (z2.h.a(c0442s, (C0442s) this.f4695j)) {
                    booleanValue = false;
                } else {
                    if (z2.h.a(c0442s, ((androidx.compose.ui.focus.b) this.f4696k).f6746f)) {
                        throw new IllegalStateException("Focus search landed at the root.".toString());
                    }
                    booleanValue = ((Boolean) ((y2.c) this.f4697l).l(c0442s)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case AbstractC1166e.f10138f /* 5 */:
                C0499w c0499w = (C0499w) this.f4695j;
                InterfaceC0470t interfaceC0470t = (InterfaceC0470t) this.f4696k;
                C0560j c0560j = (C0560j) this.f4697l;
                c0499w.a(interfaceC0470t, c0560j);
                return new C0371a(3, c0560j);
            case AbstractC1166e.f10136d /* 6 */:
                return new S.g((T.r) this.f4696k, this.f4695j, (C0805n) this.f4697l);
            case 7:
                C0573M c0573m = (C0573M) obj;
                W0 w02 = (W0) this.f4695j;
                c0573m.a(w02 != null ? ((Number) w02.getValue()).floatValue() : 1.0f);
                W0 w03 = (W0) this.f4696k;
                c0573m.f(w03 != null ? ((Number) w03.getValue()).floatValue() : 1.0f);
                c0573m.g(w03 != null ? ((Number) w03.getValue()).floatValue() : 1.0f);
                W0 w04 = (W0) this.f4697l;
                c0573m.m(w04 != null ? ((C0580U) w04.getValue()).f7242a : C0580U.f7240b);
                return C0880v.f8657a;
            case 8:
                int ordinal = ((EnumC0812v) obj).ordinal();
                C0580U c0580u = null;
                C0790E c0790e = (C0790E) this.f4696k;
                C0791F c0791f = (C0791F) this.f4697l;
                if (ordinal == 0) {
                    L l3 = c0790e.f8128a.f8170d;
                    if (l3 != null) {
                        c0580u = new C0580U(l3.f8141b);
                    } else {
                        L l4 = c0791f.f8131a.f8170d;
                        if (l4 != null) {
                            c0580u = new C0580U(l4.f8141b);
                        }
                    }
                } else if (ordinal == 1) {
                    c0580u = (C0580U) this.f4695j;
                } else {
                    if (ordinal != 2) {
                        throw new J2.r();
                    }
                    L l5 = c0791f.f8131a.f8170d;
                    if (l5 != null) {
                        c0580u = new C0580U(l5.f8141b);
                    } else {
                        L l6 = c0790e.f8128a.f8170d;
                        if (l6 != null) {
                            c0580u = new C0580U(l6.f8141b);
                        }
                    }
                }
                return new C0580U(c0580u != null ? c0580u.f7242a : C0580U.f7240b);
            case AbstractC1166e.f10135c /* 9 */:
                T.r rVar = (T.r) this.f4695j;
                C0945f c0945f = (C0945f) this.f4696k;
                rVar.add(c0945f);
                return new S.g((o1.o) this.f4697l, c0945f, rVar, 2);
            case AbstractC1166e.f10137e /* 10 */:
                float floatValue = ((Number) obj).floatValue();
                C1027l c1027l = (C1027l) this.f4695j;
                float f4 = c1027l.f9632w ? 1.0f : -1.0f;
                C0 c02 = c1027l.f9631v;
                long d3 = c02.d(c02.g(f4 * floatValue));
                C0 c03 = ((C1055z0) this.f4697l).f9724a;
                float f5 = c02.f(c02.d(C0.a(c03, c03.f9391h, d3, 1))) * f4;
                if (Math.abs(f5) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f5 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((Z) this.f4696k).a(cancellationException);
                }
                return C0880v.f8657a;
            case 11:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                C1156I c1156i = (C1156I) this.f4695j;
                boolean z3 = c1156i.f10060w;
                AbstractC1103Q abstractC1103Q = (AbstractC1103Q) this.f4696k;
                InterfaceC1096J interfaceC1096J = (InterfaceC1096J) this.f4697l;
                if (z3) {
                    AbstractC1102P.f(abstractC1102P, abstractC1103Q, interfaceC1096J.l(c1156i.f10058u), interfaceC1096J.l(c1156i.f10059v));
                } else {
                    AbstractC1102P.d(abstractC1102P, abstractC1103Q, interfaceC1096J.l(c1156i.f10058u), interfaceC1096J.l(c1156i.f10059v));
                }
                return C0880v.f8657a;
            case 12:
                AbstractC1102P abstractC1102P2 = (AbstractC1102P) obj;
                C1157J c1157j = (C1157J) this.f4695j;
                long j3 = ((O0.h) c1157j.f10061u.l((InterfaceC1096J) this.f4696k)).f5141a;
                if (c1157j.f10062v) {
                    AbstractC1102P.h(abstractC1102P2, (AbstractC1103Q) this.f4697l, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                } else {
                    AbstractC1102P.j(abstractC1102P2, (AbstractC1103Q) this.f4697l, (int) (j3 >> 32), (int) (j3 & 4294967295L), null, 12);
                }
                return C0880v.f8657a;
            case 13:
                AbstractC1102P abstractC1102P3 = (AbstractC1102P) obj;
                C1158K c1158k = (C1158K) this.f4695j;
                boolean z4 = c1158k.f10067y;
                AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) this.f4696k;
                InterfaceC1096J interfaceC1096J2 = (InterfaceC1096J) this.f4697l;
                if (z4) {
                    AbstractC1102P.f(abstractC1102P3, abstractC1103Q2, interfaceC1096J2.l(c1158k.f10063u), interfaceC1096J2.l(c1158k.f10064v));
                } else {
                    AbstractC1102P.d(abstractC1102P3, abstractC1103Q2, interfaceC1096J2.l(c1158k.f10063u), interfaceC1096J2.l(c1158k.f10064v));
                }
                return C0880v.f8657a;
            case 14:
                C1161N c1161n = (C1161N) this.f4697l;
                InterfaceC1159L interfaceC1159L = c1161n.f10072u;
                InterfaceC1096J interfaceC1096J3 = (InterfaceC1096J) this.f4696k;
                AbstractC1102P.d((AbstractC1102P) obj, (AbstractC1103Q) this.f4695j, interfaceC1096J3.l(interfaceC1159L.b(interfaceC1096J3.getLayoutDirection())), interfaceC1096J3.l(c1161n.f10072u.d()));
                return C0880v.f8657a;
            case AbstractC1166e.f10139g /* 15 */:
                AbstractC1102P abstractC1102P4 = (AbstractC1102P) obj;
                List list = (List) this.f4695j;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    C1220o c1220o = (C1220o) this.f4696k;
                    if (i2 >= size) {
                        if (c1220o != null) {
                            c1220o.g(abstractC1102P4);
                        }
                        ((InterfaceC0258c0) this.f4697l).getValue();
                        return C0880v.f8657a;
                    }
                    C1220o c1220o2 = (C1220o) list.get(i2);
                    if (c1220o2 != c1220o) {
                        c1220o2.g(abstractC1102P4);
                    }
                    i2++;
                }
            case 16:
                z zVar = (z) obj;
                ((InterfaceC0258c0) this.f4696k).setValue(zVar);
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f4697l;
                boolean z5 = !z2.h.a((String) interfaceC0258c0.getValue(), zVar.f3932a.f500a);
                C0024g c0024g = zVar.f3932a;
                interfaceC0258c0.setValue(c0024g.f500a);
                if (z5) {
                    ((y2.c) this.f4695j).l(c0024g.f500a);
                }
                return C0880v.f8657a;
            case 17:
                InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
                S s3 = (S) this.f4695j;
                z.p0 d4 = s3.d();
                if (d4 != null) {
                    InterfaceC0600s e3 = interfaceC0654d.e0().e();
                    long j4 = ((J) s3.f11565x.getValue()).f473a;
                    long j5 = ((J) s3.f11566y.getValue()).f473a;
                    long j6 = s3.f11564w;
                    boolean b3 = J.b(j4);
                    I0.s sVar = (I0.s) this.f4697l;
                    H h2 = d4.f11788a;
                    C0589h c0589h = s3.f11563v;
                    if (!b3) {
                        c0589h.e(j6);
                        int l7 = sVar.l(J.e(j4));
                        int l8 = sVar.l(J.d(j4));
                        if (l7 != l8) {
                            e3.g(h2.j(l7, l8), c0589h);
                        }
                    } else if (J.b(j5)) {
                        z zVar2 = (z) this.f4696k;
                        if (!J.b(zVar2.f3933b)) {
                            c0589h.e(j6);
                            long j7 = zVar2.f3933b;
                            int l9 = sVar.l(J.e(j7));
                            int l10 = sVar.l(J.d(j7));
                            if (l9 != l10) {
                                e3.g(h2.j(l9, l10), c0589h);
                            }
                        }
                    } else {
                        long b4 = h2.f461a.f452b.b();
                        C0603v c0603v = new C0603v(b4);
                        if (b4 == 16) {
                            c0603v = null;
                        }
                        long j8 = c0603v != null ? c0603v.f7279a : C0603v.f7272b;
                        c0589h.e(C0603v.b(C0603v.d(j8) * 0.2f, j8));
                        int l11 = sVar.l(J.e(j5));
                        int l12 = sVar.l(J.d(j5));
                        if (l11 != l12) {
                            e3.g(h2.j(l11, l12), c0589h);
                        }
                    }
                    long j9 = h2.f463c;
                    float f6 = (int) (j9 >> 32);
                    C0.o oVar = h2.f462b;
                    boolean z6 = f6 < oVar.f526d || oVar.f525c || ((float) ((int) (j9 & 4294967295L))) < oVar.f527e;
                    G g3 = h2.f461a;
                    boolean z7 = z6 && !K1.f.t(g3.f456f, 3);
                    if (z7) {
                        long j10 = h2.f463c;
                        b0.d n3 = AbstractC0423a.n(0L, C.i((int) (j10 >> 32), (int) (j10 & 4294967295L)));
                        e3.f();
                        InterfaceC0600s.c(e3, n3);
                    }
                    C0.C c3 = g3.f452b.f475a;
                    N0.j jVar = c3.f439m;
                    N0.m mVar = c3.f427a;
                    if (jVar == null) {
                        jVar = N0.j.f4993b;
                    }
                    N0.j jVar2 = jVar;
                    C0575O c0575o = c3.f440n;
                    if (c0575o == null) {
                        c0575o = C0575O.f7219d;
                    }
                    C0575O c0575o2 = c0575o;
                    AbstractC0655e abstractC0655e = c3.f442p;
                    if (abstractC0655e == null) {
                        abstractC0655e = e0.g.f7556a;
                    }
                    AbstractC0655e abstractC0655e2 = abstractC0655e;
                    try {
                        AbstractC0598q c4 = mVar.c();
                        N0.l lVar = N0.l.f4998a;
                        if (c4 != null) {
                            C0.o.h(h2.f462b, e3, c4, mVar != lVar ? mVar.a() : 1.0f, c0575o2, jVar2, abstractC0655e2);
                        } else {
                            C0.o.g(h2.f462b, e3, mVar != lVar ? mVar.b() : C0603v.f7272b, c0575o2, jVar2, abstractC0655e2);
                        }
                        if (z7) {
                            e3.b();
                        }
                    } catch (Throwable th) {
                        if (z7) {
                            e3.b();
                        }
                        throw th;
                    }
                }
                return C0880v.f8657a;
            default:
                I0.F f7 = (I0.F) ((z2.s) this.f4697l).f11909h;
                z b5 = ((B.z) this.f4695j).b((List) obj);
                if (f7 != null) {
                    f7.a(null, b5);
                }
                ((y2.c) this.f4696k).l(b5);
                return C0880v.f8657a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i2, boolean z3) {
        super(1);
        this.f4694i = i2;
        this.f4696k = obj;
        this.f4695j = obj2;
        this.f4697l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList, C1220o c1220o, boolean z3, InterfaceC0258c0 interfaceC0258c0) {
        super(1);
        this.f4694i = 15;
        this.f4695j = arrayList;
        this.f4696k = c1220o;
        this.f4697l = interfaceC0258c0;
    }
}
