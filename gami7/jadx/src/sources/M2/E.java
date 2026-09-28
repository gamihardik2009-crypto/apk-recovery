package M2;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class E extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4801l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f4802m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4803n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H f4804o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4805p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(U u3, InterfaceC0343g interfaceC0343g, H h2, Object obj, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4802m = u3;
        this.f4803n = interfaceC0343g;
        this.f4804o = h2;
        this.f4805p = obj;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((E) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new E(this.f4802m, this.f4803n, this.f4804o, this.f4805p, interfaceC1073d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[RETURN] */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r8.f4801l
            r2 = 4
            r3 = 3
            r4 = 1
            M2.g r5 = r8.f4803n
            r6 = 2
            M2.H r7 = r8.f4804o
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            C1.y.J(r9)
            goto L53
        L23:
            C1.y.J(r9)
            goto L7b
        L27:
            C1.y.J(r9)
            M2.V r9 = M2.T.f4838a
            M2.U r1 = r8.f4802m
            if (r1 != r9) goto L39
            r8.f4801l = r4
            java.lang.Object r9 = r5.b(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L39:
            M2.V r9 = M2.T.f4839b
            r4 = 0
            if (r1 != r9) goto L5c
            r9 = r7
            N2.b r9 = (N2.AbstractC0363b) r9
            N2.F r9 = r9.j()
            M2.C r1 = new M2.C
            r1.<init>(r6, r4)
            r8.f4801l = r6
            java.lang.Object r9 = M2.P.j(r9, r1, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            r8.f4801l = r3
            java.lang.Object r9 = r5.b(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L5c:
            r9 = r7
            N2.b r9 = (N2.AbstractC0363b) r9
            N2.F r9 = r9.j()
            M2.g r9 = r1.a(r9)
            M2.g r9 = M2.P.g(r9)
            M2.D r1 = new M2.D
            java.lang.Object r3 = r8.f4805p
            r1.<init>(r5, r7, r3, r4)
            r8.f4801l = r2
            java.lang.Object r9 = M2.P.e(r9, r1, r8)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            m2.v r9 = m2.C0880v.f8657a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.E.p(java.lang.Object):java.lang.Object");
    }
}
