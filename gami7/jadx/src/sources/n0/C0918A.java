package n0;

import J2.C0311h;
import J2.InterfaceC0310g;
import n2.AbstractC0948C;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import t0.AbstractC1248f;
import u0.V0;

/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918A implements O0.b, InterfaceC1073d {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1073d f8901h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0921D f8902i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0310g f8903j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0931j f8904k = EnumC0931j.f8947i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0921D f8905l;

    public C0918A(C0921D c0921d, C0311h c0311h) {
        this.f8905l = c0921d;
        this.f8901h = c0311h;
        this.f8902i = c0921d;
    }

    @Override // O0.b
    public final long G(long j3) {
        return this.f8902i.G(j3);
    }

    @Override // O0.b
    public final long J(float f3) {
        return this.f8902i.J(f3);
    }

    @Override // O0.b
    public final long M(long j3) {
        return this.f8902i.M(j3);
    }

    @Override // O0.b
    public final float P(float f3) {
        return this.f8902i.c() * f3;
    }

    @Override // O0.b
    public final float Q(long j3) {
        return this.f8902i.Q(j3);
    }

    public final Object a(EnumC0931j enumC0931j, InterfaceC1073d interfaceC1073d) {
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        this.f8904k = enumC0931j;
        this.f8903j = c0311h;
        return c0311h.q();
    }

    @Override // O0.b
    public final float c() {
        return this.f8902i.c();
    }

    public final long d() {
        C0921D c0921d = this.f8905l;
        c0921d.getClass();
        long G3 = c0921d.G(AbstractC1248f.v(c0921d).f10404z.g());
        long j3 = c0921d.f8913D;
        return B1.C.i(Math.max(0.0f, b0.f.d(G3) - ((int) (j3 >> 32))) / 2.0f, Math.max(0.0f, b0.f.b(G3) - ((int) (j3 & 4294967295L))) / 2.0f);
    }

    public final V0 f() {
        C0921D c0921d = this.f8905l;
        c0921d.getClass();
        return AbstractC1248f.v(c0921d).f10404z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [J2.Z] */
    /* JADX WARN: Type inference failed for: r7v4, types: [J2.Z] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [y2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r7, y2.e r9, q2.InterfaceC1073d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof n0.x
            if (r0 == 0) goto L13
            r0 = r10
            n0.x r0 = (n0.x) r0
            int r1 = r0.f8990n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8990n = r1
            goto L18
        L13:
            n0.x r0 = new n0.x
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f8988l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8990n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            J2.p0 r7 = r0.f8987k
            C1.y.J(r10)     // Catch: java.lang.Throwable -> L29
            goto L69
        L29:
            r8 = move-exception
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            C1.y.J(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            J2.g r10 = r6.f8903j
            if (r10 == 0) goto L4c
            n0.k r2 = new n0.k
            r2.<init>(r7)
            m2.i r2 = C1.y.n(r2)
            r10.t(r2)
        L4c:
            n0.D r10 = r6.f8905l
            J2.z r10 = r10.y0()
            n0.y r2 = new n0.y
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            r8 = 0
            J2.p0 r7 = J2.B.r(r10, r4, r8, r2, r7)
            r0.f8987k = r7     // Catch: java.lang.Throwable -> L29
            r0.f8990n = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.j(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L69
            return r1
        L69:
            n0.b r8 = n0.C0923b.f8921h
            r7.a(r8)
            return r10
        L6f:
            n0.b r9 = n0.C0923b.f8921h
            r7.a(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0918A.g(long, y2.e, q2.d):java.lang.Object");
    }

    @Override // O0.b
    public final long g0(float f3) {
        return this.f8902i.g0(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r5, p.E0 r7, q2.InterfaceC1073d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof n0.z
            if (r0 == 0) goto L13
            r0 = r8
            n0.z r0 = (n0.z) r0
            int r1 = r0.f8996m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8996m = r1
            goto L18
        L13:
            n0.z r0 = new n0.z
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f8994k
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8996m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            C1.y.J(r8)     // Catch: n0.C0932k -> L3b
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            C1.y.J(r8)
            r0.f8996m = r3     // Catch: n0.C0932k -> L3b
            java.lang.Object r8 = r4.g(r5, r7, r0)     // Catch: n0.C0932k -> L3b
            if (r8 != r1) goto L3c
            return r1
        L3b:
            r8 = 0
        L3c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0918A.h(long, p.E0, q2.d):java.lang.Object");
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f8902i.l(f3);
    }

    @Override // O0.b
    public final int m0(long j3) {
        return this.f8902i.m0(j3);
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return C1079j.f9784h;
    }

    @Override // O0.b
    public final float o0(int i2) {
        return this.f8902i.o0(i2);
    }

    @Override // O0.b
    public final float p0(long j3) {
        return this.f8902i.p0(j3);
    }

    @Override // O0.b
    public final float r0(float f3) {
        return f3 / this.f8902i.c();
    }

    @Override // O0.b
    public final float s() {
        return this.f8902i.s();
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        C0921D c0921d = this.f8905l;
        synchronized (c0921d.f8910A) {
            c0921d.f8910A.m(this);
        }
        this.f8901h.t(obj);
    }
}
