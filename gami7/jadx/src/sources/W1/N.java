package W1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class N extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5953l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f5954m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5954m = p3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((N) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new N(this.f5954m, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[RETURN] */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r10) {
        /*
            r9 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r9.f5953l
            m2.v r2 = m2.C0880v.f8657a
            r3 = 2
            W1.P r4 = r9.f5954m
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r3) goto L15
            C1.y.J(r10)
            goto L90
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            C1.y.J(r10)
            goto L85
        L21:
            C1.y.J(r10)
            M2.K r10 = r4.f5967j
            M2.b0 r10 = r10.f4811h
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r10.iterator()
        L3c:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r10.next()
            R1.b r7 = (R1.b) r7
            java.lang.String r8 = r7.f5477c
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L56
            java.lang.String r7 = r7.f5475a
            r6.add(r7)
            goto L3c
        L56:
            java.lang.String r7 = r7.f5477c
            r1.add(r7)
            goto L3c
        L5c:
            boolean r10 = r6.isEmpty()
            r10 = r10 ^ r5
            if (r10 == 0) goto L90
            r9.f5953l = r5
            Q1.p r10 = r4.f5959b
            com.example.bulksmsscheduler.data.AppDatabase r10 = r10.f5312a
            Q1.e r10 = r10.q()
            r10.getClass()
            Q1.b r1 = new Q1.b
            r5 = 0
            r1.<init>(r10, r6, r5)
            java.lang.Object r10 = r10.f5277a
            r1.r r10 = (r1.r) r10
            java.lang.Object r10 = n2.AbstractC0949a.k(r10, r1, r9)
            if (r10 != r0) goto L81
            goto L82
        L81:
            r10 = r2
        L82:
            if (r10 != r0) goto L85
            return r0
        L85:
            Q1.p r10 = r4.f5959b
            r9.f5953l = r3
            java.lang.Object r10 = r10.f(r9)
            if (r10 != r0) goto L90
            return r0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.N.p(java.lang.Object):java.lang.Object");
    }
}
