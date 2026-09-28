package w;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r0.InterfaceC1129r;
import s2.AbstractC1204i;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f11417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1129r f11418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.a f11419o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376f(i iVar, InterfaceC1129r interfaceC1129r, y2.a aVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11417m = iVar;
        this.f11418n = interfaceC1129r;
        this.f11419o = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1376f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1376f(this.f11417m, this.f11418n, this.f11419o, interfaceC1073d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cc, code lost:
    
        if (r13 == r0) goto L40;
     */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r13) {
        /*
            r12 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r12.f11416l
            m2.v r2 = m2.C0880v.f8657a
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            C1.y.J(r13)
            goto Ld3
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            C1.y.J(r13)
            w.i r13 = r12.f11417m
            p.l r1 = r13.f11429u
            w.e r4 = new w.e
            r0.r r5 = r12.f11418n
            y2.a r6 = r12.f11419o
            r4.<init>(r13, r5, r6)
            r12.f11416l = r3
            r1.getClass()
            java.lang.Object r13 = r4.c()
            b0.d r13 = (b0.d) r13
            if (r13 == 0) goto Lcf
            long r5 = r1.f9628C
            boolean r13 = r1.M0(r13, r5)
            if (r13 != 0) goto Lcf
            J2.h r13 = new J2.h
            q2.d r5 = n2.AbstractC0948C.i(r12)
            r13.<init>(r3, r5)
            r13.r()
            p.i r5 = new p.i
            r5.<init>(r4, r13)
            n0.h r6 = r1.f9634y
            r6.getClass()
            java.lang.Object r4 = r4.c()
            b0.d r4 = (b0.d) r4
            if (r4 != 0) goto L5f
            r13.t(r2)
            goto Lc8
        L5f:
            p.b r7 = new p.b
            r8 = 0
            r7.<init>(r6, r8, r5)
            r13.u(r7)
            E2.d r7 = new E2.d
            L.d r6 = r6.f8942a
            int r8 = r6.f4620j
            int r8 = r8 - r3
            r9 = 0
            r7.<init>(r9, r8, r3)
            int r7 = r7.f1077i
            if (r7 < 0) goto Lbe
        L77:
            java.lang.Object[] r8 = r6.f4618h
            r8 = r8[r7]
            p.i r8 = (p.C1021i) r8
            y2.a r8 = r8.f9601a
            java.lang.Object r8 = r8.c()
            b0.d r8 = (b0.d) r8
            if (r8 != 0) goto L88
            goto Lb9
        L88:
            b0.d r10 = r4.e(r8)
            boolean r11 = z2.h.a(r10, r4)
            if (r11 == 0) goto L97
            int r7 = r7 + r3
            r6.a(r7, r5)
            goto Lc1
        L97:
            boolean r8 = z2.h.a(r10, r8)
            if (r8 != 0) goto Lb9
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r8.<init>(r10)
            int r10 = r6.f4620j
            int r10 = r10 - r3
            if (r10 > r7) goto Lb9
        La9:
            java.lang.Object[] r11 = r6.f4618h
            r11 = r11[r7]
            p.i r11 = (p.C1021i) r11
            J2.g r11 = r11.f9602b
            r11.H(r8)
            if (r10 == r7) goto Lb9
            int r10 = r10 + 1
            goto La9
        Lb9:
            if (r7 == 0) goto Lbe
            int r7 = r7 + (-1)
            goto L77
        Lbe:
            r6.a(r9, r5)
        Lc1:
            boolean r3 = r1.f9629D
            if (r3 != 0) goto Lc8
            r1.N0()
        Lc8:
            java.lang.Object r13 = r13.q()
            if (r13 != r0) goto Lcf
            goto Ld0
        Lcf:
            r13 = r2
        Ld0:
            if (r13 != r0) goto Ld3
            return r0
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1376f.p(java.lang.Object):java.lang.Object");
    }
}
