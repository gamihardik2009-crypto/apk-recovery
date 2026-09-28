package t;

import J.C0257c;
import J.C0268h0;
import v.C1332D;

/* renamed from: t.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10320a;

    /* renamed from: b, reason: collision with root package name */
    public final C0268h0 f10321b;

    /* renamed from: c, reason: collision with root package name */
    public final C0268h0 f10322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10323d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10324e;

    /* renamed from: f, reason: collision with root package name */
    public final C1332D f10325f;

    public C1221p(int i2, int i3, int i4) {
        this.f10320a = i4;
        switch (i4) {
            case 1:
                this.f10321b = C0257c.M(i2);
                this.f10322c = C0257c.M(i3);
                this.f10325f = new C1332D(i2, 90, 200);
                break;
            default:
                this.f10321b = C0257c.M(i2);
                this.f10322c = C0257c.M(i3);
                this.f10325f = new C1332D(i2, 30, 100);
                break;
        }
    }

    public final int a() {
        switch (this.f10320a) {
        }
        return this.f10321b.g();
    }

    public final int b() {
        switch (this.f10320a) {
        }
        return this.f10322c.g();
    }

    public final void c(int i2, int i3) {
        switch (this.f10320a) {
            case 0:
                if (i2 >= 0.0f) {
                    this.f10321b.h(i2);
                    this.f10325f.a(i2);
                    this.f10322c.h(i3);
                    return;
                } else {
                    throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
                }
            default:
                if (i2 >= 0.0f) {
                    this.f10321b.h(i2);
                    this.f10325f.a(i2);
                    this.f10322c.h(i3);
                    return;
                } else {
                    throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
                }
        }
    }
}
