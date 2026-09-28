package D;

import a.AbstractC0423a;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044m implements R0.A {

    /* renamed from: a, reason: collision with root package name */
    public final V.c f868a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0045n f869b;

    /* renamed from: c, reason: collision with root package name */
    public long f870c = 0;

    public C0044m(V.c cVar, InterfaceC0045n interfaceC0045n) {
        this.f868a = cVar;
        this.f869b = interfaceC0045n;
    }

    @Override // R0.A
    public final long a(O0.i iVar, long j3, O0.k kVar, long j4) {
        long a3 = this.f869b.a();
        if (!K1.f.F(a3)) {
            a3 = this.f870c;
        }
        this.f870c = a3;
        return O0.h.c(O0.h.c(AbstractC0423a.m(iVar.f5143a, iVar.f5144b), AbstractC0423a.Z(a3)), this.f868a.a(j4, 0L, kVar));
    }
}
