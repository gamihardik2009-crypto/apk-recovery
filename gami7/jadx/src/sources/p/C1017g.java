package p;

import m.AbstractC0831e;
import m.C0848v;
import m.InterfaceC0840m;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017g implements InterfaceC1013e {

    /* renamed from: b, reason: collision with root package name */
    public final m.w0 f9598b = AbstractC0831e.n(125, 0, new C0848v(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // p.InterfaceC1013e
    public final float a(float f3, float f4, float f5) {
        float abs = Math.abs((f4 + f3) - f3);
        float f6 = (0.3f * f5) - (0.0f * abs);
        float f7 = f5 - f6;
        if ((abs <= f5) && f7 < abs) {
            f6 = f5 - abs;
        }
        return f3 - f6;
    }

    @Override // p.InterfaceC1013e
    public final InterfaceC0840m b() {
        return this.f9598b;
    }
}
