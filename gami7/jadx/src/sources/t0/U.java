package t0;

import J.C0292u;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public V.n f10508a;

    /* renamed from: b, reason: collision with root package name */
    public int f10509b;

    /* renamed from: c, reason: collision with root package name */
    public L.d f10510c;

    /* renamed from: d, reason: collision with root package name */
    public L.d f10511d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0292u f10513f;

    public U(C0292u c0292u, V.n nVar, int i2, L.d dVar, L.d dVar2, boolean z3) {
        this.f10513f = c0292u;
        this.f10508a = nVar;
        this.f10509b = i2;
        this.f10510c = dVar;
        this.f10511d = dVar2;
        this.f10512e = z3;
    }

    public final boolean a(int i2, int i3) {
        L.d dVar = this.f10510c;
        int i4 = this.f10509b;
        V.m mVar = (V.m) dVar.f4618h[i2 + i4];
        V.m mVar2 = (V.m) this.f10511d.f4618h[i4 + i3];
        V v3 = W.f10514a;
        return z2.h.a(mVar, mVar2) || V.a.a(mVar, mVar2);
    }
}
