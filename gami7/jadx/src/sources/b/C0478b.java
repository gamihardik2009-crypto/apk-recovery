package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478b {

    /* renamed from: a, reason: collision with root package name */
    public final float f6971a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6972b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6974d;

    public C0478b(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        C0477a c0477a = C0477a.f6970a;
        float d3 = c0477a.d(backEvent);
        float e3 = c0477a.e(backEvent);
        float b3 = c0477a.b(backEvent);
        int c3 = c0477a.c(backEvent);
        this.f6971a = d3;
        this.f6972b = e3;
        this.f6973c = b3;
        this.f6974d = c3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f6971a);
        sb.append(", touchY=");
        sb.append(this.f6972b);
        sb.append(", progress=");
        sb.append(this.f6973c);
        sb.append(", swipeEdge=");
        return B1.t.j(sb, this.f6974d, '}');
    }
}
