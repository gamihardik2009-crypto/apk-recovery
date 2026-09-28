package H;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1616c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1617d = new LinkedHashMap();

    public J0(String str, String str2, String str3) {
        this.f1614a = str;
        this.f1615b = str2;
        this.f1616c = str3;
    }

    public final String a(Long l3, Locale locale, boolean z3) {
        if (l3 == null) {
            return null;
        }
        return D1.s(l3.longValue(), z3 ? this.f1616c : this.f1615b, locale, this.f1617d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return z2.h.a(this.f1614a, j02.f1614a) && z2.h.a(this.f1615b, j02.f1615b) && z2.h.a(this.f1616c, j02.f1616c);
    }

    public final int hashCode() {
        return this.f1616c.hashCode() + B1.t.e(this.f1614a.hashCode() * 31, 31, this.f1615b);
    }
}
