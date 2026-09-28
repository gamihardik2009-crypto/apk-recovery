package p;

import m0.InterfaceC0853a;

/* renamed from: p.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028l0 implements InterfaceC0853a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f9636h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f9637i;

    public C1028l0(String str, boolean z3) {
        this.f9636h = z3;
        this.f9637i = str;
    }

    @Override // m0.InterfaceC0853a
    public long K(long j3, long j4, int i2) {
        if (!this.f9636h) {
            return 0L;
        }
        C0 c02 = (C0) this.f9637i;
        if (c02.f9384a.d()) {
            return 0L;
        }
        return c02.g(c02.c(c02.f9384a.b(c02.c(c02.f(j4)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // m0.InterfaceC0853a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(long r3, long r5, q2.InterfaceC1073d r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof p.C1026k0
            if (r3 == 0) goto L13
            r3 = r7
            p.k0 r3 = (p.C1026k0) r3
            int r4 = r3.f9625n
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f9625n = r4
            goto L18
        L13:
            p.k0 r3 = new p.k0
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f9623l
            r2.a r7 = r2.EnumC1145a.f10026h
            int r0 = r3.f9625n
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f9622k
            C1.y.J(r4)
            goto L47
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            C1.y.J(r4)
            boolean r4 = r2.f9636h
            if (r4 == 0) goto L50
            r3.f9622k = r5
            r3.f9625n = r1
            java.lang.Object r4 = r2.f9637i
            p.C0 r4 = (p.C0) r4
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            O0.o r4 = (O0.o) r4
            long r3 = r4.f5156a
            long r3 = O0.o.d(r5, r3)
            goto L52
        L50:
            r3 = 0
        L52:
            O0.o r5 = new O0.o
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1028l0.L(long, long, q2.d):java.lang.Object");
    }

    public C1028l0(C0 c02, boolean z3) {
        this.f9637i = c02;
        this.f9636h = z3;
    }
}
