package z;

import J.InterfaceC0258c0;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class g0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public Object f11691l;

    /* renamed from: m, reason: collision with root package name */
    public int f11692m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f11693n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f11694o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r.l f11695p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(InterfaceC0258c0 interfaceC0258c0, long j3, r.l lVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11693n = interfaceC0258c0;
        this.f11694o = j3;
        this.f11695p = lVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((g0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new g0(this.f11693n, this.f11694o, this.f11695p, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r8.f11692m
            r.l r2 = r8.f11695p
            r3 = 2
            r4 = 1
            J.c0 r5 = r8.f11693n
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r8.f11691l
            r.n r0 = (r.n) r0
            C1.y.J(r9)
            goto L5f
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.f11691l
            J.c0 r1 = (J.InterfaceC0258c0) r1
            C1.y.J(r9)
            goto L46
        L28:
            C1.y.J(r9)
            java.lang.Object r9 = r5.getValue()
            r.n r9 = (r.n) r9
            if (r9 == 0) goto L4a
            r.m r1 = new r.m
            r1.<init>(r9)
            if (r2 == 0) goto L45
            r8.f11691l = r5
            r8.f11692m = r4
            java.lang.Object r9 = r2.b(r1, r8)
            if (r9 != r0) goto L45
            return r0
        L45:
            r1 = r5
        L46:
            r9 = 0
            r1.setValue(r9)
        L4a:
            r.n r9 = new r.n
            long r6 = r8.f11694o
            r9.<init>(r6)
            if (r2 == 0) goto L60
            r8.f11691l = r9
            r8.f11692m = r3
            java.lang.Object r1 = r2.b(r9, r8)
            if (r1 != r0) goto L5e
            return r0
        L5e:
            r0 = r9
        L5f:
            r9 = r0
        L60:
            r5.setValue(r9)
            m2.v r9 = m2.C0880v.f8657a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g0.p(java.lang.Object):java.lang.Object");
    }
}
