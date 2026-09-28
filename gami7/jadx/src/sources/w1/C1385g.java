package w1;

import android.content.Context;
import m2.C0870l;
import m2.C0877s;
import n1.C0944e;
import p1.C1058a;

/* renamed from: w1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385g implements v1.c {

    /* renamed from: h, reason: collision with root package name */
    public final Context f11457h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11458i;

    /* renamed from: j, reason: collision with root package name */
    public final C1058a f11459j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11460k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11461l;

    /* renamed from: m, reason: collision with root package name */
    public final C0870l f11462m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11463n;

    public C1385g(Context context, String str, C1058a c1058a, boolean z3, boolean z4) {
        z2.h.f(context, "context");
        z2.h.f(c1058a, "callback");
        this.f11457h = context;
        this.f11458i = str;
        this.f11459j = c1058a;
        this.f11460k = z3;
        this.f11461l = z4;
        this.f11462m = new C0870l(new C0944e(14, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11462m.f8653i != C0877s.f8656a) {
            ((C1384f) this.f11462m.getValue()).close();
        }
    }

    @Override // v1.c
    public final C1380b q() {
        return ((C1384f) this.f11462m.getValue()).a(true);
    }

    @Override // v1.c
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.f11462m.f8653i != C0877s.f8656a) {
            C1384f c1384f = (C1384f) this.f11462m.getValue();
            z2.h.f(c1384f, "sQLiteOpenHelper");
            c1384f.setWriteAheadLoggingEnabled(z3);
        }
        this.f11463n = z3;
    }
}
