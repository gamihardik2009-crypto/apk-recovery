package H;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final float f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1419b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1420c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1421d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1422e;

    public E(float f3, float f4, float f5, float f6, float f7) {
        this.f1418a = f3;
        this.f1419b = f4;
        this.f1420c = f5;
        this.f1421d = f6;
        this.f1422e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return O0.e.a(this.f1418a, e3.f1418a) && O0.e.a(this.f1419b, e3.f1419b) && O0.e.a(this.f1420c, e3.f1420c) && O0.e.a(this.f1421d, e3.f1421d) && O0.e.a(this.f1422e, e3.f1422e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1422e) + B1.t.c(this.f1421d, B1.t.c(this.f1420c, B1.t.c(this.f1419b, Float.hashCode(this.f1418a) * 31, 31), 31), 31);
    }
}
