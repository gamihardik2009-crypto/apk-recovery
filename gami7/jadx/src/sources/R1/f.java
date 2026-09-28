package R1;

import B1.t;
import m.AbstractC0837j;
import z2.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5496a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5497b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5499d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5500e;

    /* renamed from: f, reason: collision with root package name */
    public final c f5501f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5502g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5503h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5504i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5505j;

    public f(String str, String str2, String str3, String str4, String str5, c cVar, int i2, String str6, String str7, String str8) {
        h.f(str, "id");
        h.f(str2, "clientId");
        h.f(str3, "templateId");
        h.f(str4, "scheduledDate");
        h.f(str5, "scheduledTime");
        h.f(cVar, "status");
        h.f(str7, "week");
        h.f(str8, "message");
        this.f5496a = str;
        this.f5497b = str2;
        this.f5498c = str3;
        this.f5499d = str4;
        this.f5500e = str5;
        this.f5501f = cVar;
        this.f5502g = i2;
        this.f5503h = str6;
        this.f5504i = str7;
        this.f5505j = str8;
    }

    public static f a(f fVar, String str, String str2, String str3, c cVar, int i2, String str4, int i3) {
        String str5 = (i3 & 1) != 0 ? fVar.f5496a : str;
        String str6 = fVar.f5497b;
        String str7 = fVar.f5498c;
        String str8 = (i3 & 8) != 0 ? fVar.f5499d : str2;
        String str9 = (i3 & 16) != 0 ? fVar.f5500e : str3;
        int i4 = (i3 & 64) != 0 ? fVar.f5502g : i2;
        String str10 = fVar.f5503h;
        String str11 = (i3 & 256) != 0 ? fVar.f5504i : str4;
        String str12 = fVar.f5505j;
        fVar.getClass();
        h.f(str5, "id");
        h.f(str6, "clientId");
        h.f(str7, "templateId");
        h.f(str8, "scheduledDate");
        h.f(str9, "scheduledTime");
        h.f(str11, "week");
        h.f(str12, "message");
        return new f(str5, str6, str7, str8, str9, cVar, i4, str10, str11, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.f5496a, fVar.f5496a) && h.a(this.f5497b, fVar.f5497b) && h.a(this.f5498c, fVar.f5498c) && h.a(this.f5499d, fVar.f5499d) && h.a(this.f5500e, fVar.f5500e) && this.f5501f == fVar.f5501f && this.f5502g == fVar.f5502g && h.a(this.f5503h, fVar.f5503h) && h.a(this.f5504i, fVar.f5504i) && h.a(this.f5505j, fVar.f5505j);
    }

    public final int hashCode() {
        int b3 = AbstractC0837j.b(this.f5502g, (this.f5501f.hashCode() + t.e(t.e(t.e(t.e(this.f5496a.hashCode() * 31, 31, this.f5497b), 31, this.f5498c), 31, this.f5499d), 31, this.f5500e)) * 31, 31);
        String str = this.f5503h;
        return this.f5505j.hashCode() + t.e((b3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f5504i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Schedule(id=");
        sb.append(this.f5496a);
        sb.append(", clientId=");
        sb.append(this.f5497b);
        sb.append(", templateId=");
        sb.append(this.f5498c);
        sb.append(", scheduledDate=");
        sb.append(this.f5499d);
        sb.append(", scheduledTime=");
        sb.append(this.f5500e);
        sb.append(", status=");
        sb.append(this.f5501f);
        sb.append(", retryCount=");
        sb.append(this.f5502g);
        sb.append(", campaignId=");
        sb.append(this.f5503h);
        sb.append(", week=");
        sb.append(this.f5504i);
        sb.append(", message=");
        return t.k(sb, this.f5505j, ')');
    }
}
