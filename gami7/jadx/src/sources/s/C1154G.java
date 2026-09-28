package s;

import t0.i0;

/* renamed from: s.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154G extends V.n implements i0 {

    /* renamed from: u, reason: collision with root package name */
    public float f10054u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10055v;

    @Override // t0.i0
    public final Object i0(Object obj) {
        P p3 = obj instanceof P ? (P) obj : null;
        if (p3 == null) {
            p3 = new P();
        }
        p3.f10073a = this.f10054u;
        p3.f10074b = this.f10055v;
        return p3;
    }
}
