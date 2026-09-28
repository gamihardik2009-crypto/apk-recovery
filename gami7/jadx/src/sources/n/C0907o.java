package n;

import J.C0283p;
import b0.AbstractC0503a;
import c0.AbstractC0569I;
import c0.AbstractC0571K;
import c0.AbstractC0598q;
import c0.C0566F;
import c0.C0567G;
import c0.C0568H;
import c0.C0603v;
import c0.InterfaceC0570J;
import c0.InterfaceC0576P;
import e0.InterfaceC0654d;
import t0.AbstractC1248f;
import t0.C1238G;
import t0.InterfaceC1257o;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907o extends V.n implements InterfaceC1257o, t0.b0 {

    /* renamed from: A, reason: collision with root package name */
    public AbstractC0569I f8814A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0576P f8815B;

    /* renamed from: u, reason: collision with root package name */
    public long f8816u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0598q f8817v;

    /* renamed from: w, reason: collision with root package name */
    public float f8818w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0576P f8819x;

    /* renamed from: y, reason: collision with root package name */
    public long f8820y;

    /* renamed from: z, reason: collision with root package name */
    public O0.k f8821z;

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        InterfaceC0570J interfaceC0570J;
        InterfaceC0570J interfaceC0570J2;
        if (this.f8819x == AbstractC0571K.f7193a) {
            if (!C0603v.c(this.f8816u, C0603v.f7277g)) {
                c1238g.w0(this.f8816u, 0L, (r17 & 4) != 0 ? InterfaceC0654d.v0(c1238g.e(), 0L) : 0L, 1.0f, e0.g.f7556a, null, (r17 & 64) != 0 ? 3 : 0);
            }
            AbstractC0598q abstractC0598q = this.f8817v;
            if (abstractC0598q != null) {
                InterfaceC0654d.O(c1238g, abstractC0598q, 0L, 0L, this.f8818w, null, 118);
            }
        } else {
            z2.s sVar = new z2.s();
            if (b0.f.a(c1238g.f10415h.e(), this.f8820y) && c1238g.getLayoutDirection() == this.f8821z && z2.h.a(this.f8815B, this.f8819x)) {
                AbstractC0569I abstractC0569I = this.f8814A;
                z2.h.c(abstractC0569I);
                sVar.f11909h = abstractC0569I;
            } else {
                AbstractC1248f.s(this, new C0283p(sVar, this, c1238g, 1));
            }
            this.f8814A = (AbstractC0569I) sVar.f11909h;
            this.f8820y = c1238g.f10415h.e();
            this.f8821z = c1238g.getLayoutDirection();
            this.f8815B = this.f8819x;
            Object obj = sVar.f11909h;
            z2.h.c(obj);
            AbstractC0569I abstractC0569I2 = (AbstractC0569I) obj;
            boolean c3 = C0603v.c(this.f8816u, C0603v.f7277g);
            e0.g gVar = e0.g.f7556a;
            if (!c3) {
                long j3 = this.f8816u;
                if (abstractC0569I2 instanceof C0567G) {
                    b0.d dVar = ((C0567G) abstractC0569I2).f7190a;
                    c1238g.w0(j3, K1.f.e(dVar.f7060a, dVar.f7061b), B1.C.i(dVar.d(), dVar.c()), 1.0f, gVar, null, 3);
                } else {
                    if (abstractC0569I2 instanceof C0568H) {
                        C0568H c0568h = (C0568H) abstractC0569I2;
                        interfaceC0570J2 = c0568h.f7192b;
                        if (interfaceC0570J2 == null) {
                            b0.e eVar = c0568h.f7191a;
                            float b3 = AbstractC0503a.b(eVar.f7071h);
                            c1238g.x0(j3, K1.f.e(eVar.f7064a, eVar.f7065b), B1.C.i(eVar.b(), eVar.a()), B2.a.d(b3, b3), gVar, 1.0f, null, 3);
                        }
                    } else {
                        if (!(abstractC0569I2 instanceof C0566F)) {
                            throw new J2.r();
                        }
                        interfaceC0570J2 = ((C0566F) abstractC0569I2).f7189a;
                    }
                    c1238g.X(interfaceC0570J2, j3, 1.0f, gVar, null, 3);
                }
            }
            AbstractC0598q abstractC0598q2 = this.f8817v;
            if (abstractC0598q2 != null) {
                float f3 = this.f8818w;
                if (abstractC0569I2 instanceof C0567G) {
                    b0.d dVar2 = ((C0567G) abstractC0569I2).f7190a;
                    c1238g.u(abstractC0598q2, K1.f.e(dVar2.f7060a, dVar2.f7061b), B1.C.i(dVar2.d(), dVar2.c()), f3, gVar, null, 3);
                } else {
                    if (abstractC0569I2 instanceof C0568H) {
                        C0568H c0568h2 = (C0568H) abstractC0569I2;
                        interfaceC0570J = c0568h2.f7192b;
                        if (interfaceC0570J == null) {
                            b0.e eVar2 = c0568h2.f7191a;
                            float b4 = AbstractC0503a.b(eVar2.f7071h);
                            c1238g.h0(abstractC0598q2, K1.f.e(eVar2.f7064a, eVar2.f7065b), B1.C.i(eVar2.b(), eVar2.a()), B2.a.d(b4, b4), f3, gVar, null, 3);
                        }
                    } else {
                        if (!(abstractC0569I2 instanceof C0566F)) {
                            throw new J2.r();
                        }
                        interfaceC0570J = ((C0566F) abstractC0569I2).f7189a;
                    }
                    c1238g.B(interfaceC0570J, abstractC0598q2, f3, gVar, null, 3);
                }
            }
        }
        c1238g.a();
    }

    @Override // t0.b0
    public final void s0() {
        this.f8820y = 9205357640488583168L;
        this.f8821z = null;
        this.f8814A = null;
        this.f8815B = null;
        AbstractC1248f.n(this);
    }
}
