package z;

import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class X extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public n0.r f11578j;

    /* renamed from: k, reason: collision with root package name */
    public int f11579k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f11581m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(a0 a0Var, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f11581m = a0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((X) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        X x2 = new X(this.f11581m, interfaceC1073d);
        x2.f11580l = obj;
        return x2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r13) {
        /*
            r12 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r12.f11579k
            r2 = 1
            r3 = 2
            z.a0 r4 = r12.f11581m
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            n0.r r1 = r12.f11578j
            java.lang.Object r2 = r12.f11580l
            n0.A r2 = (n0.C0918A) r2
            C1.y.J(r13)
            goto L53
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f11580l
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r13)
            goto L3b
        L28:
            C1.y.J(r13)
            java.lang.Object r13 = r12.f11580l
            r1 = r13
            n0.A r1 = (n0.C0918A) r1
            r12.f11580l = r1
            r12.f11579k = r2
            java.lang.Object r13 = p.b1.c(r1, r12, r3)
            if (r13 != r0) goto L3b
            return r0
        L3b:
            n0.r r13 = (n0.r) r13
            long r5 = r13.f8959c
            r4.e()
            r2 = r1
            r1 = r13
        L44:
            r12.f11580l = r2
            r12.f11578j = r1
            r12.f11579k = r3
            n0.j r13 = n0.EnumC0931j.f8947i
            java.lang.Object r13 = r2.a(r13, r12)
            if (r13 != r0) goto L53
            return r0
        L53:
            n0.i r13 = (n0.C0930i) r13
            java.util.List r13 = r13.f8943a
            int r5 = r13.size()
            r6 = 0
        L5c:
            if (r6 >= r5) goto L76
            java.lang.Object r7 = r13.get(r6)
            n0.r r7 = (n0.r) r7
            long r8 = r7.f8957a
            long r10 = r1.f8957a
            boolean r8 = n0.q.a(r8, r10)
            if (r8 == 0) goto L73
            boolean r7 = r7.f8960d
            if (r7 == 0) goto L73
            goto L44
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r4.b()
            m2.v r13 = m2.C0880v.f8657a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.X.p(java.lang.Object):java.lang.Object");
    }
}
