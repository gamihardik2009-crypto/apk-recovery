package c0;

import android.graphics.PathMeasure;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f7263a;

    public C0592k(PathMeasure pathMeasure) {
        this.f7263a = pathMeasure;
    }

    public final void a(float f3, float f4, InterfaceC0570J interfaceC0570J) {
        if (!(interfaceC0570J instanceof C0591j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f7263a.getSegment(f3, f4, ((C0591j) interfaceC0570J).f7260a, true);
    }
}
