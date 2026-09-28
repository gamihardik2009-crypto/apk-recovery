package n2;

import D.C0032a;
import H.C0148m;
import H.C0157n1;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0287r0;
import J.C0291t0;
import J2.AbstractC0324v;
import a.AbstractC0423a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0461j;
import androidx.lifecycle.X;
import androidx.lifecycle.c0;
import j1.AbstractC0777e;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import k1.C0783a;
import l1.AbstractC0815b;
import m2.C0880v;
import n0.C0929h;
import n1.C0938A;
import n1.C0939B;
import n1.C0945f;
import o1.C0993a;
import o2.C1000f;
import o2.C1002h;
import q2.C1071b;
import q2.C1074e;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1075f;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;
import r2.C1146b;
import r2.C1147c;
import r2.EnumC1145a;
import s2.AbstractC1196a;
import s2.AbstractC1198c;
import t0.AbstractC1248f;
import t0.Z;
import v.C1362p;
import v.InterfaceC1363q;
import w.InterfaceC1371a;

/* renamed from: n2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0948C {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(y2.a r10, V.o r11, v.C1337I r12, y2.e r13, J.C0285q r14, int r15, int r16) {
        /*
            r1 = r10
            r4 = r13
            r0 = r14
            r5 = r15
            r2 = 2002163445(0x775696f5, float:4.3523957E33)
            r14.W(r2)
            r2 = r16 & 1
            if (r2 == 0) goto L11
            r2 = r5 | 6
            goto L21
        L11:
            r2 = r5 & 6
            if (r2 != 0) goto L20
            boolean r2 = r14.i(r10)
            if (r2 == 0) goto L1d
            r2 = 4
            goto L1e
        L1d:
            r2 = 2
        L1e:
            r2 = r2 | r5
            goto L21
        L20:
            r2 = r5
        L21:
            r3 = r16 & 2
            if (r3 == 0) goto L29
            r2 = r2 | 48
        L27:
            r6 = r11
            goto L3a
        L29:
            r6 = r5 & 48
            if (r6 != 0) goto L27
            r6 = r11
            boolean r7 = r14.g(r11)
            if (r7 == 0) goto L37
            r7 = 32
            goto L39
        L37:
            r7 = 16
        L39:
            r2 = r2 | r7
        L3a:
            r7 = r16 & 4
            if (r7 == 0) goto L42
            r2 = r2 | 384(0x180, float:5.38E-43)
        L40:
            r8 = r12
            goto L53
        L42:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L40
            r8 = r12
            boolean r9 = r14.g(r12)
            if (r9 == 0) goto L50
            r9 = 256(0x100, float:3.59E-43)
            goto L52
        L50:
            r9 = 128(0x80, float:1.8E-43)
        L52:
            r2 = r2 | r9
        L53:
            r9 = r16 & 8
            if (r9 == 0) goto L5a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L6a
        L5a:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L6a
            boolean r9 = r14.i(r13)
            if (r9 == 0) goto L67
            r9 = 2048(0x800, float:2.87E-42)
            goto L69
        L67:
            r9 = 1024(0x400, float:1.435E-42)
        L69:
            r2 = r2 | r9
        L6a:
            r2 = r2 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r2 != r9) goto L7d
            boolean r2 = r14.A()
            if (r2 != 0) goto L77
            goto L7d
        L77:
            r14.P()
            r2 = r6
            r3 = r8
            goto L9c
        L7d:
            if (r3 == 0) goto L82
            V.l r2 = V.l.f5857b
            goto L83
        L82:
            r2 = r6
        L83:
            if (r7 == 0) goto L87
            r3 = 0
            goto L88
        L87:
            r3 = r8
        L88:
            J.c0 r6 = J.C0257c.R(r10, r14)
            androidx.compose.foundation.lazy.layout.b r7 = new androidx.compose.foundation.lazy.layout.b
            r7.<init>(r3, r2, r13, r6)
            r6 = -1488997347(0xffffffffa73fb41d, float:-2.6604214E-15)
            R.a r6 = R.b.c(r6, r7, r14)
            r7 = 6
            n2.AbstractC0949a.c(r6, r14, r7)
        L9c:
            J.t0 r8 = r14.t()
            if (r8 == 0) goto Lb0
            H.n r9 = new H.n
            r7 = 4
            r0 = r9
            r1 = r10
            r4 = r13
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f4235d = r9
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0948C.a(y2.a, V.o, v.I, y2.e, J.q, int, int):void");
    }

    public static final void b(C0945f c0945f, S.c cVar, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-1579360880);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(c0945f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(cVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            J.B b3 = AbstractC0815b.f8285a;
            z2.h.f(c0945f, "viewModelStoreOwner");
            C0257c.b(new C0287r0[]{AbstractC0815b.f8285a.a(c0945f), AbstractC0777e.f8096a.a(c0945f), AndroidCompositionLocals_androidKt.f6784e.a(c0945f)}, R.b.c(-52928304, new C0148m(cVar, 13, eVar), c0285q), c0285q, 56);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0032a(c0945f, cVar, eVar, i2, 3);
        }
    }

    public static final void c(S.c cVar, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(1211832233);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(1729797275);
            c0 a3 = AbstractC0815b.a(c0285q);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            X f02 = AbstractC0423a.f0(z2.t.a(C0993a.class), a3, null, a3 instanceof InterfaceC0461j ? ((InterfaceC0461j) a3).a() : C0783a.f8106i, c0285q);
            c0285q.r(false);
            C0993a c0993a = (C0993a) f02;
            c0993a.f9233d = new WeakReference(cVar);
            cVar.a(c0993a.f9232c, eVar, c0285q, ((i3 << 6) & 896) | (i3 & 112));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 10, cVar, eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(n.w0 r5, float r6, m.w0 r7, q2.InterfaceC1073d r8) {
        /*
            boolean r0 = r8 instanceof p.C1008b0
            if (r0 == 0) goto L13
            r0 = r8
            p.b0 r0 = (p.C1008b0) r0
            int r1 = r0.f9567m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9567m = r1
            goto L18
        L13:
            p.b0 r0 = new p.b0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9566l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9567m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z2.p r5 = r0.f9565k
            C1.y.J(r8)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            C1.y.J(r8)
            z2.p r8 = new z2.p
            r8.<init>()
            p.c0 r2 = new p.c0
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.f9565k = r8
            r0.f9567m = r3
            n.c0 r6 = n.c0.f8753h
            java.lang.Object r5 = r5.e(r6, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r8
        L4d:
            float r5 = r5.f11906h
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0948C.d(n.w0, float, m.w0, q2.d):java.lang.Object");
    }

    public static final void e(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(",");
            }
        }
    }

    public static C1002h f(C1002h c1002h) {
        C1000f c1000f = c1002h.f9355h;
        c1000f.b();
        return c1000f.f9348p > 0 ? c1002h : C1002h.f9354i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1073d g(Object obj, InterfaceC1073d interfaceC1073d, y2.e eVar) {
        z2.h.f(eVar, "<this>");
        z2.h.f(interfaceC1073d, "completion");
        if (eVar instanceof AbstractC1196a) {
            return ((AbstractC1196a) eVar).m(obj, interfaceC1073d);
        }
        InterfaceC1078i n3 = interfaceC1073d.n();
        return n3 == C1079j.f9784h ? new C1146b(obj, interfaceC1073d, eVar) : new C1147c(interfaceC1073d, n3, eVar, obj);
    }

    public static InterfaceC1076g h(InterfaceC1076g interfaceC1076g, InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        if (z2.h.a(interfaceC1076g.getKey(), interfaceC1077h)) {
            return interfaceC1076g;
        }
        return null;
    }

    public static InterfaceC1073d i(InterfaceC1073d interfaceC1073d) {
        z2.h.f(interfaceC1073d, "<this>");
        AbstractC1198c abstractC1198c = interfaceC1073d instanceof AbstractC1198c ? (AbstractC1198c) interfaceC1073d : null;
        if (abstractC1198c == null) {
            return interfaceC1073d;
        }
        InterfaceC1073d interfaceC1073d2 = abstractC1198c.f10206j;
        if (interfaceC1073d2 != null) {
            return interfaceC1073d2;
        }
        InterfaceC1075f interfaceC1075f = (InterfaceC1075f) abstractC1198c.n().s(C1074e.f9782h);
        InterfaceC1073d hVar = interfaceC1075f != null ? new O2.h((AbstractC0324v) interfaceC1075f, abstractC1198c) : abstractC1198c;
        abstractC1198c.f10206j = hVar;
        return hVar;
    }

    public static final V.o j(V.o oVar, InterfaceC1363q interfaceC1363q, C0929h c0929h, boolean z3, O0.k kVar, p.X x2, boolean z4, C0285q c0285q, int i2) {
        if (!z4) {
            c0285q.U(-1890658823);
            c0285q.r(false);
            return oVar;
        }
        c0285q.U(-1890632411);
        boolean z5 = true;
        boolean z6 = ((((i2 & 112) ^ 48) > 32 && c0285q.g(interfaceC1363q)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && c0285q.g(c0929h)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && c0285q.h(z3)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && c0285q.g(kVar)) || (i2 & 24576) == 16384);
        if ((((458752 & i2) ^ 196608) <= 131072 || !c0285q.g(x2)) && (i2 & 196608) != 131072) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object K3 = c0285q.K();
        if (z7 || K3 == C0275l.f4150a) {
            K3 = new C1362p(interfaceC1363q, c0929h, z3, kVar, x2);
            c0285q.e0(K3);
        }
        V.o k3 = oVar.k((C1362p) K3);
        c0285q.r(false);
        return k3;
    }

    public static InterfaceC1078i k(InterfaceC1076g interfaceC1076g, InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        return z2.h.a(interfaceC1076g.getKey(), interfaceC1077h) ? C1079j.f9784h : interfaceC1076g;
    }

    public static final C0938A l(y2.c cVar) {
        C0939B c0939b = new C0939B();
        cVar.l(c0939b);
        boolean z3 = c0939b.f9008b;
        n1.z zVar = c0939b.f9007a;
        zVar.f9141a = z3;
        zVar.f9142b = c0939b.f9009c;
        int i2 = c0939b.f9010d;
        boolean z4 = c0939b.f9011e;
        zVar.f9143c = i2;
        zVar.f9144d = null;
        zVar.f9145e = false;
        zVar.f9146f = z4;
        return zVar.a();
    }

    public static LinkedHashSet m(Set set, Object obj) {
        z2.h.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0946A.m(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static InterfaceC1078i n(InterfaceC1076g interfaceC1076g, InterfaceC1078i interfaceC1078i) {
        z2.h.f(interfaceC1078i, "context");
        return interfaceC1078i == C1079j.f9784h ? interfaceC1076g : (InterfaceC1078i) interfaceC1078i.y(interfaceC1076g, C1071b.f9778k);
    }

    public static final Object o(V.n nVar, b0.d dVar, InterfaceC1073d interfaceC1073d) {
        InterfaceC1371a interfaceC1371a;
        Object n02;
        boolean z3 = nVar.f5858h.f5869t;
        C0880v c0880v = C0880v.f8657a;
        if (!z3) {
            return c0880v;
        }
        Z u3 = AbstractC1248f.u(nVar);
        if (nVar.f5858h.f5869t) {
            InterfaceC1371a interfaceC1371a2 = (InterfaceC1371a) AbstractC1248f.j(nVar, w.i.f11428w);
            if (interfaceC1371a2 == null) {
                interfaceC1371a2 = new w.j(nVar);
            }
            interfaceC1371a = interfaceC1371a2;
        } else {
            interfaceC1371a = null;
        }
        return (interfaceC1371a != null && (n02 = interfaceC1371a.n0(u3, new D.c0(dVar, 17, u3), interfaceC1073d)) == EnumC1145a.f10026h) ? n02 : c0880v;
    }
}
