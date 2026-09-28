package androidx.lifecycle;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0466o f6905a;

    /* renamed from: b, reason: collision with root package name */
    public r f6906b;

    public final void a(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        EnumC0466o a3 = enumC0465n.a();
        EnumC0466o enumC0466o = this.f6905a;
        z2.h.f(enumC0466o, "state1");
        if (a3.compareTo(enumC0466o) < 0) {
            enumC0466o = a3;
        }
        this.f6905a = enumC0466o;
        this.f6906b.d(interfaceC0470t, enumC0465n);
        this.f6905a = a3;
    }
}
