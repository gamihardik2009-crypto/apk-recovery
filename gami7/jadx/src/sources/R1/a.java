package R1;

import B1.t;
import m.AbstractC0837j;
import z2.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5466a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5467b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5468c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5469d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5470e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5471f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5472g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5473h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5474i;

    public /* synthetic */ a() {
        this(0, "09:00", "18:00", true, 5, 4, false, false, "");
    }

    public static a a(a aVar, String str, String str2, boolean z3, int i2, boolean z4, boolean z5, String str3, int i3) {
        int i4 = aVar.f5466a;
        String str4 = (i3 & 2) != 0 ? aVar.f5467b : str;
        String str5 = (i3 & 4) != 0 ? aVar.f5468c : str2;
        boolean z6 = (i3 & 8) != 0 ? aVar.f5469d : z3;
        int i5 = (i3 & 16) != 0 ? aVar.f5470e : i2;
        int i6 = aVar.f5471f;
        boolean z7 = (i3 & 64) != 0 ? aVar.f5472g : z4;
        boolean z8 = (i3 & 128) != 0 ? aVar.f5473h : z5;
        String str6 = (i3 & 256) != 0 ? aVar.f5474i : str3;
        aVar.getClass();
        h.f(str4, "workStartTime");
        h.f(str5, "workEndTime");
        h.f(str6, "automationStartDate");
        return new a(i4, str4, str5, z6, i5, i6, z7, z8, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5466a == aVar.f5466a && h.a(this.f5467b, aVar.f5467b) && h.a(this.f5468c, aVar.f5468c) && this.f5469d == aVar.f5469d && this.f5470e == aVar.f5470e && this.f5471f == aVar.f5471f && this.f5472g == aVar.f5472g && this.f5473h == aVar.f5473h && h.a(this.f5474i, aVar.f5474i);
    }

    public final int hashCode() {
        return this.f5474i.hashCode() + t.f(t.f(AbstractC0837j.b(this.f5471f, AbstractC0837j.b(this.f5470e, t.f(t.e(t.e(Integer.hashCode(this.f5466a) * 31, 31, this.f5467b), 31, this.f5468c), 31, this.f5469d), 31), 31), 31, this.f5472g), 31, this.f5473h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppSettings(id=");
        sb.append(this.f5466a);
        sb.append(", workStartTime=");
        sb.append(this.f5467b);
        sb.append(", workEndTime=");
        sb.append(this.f5468c);
        sb.append(", skipSunday=");
        sb.append(this.f5469d);
        sb.append(", timeGapMinutes=");
        sb.append(this.f5470e);
        sb.append(", messageRotationCount=");
        sb.append(this.f5471f);
        sb.append(", automationEnabled=");
        sb.append(this.f5472g);
        sb.append(", newDataAdded=");
        sb.append(this.f5473h);
        sb.append(", automationStartDate=");
        return t.k(sb, this.f5474i, ')');
    }

    public a(int i2, String str, String str2, boolean z3, int i3, int i4, boolean z4, boolean z5, String str3) {
        h.f(str, "workStartTime");
        h.f(str2, "workEndTime");
        h.f(str3, "automationStartDate");
        this.f5466a = i2;
        this.f5467b = str;
        this.f5468c = str2;
        this.f5469d = z3;
        this.f5470e = i3;
        this.f5471f = i4;
        this.f5472g = z4;
        this.f5473h = z5;
        this.f5474i = str3;
    }
}
