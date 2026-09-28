package R1;

import B1.t;
import m.AbstractC0837j;
import z2.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5477c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5478d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5479e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5480f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5481g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5482h;

    public b(String str, String str2, String str3, String str4, boolean z3, int i2, boolean z4, String str5) {
        h.f(str, "id");
        h.f(str2, "name");
        h.f(str3, "phone");
        h.f(str4, "notes");
        h.f(str5, "source");
        this.f5475a = str;
        this.f5476b = str2;
        this.f5477c = str3;
        this.f5478d = str4;
        this.f5479e = z3;
        this.f5480f = i2;
        this.f5481g = z4;
        this.f5482h = str5;
    }

    public static b a(b bVar, String str, String str2, boolean z3, int i2) {
        String str3 = bVar.f5475a;
        if ((i2 & 2) != 0) {
            str = bVar.f5476b;
        }
        String str4 = str;
        String str5 = bVar.f5478d;
        boolean z4 = bVar.f5479e;
        int i3 = bVar.f5480f;
        if ((i2 & 64) != 0) {
            z3 = bVar.f5481g;
        }
        String str6 = bVar.f5482h;
        bVar.getClass();
        h.f(str3, "id");
        h.f(str4, "name");
        h.f(str2, "phone");
        h.f(str5, "notes");
        h.f(str6, "source");
        return new b(str3, str4, str2, str5, z4, i3, z3, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f5475a, bVar.f5475a) && h.a(this.f5476b, bVar.f5476b) && h.a(this.f5477c, bVar.f5477c) && h.a(this.f5478d, bVar.f5478d) && this.f5479e == bVar.f5479e && this.f5480f == bVar.f5480f && this.f5481g == bVar.f5481g && h.a(this.f5482h, bVar.f5482h);
    }

    public final int hashCode() {
        return this.f5482h.hashCode() + t.f(AbstractC0837j.b(this.f5480f, t.f(t.e(t.e(t.e(this.f5475a.hashCode() * 31, 31, this.f5476b), 31, this.f5477c), 31, this.f5478d), 31, this.f5479e), 31), 31, this.f5481g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Client(id=");
        sb.append(this.f5475a);
        sb.append(", name=");
        sb.append(this.f5476b);
        sb.append(", phone=");
        sb.append(this.f5477c);
        sb.append(", notes=");
        sb.append(this.f5478d);
        sb.append(", active=");
        sb.append(this.f5479e);
        sb.append(", orderIndex=");
        sb.append(this.f5480f);
        sb.append(", useNameInTemplate=");
        sb.append(this.f5481g);
        sb.append(", source=");
        return t.k(sb, this.f5482h, ')');
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, int i2, boolean z3, String str5, int i3) {
        this(str, str2, str3, (i3 & 8) != 0 ? "" : str4, true, i2, (i3 & 64) != 0 ? true : z3, str5);
    }
}
