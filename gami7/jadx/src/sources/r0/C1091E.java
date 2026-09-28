package r0;

import t0.f0;
import u0.C1314v;

/* renamed from: r0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091E extends AbstractC1102P {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9823b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9824c;

    public /* synthetic */ C1091E(int i2, Object obj) {
        this.f9823b = i2;
        this.f9824c = obj;
    }

    @Override // r0.AbstractC1102P
    public final O0.k b() {
        switch (this.f9823b) {
            case 0:
                return ((t0.N) this.f9824c).getLayoutDirection();
            default:
                return ((C1314v) ((f0) this.f9824c)).getLayoutDirection();
        }
    }

    @Override // r0.AbstractC1102P
    public final int c() {
        switch (this.f9823b) {
            case 0:
                return ((t0.N) this.f9824c).i0();
            default:
                return ((C1314v) ((f0) this.f9824c)).getRoot().f10379D.f10480r.f9834h;
        }
    }
}
