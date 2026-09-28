package v;

import J.C0257c;
import J.C0268h0;
import J.C0274k0;
import J.W;

/* renamed from: v.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333E {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11279a;

    /* renamed from: b, reason: collision with root package name */
    public final C1334F f11280b;

    /* renamed from: c, reason: collision with root package name */
    public final C0268h0 f11281c = C0257c.M(-1);

    /* renamed from: d, reason: collision with root package name */
    public final C0268h0 f11282d = C0257c.M(0);

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f11283e;

    /* renamed from: f, reason: collision with root package name */
    public final C0274k0 f11284f;

    public C1333E(Object obj, C1334F c1334f) {
        this.f11279a = obj;
        this.f11280b = c1334f;
        W w2 = W.f4109m;
        this.f11283e = C0257c.N(null, w2);
        this.f11284f = C0257c.N(null, w2);
    }

    public final int a() {
        return this.f11282d.g();
    }

    public final C1333E b() {
        C0268h0 c0268h0 = this.f11282d;
        if (c0268h0.g() == 0) {
            this.f11280b.f11285h.add(this);
            C1333E c1333e = (C1333E) this.f11284f.getValue();
            if (c1333e != null) {
                c1333e.b();
            } else {
                c1333e = null;
            }
            this.f11283e.setValue(c1333e);
        }
        c0268h0.h(c0268h0.g() + 1);
        return this;
    }

    public final void c() {
        C0268h0 c0268h0 = this.f11282d;
        if (c0268h0.g() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        c0268h0.h(c0268h0.g() - 1);
        if (c0268h0.g() == 0) {
            this.f11280b.f11285h.remove(this);
            C0274k0 c0274k0 = this.f11283e;
            C1333E c1333e = (C1333E) c0274k0.getValue();
            if (c1333e != null) {
                c1333e.c();
            }
            c0274k0.setValue(null);
        }
    }
}
