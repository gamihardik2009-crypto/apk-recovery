package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class O implements r, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public final String f6853h;

    /* renamed from: i, reason: collision with root package name */
    public final N f6854i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6855j;

    public O(String str, N n3) {
        this.f6853h = str;
        this.f6854i = n3;
    }

    public final void a(C0472v c0472v, u1.e eVar) {
        z2.h.f(eVar, "registry");
        z2.h.f(c0472v, "lifecycle");
        if (!(!this.f6855j)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f6855j = true;
        c0472v.a(this);
        eVar.c(this.f6853h, this.f6854i.f6852e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        if (enumC0465n == EnumC0465n.ON_DESTROY) {
            this.f6855j = false;
            interfaceC0470t.e().f(this);
        }
    }
}
