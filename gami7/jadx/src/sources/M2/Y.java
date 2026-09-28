package M2;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class Y extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public int f4847l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ InterfaceC0344h f4848m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f4849n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a0 f4850o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, InterfaceC1073d interfaceC1073d) {
        super(3, interfaceC1073d);
        this.f4850o = a0Var;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        Y y3 = new Y(this.f4850o, (InterfaceC1073d) obj3);
        y3.f4848m = (InterfaceC0344h) obj;
        y3.f4849n = intValue;
        return y3.p(C0880v.f8657a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r11) {
        /*
            r10 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r10.f4847l
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            M2.a0 r7 = r10.f4850o
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            M2.h r1 = r10.f4848m
            C1.y.J(r11)
            goto L79
        L26:
            M2.h r1 = r10.f4848m
            C1.y.J(r11)
            goto L6c
        L2c:
            M2.h r1 = r10.f4848m
            C1.y.J(r11)
            goto L57
        L32:
            C1.y.J(r11)
            goto L87
        L36:
            C1.y.J(r11)
            M2.h r1 = r10.f4848m
            int r11 = r10.f4849n
            if (r11 <= 0) goto L4a
            M2.S r11 = M2.S.f4834h
            r10.f4847l = r6
            java.lang.Object r11 = r1.f(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L4a:
            long r8 = r7.f4856a
            r10.f4848m = r1
            r10.f4847l = r5
            java.lang.Object r11 = J2.B.f(r8, r10)
            if (r11 != r0) goto L57
            return r0
        L57:
            long r5 = r7.f4857b
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L79
            M2.S r11 = M2.S.f4835i
            r10.f4848m = r1
            r10.f4847l = r4
            java.lang.Object r11 = r1.f(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            long r4 = r7.f4857b
            r10.f4848m = r1
            r10.f4847l = r3
            java.lang.Object r11 = J2.B.f(r4, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            M2.S r11 = M2.S.f4836j
            r3 = 0
            r10.f4848m = r3
            r10.f4847l = r2
            java.lang.Object r11 = r1.f(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L87:
            m2.v r11 = m2.C0880v.f8657a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.Y.p(java.lang.Object):java.lang.Object");
    }
}
