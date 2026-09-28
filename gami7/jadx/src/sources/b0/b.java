package b0;

import C1.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f7054a;

    /* renamed from: b, reason: collision with root package name */
    public float f7055b;

    /* renamed from: c, reason: collision with root package name */
    public float f7056c;

    /* renamed from: d, reason: collision with root package name */
    public float f7057d;

    public final void a(float f3, float f4, float f5, float f6) {
        this.f7054a = Math.max(f3, this.f7054a);
        this.f7055b = Math.max(f4, this.f7055b);
        this.f7056c = Math.min(f5, this.f7056c);
        this.f7057d = Math.min(f6, this.f7057d);
    }

    public final boolean b() {
        return this.f7054a >= this.f7056c || this.f7055b >= this.f7057d;
    }

    public final String toString() {
        return "MutableRect(" + y.K(this.f7054a) + ", " + y.K(this.f7055b) + ", " + y.K(this.f7056c) + ", " + y.K(this.f7057d) + ')';
    }
}
