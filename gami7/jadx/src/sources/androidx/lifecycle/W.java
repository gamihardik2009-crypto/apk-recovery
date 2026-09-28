package androidx.lifecycle;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final C0472v f6872h;

    /* renamed from: i, reason: collision with root package name */
    public final EnumC0465n f6873i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6874j;

    public W(C0472v c0472v, EnumC0465n enumC0465n) {
        z2.h.f(c0472v, "registry");
        z2.h.f(enumC0465n, "event");
        this.f6872h = c0472v;
        this.f6873i = enumC0465n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6874j) {
            return;
        }
        this.f6872h.d(this.f6873i);
        this.f6874j = true;
    }
}
