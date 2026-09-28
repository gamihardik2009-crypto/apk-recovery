package p;

import m2.C0880v;
import n0.C0919B;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import t0.AbstractC1248f;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1047v0 f9384a;

    /* renamed from: b, reason: collision with root package name */
    public n.j0 f9385b;

    /* renamed from: c, reason: collision with root package name */
    public U f9386c;

    /* renamed from: d, reason: collision with root package name */
    public X f9387d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9388e;

    /* renamed from: f, reason: collision with root package name */
    public Q1.r f9389f;

    /* renamed from: g, reason: collision with root package name */
    public int f9390g = 1;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1012d0 f9391h = androidx.compose.foundation.gestures.a.f6606a;

    /* renamed from: i, reason: collision with root package name */
    public final C1055z0 f9392i = new C1055z0(this);

    /* renamed from: j, reason: collision with root package name */
    public final C0919B f9393j = new C0919B(8, this);

    public C0(InterfaceC1047v0 interfaceC1047v0, n.j0 j0Var, U u3, X x2, boolean z3, Q1.r rVar) {
        this.f9384a = interfaceC1047v0;
        this.f9385b = j0Var;
        this.f9386c = u3;
        this.f9387d = x2;
        this.f9388e = z3;
        this.f9389f = rVar;
    }

    public static final long a(C0 c02, InterfaceC1012d0 interfaceC1012d0, long j3, int i2) {
        long j4;
        m0.f fVar = (m0.f) c02.f9389f.f5322b;
        m0.f fVar2 = null;
        m0.f fVar3 = (fVar == null || !fVar.f5869t) ? null : (m0.f) AbstractC1248f.k(fVar);
        long j5 = 0;
        long r3 = fVar3 != null ? fVar3.r(j3, i2) : 0L;
        long g3 = b0.c.g(j3, r3);
        long d3 = c02.d(c02.g(interfaceC1012d0.a(c02.f(c02.d(b0.c.a(g3, 0.0f, c02.f9387d == X.f9519i ? 1 : 2))))));
        long g4 = b0.c.g(g3, d3);
        m0.f fVar4 = (m0.f) c02.f9389f.f5322b;
        if (fVar4 != null && fVar4.f5869t) {
            fVar2 = (m0.f) AbstractC1248f.k(fVar4);
        }
        m0.f fVar5 = fVar2;
        if (fVar5 != null) {
            j4 = d3;
            j5 = fVar5.K(d3, g4, i2);
        } else {
            j4 = d3;
        }
        return b0.c.h(b0.c.h(r3, j4), j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r12, q2.InterfaceC1073d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.C1049w0
            if (r0 == 0) goto L13
            r0 = r14
            p.w0 r0 = (p.C1049w0) r0
            int r1 = r0.f9700n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9700n = r1
            goto L18
        L13:
            p.w0 r0 = new p.w0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f9698l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9700n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z2.r r12 = r0.f9697k
            C1.y.J(r14)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            C1.y.J(r14)
            z2.r r14 = new z2.r
            r14.<init>()
            r14.f11908h = r12
            n.c0 r2 = n.c0.f8753h
            p.y0 r10 = new p.y0
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f9697k = r14
            r0.f9700n = r3
            java.lang.Object r12 = r11.e(r2, r10, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            r12 = r14
        L53:
            long r12 = r12.f11908h
            O0.o r14 = new O0.o
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0.b(long, q2.d):java.lang.Object");
    }

    public final float c(float f3) {
        return this.f9388e ? f3 * (-1) : f3;
    }

    public final long d(long j3) {
        return this.f9388e ? b0.c.i(-1.0f, j3) : j3;
    }

    public final Object e(n.c0 c0Var, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        Object e3 = this.f9384a.e(c0Var, new B0(this, null, eVar), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    public final float f(long j3) {
        return this.f9387d == X.f9519i ? b0.c.d(j3) : b0.c.e(j3);
    }

    public final long g(float f3) {
        if (f3 == 0.0f) {
            return 0L;
        }
        return this.f9387d == X.f9519i ? K1.f.e(f3, 0.0f) : K1.f.e(0.0f, f3);
    }
}
