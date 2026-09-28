package W2;

import D.c0;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import p1.C1058a;

/* renamed from: W2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414o implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6152b;

    public C0414o() {
        this.f6151a = 1;
        this.f6152b = B2.a.x(EnumC0863e.f8643h, new c0(this));
    }

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        switch (this.f6151a) {
            case 0:
                z2.h.f(c1058a, "encoder");
                throw new IllegalStateException("unsupported".toString());
            default:
                z2.h.f(c1058a, "encoder");
                z2.h.f(obj, "value");
                z2.h.f(b(), "descriptor");
                z2.h.f(b(), "descriptor");
                return;
        }
    }

    @Override // T2.a
    public final U2.f b() {
        switch (this.f6151a) {
            case 0:
                throw new IllegalStateException("unsupported".toString());
            default:
                return (U2.f) ((InterfaceC0862d) this.f6152b).getValue();
        }
    }

    public C0414o(T2.a aVar) {
        this.f6151a = 0;
        this.f6152b = aVar;
    }
}
