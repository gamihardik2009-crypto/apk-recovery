package R1;

import B1.t;
import z2.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5491b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5492c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5493d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5495f;

    public e(String str, String str2, String str3, String str4, boolean z3, int i2) {
        h.f(str, "id");
        h.f(str2, "title");
        h.f(str3, "greeting");
        h.f(str4, "message");
        this.f5490a = str;
        this.f5491b = str2;
        this.f5492c = str3;
        this.f5493d = str4;
        this.f5494e = z3;
        this.f5495f = i2;
    }

    public static e a(e eVar, String str, String str2, String str3, boolean z3, int i2) {
        String str4 = eVar.f5490a;
        if ((i2 & 2) != 0) {
            str = eVar.f5491b;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = eVar.f5492c;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = eVar.f5493d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            z3 = eVar.f5494e;
        }
        int i3 = eVar.f5495f;
        eVar.getClass();
        h.f(str4, "id");
        h.f(str5, "title");
        h.f(str6, "greeting");
        h.f(str7, "message");
        return new e(str4, str5, str6, str7, z3, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.f5490a, eVar.f5490a) && h.a(this.f5491b, eVar.f5491b) && h.a(this.f5492c, eVar.f5492c) && h.a(this.f5493d, eVar.f5493d) && this.f5494e == eVar.f5494e && this.f5495f == eVar.f5495f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5495f) + t.f(t.e(t.e(t.e(this.f5490a.hashCode() * 31, 31, this.f5491b), 31, this.f5492c), 31, this.f5493d), 31, this.f5494e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageTemplate(id=");
        sb.append(this.f5490a);
        sb.append(", title=");
        sb.append(this.f5491b);
        sb.append(", greeting=");
        sb.append(this.f5492c);
        sb.append(", message=");
        sb.append(this.f5493d);
        sb.append(", enabled=");
        sb.append(this.f5494e);
        sb.append(", order=");
        return t.j(sb, this.f5495f, ')');
    }
}
