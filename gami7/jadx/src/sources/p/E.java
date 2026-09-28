package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class E extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9400l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f9402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0921D f9403o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f9404p;
    public final /* synthetic */ y2.c q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.a f9405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.a f9406s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y2.e f9407t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(M m3, C0921D c0921d, y2.e eVar, y2.c cVar, y2.a aVar, y2.a aVar2, y2.e eVar2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9402n = m3;
        this.f9403o = c0921d;
        this.f9404p = eVar;
        this.q = cVar;
        this.f9405r = aVar;
        this.f9406s = aVar2;
        this.f9407t = eVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((E) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        E e3 = new E(this.f9402n, this.f9403o, this.f9404p, this.q, this.f9405r, this.f9406s, this.f9407t, interfaceC1073d);
        e3.f9401m = obj;
        return e3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r15) {
        /*
            r14 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r14.f9400l
            m2.v r2 = m2.C0880v.f8657a
            p.M r3 = r14.f9402n
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 != r4) goto L17
            java.lang.Object r0 = r14.f9401m
            J2.z r0 = (J2.InterfaceC0328z) r0
            C1.y.J(r15)     // Catch: java.util.concurrent.CancellationException -> L15
            goto L61
        L15:
            r15 = move-exception
            goto L52
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            C1.y.J(r15)
            java.lang.Object r15 = r14.f9401m
            J2.z r15 = (J2.InterfaceC0328z) r15
            p.X r7 = r3.f9468w     // Catch: java.util.concurrent.CancellationException -> L50
            n0.D r1 = r14.f9403o     // Catch: java.util.concurrent.CancellationException -> L50
            y2.e r8 = r14.f9404p     // Catch: java.util.concurrent.CancellationException -> L50
            y2.c r11 = r14.q     // Catch: java.util.concurrent.CancellationException -> L50
            y2.a r10 = r14.f9405r     // Catch: java.util.concurrent.CancellationException -> L50
            y2.a r6 = r14.f9406s     // Catch: java.util.concurrent.CancellationException -> L50
            y2.e r9 = r14.f9407t     // Catch: java.util.concurrent.CancellationException -> L50
            r14.f9401m = r15     // Catch: java.util.concurrent.CancellationException -> L50
            r14.f9400l = r4     // Catch: java.util.concurrent.CancellationException -> L50
            float r4 = p.D.f9394a     // Catch: java.util.concurrent.CancellationException -> L50
            p.B r4 = new p.B     // Catch: java.util.concurrent.CancellationException -> L50
            r12 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L50
            java.lang.Object r15 = n2.AbstractC0946A.e(r1, r4, r14)     // Catch: java.util.concurrent.CancellationException -> L50
            if (r15 != r0) goto L48
            goto L49
        L48:
            r15 = r2
        L49:
            if (r15 != r0) goto L61
            return r0
        L4c:
            r13 = r0
            r0 = r15
            r15 = r13
            goto L52
        L50:
            r0 = move-exception
            goto L4c
        L52:
            L2.k r1 = r3.f9464A
            if (r1 == 0) goto L5b
            p.s r3 = p.C1040s.f9677a
            r1.q(r3)
        L5b:
            boolean r0 = J2.B.o(r0)
            if (r0 == 0) goto L62
        L61:
            return r2
        L62:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p.E.p(java.lang.Object):java.lang.Object");
    }
}
