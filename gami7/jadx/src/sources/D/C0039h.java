package D;

import c0.C0588g;
import c0.C0594m;
import e0.C0652b;
import m2.C0880v;
import t0.C1238G;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039h extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f853i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f854j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0588g f855k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0594m f856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039h(y2.a aVar, boolean z3, C0588g c0588g, C0594m c0594m) {
        super(1);
        this.f853i = aVar;
        this.f854j = z3;
        this.f855k = c0588g;
        this.f856l = c0594m;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C1238G c1238g = (C1238G) obj;
        c1238g.a();
        if (((Boolean) this.f853i.c()).booleanValue()) {
            boolean z3 = this.f854j;
            C0594m c0594m = this.f856l;
            C0588g c0588g = this.f855k;
            if (z3) {
                C0652b c0652b = c1238g.f10415h;
                long x2 = c0652b.x();
                K1.m mVar = c0652b.f7552i;
                long j3 = mVar.j();
                mVar.e().f();
                try {
                    ((B.F) mVar.f4558a).F(-1.0f, 1.0f, x2);
                    c1238g.c0(c0588g, 0L, 1.0f, e0.g.f7556a, c0594m, 3);
                } finally {
                    mVar.e().b();
                    mVar.r(j3);
                }
            } else {
                c1238g.c0(c0588g, 0L, 1.0f, e0.g.f7556a, c0594m, 3);
            }
        }
        return C0880v.f8657a;
    }
}
