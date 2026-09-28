package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class A0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public long f9357l;

    /* renamed from: m, reason: collision with root package name */
    public int f9358m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ long f9359n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0 f9360o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C0 c02, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9360o = c02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        long j3 = ((O0.o) obj).f5156a;
        A0 a02 = new A0(this.f9360o, (InterfaceC1073d) obj2);
        a02.f9359n = j3;
        return a02.p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        A0 a02 = new A0(this.f9360o, interfaceC1073d);
        a02.f9359n = ((O0.o) obj).f5156a;
        return a02;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r12) {
        /*
            r11 = this;
            r2.a r6 = r2.EnumC1145a.f10026h
            int r0 = r11.f9358m
            r1 = 3
            r2 = 2
            r3 = 1
            p.C0 r4 = r11.f9360o
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            long r0 = r11.f9357l
            long r2 = r11.f9359n
            C1.y.J(r12)
            r9 = r0
            r0 = r12
            goto L76
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            long r2 = r11.f9357l
            long r7 = r11.f9359n
            C1.y.J(r12)
            r0 = r12
            goto L5b
        L2c:
            long r7 = r11.f9359n
            C1.y.J(r12)
            r0 = r12
            goto L45
        L33:
            C1.y.J(r12)
            long r7 = r11.f9359n
            Q1.r r0 = r4.f9389f
            r11.f9359n = r7
            r11.f9358m = r3
            java.lang.Object r0 = r0.b(r7, r11)
            if (r0 != r6) goto L45
            return r6
        L45:
            O0.o r0 = (O0.o) r0
            long r9 = r0.f5156a
            long r9 = O0.o.d(r7, r9)
            r11.f9359n = r7
            r11.f9357l = r9
            r11.f9358m = r2
            java.lang.Object r0 = r4.b(r9, r11)
            if (r0 != r6) goto L5a
            return r6
        L5a:
            r2 = r9
        L5b:
            O0.o r0 = (O0.o) r0
            long r9 = r0.f5156a
            Q1.r r0 = r4.f9389f
            long r2 = O0.o.d(r2, r9)
            r11.f9359n = r7
            r11.f9357l = r9
            r11.f9358m = r1
            r1 = r2
            r3 = r9
            r5 = r11
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L75
            return r6
        L75:
            r2 = r7
        L76:
            O0.o r0 = (O0.o) r0
            long r0 = r0.f5156a
            long r0 = O0.o.d(r9, r0)
            long r0 = O0.o.d(r2, r0)
            O0.o r2 = new O0.o
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.A0.p(java.lang.Object):java.lang.Object");
    }
}
