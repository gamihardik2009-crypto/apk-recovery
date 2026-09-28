package n;

import a.AbstractC0423a;
import b0.AbstractC0503a;
import c0.AbstractC0598q;
import e0.C0652b;
import e0.InterfaceC0654d;
import m2.C0880v;
import t0.C1238G;

/* loaded from: classes.dex */
public final class r extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8834i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0598q f8835j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f8836k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f8837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f8838m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8839n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f8840o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0.h f8841p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z3, AbstractC0598q abstractC0598q, long j3, float f3, float f4, long j4, long j5, e0.h hVar) {
        super(1);
        this.f8834i = z3;
        this.f8835j = abstractC0598q;
        this.f8836k = j3;
        this.f8837l = f3;
        this.f8838m = f4;
        this.f8839n = j4;
        this.f8840o = j5;
        this.f8841p = hVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C1238G c1238g = (C1238G) obj;
        c1238g.a();
        if (this.f8834i) {
            InterfaceC0654d.A(c1238g, this.f8835j, 0L, 0L, this.f8836k, null, 246);
        } else {
            long j3 = this.f8836k;
            float b3 = AbstractC0503a.b(j3);
            float f3 = this.f8837l;
            if (b3 < f3) {
                float f4 = this.f8838m;
                C0652b c0652b = c1238g.f10415h;
                float d3 = b0.f.d(c0652b.e());
                float f5 = this.f8838m;
                float f6 = d3 - f5;
                float b4 = b0.f.b(c0652b.e()) - f5;
                AbstractC0598q abstractC0598q = this.f8835j;
                long j4 = this.f8836k;
                K1.m mVar = c0652b.f7552i;
                long j5 = mVar.j();
                mVar.e().f();
                try {
                    ((K1.m) ((B.F) mVar.f4558a).f165i).e().p(f4, f4, f6, b4, 0);
                    InterfaceC0654d.A(c1238g, abstractC0598q, 0L, 0L, j4, null, 246);
                } finally {
                    mVar.e().b();
                    mVar.r(j5);
                }
            } else {
                InterfaceC0654d.A(c1238g, this.f8835j, this.f8839n, this.f8840o, AbstractC0423a.a0(f3, j3), this.f8841p, 208);
            }
        }
        return C0880v.f8657a;
    }
}
