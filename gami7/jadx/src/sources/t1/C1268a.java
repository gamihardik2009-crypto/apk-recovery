package t1;

import H2.l;
import java.util.Locale;
import n1.E;
import z2.h;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10642a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10643b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10645d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10646e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10647f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10648g;

    public C1268a(String str, String str2, boolean z3, int i2, String str3, int i3) {
        this.f10642a = str;
        this.f10643b = str2;
        this.f10644c = z3;
        this.f10645d = i2;
        this.f10646e = str3;
        this.f10647f = i3;
        Locale locale = Locale.US;
        h.e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        h.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f10648g = l.O(upperCase, "INT", false) ? 3 : (l.O(upperCase, "CHAR", false) || l.O(upperCase, "CLOB", false) || l.O(upperCase, "TEXT", false)) ? 2 : l.O(upperCase, "BLOB", false) ? 5 : (l.O(upperCase, "REAL", false) || l.O(upperCase, "FLOA", false) || l.O(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1268a)) {
            return false;
        }
        C1268a c1268a = (C1268a) obj;
        if (this.f10645d != c1268a.f10645d) {
            return false;
        }
        if (!h.a(this.f10642a, c1268a.f10642a) || this.f10644c != c1268a.f10644c) {
            return false;
        }
        int i2 = c1268a.f10647f;
        String str = c1268a.f10646e;
        String str2 = this.f10646e;
        int i3 = this.f10647f;
        if (i3 == 1 && i2 == 2 && str2 != null && !E.h(str2, str)) {
            return false;
        }
        if (i3 != 2 || i2 != 1 || str == null || E.h(str, str2)) {
            return (i3 == 0 || i3 != i2 || (str2 == null ? str == null : E.h(str2, str))) && this.f10648g == c1268a.f10648g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10642a.hashCode() * 31) + this.f10648g) * 31) + (this.f10644c ? 1231 : 1237)) * 31) + this.f10645d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f10642a);
        sb.append("', type='");
        sb.append(this.f10643b);
        sb.append("', affinity='");
        sb.append(this.f10648g);
        sb.append("', notNull=");
        sb.append(this.f10644c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f10645d);
        sb.append(", defaultValue='");
        String str = this.f10646e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
