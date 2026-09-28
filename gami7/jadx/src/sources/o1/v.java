package o1;

import J2.InterfaceC0328z;
import m.W;
import m.p0;
import m2.C0880v;
import n1.C0945f;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class v extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9294l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W f9296n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0945f f9297o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f9298p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(W w2, C0945f c0945f, p0 p0Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9296n = w2;
        this.f9297o = c0945f;
        this.f9298p = p0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((v) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        v vVar = new v(this.f9296n, this.f9297o, this.f9298p, interfaceC1073d);
        vVar.f9295m = obj;
        return vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r15 == r0) goto L17;
     */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r15) {
        /*
            r14 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r14.f9294l
            m2.v r2 = m2.C0880v.f8657a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L17:
            C1.y.J(r15)
            goto L8a
        L1c:
            C1.y.J(r15)
            java.lang.Object r15 = r14.f9295m
            J2.z r15 = (J2.InterfaceC0328z) r15
            m.W r1 = r14.f9296n
            J.k0 r5 = r1.f8373j
            java.lang.Object r5 = r5.getValue()
            n1.f r6 = r14.f9297o
            boolean r5 = z2.h.a(r5, r6)
            if (r5 != 0) goto L51
            r14.f9294l = r4
            m.p0 r9 = r1.f8375l
            if (r9 != 0) goto L3b
        L39:
            r15 = r2
            goto L4e
        L3b:
            m.N r15 = new m.N
            n1.f r6 = r14.f9297o
            r7 = 0
            r10 = 0
            r5 = r15
            r8 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            m.J r1 = r1.f8380r
            java.lang.Object r15 = m.J.a(r1, r15, r14)
            if (r15 != r0) goto L39
        L4e:
            if (r15 != r0) goto L8a
            return r0
        L51:
            m.p0 r4 = r14.f9298p
            J.F r4 = r4.f8559m
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r7 = 1000000(0xf4240, float:1.401298E-39)
            long r7 = (long) r7
            long r4 = r4 / r7
            J.g0 r7 = r1.f8378o
            float r8 = r7.g()
            float r7 = r7.g()
            float r4 = (float) r4
            float r7 = r7 * r4
            int r4 = (int) r7
            r5 = 6
            r7 = 0
            r9 = 0
            m.w0 r10 = m.AbstractC0831e.n(r4, r9, r7, r5)
            H.F0 r11 = new H.F0
            r4 = 3
            r11.<init>(r15, r1, r6, r4)
            r14.f9294l = r3
            r9 = 0
            r13 = 4
            r12 = r14
            java.lang.Object r15 = m.AbstractC0831e.d(r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L8a
            return r0
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.v.p(java.lang.Object):java.lang.Object");
    }
}
