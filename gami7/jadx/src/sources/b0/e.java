package b0;

import B1.t;
import C1.y;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f7064a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7065b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7066c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7067d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7068e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7069f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7070g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7071h;

    static {
        long j3 = AbstractC0503a.f7052a;
        B2.a.d(AbstractC0503a.b(j3), AbstractC0503a.c(j3));
    }

    public e(float f3, float f4, float f5, float f6, long j3, long j4, long j5, long j6) {
        this.f7064a = f3;
        this.f7065b = f4;
        this.f7066c = f5;
        this.f7067d = f6;
        this.f7068e = j3;
        this.f7069f = j4;
        this.f7070g = j5;
        this.f7071h = j6;
    }

    public final float a() {
        return this.f7067d - this.f7065b;
    }

    public final float b() {
        return this.f7066c - this.f7064a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f7064a, eVar.f7064a) == 0 && Float.compare(this.f7065b, eVar.f7065b) == 0 && Float.compare(this.f7066c, eVar.f7066c) == 0 && Float.compare(this.f7067d, eVar.f7067d) == 0 && AbstractC0503a.a(this.f7068e, eVar.f7068e) && AbstractC0503a.a(this.f7069f, eVar.f7069f) && AbstractC0503a.a(this.f7070g, eVar.f7070g) && AbstractC0503a.a(this.f7071h, eVar.f7071h);
    }

    public final int hashCode() {
        int c3 = t.c(this.f7067d, t.c(this.f7066c, t.c(this.f7065b, Float.hashCode(this.f7064a) * 31, 31), 31), 31);
        int i2 = AbstractC0503a.f7053b;
        return Long.hashCode(this.f7071h) + t.d(t.d(t.d(c3, 31, this.f7068e), 31, this.f7069f), 31, this.f7070g);
    }

    public final String toString() {
        String str = y.K(this.f7064a) + ", " + y.K(this.f7065b) + ", " + y.K(this.f7066c) + ", " + y.K(this.f7067d);
        long j3 = this.f7068e;
        long j4 = this.f7069f;
        boolean a3 = AbstractC0503a.a(j3, j4);
        long j5 = this.f7070g;
        long j6 = this.f7071h;
        if (!a3 || !AbstractC0503a.a(j4, j5) || !AbstractC0503a.a(j5, j6)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC0503a.d(j3)) + ", topRight=" + ((Object) AbstractC0503a.d(j4)) + ", bottomRight=" + ((Object) AbstractC0503a.d(j5)) + ", bottomLeft=" + ((Object) AbstractC0503a.d(j6)) + ')';
        }
        if (AbstractC0503a.b(j3) == AbstractC0503a.c(j3)) {
            return "RoundRect(rect=" + str + ", radius=" + y.K(AbstractC0503a.b(j3)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + y.K(AbstractC0503a.b(j3)) + ", y=" + y.K(AbstractC0503a.c(j3)) + ')';
    }
}
