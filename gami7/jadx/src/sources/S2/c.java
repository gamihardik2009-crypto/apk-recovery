package S2;

import J2.AbstractC0324v;
import J2.C0311h;
import J2.InterfaceC0310g;
import J2.w0;
import O2.t;
import O2.v;
import m2.C0880v;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class c implements InterfaceC0310g, w0 {

    /* renamed from: h, reason: collision with root package name */
    public final C0311h f5625h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f5627j;

    public c(d dVar, C0311h c0311h, Object obj) {
        this.f5627j = dVar;
        this.f5625h = c0311h;
        this.f5626i = obj;
    }

    @Override // J2.InterfaceC0310g
    public final void D(AbstractC0324v abstractC0324v) {
        this.f5625h.D(abstractC0324v);
    }

    @Override // J2.InterfaceC0310g
    public final void E(Object obj) {
        this.f5625h.E(obj);
    }

    @Override // J2.InterfaceC0310g
    public final boolean H(Throwable th) {
        return this.f5625h.H(th);
    }

    @Override // J2.w0
    public final void a(t tVar, int i2) {
        this.f5625h.a(tVar, i2);
    }

    @Override // J2.InterfaceC0310g
    public final boolean b() {
        return this.f5625h.b();
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return this.f5625h.f4403l;
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        this.f5625h.t(obj);
    }

    @Override // J2.InterfaceC0310g
    public final v z(Object obj, y2.c cVar) {
        d dVar = this.f5627j;
        b bVar = new b(dVar, this, 1);
        v z3 = this.f5625h.z((C0880v) obj, bVar);
        if (z3 != null) {
            d.f5628h.set(dVar, this.f5626i);
        }
        return z3;
    }
}
