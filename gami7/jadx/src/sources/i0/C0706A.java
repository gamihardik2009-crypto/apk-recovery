package i0;

import B.F;
import J.C0257c;
import J.C0268h0;
import J.C0274k0;
import J.W;
import c0.C0594m;
import e0.InterfaceC0654d;

/* renamed from: i0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706A {

    /* renamed from: a, reason: collision with root package name */
    public C0594m f7803a;

    /* renamed from: b, reason: collision with root package name */
    public float f7804b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public O0.k f7805c = O0.k.f5148h;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f7806d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f7807e;

    /* renamed from: f, reason: collision with root package name */
    public final C0730w f7808f;

    /* renamed from: g, reason: collision with root package name */
    public final C0268h0 f7809g;

    /* renamed from: h, reason: collision with root package name */
    public float f7810h;

    /* renamed from: i, reason: collision with root package name */
    public C0594m f7811i;

    /* renamed from: j, reason: collision with root package name */
    public int f7812j;

    public C0706A(C0709b c0709b) {
        b0.f fVar = new b0.f(0L);
        W w2 = W.f4109m;
        this.f7806d = C0257c.N(fVar, w2);
        this.f7807e = C0257c.N(Boolean.FALSE, w2);
        C0730w c0730w = new C0730w(c0709b);
        c0730w.f7941f = new B.y(24, this);
        this.f7808f = c0730w;
        this.f7809g = C0257c.M(0);
        this.f7810h = 1.0f;
        this.f7812j = -1;
    }

    public final void a(InterfaceC0654d interfaceC0654d, long j3, float f3, C0594m c0594m) {
        if (this.f7804b != f3) {
            this.f7810h = f3;
            this.f7804b = f3;
        }
        if (!z2.h.a(this.f7803a, c0594m)) {
            this.f7811i = c0594m;
            this.f7803a = c0594m;
        }
        O0.k layoutDirection = interfaceC0654d.getLayoutDirection();
        if (this.f7805c != layoutDirection) {
            this.f7805c = layoutDirection;
        }
        float d3 = b0.f.d(interfaceC0654d.e()) - b0.f.d(j3);
        float b3 = b0.f.b(interfaceC0654d.e()) - b0.f.b(j3);
        ((F) interfaceC0654d.e0().f4558a).x(0.0f, 0.0f, d3, b3);
        if (f3 > 0.0f) {
            try {
                if (b0.f.d(j3) > 0.0f && b0.f.b(j3) > 0.0f) {
                    C0594m c0594m2 = this.f7811i;
                    C0730w c0730w = this.f7808f;
                    if (c0594m2 == null) {
                        c0594m2 = (C0594m) c0730w.f7942g.getValue();
                    }
                    if (((Boolean) this.f7807e.getValue()).booleanValue() && interfaceC0654d.getLayoutDirection() == O0.k.f5149i) {
                        long x2 = interfaceC0654d.x();
                        K1.m e02 = interfaceC0654d.e0();
                        long j4 = e02.j();
                        e02.e().f();
                        try {
                            ((F) e02.f4558a).F(-1.0f, 1.0f, x2);
                            c0730w.e(interfaceC0654d, this.f7810h, c0594m2);
                            e02.e().b();
                            e02.r(j4);
                        } catch (Throwable th) {
                            e02.e().b();
                            e02.r(j4);
                            throw th;
                        }
                    } else {
                        c0730w.e(interfaceC0654d, this.f7810h, c0594m2);
                    }
                    this.f7812j = this.f7809g.g();
                }
            } finally {
                ((F) interfaceC0654d.e0().f4558a).x(-0.0f, -0.0f, -d3, -b3);
            }
        }
    }

    public final long b() {
        return ((b0.f) this.f7806d.getValue()).f7072a;
    }
}
