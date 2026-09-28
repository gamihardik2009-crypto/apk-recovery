package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class K0 extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f9448j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9449k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f9450l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.f f9451m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f9452n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9453o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(InterfaceC0328z interfaceC0328z, y2.f fVar, y2.c cVar, C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9450l = interfaceC0328z;
        this.f9451m = fVar;
        this.f9452n = cVar;
        this.f9453o = c1006a0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((K0) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        K0 k02 = new K0(this.f9450l, this.f9451m, this.f9452n, this.f9453o, interfaceC1073d);
        k02.f9449k = obj;
        return k02;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r11) {
        /*
            r10 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r10.f9448j
            r2 = 0
            J2.z r3 = r10.f9450l
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            p.a0 r8 = r10.f9453o
            if (r1 == 0) goto L27
            if (r1 == r7) goto L1f
            if (r1 != r6) goto L17
            C1.y.J(r11)
            goto L62
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            java.lang.Object r1 = r10.f9449k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r11)
            goto L42
        L27:
            C1.y.J(r11)
            java.lang.Object r11 = r10.f9449k
            r1 = r11
            n0.A r1 = (n0.C0918A) r1
            p.G0 r11 = new p.G0
            r11.<init>(r8, r5)
            J2.B.r(r3, r5, r2, r11, r4)
            r10.f9449k = r1
            r10.f9448j = r7
            java.lang.Object r11 = p.b1.c(r1, r10, r4)
            if (r11 != r0) goto L42
            return r0
        L42:
            n0.r r11 = (n0.r) r11
            r11.a()
            p.N r7 = p.b1.f9568a
            y2.f r9 = r10.f9451m
            if (r9 == r7) goto L55
            p.H0 r7 = new p.H0
            r7.<init>(r9, r8, r11, r5)
            J2.B.r(r3, r5, r2, r7, r4)
        L55:
            r10.f9449k = r5
            r10.f9448j = r6
            n0.j r11 = n0.EnumC0931j.f8947i
            java.lang.Object r11 = p.b1.e(r1, r11, r10)
            if (r11 != r0) goto L62
            return r0
        L62:
            n0.r r11 = (n0.r) r11
            if (r11 != 0) goto L6f
            p.I0 r11 = new p.I0
            r11.<init>(r8, r5)
            J2.B.r(r3, r5, r2, r11, r4)
            goto L88
        L6f:
            r11.a()
            p.J0 r0 = new p.J0
            r0.<init>(r8, r5)
            J2.B.r(r3, r5, r2, r0, r4)
            y2.c r0 = r10.f9452n
            if (r0 == 0) goto L88
            b0.c r1 = new b0.c
            long r2 = r11.f8959c
            r1.<init>(r2)
            r0.l(r1)
        L88:
            m2.v r11 = m2.C0880v.f8657a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.K0.p(java.lang.Object):java.lang.Object");
    }
}
