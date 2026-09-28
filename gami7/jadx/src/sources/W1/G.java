package W1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class G extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f5925m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5926n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5927o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5928p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p3, String str, String str2, String str3, boolean z3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5925m = p3;
        this.f5926n = str;
        this.f5927o = str2;
        this.f5928p = str3;
        this.q = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((G) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new G(this.f5925m, this.f5926n, this.f5927o, this.f5928p, this.q, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0090 A[RETURN] */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f5924l
            m2.v r3 = m2.C0880v.f8657a
            r4 = 3
            r5 = 2
            W1.P r6 = r0.f5925m
            r7 = 1
            if (r2 == 0) goto L2c
            if (r2 == r7) goto L26
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1a
            C1.y.J(r18)
            goto L90
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            C1.y.J(r18)
            goto L84
        L26:
            C1.y.J(r18)
            r2 = r18
            goto L3a
        L2c:
            C1.y.J(r18)
            Q1.p r2 = r6.f5959b
            r0.f5924l = r7
            java.lang.Object r2 = r2.b(r0)
            if (r2 != r1) goto L3a
            return r1
        L3a:
            java.lang.Number r2 = (java.lang.Number) r2
            int r12 = r2.intValue()
            Q1.p r2 = r6.f5959b
            R1.b r15 = new R1.b
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r8 = r7.toString()
            java.lang.String r7 = "toString(...)"
            z2.h.e(r8, r7)
            boolean r13 = r0.q
            java.lang.String r14 = "MANUAL"
            java.lang.String r9 = r0.f5926n
            java.lang.String r10 = r0.f5927o
            java.lang.String r11 = r0.f5928p
            r16 = 16
            r7 = r15
            r4 = r15
            r15 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f5924l = r5
            com.example.bulksmsscheduler.data.AppDatabase r2 = r2.f5312a
            Q1.e r2 = r2.q()
            r2.getClass()
            Q1.c r5 = new Q1.c
            r7 = 0
            r5.<init>(r2, r4, r7)
            java.lang.Object r2 = r2.f5277a
            r1.r r2 = (r1.r) r2
            java.lang.Object r2 = n2.AbstractC0949a.k(r2, r5, r0)
            if (r2 != r1) goto L80
            goto L81
        L80:
            r2 = r3
        L81:
            if (r2 != r1) goto L84
            return r1
        L84:
            Q1.p r2 = r6.f5959b
            r4 = 3
            r0.f5924l = r4
            java.lang.Object r2 = r2.f(r0)
            if (r2 != r1) goto L90
            return r1
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.G.p(java.lang.Object):java.lang.Object");
    }
}
