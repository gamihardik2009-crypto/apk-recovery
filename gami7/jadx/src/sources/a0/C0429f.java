package a0;

import j.AbstractC0740F;
import j.C0736B;
import u0.C1299n;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429f {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f6456a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f6457b;

    /* renamed from: c, reason: collision with root package name */
    public final C0736B f6458c;

    /* renamed from: d, reason: collision with root package name */
    public final C0736B f6459d;

    /* renamed from: e, reason: collision with root package name */
    public final C0736B f6460e;

    /* renamed from: f, reason: collision with root package name */
    public final C0736B f6461f;

    public C0429f(C1299n c1299n, C0428e c0428e) {
        this.f6456a = c1299n;
        this.f6457b = c0428e;
        int i2 = AbstractC0740F.f7972a;
        this.f6458c = new C0736B();
        this.f6459d = new C0736B();
        this.f6460e = new C0736B();
        this.f6461f = new C0736B();
    }

    public final boolean a() {
        return this.f6458c.h() || this.f6460e.h() || this.f6459d.h();
    }

    public final void b(C0736B c0736b, Object obj) {
        if (c0736b.a(obj) && this.f6458c.f7967d + this.f6459d.f7967d + this.f6460e.f7967d == 1) {
            this.f6456a.l(new C0428e(0, this, C0429f.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
        }
    }
}
