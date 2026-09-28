package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: p.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032n0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1045u0 f9650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9651n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1032n0(C1045u0 c1045u0, long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9650m = c1045u0;
        this.f9651n = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1032n0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1032n0(this.f9650m, this.f9651n, interfaceC1073d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r9 == r0) goto L24;
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
            int r1 = r8.f9649l
            m2.v r2 = m2.C0880v.f8657a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            C1.y.J(r9)
            goto L68
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            C1.y.J(r9)
            p.u0 r9 = r8.f9650m
            p.C0 r9 = r9.f9690J
            r8.f9649l = r3
            p.X r1 = r9.f9387d
            p.X r4 = p.X.f9519i
            r5 = 0
            long r6 = r8.f9651n
            if (r1 != r4) goto L2e
            long r3 = O0.o.a(r5, r5, r3, r6)
            goto L33
        L2e:
            r1 = 2
            long r3 = O0.o.a(r5, r5, r1, r6)
        L33:
            p.A0 r1 = new p.A0
            r5 = 0
            r1.<init>(r9, r5)
            n.j0 r5 = r9.f9385b
            if (r5 == 0) goto L56
            p.v0 r6 = r9.f9384a
            boolean r6 = r6.a()
            if (r6 != 0) goto L4d
            p.v0 r9 = r9.f9384a
            boolean r9 = r9.c()
            if (r9 == 0) goto L56
        L4d:
            java.lang.Object r9 = r5.f(r3, r1, r8)
            if (r9 != r0) goto L54
            goto L65
        L54:
            r9 = r2
            goto L65
        L56:
            p.A0 r9 = new p.A0
            p.C0 r1 = r1.f9360o
            r9.<init>(r1, r8)
            r9.f9359n = r3
            java.lang.Object r9 = r9.p(r2)
            if (r9 != r0) goto L54
        L65:
            if (r9 != r0) goto L68
            return r0
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1032n0.p(java.lang.Object):java.lang.Object");
    }
}
