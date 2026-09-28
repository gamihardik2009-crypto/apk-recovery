package M2;

import N2.AbstractC0368g;
import q2.InterfaceC1078i;

/* renamed from: M2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339c extends AbstractC0368g {

    /* renamed from: k, reason: collision with root package name */
    public final y2.e f4862k;

    /* renamed from: l, reason: collision with root package name */
    public final y2.e f4863l;

    public C0339c(y2.e eVar, InterfaceC1078i interfaceC1078i, int i2, int i3) {
        super(interfaceC1078i, i2, i3);
        this.f4862k = eVar;
        this.f4863l = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // N2.AbstractC0368g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(L2.u r6, q2.InterfaceC1073d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof M2.C0338b
            if (r0 == 0) goto L13
            r0 = r7
            M2.b r0 = (M2.C0338b) r0
            int r1 = r0.f4861n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4861n = r1
            goto L18
        L13:
            M2.b r0 = new M2.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f4859l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4861n
            m2.v r3 = m2.C0880v.f8657a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            L2.u r6 = r0.f4858k
            C1.y.J(r7)
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            C1.y.J(r7)
            r0.f4858k = r6
            r0.f4861n = r4
            y2.e r7 = r5.f4862k
            java.lang.Object r7 = r7.j(r6, r0)
            if (r7 != r1) goto L43
            goto L44
        L43:
            r7 = r3
        L44:
            if (r7 != r1) goto L47
            return r1
        L47:
            L2.t r6 = (L2.t) r6
            L2.k r6 = r6.f4746k
            boolean r6 = r6.w()
            if (r6 == 0) goto L52
            return r3
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.C0339c.f(L2.u, q2.d):java.lang.Object");
    }

    @Override // N2.AbstractC0368g
    public final AbstractC0368g g(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return new C0339c(this.f4863l, interfaceC1078i, i2, i3);
    }

    @Override // N2.AbstractC0368g
    public final String toString() {
        return "block[" + this.f4862k + "] -> " + super.toString();
    }
}
