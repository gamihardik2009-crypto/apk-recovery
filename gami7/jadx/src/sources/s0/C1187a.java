package s0;

import n1.E;
import n2.AbstractC0946A;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187a extends E {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1192f f10192a;

    @Override // n1.E
    public final boolean g(C1194h c1194h) {
        return c1194h == this.f10192a.getKey();
    }

    @Override // n1.E
    public final Object j(C1194h c1194h) {
        if (c1194h == this.f10192a.getKey()) {
            return this.f10192a.getValue();
        }
        AbstractC0946A.r("Check failed.");
        throw null;
    }
}
