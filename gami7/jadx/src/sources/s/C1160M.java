package s;

/* renamed from: s.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160M implements InterfaceC1159L {

    /* renamed from: a, reason: collision with root package name */
    public final float f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10069b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10070c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10071d;

    public C1160M(float f3, float f4, float f5, float f6) {
        this.f10068a = f3;
        this.f10069b = f4;
        this.f10070c = f5;
        this.f10071d = f6;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative".toString());
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative".toString());
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative".toString());
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative".toString());
        }
    }

    @Override // s.InterfaceC1159L
    public final float a(O0.k kVar) {
        return kVar == O0.k.f5148h ? this.f10070c : this.f10068a;
    }

    @Override // s.InterfaceC1159L
    public final float b(O0.k kVar) {
        return kVar == O0.k.f5148h ? this.f10068a : this.f10070c;
    }

    @Override // s.InterfaceC1159L
    public final float c() {
        return this.f10071d;
    }

    @Override // s.InterfaceC1159L
    public final float d() {
        return this.f10069b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1160M)) {
            return false;
        }
        C1160M c1160m = (C1160M) obj;
        return O0.e.a(this.f10068a, c1160m.f10068a) && O0.e.a(this.f10069b, c1160m.f10069b) && O0.e.a(this.f10070c, c1160m.f10070c) && O0.e.a(this.f10071d, c1160m.f10071d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10071d) + B1.t.c(this.f10070c, B1.t.c(this.f10069b, Float.hashCode(this.f10068a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) O0.e.b(this.f10068a)) + ", top=" + ((Object) O0.e.b(this.f10069b)) + ", end=" + ((Object) O0.e.b(this.f10070c)) + ", bottom=" + ((Object) O0.e.b(this.f10071d)) + ')';
    }
}
