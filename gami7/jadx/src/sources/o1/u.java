package o1;

import J2.InterfaceC0328z;
import m.W;
import m2.C0880v;
import n1.C0945f;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class u extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9290l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f9291m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W f9292n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0945f f9293o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(float f3, W w2, C0945f c0945f, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9291m = f3;
        this.f9292n = w2;
        this.f9293o = c0945f;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((u) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new u(this.f9291m, this.f9292n, this.f9293o, interfaceC1073d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r8.f9290l
            m2.v r2 = m2.C0880v.f8657a
            m.W r3 = r8.f9292n
            r4 = 0
            float r5 = r8.f9291m
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L23
            if (r1 == r7) goto L1f
            if (r1 != r6) goto L17
            C1.y.J(r9)
            goto L71
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            C1.y.J(r9)
            goto L39
        L23:
            C1.y.J(r9)
            int r9 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r9 <= 0) goto L39
            r8.f9290l = r7
            J.k0 r9 = r3.f8372i
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r9 = r3.t(r5, r9, r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            int r9 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r9 != 0) goto L71
            r8.f9290l = r6
            m.p0 r9 = r3.f8375l
            if (r9 != 0) goto L45
        L43:
            r9 = r2
            goto L6e
        L45:
            J.k0 r1 = r3.f8373j
            java.lang.Object r1 = r1.getValue()
            n1.f r4 = r8.f9293o
            boolean r1 = z2.h.a(r1, r4)
            if (r1 == 0) goto L60
            J.k0 r1 = r3.f8372i
            java.lang.Object r1 = r1.getValue()
            boolean r1 = z2.h.a(r1, r4)
            if (r1 == 0) goto L60
            goto L43
        L60:
            m.T r1 = new m.T
            r5 = 0
            r1.<init>(r3, r4, r9, r5)
            m.J r9 = r3.f8380r
            java.lang.Object r9 = m.J.a(r9, r1, r8)
            if (r9 != r0) goto L43
        L6e:
            if (r9 != r0) goto L71
            return r0
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.u.p(java.lang.Object):java.lang.Object");
    }
}
