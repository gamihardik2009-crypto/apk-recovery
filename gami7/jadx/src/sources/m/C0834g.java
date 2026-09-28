package m;

import J.W0;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834g extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public L2.a f8461l;

    /* renamed from: m, reason: collision with root package name */
    public int f8462m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8463n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ L2.k f8464o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0829d f8465p;
    public final /* synthetic */ W0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W0 f8466r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0834g(L2.k kVar, C0829d c0829d, W0 w02, W0 w03, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8464o = kVar;
        this.f8465p = c0829d;
        this.q = w02;
        this.f8466r = w03;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0834g) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0834g c0834g = new C0834g(this.f8464o, this.f8465p, this.q, this.f8466r, interfaceC1073d);
        c0834g.f8463n = obj;
        return c0834g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r15) {
        /*
            r14 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r14.f8462m
            L2.k r2 = r14.f8464o
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            L2.a r1 = r14.f8461l
            java.lang.Object r4 = r14.f8463n
            J2.z r4 = (J2.InterfaceC0328z) r4
            C1.y.J(r15)
            goto L36
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            C1.y.J(r15)
            java.lang.Object r15 = r14.f8463n
            J2.z r15 = (J2.InterfaceC0328z) r15
            L2.a r1 = r2.iterator()
            r4 = r15
        L29:
            r14.f8463n = r4
            r14.f8461l = r1
            r14.f8462m = r3
            java.lang.Object r15 = r1.b(r14)
            if (r15 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L65
            java.lang.Object r15 = r1.c()
            java.lang.Object r5 = r2.m()
            boolean r6 = r5 instanceof L2.m
            r7 = 0
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r5 != 0) goto L51
            r9 = r15
            goto L52
        L51:
            r9 = r5
        L52:
            m.f r15 = new m.f
            m.d r10 = r14.f8465p
            J.W0 r11 = r14.q
            J.W0 r12 = r14.f8466r
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r5 = 3
            r6 = 0
            J2.B.r(r4, r7, r6, r15, r5)
            goto L29
        L65:
            m2.v r15 = m2.C0880v.f8657a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0834g.p(java.lang.Object):java.lang.Object");
    }
}
