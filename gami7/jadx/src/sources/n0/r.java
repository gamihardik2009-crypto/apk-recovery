package n0;

import java.util.List;
import n2.C0970v;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f8957a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8959c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8960d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8961e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8962f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8963g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8964h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8965i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8966j;

    /* renamed from: k, reason: collision with root package name */
    public final List f8967k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8968l;

    /* renamed from: m, reason: collision with root package name */
    public C0924c f8969m;

    public r(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, boolean z5, int i2, long j8) {
        this.f8957a = j3;
        this.f8958b = j4;
        this.f8959c = j5;
        this.f8960d = z3;
        this.f8961e = f3;
        this.f8962f = j6;
        this.f8963g = j7;
        this.f8964h = z4;
        this.f8965i = i2;
        this.f8966j = j8;
        this.f8968l = 0L;
        C0924c c0924c = new C0924c();
        c0924c.f8922a = z5;
        c0924c.f8923b = z5;
        this.f8969m = c0924c;
    }

    public final void a() {
        C0924c c0924c = this.f8969m;
        c0924c.f8923b = true;
        c0924c.f8922a = true;
    }

    public final boolean b() {
        C0924c c0924c = this.f8969m;
        return c0924c.f8923b || c0924c.f8922a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) q.b(this.f8957a));
        sb.append(", uptimeMillis=");
        sb.append(this.f8958b);
        sb.append(", position=");
        sb.append((Object) b0.c.j(this.f8959c));
        sb.append(", pressed=");
        sb.append(this.f8960d);
        sb.append(", pressure=");
        sb.append(this.f8961e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f8962f);
        sb.append(", previousPosition=");
        sb.append((Object) b0.c.j(this.f8963g));
        sb.append(", previousPressed=");
        sb.append(this.f8964h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i2 = this.f8965i;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f8967k;
        if (obj == null) {
            obj = C0970v.f9165h;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) b0.c.j(this.f8966j));
        sb.append(')');
        return sb.toString();
    }

    public r(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, int i2, List list, long j8, long j9) {
        this(j3, j4, j5, z3, f3, j6, j7, z4, false, i2, j8);
        this.f8967k = list;
        this.f8968l = j9;
    }
}
