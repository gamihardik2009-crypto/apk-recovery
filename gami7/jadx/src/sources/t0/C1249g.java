package t0;

import a0.InterfaceC0433j;
import n2.AbstractC0946A;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249g implements InterfaceC0433j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1249g f10578a = new C1249g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f10579b;

    @Override // a0.InterfaceC0433j
    public final boolean a() {
        Boolean bool = f10579b;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC0946A.s("canFocus is read before it is written");
        throw null;
    }

    @Override // a0.InterfaceC0433j
    public final void b(boolean z3) {
        f10579b = Boolean.valueOf(z3);
    }
}
