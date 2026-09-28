package R0;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class i extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5410l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f5412n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x xVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5412n = xVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((i) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        i iVar = new i(this.f5412n, interfaceC1073d);
        iVar.f5411m = obj;
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:5:0x0049). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r8.f5410l
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.f5411m
            J2.z r1 = (J2.InterfaceC0328z) r1
            C1.y.J(r9)
            goto L49
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            C1.y.J(r9)
            java.lang.Object r9 = r8.f5411m
            J2.z r9 = (J2.InterfaceC0328z) r9
            r1 = r9
        L21:
            boolean r9 = J2.B.o(r1)
            if (r9 == 0) goto L63
            R0.c r9 = R0.c.f5390k
            r8.f5411m = r1
            r8.f5410l = r2
            q2.i r3 = r8.f10205i
            z2.h.c(r3)
            u0.w0 r4 = u0.C1317w0.f11247h
            q2.g r4 = r3.s(r4)
            m.AbstractC0837j.c(r4)
            z2.h.c(r3)
            J.X r3 = J.C0257c.H(r3)
            java.lang.Object r9 = r3.d(r9, r8)
            if (r9 != r0) goto L49
            return r0
        L49:
            R0.x r9 = r8.f5412n
            int[] r3 = r9.f5455H
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f5458s
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L5f
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L5f:
            r9.j()
            goto L21
        L63:
            m2.v r9 = m2.C0880v.f8657a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.i.p(java.lang.Object):java.lang.Object");
    }
}
