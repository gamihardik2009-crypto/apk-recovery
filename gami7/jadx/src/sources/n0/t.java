package n0;

import java.util.ArrayList;
import java.util.List;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f8973a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8974b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8975c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8976d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8977e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8978f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8979g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8980h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8981i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8982j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8983k;

    public t(long j3, long j4, long j5, long j6, boolean z3, float f3, int i2, boolean z4, ArrayList arrayList, long j7, long j8) {
        this.f8973a = j3;
        this.f8974b = j4;
        this.f8975c = j5;
        this.f8976d = j6;
        this.f8977e = z3;
        this.f8978f = f3;
        this.f8979g = i2;
        this.f8980h = z4;
        this.f8981i = arrayList;
        this.f8982j = j7;
        this.f8983k = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return q.a(this.f8973a, tVar.f8973a) && this.f8974b == tVar.f8974b && b0.c.b(this.f8975c, tVar.f8975c) && b0.c.b(this.f8976d, tVar.f8976d) && this.f8977e == tVar.f8977e && Float.compare(this.f8978f, tVar.f8978f) == 0 && AbstractC0937p.e(this.f8979g, tVar.f8979g) && this.f8980h == tVar.f8980h && z2.h.a(this.f8981i, tVar.f8981i) && b0.c.b(this.f8982j, tVar.f8982j) && b0.c.b(this.f8983k, tVar.f8983k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8983k) + B1.t.d((this.f8981i.hashCode() + B1.t.f(AbstractC0837j.b(this.f8979g, B1.t.c(this.f8978f, B1.t.f(B1.t.d(B1.t.d(B1.t.d(Long.hashCode(this.f8973a) * 31, 31, this.f8974b), 31, this.f8975c), 31, this.f8976d), 31, this.f8977e), 31), 31), 31, this.f8980h)) * 31, 31, this.f8982j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) q.b(this.f8973a));
        sb.append(", uptime=");
        sb.append(this.f8974b);
        sb.append(", positionOnScreen=");
        sb.append((Object) b0.c.j(this.f8975c));
        sb.append(", position=");
        sb.append((Object) b0.c.j(this.f8976d));
        sb.append(", down=");
        sb.append(this.f8977e);
        sb.append(", pressure=");
        sb.append(this.f8978f);
        sb.append(", type=");
        int i2 = this.f8979g;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f8980h);
        sb.append(", historical=");
        sb.append(this.f8981i);
        sb.append(", scrollDelta=");
        sb.append((Object) b0.c.j(this.f8982j));
        sb.append(", originalEventPosition=");
        sb.append((Object) b0.c.j(this.f8983k));
        sb.append(')');
        return sb.toString();
    }
}
