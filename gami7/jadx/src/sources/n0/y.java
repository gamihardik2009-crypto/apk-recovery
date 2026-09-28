package n0;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class y extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8991l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8992m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0918A f8993n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j3, C0918A c0918a, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8992m = j3;
        this.f8993n = c0918a;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((y) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new y(this.f8992m, this.f8993n, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r11) {
        /*
            r10 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r10.f8991l
            r2 = 1
            long r4 = r10.f8992m
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            C1.y.J(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            C1.y.J(r11)
            goto L2e
        L20:
            C1.y.J(r11)
            long r8 = r4 - r2
            r10.f8991l = r7
            java.lang.Object r11 = J2.B.f(r8, r10)
            if (r11 != r0) goto L2e
            return r0
        L2e:
            r10.f8991l = r6
            java.lang.Object r11 = J2.B.f(r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            n0.A r11 = r10.f8993n
            J2.g r11 = r11.f8903j
            if (r11 == 0) goto L49
            n0.k r0 = new n0.k
            r0.<init>(r4)
            m2.i r0 = C1.y.n(r0)
            r11.t(r0)
        L49:
            m2.v r11 = m2.C0880v.f8657a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y.p(java.lang.Object):java.lang.Object");
    }
}
