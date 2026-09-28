package c0;

/* renamed from: c0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568H extends AbstractC0569I {

    /* renamed from: a, reason: collision with root package name */
    public final b0.e f7191a;

    /* renamed from: b, reason: collision with root package name */
    public final C0591j f7192b;

    public C0568H(b0.e eVar) {
        C0591j c0591j;
        this.f7191a = eVar;
        if (l0.c.G(eVar)) {
            c0591j = null;
        } else {
            c0591j = AbstractC0571K.h();
            InterfaceC0570J.b(c0591j, eVar);
        }
        this.f7192b = c0591j;
    }

    @Override // c0.AbstractC0569I
    public final b0.d a() {
        b0.e eVar = this.f7191a;
        return new b0.d(eVar.f7064a, eVar.f7065b, eVar.f7066c, eVar.f7067d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0568H) {
            return z2.h.a(this.f7191a, ((C0568H) obj).f7191a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7191a.hashCode();
    }
}
